package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUser = new ArrayList<>();

    public Forum() {
        forumUser.add(new ForumUser(001, "Jan Kowalski", 'M', 2011, 2, 18, 33));
        forumUser.add(new ForumUser(002, "Adam Nowak",'M', 1995, 6, 14, 6));
        forumUser.add(new ForumUser(003, "Anna Pies",'F', 1987,12 , 12, 63));
        forumUser.add(new ForumUser(004, "Andrzej Kiełbasa",'M', 1975, 4, 25, 1));
        forumUser.add(new ForumUser(005, "Maria Cedro",'F', 1984, 1, 15, 10));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUser);
    }
}
