package com.login.tests;

import org.testng.annotations.Test;

public class Login_User 
{
  @Test
  public void valid_user()
  {
	  System.out.println("Valid User Login");
  }
  
  @Test
  public void invalid_user()
  {
	  System.out.println("Invalid User");
  }
  @Test
  public void invalid_pass()
  {
	  System.out.println("Invalid pass");
  }
  
  @Test
  public void Blank()
  {
	  System.out.println("User Blank");
  }
  
}
