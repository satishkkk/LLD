package day3.designPatterns.bridge;

import day3.designPatterns.bridge.formatters.Formatter;
import day3.designPatterns.bridge.formatters.HtmlFormatter;
import day3.designPatterns.bridge.formatters.PrintFormatter;
import day3.designPatterns.bridge.resources.MovieResource;
import day3.designPatterns.bridge.resources.Resource;

public class BridgeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2:15");
		movie.setYear("2014");
		
		Resource movieResource = new MovieResource(movie);

		
		Formatter printFormatter = new PrintFormatter(movieResource);
		
		String printedMaterial = printFormatter.render();
		
		System.out.println(printedMaterial);
		
		
		Formatter htmlFormatter = new HtmlFormatter(movieResource);
		
		String htmlMaterial = htmlFormatter.render();
		
		System.out.println(htmlMaterial);
		
	}

}
