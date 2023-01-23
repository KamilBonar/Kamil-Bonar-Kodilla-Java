package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        List<String> toDoList = board.getToDoList().getTasksList();
        toDoList.add("taskOne");

        List<String> inProgressList = board.getInProgressList().getTasksList();
        inProgressList.add("taskTwo");

        List<String> doneList = board.getDoneList().getTasksList();
        doneList.add("taskThree");

        //Then
        Assertions.assertEquals("taskOne", toDoList.get(0));
        Assertions.assertEquals("taskTwo", inProgressList.get(0));
        Assertions.assertEquals("taskThree", doneList.get(0));
    }
}