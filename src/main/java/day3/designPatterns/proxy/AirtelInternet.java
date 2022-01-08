package day3.designPatterns.proxy;

public class AirtelInternet implements Internet {

	@Override
	public String getResource(String site) {
		return "Openeing " + site;
	}

}
