@anagram @negative
Feature: Anagram Checker - Non-Anagram Pairs
  As a user
  I want to check if two strings are anagrams
  So that I can verify strings that are NOT anagrams return false

  Scenario Outline: Verify strings that are NOT anagrams return false
    Given the input strings "<input1>" and "<input2>"
    When I check if they are anagrams
    Then the result should be "<output>"

    Examples:
      | input1 | input2 | output |
      | hello  | world  | false  |
      | rat    | car    | false  |
