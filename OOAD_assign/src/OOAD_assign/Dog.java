package OOAD_assign;

public class Dog extends Canine {
	
	String name;
	//status set to make the animal to present in the zoo.
	int status=0;
	
	public Dog(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	//status set to make the animal to present in the zoo. 
	public void setStatus() {
		this.status=1;
	}
	
	public int getStatus() {
		return status;
	}
	public String makeNoise() {
		return "is making sounds like Barking";
	}
}