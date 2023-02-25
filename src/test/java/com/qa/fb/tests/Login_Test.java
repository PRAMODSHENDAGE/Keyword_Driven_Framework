package com.qa.fb.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.qa.fb.keyword.engine.Keyword_Engine;

public class Login_Test {
	
	public Keyword_Engine Keyword;
	public static Logger Log = Logger.getLogger(Login_Test.class);
	
	@Test
	public void login_Test() {
		Log.info("Starting the Execution");
		Keyword = new Keyword_Engine();
		Keyword.start_Execution("Login");
	}
}
