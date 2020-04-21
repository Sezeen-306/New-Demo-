package com.webtest.socialware.pageObj;

import org.openqa.selenium.By;

public class LoginPageObj {
	
	public By user_name_field = By.xpath("//input[@placeholder='Email']");
	
	public By user_password_field= By.xpath("//input[@type='password']");
	
	public By user_login_btn=By.xpath("//input[@value='Log in']");

}
