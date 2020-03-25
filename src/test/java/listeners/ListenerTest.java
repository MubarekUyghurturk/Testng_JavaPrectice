package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listeners.CustomListener.class)
public class ListenerTest {

    private Object listenets;

    @Test
    public void test1(){
        System.out.println("This is test1");
        Assert.assertEquals("A","A");
    }


    @Test
    public void test2(){
        System.out.println("This is test2");
        Assert.assertEquals("A","B");
    }




    @Test
    public void test3(){
        System.out.println("This is test3");
        throw new SkipException("This is skip exception....");
    }

}
