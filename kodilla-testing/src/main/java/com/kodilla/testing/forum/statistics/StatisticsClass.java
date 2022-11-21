package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsClass {
    int usersCount;
    int postCount;
    int commentCount;
    int averageNumberOfPosts;
    int averageNumberOfComments;
    int averageNumberOfCommentsPost;


    void calculateAdvStatistics(Statistics statistics) {

        List<String> strings = statistics.userNames();
        usersCount = strings.size();

        postCount = statistics.postsCount();

        commentCount = statistics.commentsCount();

        if (usersCount <= 0) {
            averageNumberOfPosts = 0;
        } else {
            averageNumberOfPosts = postCount / usersCount;
        }

        if (usersCount <= 0) {
            averageNumberOfComments = 0;
        } else {
            averageNumberOfComments = commentCount / usersCount;
        }

        if (postCount <= 0) {
            averageNumberOfCommentsPost = 0;
        } else
            averageNumberOfCommentsPost = commentCount / postCount;
    }
}
