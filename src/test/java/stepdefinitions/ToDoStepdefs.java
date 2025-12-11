package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import todo.TodoList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToDoStepdefs {
    private TodoList todoList;

    @Given("I have created a todolist")
    public void iHaveCreatedATodolist() {
        todoList = new TodoList();
    }

    @When("I add a task with description {string}")
    public void iAddATaskWithDescription(String task) {
        todoList.addTask(task);
    }

    @Then("I have a task with description {string}")
    public void iHaveATaskWithDescription(String list) {
        String expected = list;
        String actual = todoList.getList().trim();
        assertEquals(expected,actual);
    }

    @When("I complete task {int} as done")
    public void iCompleteTaskAsDone(int index) {
        todoList.completeTask(index);
    }

    @Then("I get {int} number of completed tasks")
    public void iGetNumberOfCompletedTasks(int index) {
        boolean expected = true;
        boolean actual = todoList.isTaskFinished(index);
    }

    @And("I have task {int} finished")
    public void iHaveTaskFinished(int index) {
        assertTrue(todoList.isTaskFinished(index));

    }
}
