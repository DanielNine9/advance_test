package huydqpc07859_lab2;

import org.junit.Assert;		
import org.junit.Test;		

public class SuiteTest2 {				
   	

    @Test		
    public void createAndSetName() {					
        		

        String expected = "Y";					
        String actual = "Y";					

        Assert.assertEquals(expected, actual);					
        System.out.println("createAndSetName func in SuiteTest2 is successful " + actual);							
    }		

}	
