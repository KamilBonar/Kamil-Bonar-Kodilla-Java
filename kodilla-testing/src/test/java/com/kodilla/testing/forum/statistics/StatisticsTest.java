package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class StatisticsTest {

    Statistics statisticsMock = Mockito.mock(Statistics.class);

    @Test
    public void test0Posts() {

        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        int postCounter0 = 0;
        when(statisticsMock.postsCount()).thenReturn(postCounter0);

        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, statisticsClass.postCount);
    }

    @Test
    public void test1000Posts() {

        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        int postCounter1000 = 1000;
        when(statisticsMock.postsCount()).thenReturn(postCounter1000);

        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(1000, statisticsClass.postCount);
    }

    @Test
    public void test0Comments() {

        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        int commentCounter = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentCounter);

        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, statisticsClass.commentCount);
    }

    @Test
    public void testMoreCommentsThanPosts() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        int commentCounter = 50;
        int postCounter = 45;
        when(statisticsMock.commentsCount()).thenReturn(commentCounter);
        when(statisticsMock.postsCount()).thenReturn(postCounter);

        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(50, statisticsClass.commentCount);
        Assertions.assertEquals(45, statisticsClass.postCount);
    }

    @Test
    public void testMorePostsThanComments() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        int commentCounter = 45;
        int postCounter = 50;
        when(statisticsMock.commentsCount()).thenReturn(commentCounter);
        when(statisticsMock.postsCount()).thenReturn(postCounter);

        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(45, statisticsClass.commentCount);
        Assertions.assertEquals(50, statisticsClass.postCount);
    }

    @Test
    public void test0Users() {

        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        List<String> zeroUsers = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(zeroUsers);

        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, statisticsClass.usersCount);
    }

    @Test
    public void test100Users() {

        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        List<String> hundredUsers = generateList(100);
        when(statisticsMock.userNames()).thenReturn(hundredUsers);

        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(100, statisticsClass.usersCount);
    }

    private List<String> generateList(int numberOfUsers) {
        List<String> userList = new ArrayList<>();
        for (int n = 1; n <= numberOfUsers; n++) {
            String user = "User " + n;
            userList.add(user);
        }
        return userList;
    }
}
