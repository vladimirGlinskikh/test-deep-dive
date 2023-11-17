package kz.zhelezyaka.testdeepdive.todo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoAssertJTest {

    @Test
    void shouldCreateNewTodo() {
        var test = new Todo("Test", true);

        assertThat(test.name())
                .startsWith("T")
                .endsWith("t")
                .contains("es")
                .isEqualTo("Test");
    }
}
