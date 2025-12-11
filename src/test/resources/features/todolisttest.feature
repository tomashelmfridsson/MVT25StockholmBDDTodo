Feature: TodoList

  Background:
    Given I have created a todolist

    # Add Task tester
  Scenario: Add Task
    When I add a task with description "Köpa mjölk"
    Then I have a task with description "1. [ ] Köpa mjölk"

    # Complete Task tester & Is Task Finished
  Scenario: Mark the task as completed
    Given I add a task with description "Betala räkningar"
    When I complete task 0 as done
    Then I get 0 number of completed tasks
    And I have a task with description "1. [X] Betala räkningar"
    And I have task 0 finished

      # Negativt test
  Scenario: Complete a none existing task

    # Get Number Of Tasks tester
  Scenario: Add Multiple Tasks
    When I add a task with description "Köpa mjölk"
    And I add a task with description "Betala räkningar"
    Then I have a task with description "1. [ ] Köpa mjölk\n2. [ ] Betala räkningar"





