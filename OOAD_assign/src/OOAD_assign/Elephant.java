package OOAD_assign;

public class Elephant extends Pachyderm{
	String name;
	//status set to make the animal to present in the zoo.
	int status=0;
	public Elephant(String name) {
		this.name=name;
	}
	//returns the name of the Elephant
	public String getName() {
		return name;
	}
	public void setStatus() {
		this.status=1;
	}
	
	public int getStatus() {
		return status;
	}
	//returns the sound made by elephant.
	public String makeNoise() {
		return "is making trumphet noise";
	}
}