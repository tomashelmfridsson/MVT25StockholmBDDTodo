package stepdefinitions;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import todo.TodoList;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void iCompleteTaskAsDone(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("I get {int} number of completed tasks")
    public void iGetNumberOfCompletedTasks(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
