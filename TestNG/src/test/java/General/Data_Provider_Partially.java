package General;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Partially 
{
	 @Test (dataProvider = "dp1")
	 public void testLogin(String s) throws Exception
	 {
		 System.out.println(s);
	 }
	 
	 @DataProvider(indices= {0,2})
		public String[] dp1()
		{
		 String[] data = new String[]
				 {
						 "Rohit",
						 "Aniket",
						 "Gaurav",
						 "Mayur"
				 };
		 return data;
		}
}
