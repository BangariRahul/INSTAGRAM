package com.geekster.instagram.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_post")
public class Post {

    @Id
    @Column(name = "post_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;


    private Timestamp createdDate;


    private Timestamp updatedDate;


    private String postData;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}
