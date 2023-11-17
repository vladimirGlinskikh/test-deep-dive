package kz.zhelezyaka.testdeepdive;

import kz.zhelezyaka.testdeepdive.todo.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class TodoRepository {
    private static final Logger log = LoggerFactory.getLogger(TodoRepository.class);
    List<Todo> todos;

    public TodoRepository() {
        todos = List.of(
                new Todo("Test 1", true),
                new Todo("Test 2", true));
    }

    List<Todo> findAll() {
        log.info("TodoRepository.findAll() called...");
        return todos;
    }
}
