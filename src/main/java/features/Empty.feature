Feature: Empty first run
  Scenario: Sout
    When sout my name
    And sout my family
    Then sout my age

    Scenario: data
      When sout my name "Tais"
      And sout my family "Smyrnova" and family my husband "Khyzha"