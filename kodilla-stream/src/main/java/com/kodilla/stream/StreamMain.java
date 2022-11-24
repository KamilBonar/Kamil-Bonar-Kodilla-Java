package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUser = forum.getUserList().stream()

                .filter(ForumUser -> ForumUser.getSex() == 'M')
                .filter(ForumUser -> ForumUser.getAge() > 20)
                .filter(ForumUser -> ForumUser.getPostsList() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, ForumUser -> ForumUser));

        forumUser.entrySet().stream()
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);
    }
}