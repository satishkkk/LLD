package day3.designPatterns.factory.websites;

import day3.designPatterns.factory.pages.CartPage;
import day3.designPatterns.factory.pages.ItemPage;
import day3.designPatterns.factory.pages.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
