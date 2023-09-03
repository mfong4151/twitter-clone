Current Twitter clone that I'm doing in Java Spring Boot. Not a huge portfolio project, just a way for me to dump commits on my Github.

User Table:

    user_id (Primary Key)
    username (Unique)
    email
    password_hash
    profile_picture_url
    bio
    registration_date
    last_login

Tweet Table:

    tweet_id (Primary Key)
    user_id (Foreign Key referencing User Table)
    content
    timestamp
    retweet_count
    like_count

Follower Table:

    follower_id (Primary Key, Foreign Key referencing User Table)
    followee_id (Primary Key, Foreign Key referencing User Table)
    follow_date

Hashtag Table:

    hashtag_id (Primary Key)
    tag_name (Unique)
    creation_date

TweetHashtag Table:

    tweet_id (Foreign Key referencing Tweet Table)
    hashtag_id (Foreign Key referencing Hashtag Table)

Like Table:

    like_id (Primary Key)
    user_id (Foreign Key referencing User Table)
    tweet_id (Foreign Key referencing Tweet Table)
    like_date

Retweet Table:

    retweet_id (Primary Key)
    user_id (Foreign Key referencing User Table)
    tweet_id (Foreign Key referencing Tweet Table)
    retweet_date

Reply Table:

    reply_id (Primary Key)
    user_id (Foreign Key referencing User Table)
    tweet_id (Foreign Key referencing Tweet Table)
    reply_content
    reply_date

Notification Table:

    notification_id (Primary Key)
    user_id (Foreign Key referencing User Table)
    content
    timestamp
    seen (Boolean)# twitter-clone
