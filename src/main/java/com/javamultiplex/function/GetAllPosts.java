package com.javamultiplex.function;

import com.javamultiplex.model.Post;
import com.javamultiplex.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author Rohit Agarwal on 31/05/21 3:13 pm
 * @copyright www.javamultiplex.com
 */
@Component
public class GetAllPosts implements Supplier<List<Post>> {

    private final PostService postService;

    @Autowired
    public GetAllPosts(PostService postService) {
        this.postService = postService;
    }

    @Override
    public List<Post> get() {
        return postService.getPosts();
    }
}
