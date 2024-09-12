package com.example.social.serializables;

import com.example.social.entities.Post;

public record PostRecord(Long likes, Long reposts, Post comments, Long id) {
}
