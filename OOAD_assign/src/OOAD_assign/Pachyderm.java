package OOAD_assign;


public abstract  class Pachyderm  extends Animal {

	public String type() {
		return "pachyderm";
	}
	// The implementation of roam and eat are specific to Pachyderms
	public String roam() {
		return "is roaming slowly";
	}
	public String eat() {
		return "is eating grass";
	}
}
