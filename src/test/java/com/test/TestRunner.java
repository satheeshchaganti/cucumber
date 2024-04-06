package com.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"D:\\Latest workspace\\cucumber2\\Feature Files\\Login.feature"},
		    glue= {"com.test"},
		  plugin= {"pretty",
				   "html:target/report/cucumber.html",
				   "json:target/report/cucumber.json"
		          },
		dryRun=false	
		         )

public class TestRunner extends AbstractTestNGCucumberTests 
{

}
