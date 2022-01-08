package day3.designPatterns.decorator.beverages.decorators;

import day3.designPatterns.decorator.beverages.Beverage;

public abstract class BeverageDecorator extends Beverage{
	
	Beverage beverage;
	
	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
}
