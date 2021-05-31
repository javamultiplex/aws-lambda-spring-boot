package com.javamultiplex.service;

import com.javamultiplex.client.PostClient;
import com.javamultiplex.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rohit Agarwal on 31/05/21 3:22 pm
 * @copyright www.javamultiplex.com
 */
@Service
public class PostService {
    private final PostClient postClient;

    @Autowired
    public PostService(PostClient postClient) {
        this.postClient = postClient;
    }

    public List<Post> getPosts() {
        return postClient.getPosts();
    }
}
