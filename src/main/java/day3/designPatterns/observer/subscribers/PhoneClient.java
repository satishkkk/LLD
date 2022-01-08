package day3.designPatterns.observer.subscribers;

import day3.designPatterns.observer.Subject;

public class PhoneClient extends Observer {

	public PhoneClient (Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message + " - sent from phone");
	}
	
	@Override
	public void update() {
		System.out.println("Phone Stream: " + subject.getState());
	}
}
