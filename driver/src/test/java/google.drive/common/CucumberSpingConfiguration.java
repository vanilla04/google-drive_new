package google.drive.common;


import google.drive.DriverApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DriverApplication.class })
public class CucumberSpingConfiguration {
    
}
