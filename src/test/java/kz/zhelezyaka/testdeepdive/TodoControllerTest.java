package kz.zhelezyaka.testdeepdive;

import kz.zhelezyaka.testdeepdive.todo.Todo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TodoController.class)
class TodoControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    TodoRepository todoRepository;

    @Test
    void shouldFindAllTodos() throws Exception {
        var todos = List.of(
                new Todo("Test 1", true),
                new Todo("Test 2", true));

        Mockito.when(todoRepository.findAll()).thenReturn(todos);

        mockMvc.perform(get("/api/todos"))
                .andExpect(status().isOk());
    }
}