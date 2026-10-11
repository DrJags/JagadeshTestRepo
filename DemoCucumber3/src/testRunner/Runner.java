package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature",   //All feature file will executed bcz of mentioning the Feature as a folder
        glue={"StepDefinition"},
        plugin= {"com.cucumber.listener.ExtentCucumberFormatter:Output/report.html"},
        monochrome = true, //By default value is false. purpose : Console log should be readable
        tags= {"@reg"},  //Only @login and @reg will run independent of the scenarios. 
        format={"pretty"} //Presentable view in the Console Screen
                               //By using tags we can control which scenario will be executed
        					  //~@reg it will not execute but all other tags will be executed
        
)
public class Runner {

}

//Comments Section in case of 500 scenarios provide one common tag like @Reg so that all scenarios will be executed tags={"@Reg"}
//@reg @smoke  it will execute when we call any one
//We can use same tag name for many scenarios 
//And can be placed for When and Then