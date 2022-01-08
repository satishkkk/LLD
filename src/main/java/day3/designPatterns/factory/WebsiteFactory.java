package day3.designPatterns.factory;

import day3.designPatterns.factory.websites.Blog;
import day3.designPatterns.factory.websites.Shop;
import day3.designPatterns.factory.websites.Website;

public class WebsiteFactory {

	public static Website getWebsite(WebsiteType siteType) {
		switch(siteType) {
			case BLOG : {
				return new Blog();
			}
		
			case SHOP : {
				return new Shop();
			}
			
			default : {
				return null;
			}
 		}
	}
	
}
