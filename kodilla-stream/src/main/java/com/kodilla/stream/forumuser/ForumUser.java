package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Year;

public class ForumUser {
    private final int idUser;
    private final String userName;
    private final char sex;
    private final LocalDate birth;
    private final int postsList;

    public ForumUser(final int idUser, final String userName, final char sex, final int year, final int month, final int day, final int postsList) {
        this.idUser = idUser;
        this.userName = userName;
        this.sex = sex;
        this.birth = LocalDate.of(year, month, day);
        this.postsList = postsList;
    }


    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getPostsList() {
        return postsList;
    }

    public int getAge() {
        int age = Year.now().getValue() - getBirth().getYear();
        return age;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birth=" + birth +
                ", postsList=" + postsList +
                '}';
    }
}
