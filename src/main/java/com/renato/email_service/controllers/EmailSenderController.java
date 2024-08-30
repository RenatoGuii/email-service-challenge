package com.renato.email_service.controllers;

import com.renato.email_service.services.EmailSenderService;
import com.renato.email_service.core.EmailDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@Tag(name = "EmailSenderController")
public class EmailSenderController {

    @Autowired
    private EmailSenderService emailSenderService;

    @Operation(summary = "Enviar um email")
    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody @Valid EmailDTO data) {
        emailSenderService.sendEmail(data.to(), data.subject(), data.body());
        return ResponseEntity.status(HttpStatus.OK).body("Email sent successfully");
    }

}
