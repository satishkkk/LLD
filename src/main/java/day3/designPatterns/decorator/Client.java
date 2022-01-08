package day3.designPatterns.decorator;

import day3.designPatterns.decorator.beverages.Beverage;
import day3.designPatterns.decorator.beverages.Cappuccino;
import day3.designPatterns.decorator.beverages.decorators.ChocolateDecorator;
//import day3.designPatterns.decorator.visualComponents.TextView;
//import day3.designPatterns.decorator.visualComponents.VisualComponent;
//import day3.designPatterns.decorator.visualComponents.decorators.BorderDecorator;
//import day3.designPatterns.decorator.visualComponents.decorators.ScrollDecorator;

public class Client {

	public static void main(String[] args) {
		
		/*
		VisualComponent textBox = new TextView("This is the text of my text-box");
		VisualComponent textBoxWithBorder = new BorderDecorator(textBox);
		VisualComponent textBoxWithScroll = new ScrollDecorator(textBoxWithBorder);
		
		
		textBoxWithScroll.draw();
		
		*/
		
		Beverage coffee = new Cappuccino();
		System.out.println(coffee.cost());
		
		Beverage coffeeWithCoholate = new ChocolateDecorator(new ChocolateDecorator(coffee));
		System.out.println(coffeeWithCoholate.cost());
		


	}

}
