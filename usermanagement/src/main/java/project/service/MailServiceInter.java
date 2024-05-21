package project.service;

import org.springframework.web.multipart.MultipartFile;
import project.models.EventEntity;

import javax.mail.MessagingException;

public interface MailServiceInter {
    interface EmailService {
        String sendMail(MultipartFile[] file, String to, String[] cc, String subject, String body);
    }

}