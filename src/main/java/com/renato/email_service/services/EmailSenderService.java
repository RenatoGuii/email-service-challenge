package com.renato.email_service.services;

import com.renato.email_service.adapters.EmailSenderGateway;
import com.renato.email_service.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {
    @Autowired
    EmailSenderGateway emailSenderGateway;

    @Override
    public void sendEmail(String to, String subject, String body) {
        emailSenderGateway.sendEmail(to, subject, body);
    }
}
