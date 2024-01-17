package PageLayer;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{

	public String validateTitle()
	{
		return driver.getTitle();
		
	}
	public String validateUrl()
	{
		return driver.getCurrentUrl();
	}
}
