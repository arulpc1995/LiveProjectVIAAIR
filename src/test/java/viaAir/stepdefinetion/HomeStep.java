package viaAir.stepdefinetion;

import com.ViaAir.POM.Home;

import cucumber.api.java.en.Given;
import functionBase.basefunction;

public class HomeStep extends basefunction  {
	@Given("The user in home booking flight page")
	public void the_user_in_home_booking_flight_page() {
		Home h=new Home();
	   click(h.getBookinflight());
	   String t1 = getText(h.getBookinflight());
	   System.out.println(t1);
	   
	}
	

}
