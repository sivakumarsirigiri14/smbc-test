package com.smbc.tests.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramSteps {

    private String input1;
    private String input2;
    private boolean result;

    @Given("the input strings {string} and {string}")
    public void the_input_strings(String input1, String input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    @When("I check if they are anagrams")
    public void i_check_if_they_are_anagrams() {
        result = areAnagrams(input1, input2);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expectedOutput) {
        boolean expected = Boolean.parseBoolean(expectedOutput);
        assertEquals(expected, result,
            "areAnagrams(\"" + input1 + "\", \"" + input2 + "\") expected=" + expected + " actual=" + result);
    }


    /**
     * Returns true if input1 and input2 are anagrams of each other.
     * Ignores spaces and is case-insensitive.
     * Examples:
     *   "listen",  "silent"          -> true
     *   "school master", "classroom" -> true  (spaces stripped)
     *   "hello",   "world"           -> false
     */
    static boolean areAnagrams(String input1, String input2) {
        char[] a = input1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] b = input2.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
