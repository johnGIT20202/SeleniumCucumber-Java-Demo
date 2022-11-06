Feature: DemoCucumber

  Scenario: Chrome_Test_1
    Given user navigate to "https://www.google.com/"
    When browser is "Chrome"
    Then run scenario Chrome_Test_1

  Scenario: Chrome_Test_2
    Given user navigate to "https://www.google.com/"
    When browser is "Chrome"
    Then run scenario Chrome_Test_2

  Scenario: Edge_Test_1
    Given user navigate to "https://www.google.com/"
    When browser is "Edge"
    Then run scenario Edge_Test_1

  Scenario: Edge_Test_2
    Given user navigate to "https://www.google.com/"
    When browser is "Edge"
    Then run scenario Edge_Test_2