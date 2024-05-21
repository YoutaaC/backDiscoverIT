package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.models.PostEntity;
import project.models.UserEntity;
import project.service.PostServiceImpl;
import project.service.PostServiceInter;
import project.service.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostController {

    @Autowired
    PostServiceInter postServiceInter;
    @Autowired
    PostServiceImpl postServiceImpl;

    @PostMapping("/add")
    public PostEntity createPost(@RequestBody PostEntity post){

        return postServiceInter.createPost(post);
    }

    @GetMapping("/getAll")
    public List<PostEntity> getAllPosts(){

        return postServiceInter.getAllPosts();
    }

    @PutMapping(value = "/update/{id}")
    public PostEntity updatePostPut(@PathVariable Long id ,@RequestBody PostEntity post)
    {
        return postServiceInter.updatePostPut(id,post);

    }

    @PostMapping("/addP/{userId}")

    public PostEntity createPostUser(@PathVariable Long userId, @RequestBody PostEntity post)
    {
        return postServiceInter.createPostUser(userId,post);
    }

    @GetMapping("/getUser/{userId}")
    public List<PostEntity> getPostsByUserId(@PathVariable Long userId)
    {
        return postServiceInter.getPostsByUserId(userId);

    }

    @PutMapping("/updateUser/{postId}")
    public PostEntity updatePostUser(@PathVariable Long postId,@RequestBody PostEntity updatedPost )
    {
        return postServiceInter.updatePostUser(postId,updatedPost);

    }

    @DeleteMapping(value = "/delete/{id}")
    public void deletePost(@PathVariable Long id)
    {

        postServiceInter.deletePost(id);
    }


    @GetMapping(value = "/getPostById/{postid}")
    public PostEntity getPostById(@PathVariable Long postid)
    {
        return postServiceInter.getPostById(postid);

    }

    @GetMapping("/count")
    public long getPostCount() {
        return postServiceImpl.countPosts();
    }

}
