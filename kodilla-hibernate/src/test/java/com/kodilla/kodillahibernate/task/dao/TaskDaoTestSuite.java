package com.kodilla.kodillahibernate.task.dao;

import com.kodilla.kodillahibernate.task.Task;
import com.kodilla.kodillahibernate.tasklist.TaskList;
import com.kodilla.kodillahibernate.task.TaskFinancialDetails;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TaskDaoTestSuite {

    @Test
    void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

        //When
        taskDao.save(task);
        int id = task.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        taskDao.deleteById(id);
    }
}
