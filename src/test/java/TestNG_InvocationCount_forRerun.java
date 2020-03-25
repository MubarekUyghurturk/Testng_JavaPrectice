import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_InvocationCount_forRerun {


    @Test (invocationCount =3)
    public void Z(){
        System.out.println( "inside method Z");
    }



    @AfterMethod
    public void end(){

    }



    @Test (invocationCount = 2)
    public void Y(){
        System.out.println( "inside method Y");
    }
}

