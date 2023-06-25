Feature: consult
  @CCC
  Scenario: confirm form
    When I click consultation button
    And fill in the form
      | name  | email             | telegram        | phone     | viber     | course     |  |
      | Aslak | aslak@cucumber.io | @aslak_hellesoy | 974556789 | 789654123 | Java Basic |  |

    Then Check confirm button
