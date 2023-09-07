package day25.feb08;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeAnnotation1ExtendsBase extends PracticAllAnnotationBase {
	
	@Test
	public void test() {
		Reporter.log("Create customer", true);
	}

}
