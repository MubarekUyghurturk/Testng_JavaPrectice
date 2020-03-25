import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {


    // depends on the numbers of parameters under the DataProvider method, this Test method will execuite multiple times
    // we don't need to use a looping method for exacuite multiple user credencials. this is the advantages of the DataProvider
    @Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomeDataProvider.class)
    public void loginTest(String email, String password){
        System.out.println(email + " " + password);
    }




     // some times DAtaProvider method can be define in different class, so we create ==> CustomeDataProvider to demo for this situation

  /*  @DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {

        Object[][] data = {{"abc@gmail.com", "abc"}, {"def@gmail.com","def"},{"ghi@gmail.com","ghi"}};
        return data;
    }
*/

}
