package kz.zhelezyaka.testdeepdive.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoJUnitTest {
    @Test
    void shouldCreateNewTodo() {
        var test = new Todo("Test", true);

        assertEquals("Test", test.name(),
                "Todo name was not equal to test.");

        assertTrue(test.completed());
    }
}