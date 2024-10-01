package com.example.social.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "posts")
public class Post implements Serializable {

    public Post(Long id, Long reposts, Long likes, Long comments) {
        this.reposts = reposts;
        this.likes = likes;
        this.comments = comments;
    }

    public Post() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "reposts", nullable = false)
    private Long reposts;

    @Column(name = "likes", nullable = false)
    private Long likes;

    @Column(name = "comments")
    private Long comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReposts() {
        return reposts;
    }

    public void setReposts(Long reposts) {
        this.reposts = reposts;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", reposts=" + reposts +
                ", likes=" + likes +
                ", comments=" + comments +
                '}';
    }
}
