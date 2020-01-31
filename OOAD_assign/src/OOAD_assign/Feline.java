package OOAD_assign;

public abstract  class Feline  extends Animal {

	public String type() {
		return "Feline";
	}
	// The implementation of roam and eat are specific to Felines
	public String roam() {
		return "is roaming very fast";
	}
	public String eat() {
		return "is eating meat";
	}
}