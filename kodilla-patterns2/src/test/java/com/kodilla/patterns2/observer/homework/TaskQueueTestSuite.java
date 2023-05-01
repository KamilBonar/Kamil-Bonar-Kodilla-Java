package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void RegisterMentorTest(){
        //Given
        TasksQueue tasksQueue1 = new TasksQueue("Jan Kowalski");
        TasksQueue tasksQueue2 = new TasksQueue("Anna Kot");
        TasksQueue tasksQueue3 = new TasksQueue("Janusz Panek");

        TaskObserver AdamMak = new Mentor("Adam Mak");
        TaskObserver MarcinLina = new Mentor("Marcin Lina");

        //When
        tasksQueue1.registerMentor(AdamMak, tasksQueue1);
        tasksQueue2.registerMentor(AdamMak, tasksQueue2);
        tasksQueue3.registerMentor(MarcinLina, tasksQueue3);

        //Then
        assertEquals(2, AdamMak.countQueues());
        assertEquals(1, MarcinLina.countQueues());
    }
}