package project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.models.PostEntity;
import project.models.UserEntity;
import project.repository.PostRepository;
import project.repository.UserRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostServiceInter {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public PostEntity createPost(PostEntity post) {
        post.setCreated(new Date());
        return postRepository.save(post);
    }

    @Override
    public List<PostEntity> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public PostEntity updatePostPut(Long id, PostEntity post) {
        PostEntity pst = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Post not found"));
        pst.setTitle(post.getTitle());
        pst.setBody(post.getBody());
        pst.setMini_body(post.getMini_body());
        pst.setType(post.getType());
        return postRepository.save(pst);
    }

    @Override
    public PostEntity createPostUser(Long userId, PostEntity post) {
        UserEntity user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
        post.setUser(user);
        post.setCreated(new Date());
        return postRepository.save(post);
    }

    @Override
    public List<PostEntity> getPostsByUserId(Long userId) {
        return postRepository.findByUserId(userId);
    }

    @Override
    public PostEntity updatePostUser(Long postId, PostEntity updatedPost) {
        PostEntity existingPost = postRepository.findById(postId).orElseThrow(() -> new IllegalArgumentException("Post not found"));
        existingPost.setBody(updatedPost.getBody());
        existingPost.setMini_body(updatedPost.getMini_body());
        existingPost.setTitle(updatedPost.getTitle());
        existingPost.setType(updatedPost.getType());
        return postRepository.save(existingPost);
    }

    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public PostEntity getPostById(Long postId) {
        return postRepository.findById(postId).orElse(null);
    }

    public long countPosts() {
        return postRepository.count();
    }

}
