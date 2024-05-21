package project.service;

import project.models.PostEntity;
import project.models.UserEntity;

import java.util.List;

public interface PostServiceInter {

    PostEntity createPost(PostEntity post);

    List<PostEntity> getAllPosts();

    PostEntity updatePostPut(Long id, PostEntity post);
    PostEntity createPostUser(Long userId,PostEntity post);

    List<PostEntity> getPostsByUserId(Long userId);

    PostEntity updatePostUser(Long postId, PostEntity updatedPost);
    void deletePost(Long id);
    PostEntity getPostById(Long postid);
}
