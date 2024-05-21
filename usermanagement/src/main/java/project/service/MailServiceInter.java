package project.service;

import org.springframework.web.multipart.MultipartFile;
import project.models.EventEntity;

import javax.mail.MessagingException;

public interface MailServiceInter {
    interface EmailService {
        String sendMail( String to, String subject, String body);
    }

}