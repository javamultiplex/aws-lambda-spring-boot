package com.javamultiplex.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Rohit Agarwal on 31/05/21 3:14 pm
 * @copyright www.javamultiplex.com
 */
@Getter
@Setter
public class Post implements Serializable {
    private static final long serialVersionUID = 4169935340774149236L;
    private String userId;
    private String id;
    private String title;
    private String body;
}
