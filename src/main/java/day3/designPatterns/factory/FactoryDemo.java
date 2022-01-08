package day3.designPatterns.factory;

import day3.designPatterns.factory.websites.Blog;
import day3.designPatterns.factory.websites.Website;

public class FactoryDemo {

	public static void main(String[] args) {
		Blog site = (Blog) WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println(site.getPages());
		
		//site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		System.out.println(site.getPages());
	}

}
