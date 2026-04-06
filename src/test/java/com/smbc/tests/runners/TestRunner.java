package com.smbc.tests.runners;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.*;

/**
 * Single runner — discovers ALL feature files under features/.
 *
 * Parallelism is controlled by:
 *   junit-platform.properties  : thread count within each JVM fork
 *   pom.xml forkCount          : number of parallel JVM processes
 *
 * Useful run commands:
 *   mvn test                                         run all features (parallel)
 *   mvn test -Dparallel=false                        run all features sequentially
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME,  value = "com.smbc.tests.steps")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber.html, json:target/cucumber.json")
public class TestRunner {
}
