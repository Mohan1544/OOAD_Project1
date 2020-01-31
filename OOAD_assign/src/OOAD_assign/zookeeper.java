package OOAD_assign;


import java.util.List;



public class zookeeper {
//	 opening the zoo
	public void openZoo() {
		System.out.println("Zoo is opened");
	}

//	Rollcalling all the animals in the zoo
	public void rollCallAnimals(List<Animal> Animals) {
		for(int i=0;i<Animals.size();i++) {
			int c=Animals.get(i).getStatus();
			if (c==1) {
				System.out.println(Animals.get(i).getName()+" "+"is present in the zoo");
			}
			else {
				System.out.println(Animals.get(i).getName()+" "+"is not present in the zoo");
			}
			
		}
	}
	
//	waking  the animals present in the zoo after roll call.
	public void wakeAnimals(List<Animal> Animals) {
		for(int i=0;i<Animals.size();i++) {
			int c=Animals.get(i).getStatus();
			if (c==1) {
				System.out.println(Animals.get(i).getName()+" "+ Animals.get(i).wakeup());
			}
		}
	}
	
//	Feeding all the animals in the zoo
	public void feedTheAnimals(List<Animal> Animals) {
		for(int i=0;i<Animals.size();i++) {
			int c=Animals.get(i).getStatus();
			if (c==1) {
			System.out.println(Animals.get(i).getName()+" "+ Animals.get(i).eat());
		}
		}
	}
//	Exercising all the animals in the zoo
	public void exerciseTheAnimals(List<Animal> Animals) {
		for(int i=0;i<Animals.size();i++) {
			int c=Animals.get(i).getStatus();
			if (c==1) {
			System.out.println(Animals.get(i).getName()+" "+ Animals.get(i).roam());
		}
		}
	}
//	shutting the zoo
	public void shutZoo() {
		System.out.println("Zoo is shutdown");
	}
}


