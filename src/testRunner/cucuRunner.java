package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*
 * Dry Run : dryRun option can either set as true or false. 
 * If it is set as true, it means that Cucumber will only checks that every Step mentioned in the Feature File 
 * have corresponding code written in Step Definition file or not. 
 * So in case any of the function is missed in the Step Definition for any Step in Feature File, it will give us the message. 
 * For practice just add the code ‘dryRun = true‘ in TestRunner class.
 * 
 * Monochrome : his option can either set as true or false. 
 * If it is set as true, it means that the console output for the Cucumber test are much more readable. 
 * And if it is set as false, then the console output is not as readable as it should be. 
 * For practice just add the code ‘monochrome = true‘ 
 * 
 * Features : Features Options helps Cucumber to locate the Feature file in the project folder structure. 
 * You must have notices that we have been specifying the Feature Option in the TestRunner class since the first chapter. 
 * All we need to do is to specify the folder path and Cucumber will automatically find all the ‘.features‘ extension 
 * files in the folder.
 * To run multiple feature file, 
 * features = {"classpath:multicolumn.feature","classpath:outline.feature"},
 * 
 * Format: This is used to generate the report of test execution. format={"html:TestReports"}
 * here 'html' is the format and 'TestReports' is the name of the report folder to be generated.
 * 
 * 
 * Glue : It is almost the same think as Features Option but the only difference is that it 
 * helps Cucumber to locate the Step Definition file. 
 * Whenever Cucumber encounters a Step, it looks for a Step Definition inside all the files 
 * present in the folder mentioned in Glue Option
 * 
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"Features/Gmail.feature","Features/GmailLogin.feature"},
		glue={"stepDefination"},
		monochrome = true,
		format={"html:TestReports"},
		dryRun=false)


public class cucuRunner 
{}
