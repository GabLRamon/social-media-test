package com.example.social.mappers;


import com.example.social.entities.Post;
import com.example.social.serializables.PostRecord;

public class PostMapper {

    public PostRecord toRecord (Post post) {
        PostRecord postRecord = new PostRecord(post.getLikes(), post.getReposts(), post.getComments(), post.getId());
        return postRecord;
    }

}
