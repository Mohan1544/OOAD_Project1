package OOAD_assign;

public abstract  class Canine  extends Animal {

	public String type() {
		return "Canine";
	}
	// The implementation of roam and eat are specific to canines
	public String roam() {
		return "is roaming fast";
	}
	public String eat() {
		return "is eating Livestock";
	}
}
