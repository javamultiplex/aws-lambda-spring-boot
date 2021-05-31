package com.javamultiplex.client;

import com.javamultiplex.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Rohit Agarwal on 31/05/21 3:18 pm
 * @copyright www.javamultiplex.com
 */
@Component
public class PostClient {

    private final RestTemplate restTemplate;

    @Value("${API_URL}")
    private String apiUrl;

    @Autowired
    public PostClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Post> getPosts() {
        ResponseEntity<List<Post>> responseEntity = restTemplate.exchange(apiUrl,
                HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Post>>() {
                });
        return responseEntity.getBody();
    }

}
