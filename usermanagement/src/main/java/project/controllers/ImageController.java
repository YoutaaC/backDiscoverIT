package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import project.models.Image;
import project.repository.EventRepository;
import project.repository.PostRepository;
import project.repository.UserRepository;
import project.service.ImageServiceInter;

import java.io.IOException;

@RestController
@RequestMapping("/image")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class ImageController {



    @Autowired
    UserRepository userRepository;


    @Autowired
    ImageServiceInter imageServiceInter;


    @Autowired
    PostRepository postRepository;

    @Autowired
    EventRepository eventRepository;


//imageUser:

    @PostMapping("/upload/{idUser}")
    public ResponseEntity<String> uploadImage(@RequestParam("imageFile") MultipartFile file, @PathVariable int idUser) throws IOException {
        return imageServiceInter.uploadImage(file,idUser);
    }

    @GetMapping("/get/{idUser}")
    public ResponseEntity<Image>getImageByIdUser(@PathVariable int idUser)
    {
        return imageServiceInter.getImage(idUser);


    }

    @PutMapping("/update/{idUser}")

    public ResponseEntity<String>updateImage(@RequestParam("imageFile") MultipartFile file,  @PathVariable int idUser) throws IOException {

        return imageServiceInter.updateImage(file,idUser);
    }



    @DeleteMapping("/delete/{idUser}")
    public ResponseEntity<String>deleteImage(@PathVariable int idUser)
    {
        return imageServiceInter.deleteImage(idUser);
    }


    //imagePost :


    @PostMapping("/uploadPost/{idPost}")
    public ResponseEntity<String> uploadImagePost(@RequestParam("imageFile") MultipartFile file, @PathVariable int idPost) throws IOException {
        return imageServiceInter.uploadImagePost(file,idPost);
    }

    @GetMapping("/getPost/{idPost}")
    public ResponseEntity<Image>getImageByIdPost(@PathVariable int idPost)
    {
        return imageServiceInter.getImagePost(idPost);

    }

    @PutMapping("/updatePost/{idPost}")

    public ResponseEntity<String>updateImagePost(@RequestParam("imageFile") MultipartFile file,  @PathVariable int idPost) throws IOException {

        return imageServiceInter.updateImagePost(file,idPost);
    }

    @DeleteMapping("/deletePost/{idPost}")
    public ResponseEntity<String>deleteImagePost(@PathVariable int idPost)
    {
        return imageServiceInter.deleteImagePost(idPost);
    }


    //imageEvent :

    @PostMapping("/uploadEvent/{idEvent}")
    public ResponseEntity<String> uploadImageEvent(@RequestParam("imageFile") MultipartFile file, @PathVariable int idEvent) throws IOException {
        return imageServiceInter.uploadImageEvent(file,idEvent);
    }

    @GetMapping("/getEvent/{idEvent}")
    public ResponseEntity<Image>getImageByIdEvent(@PathVariable int idEvent)
    {
        return imageServiceInter.getImageEvent(idEvent);

    }

    @PutMapping("/updateEvent/{idEvent}")

    public ResponseEntity<String>updateImageEvent(@RequestParam("imageFile") MultipartFile file,  @PathVariable int idEvent) throws IOException {

        return imageServiceInter.updateImageEvent(file,idEvent);
    }

    @DeleteMapping("/deleteEvent/{idEvent}")
    public ResponseEntity<String>deleteImageEvent(@PathVariable int idEvent)
    {
        return imageServiceInter.deleteImageEvent(idEvent);
    }
}
