# your_feature.feature

Feature: Home

  Scenario: Add new employee
    Given I open the Firefox browser
    When I navigate to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And write username "Admin"
    And write password "admin123"
    Then click in login button
    Then validated entry home page
    And go to PIM section
    Then add new employee
    #Then employee add success

  Scenario: Add information to new employee
    Given I open the Firefox browser
    When I navigate to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And write username "Admin"
    And write password "admin123"
    Then click in login button
    Then validated entry home page
    And go to PIM section
    Then add new employee
    And go to emergency contact
    And add new emergency contact
    And go to salary
    Then add salary component

  Scenario: Update information to old employee
    Given I open the Firefox browser
    When I navigate to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And write username "Admin"
    And write password "admin123"
    Then click in login button
    Then validated entry home page
    And go to PIM section
    And select first employee of the list
    And go to salary
    Then add salary component