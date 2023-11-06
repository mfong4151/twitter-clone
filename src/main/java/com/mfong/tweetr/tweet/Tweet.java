package com.mfong.tweetr.tweet;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="\"tweets\"")

public class Tweet {
    @Id
    @SequenceGenerator(
        name = "tweet_sequences",
        sequenceName =  "tweet_sequences",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "tweet_sequences"
    )
    private Long id;
    @Column(name="body", nullable = false, length=140)
    private String body;
    @OneToOne
    private Long authorId;
    @Column(nullable = true)
    private Long parentTweetId;
    private Date createdAt;
    private Date updatedAt;
}
