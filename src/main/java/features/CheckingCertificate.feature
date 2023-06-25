Feature: try1
  @Me
  Scenario: Check certificate
    When I write certificate "123456"
    Then check certificate validation "false"

    @Me
    Scenario:
      When I write certificate "5678899"
      Then check certificate validation "true"

      @Me
      Scenario Outline:
        When I write certificate "<CERTIFICATE>"
        Then check certificate validation "<EXPECTED>"
        Examples:
          | CERTIFICATE | EXPECTED |
          | 123456      | false    |
          | 5678899     | true     |
          | 346666      | false    |
