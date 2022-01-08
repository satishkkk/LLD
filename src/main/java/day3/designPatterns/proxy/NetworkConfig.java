package day3.designPatterns.proxy;

public class NetworkConfig {
	
	public Internet getInternet(){
		return new InternetProxy();
	}
	
	public Internet getISP(){
		return new AirtelInternet();
	}
}
