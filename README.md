# smbc-test
Running test

1) Go to TestRunner file (src/test/java/com) under the package com.smbc.tests.runners and Run as JUnit Test

2) Command line execution: 
	a) Go to the path where the project was downloaded
	b) type :  mvn clean test (by default parallel is true) or mvn test -Dparallel=true
	c) To run sequentially - mvn test -Dparallel=false

3) Check the report
   Go to target folder and open the cucumber.html in the browser after the test run
   
4) In Anagram_Checker.feature file change any examples output from true to false and run & verify feature file scenario is failed.
