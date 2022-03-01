package com.example.demo;

public class Transformation {

    private final long id;
    private final String content;

    public Transformation(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
