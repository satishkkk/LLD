package day3.designPatterns.bridge.resources;


import java.util.ArrayList;
import java.util.List;

import day3.designPatterns.bridge.Detail;
import day3.designPatterns.bridge.Movie;

public class MovieResource extends Resource {

	private Movie movie;
	
	public MovieResource(Movie movie) {
		this.movie = movie;
	}
	
	@Override
	public List<Detail> getDetails() {
		List<Detail> details = new ArrayList<>();
		
		details.add(new Detail("Title", movie.getTitle()));
		details.add(new Detail("Year", movie.getYear()));
		details.add(new Detail("Runtime", movie.getRuntime()));

		return details;
	}

	@Override
	public String getHeader() {
		return movie.getClassification();
	}

}
