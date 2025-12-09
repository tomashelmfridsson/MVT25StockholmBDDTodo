package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import todo.TodoList;

public class MyStepdefs {

    TodoList todoList;

    @Given("I have created a todolist")
    public void iHaveCreatedATodolist() {
        todoList = new TodoList();
    }
}
