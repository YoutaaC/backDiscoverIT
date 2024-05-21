//package project.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import project.models.EventEntity;
//import project.models.PostEntity;
//import project.service.EventServiceInter;
//import project.service.PostServiceInter;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/visiteurs")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
//public class VisiteurController {
//    @Autowired
//    PostServiceInter postServiceInter;
//    @Autowired
//    EventServiceInter eventServiceInter;
//
//
//    @GetMapping("/getAllPosts")
//    public List<PostEntity> getAllPosts(){
//
//        return postServiceInter.getAllPosts();
//    }
//
//    @GetMapping("/getAllEvents")
//    public List<EventEntity> getAllEvents()
//    {
//        return eventServiceInter.getAllEvents();
//
//    }
//}
