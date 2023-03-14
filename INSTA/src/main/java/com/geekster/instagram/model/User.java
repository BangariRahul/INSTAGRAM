package com.geekster.instagram.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_user")
public class User {

    @Id//primary key
    @Column(name = "user_id") // to create column name
    @GeneratedValue(strategy = GenerationType.IDENTITY) // To auto generate primary key
    private int userId;


    private String firstName;


    private String lastName;


    private Integer age;


    private String email;


    private String phoneNumber;

}
