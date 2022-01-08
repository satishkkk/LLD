package day3.designPatterns.observer.subscribers;

import day3.designPatterns.observer.Subject;

public abstract class Observer {
	public Subject subject;
	public abstract void update();
}
