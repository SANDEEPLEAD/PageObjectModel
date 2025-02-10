Feature: Cucumber login  functionality

  @smoke
  Scenario: Verify login functionality
    Given navigate the application Url
    When Enter the username "selenium" into username field
    When Enter the password "selenium" into password field
    When click on login
    Then verify login success
    
  @Regression
  Scenario Outline: Retest on login functionality
    Given navigate the application Url
    When Enter the username "<username>" into username field
    When Enter the password "<password>" into password field
    When click on login
    Then verify login success

    Examples: 
      | username | password |
      | selenium | selenium |
      | Sai      | selenium |
      | selenium | Akki     |

