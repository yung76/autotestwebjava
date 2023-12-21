# your_feature.feature

Feature: Login

  Scenario: Login success
    Given I open the Firefox browser
    When I navigate to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And write username "Admin"
    And write password "admin123"
    Then click in login button
    Then validated entry home page
