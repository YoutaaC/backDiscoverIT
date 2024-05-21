package project.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import project.models.Image;
import project.models.PostEntity;

import java.io.IOException;
import java.util.List;

public interface ImageServiceInter {

// partie User :
    ResponseEntity<String> uploadImage(MultipartFile file, int idUser) throws IOException;

    ResponseEntity<Image> getImage(int idUser);

    ResponseEntity<String> updateImage(MultipartFile file, int idUser) throws IOException;

    ResponseEntity<String> deleteImage(int idUser);

    //partie Post:
    ResponseEntity<String> uploadImagePost(MultipartFile file, int idPost) throws IOException;

    ResponseEntity<Image> getImagePost(int idPost);

    ResponseEntity<String> updateImagePost(MultipartFile file, int idPost) throws IOException;

    ResponseEntity<String> deleteImagePost(int idPost);

    //imageEvent :

    ResponseEntity<String> uploadImageEvent(MultipartFile file, int idEvent) throws IOException;

    ResponseEntity<Image> getImageEvent(int idEvent);

    ResponseEntity<String> updateImageEvent(MultipartFile file, int idEvent) throws IOException;

    ResponseEntity<String> deleteImageEvent(int idEvent);

}
