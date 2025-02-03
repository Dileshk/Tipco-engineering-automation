import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class GenerateXmlAndExecuteItAtRuntime {
 
public void StartTest() {
    XmlSuite suite = new XmlSuite();
    suite.setName("MyTestSuite"); // this means <suite name = "codekru">

    XmlTest test = new XmlTest(suite);
    test.setName("SequentialTestExecution"); // this means <test name = "codekru">
    List<XmlClass> classes = new ArrayList<XmlClass>(); // <classes>
    classes.add(new XmlClass("Test.TesttipcoLogin")); // this means <class name = "Test.CodekruTest">
    test.setXmlClasses(classes);

    List<XmlSuite> suites = new ArrayList<XmlSuite>();
    suites.add(suite);
    TestNG testng = new TestNG();
    testng.setXmlSuites(suites);
    testng.run();
   }
}