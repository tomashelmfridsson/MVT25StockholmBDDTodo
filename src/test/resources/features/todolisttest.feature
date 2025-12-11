Feature: TodoList

  Scenario: Add Task
    Given I have created a todolist
    When I add a task with description "Köpa mjölk"
    Then I have a task with description "1. [ ] Köpa mjölk"

  Scenario: Mark the task as completed
    Given I have created a todolist
    And I add a task with description "Betala räkningar"
    When I complete task 1 as done
    Then I get 1 number of completed tasks
    