import org.testng.annotations.*;

public class TC2 {




       @BeforeClass
       public void beforeClass(){
           System.out.println();

        }


        @AfterClass
        public void afterClass(){
            System.out.println("This will execute after the class");
        }



        @BeforeMethod
        public void beforeMethod(){
            System.out.println("This is will execute before every Method");
        }


        @AfterMethod
        public void afterMethod(){
            System.out.println("This will execute after every Method");
        }



        @Test
        public void test1(){
            System.out.println("This is test1");
        }



        @Test
        public void test2(){
            System.out.println("This is test2");
        }
    }

