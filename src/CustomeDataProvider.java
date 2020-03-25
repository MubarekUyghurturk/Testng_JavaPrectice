import org.testng.annotations.DataProvider;

public class CustomeDataProvider {




    // provide data to LoginTest method in DataProviderExample.class . this is the other example to use DataProvider
    // in this case, we go back to the LoginTest method to add one more parameter that which class provide data to this LoginTest method
    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {

        Object[][] data = {{"abc@gmail.com", "abc"}, {"def@gmail.com","def"},{"ghi@gmail.com","ghi"}};
        return data;
    }
}
