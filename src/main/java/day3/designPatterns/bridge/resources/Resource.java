package day3.designPatterns.bridge.resources;


import java.util.List;

import day3.designPatterns.bridge.Detail;
import day3.designPatterns.bridge.formatters.Formatter;

public abstract class Resource {

	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}
	
	public abstract List<Detail> getDetails();
	
	abstract public String getHeader();
}
