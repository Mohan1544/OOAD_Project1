package OOAD_assign;

import java.util.Random;

public class Cat extends Feline {
	
	String name;
	//Below attribute is that we have taken that animal is not present in the zoo.
	int status=0;
	

	public Cat(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	//status set to make the animal to present in the zoo. 
	public void setStatus() {
		this.status=1;
	}
	
	// returns the status of the animal whether it is present in the zoo or not.
	public int getStatus() {
		return status;
	}
	
	public String makeNoise() {
		return "is making sounds like meow";
	}
	//Below function to exhibit a random behavior in the cat.
	public void randombehav() {
		Random rand = new Random();
		int rand_int=rand.nextInt(4);
		rand_int=rand_int+1;
		switch(rand_int) {
		case 1:
			System.out.println(getName()+" "+sleep());
			break;
		case 2:
			System.out.println(getName()+" "+eat());
			break;
		case 3:
			System.out.println(getName()+" "+wakeup());
			break;
		case 4:
			System.out.println(getName()+" "+makeNoise());
			break;
		case 5:
			System.out.println(getName()+" "+roam());
			break;
		}
	}
}