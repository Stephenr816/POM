package com.qa.opencart.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.Constants;

public class AccountsPageTest extends BaseTest{
	
	@BeforeClass
	public void accPageSetup() {
		
		accPage = lp.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void accPageTitleTest() {
		
		String title = accPage.getAccPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, Constants.ACCOUNTS_PAGE_TITLE);
	}
	
	@Test
	public void accPageUrlTest() {
		
		String url = accPage.getAccountPageUrl();
		Assert.assertTrue(url.contains(Constants.ACCOUNTS_PAGE_URL));
	
	}
	
	@Test
	public void AccountPageSectionListTest() {
		
		List<String> secList = accPage.getAccountPageSectionList();
		
		for (String e : secList) {
			
			System.out.println(e);
			
		}
		
		Assert.assertEquals(secList, Constants.ACCOUNTS_SEC_LIST);
	}
	
	
	
	

}
