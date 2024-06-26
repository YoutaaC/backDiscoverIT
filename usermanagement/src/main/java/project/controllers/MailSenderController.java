package project.controllers;

import jdk.jfr.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import project.models.EventEntity;
import project.service.EventServiceInter;
import project.service.GoogleCalendarService;
import project.service.MailServiceImpl;
import project.service.MailServiceInter;

import javax.mail.MessagingException;
import javax.persistence.EntityNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;

@RestController
@RequestMapping("/mail")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MailSenderController {

    @Autowired
    private MailServiceImpl eventServiceImpl;
//    @Autowired
//    private GoogleCalendarService googleCalendarService;
    private MailServiceInter.EmailService emailService;

    public MailSenderController(MailServiceInter.EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public String sendMail(@RequestParam String to, String subject, String body) {
        return emailService.sendMail( to, subject, body);
    }








}
