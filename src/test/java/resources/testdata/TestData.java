package resources.testdata;

import org.testng.annotations.DataProvider;
public class TestData {

    @DataProvider(name = "Credentials")
    public Object[][] getData() {
        Object[][] data = new Object[][]{

                {"Admin", "admin123"}


        };
        return data;
    }



}
