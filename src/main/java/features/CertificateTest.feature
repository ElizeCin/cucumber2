Feature: Test certificate validation
  Scenario Outline:
    When I open page "https://certificate.ithillel.ua/"
    And send certificate number "45924126"
    And click check button
    Then check the validity "true"



