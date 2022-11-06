Feature: DemoCucumber

  Scenario: Chrome_Test_1_failed
    Given user navigate to "https://www.google.com/"
    When browser is "Chrome"
    Then run scenario Chrome_Test_1_failed

  Scenario: Chrome_Test_2_failed
    Given user navigate to "https://www.google.com/"
    When browser is "Chrome"
    Then run scenario Chrome_Test_2_failed

  Scenario: Edge_Test_1_failed
    Given user navigate to "https://www.google.com/"
    When browser is "Edge"
    Then run scenario Edge_Test_1_failed

  Scenario: Edge_Test_2_failed
    Given user navigate to "https://www.google.com/"
    When browser is "Edge"
    Then run scenario Edge_Test_2_failed