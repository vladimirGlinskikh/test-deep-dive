package kz.zhelezyaka.testdeepdive.todo;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TodoHamcrestTest {

    @Test
    void shouldCreateNewTodo() {
        var test1 = new Todo("Test", true);
        var test2 = new Todo("Test", true);

        assertThat(test1, equalTo(test2));
    }
}
