package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {
    // we have to define all the ITestListener Methods, because ITestListener is an interface whenever we
    // trying to implement this interface we must address all the methods within the class.
    // even though we haven't implement those method which is ===> onTestFailedButWithinSuccessPercentage




   // This belongs to ITestListener and will execute before starting of Test Case/ Batch
    // this method only executing one time before all the methods
    public void onStart(ITestContext arg){

        System.out.println("start Test Execution .... " + arg.getName());
    }


    // This belongs to ITestListener and will execute after starting of Test Case/ Batch
    // this method only executing one time after all the methods
    public void onFinish(ITestContext arg){

        System.out.println("Finish Test Execution .... " + arg.getName());
    }


    // This belongs to ITestListener and will execute before the main test start  ex: @Test
    public void onTestStart(ITestResult arg0){

        System.out.println("start Test .... " + arg0.getName());
    }


    // This belongs to ITestListener and will execute when test is skipped
    public void onTestSkipped(ITestResult arg0){

        System.out.println("Skipped Test.... " + arg0.getName());
    }


    // This belongs to ITestListener and will execute when a test is passed
    public void onTestSuccess(ITestResult arg0){

        System.out.println("passed test .... " + arg0.getName());
    }



    // This belongs to ITestListener and will execute when a test is Failed
    public void onTestFailure(ITestResult arg0){

        System.out.println("Failed test.... " + arg0.getName());
    }


    //NOT so important...... ignore this as of now
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0){

    }





}
