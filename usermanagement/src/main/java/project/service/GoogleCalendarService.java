package project.service;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
//import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.store.FileDataStoreFactory;
import jdk.jfr.Event;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

public class GoogleCalendarService {
//    private static final String APPLICATION_NAME = "DiscoverIt";
//    private static final String CALENDAR_ID = "y.c.yass@gmail.com";
//
//    public Event createEvent(String title, String description, String startDateTime, String endDateTime) throws IOException {
//        // 1. Build HTTP transport
//        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
//
//        // 2. Create JSON factory
//        JacksonFactory jsonFactory = JacksonFactory.getDefaultInstance();
//
//        // 3. Configure OAuth 2.0 authorization (replace with your credentials)
//        Credential credential = authorizeWithOAuth2(httpTransport, jsonFactory);
//
//        // 4. Create Google Calendar service object
//        Calendar service = new Calendar.Builder(httpTransport, jsonFactory, credential)
//                .setApplicationName(APPLICATION_NAME)
//                .build();
//
//        // 5. Create Event object
//        Event event = new Event()
//                .setSummary(title)
//                .setDescription(description)
//                .setStart(new DateTime(startDateTime))
//                .setEnd(new DateTime(endDateTime));
//
//        // 6. Insert event
//        return service.events().insert(CALENDAR_ID, event).execute();
//    }
//
//    private Credential authorizeWithOAuth2(HttpTransport httpTransport, JacksonFactory jsonFactory) throws IOException {
//        // Replace with your project credentials file path
//        String credsPath = "path/to/your/credentials.json";
//
//        // Read client ID and secret from credentials file
//        InputStream inputStream = new FileInputStream(credsPath);
//        GoogleClientSecrets clientSecrets = jsonFactory.fromInputStream(inputStream, GoogleClientSecrets.class);
//
//        // Build flow and trigger user authorization request
//        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
//                httpTransport, jsonFactory, clientSecrets.getInstalled(), SCOPES)
//                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File("tokens")))
//                .setAccessType("offline")
//                .build();
//        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
//        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
//    }

}
