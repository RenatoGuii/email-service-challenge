package com.renato.email_service.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.renato.email_service.adapters.EmailSenderGateway;
import com.renato.email_service.core.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesEmailSender implements EmailSenderGateway {
    @Autowired
    AmazonSimpleEmailService amazonSimpleEmailService;

    @Override
    public void sendEmail(String to, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()
                .withSource("renatoguimaraesquirino@gmail.com") // Remetente
                .withDestination(new Destination().withToAddresses(to)) // Destinatário
                .withMessage(new Message() // Mensagem
                        .withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body))));

        try {
            amazonSimpleEmailService.sendEmail(request);
        } catch (AmazonServiceException e) {
            throw new EmailServiceException("Failure while sending email");
        }
    }
}
