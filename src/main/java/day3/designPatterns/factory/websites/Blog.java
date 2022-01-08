package day3.designPatterns.factory.websites;


import day3.designPatterns.factory.pages.AboutPage;
import day3.designPatterns.factory.pages.CommentPage;
import day3.designPatterns.factory.pages.ContactPage;
import day3.designPatterns.factory.pages.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
