package com.mfong.tweetr.user;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="\"users\"")
public class User{
    @Id
    @SequenceGenerator(
        name = "user_sequences",
        sequenceName = "user_sequences",
        allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "user_sequences"
    )
    private Long id;
    private String username;
    private String password;
    private Date regDate;
    private String bio;

    public User(){

    }

    public User(
                Long id,
                String username,
                String password,
                String bio,
                Date regDate
                ){
        
        this.id = id;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.regDate = regDate;
    }

    public User(
                String username,
                String password,
                String bio,
                Date regDate
                ){
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.regDate = regDate;

    }   

    public Long getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getBio(){
        return bio;
    }

    public Date getRegDate(){
        return regDate;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setBio(String bio){
        this.bio = bio;
 
    }

    public void setRegDate(Date regDate){
        this.regDate = regDate;
    }
}