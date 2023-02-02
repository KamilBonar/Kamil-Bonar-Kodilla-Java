package com.kodilla.kodillahibernate.tasklist.dao;

import com.kodilla.kodillahibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME= "List1";
    private static final String DESCRIPTION = "Description1";

    @Test
    void testFindByListName() {

        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTask = taskListDao.findByListName(listName);

        //Then
        assertEquals(1, readTask.size());

        //CleanUp
        taskListDao.delete(taskList);
    }
}