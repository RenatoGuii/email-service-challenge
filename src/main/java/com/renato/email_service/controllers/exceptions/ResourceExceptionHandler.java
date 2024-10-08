package com.renato.email_service.controllers.exceptions;

import com.renato.email_service.core.EmailServiceException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<StandartError> invalidInformation(HttpServletRequest request) {
        StandartError err = new StandartError();
        err.setTimeStamp(Instant.now());
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setError("Invalid Values");
        err.setMsg("Invalid or null values");
        err.setPath(request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

    @ExceptionHandler(EmailServiceException.class)
    public ResponseEntity<StandartError> sendEmailError(EmailServiceException e, HttpServletRequest request) {
        StandartError err = new StandartError();
        err.setTimeStamp(Instant.now());
        err.setStatus(HttpStatus.BAD_REQUEST.value());
        err.setError("Error sending the email");
        err.setMsg(e.getMessage());
        err.setPath(request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }

}
