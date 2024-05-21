package project.service;

import jdk.jfr.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import project.models.EventEntity;
import project.models.UserEntity;
import project.repository.EventRepository;

import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.persistence.EntityNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import javax.activation.MimeType;

@Service
public class MailServiceImpl implements MailServiceInter.EmailService{
    @Autowired
    private JavaMailSender javaMailSender;


    @Autowired
    private EventRepository eventRepository;

    // Directly access from configuration property (if using Spring Boot)
    @Value("${spring.mail.username}")
    private String from;

    @Override
    public String sendMail( String to, String subject, String body) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

            // Use the configuration property or fallback address
            mimeMessageHelper.setFrom(from);

            mimeMessageHelper.setTo(to);

            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(body);



            javaMailSender.send(mimeMessage);
            return "mail sent";
        } catch (Exception e) {
            throw new RuntimeException(e); // Consider more specific exception handling
        }
    }







}
