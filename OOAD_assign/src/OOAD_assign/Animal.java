package OOAD_assign;

abstract class Animal {
	//Animal is sleeping
	public String sleep() {
		return "is sleeping";
	}
	
	// Animal is waking up
	public String wakeup() {
		return " is  wakingup";
	}
	
	//Below Abstract classes are implemented in their respective sub classes.
	abstract String eat();
	abstract String roam();
	abstract String makeNoise();
	abstract String type();

	protected abstract String getName();

	protected abstract int getStatus();

	
}



