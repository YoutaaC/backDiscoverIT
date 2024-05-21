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
    public String sendMail(@RequestParam(value = "file", required = false) MultipartFile[] file, String to, String[] cc, String subject, String body) {
        return emailService.sendMail(file, to, cc, subject, body);
    }



//    @PostMapping("/addEvent")
//    public String addEventToCalendar(@RequestParam String title,
//                                     @RequestParam String description,
//                                     @RequestParam String startDateTime,
//                                     @RequestParam String endDateTime) throws IOException, GeneralSecurityException {
//        Event createdEvent = googleCalendarService.createEvent(title, description, startDateTime, endDateTime);
//        return "Event created successfully: " + createdEvent.getId();
//    }







}
