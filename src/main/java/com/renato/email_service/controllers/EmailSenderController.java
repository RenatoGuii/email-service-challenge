package com.renato.email_service.controllers;

import com.renato.email_service.services.EmailSenderService;
import com.renato.email_service.core.EmailDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {

    @Autowired
    EmailSenderService emailSenderService;

    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody @Valid EmailDTO data) {
        emailSenderService.sendEmail(data.to(), data.subject(), data.body());
        return ResponseEntity.status(HttpStatus.OK).body("Email sent successfully");
    }

}
