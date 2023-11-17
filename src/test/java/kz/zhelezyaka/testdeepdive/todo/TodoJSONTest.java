package kz.zhelezyaka.testdeepdive.todo;

import com.jayway.jsonpath.JsonPath;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoJSONTest {

    @Test
    void shouldCompareJson() throws JSONException {
        var data = getRestData();
        var expected = """
                {
                     "todos": [
                     {
                     "name": "Test 2",
                     "completed": true
                     },
                     {
                     "name": "Test 1",
                     "completed": true
                     }
                   ]           
                }
                """;


        JSONAssert.assertEquals(expected, data, false);
    }

    @Test
    void shouldCompareJSONPath() {
        var json = """
                {
                     "todos": [
                     {
                     "completed": true,
                     "name": "Test 1"
                     },
                     {
                     "completed": true,
                     "name": "Test 2"
                     }
                   ]           
                }
                """;
        Integer length = JsonPath.read(json, "$.todos.length()");
        String name = JsonPath.read(json, "$.todos[0].name");
        assertEquals(2, length);
        assertEquals("Test 1", name);
    }

    private String getRestData() {
        return """
                {
                     "todos": [
                     {
                     "completed": true,
                     "name": "Test 1"
                     },
                     {
                     "completed": true,
                     "name": "Test 2"
                     }
                   ]           
                }
                """;
    }
}
