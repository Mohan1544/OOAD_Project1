package OOAD_assign;

import java.util.ArrayList;
import java.util.List;

public class zoo {

	public static void main(String [] args) {
		Cat Cody = new Cat("Cody");
		Cat Code = new Cat("Code");
		Code.setStatus();
		Dog Donald = new Dog("Donald");
		Dog Dash = new Dog("Dash");
		Dash.setStatus();
		Elephant Eric = new Elephant("Eric");
		Elephant Edward = new Elephant("Edward");
		Edward.setStatus();
		Hippo Heman = new Hippo("Heman");
		Hippo Heather = new Hippo("Heather");
		Heather.setStatus();
		Lion Luke = new Lion("Luke");
		Lion Lisa = new Lion("Lisa");
		Lisa.setStatus();
		Rhino Rosy = new Rhino("Rosy");
		Rhino Rambo = new Rhino("Rambo");
		Rambo.setStatus();
		Tiger Todd = new Tiger("Todd");
		Tiger Toby = new Tiger("Toby");
		Toby.setStatus();
		Wolf William = new Wolf("William");
		Wolf Watson = new Wolf("Watson");
		Watson.setStatus();
		List<Animal> list= new ArrayList<Animal>();
//		Adding the list of all the animals to a list
		list.add(Cody);
		list.add(Code);
		list.add(Donald);
		list.add(Dash);
		list.add(Eric);
		list.add(Edward);
		list.add(Heman);
		list.add(Heather);
		list.add(Luke);
		list.add(Lisa);
		list.add(Rosy);
		list.add(Rambo);
		list.add(Todd);
		list.add(Toby);
		list.add(William);
		list.add(Watson);
		
		zookeeper z= new zookeeper();

		System.out.println("---------Opening the zoo---------");
//		zoo keeper opening the zoo
		z.openZoo();

		System.out.println("----------Roll calling the animals-------");
//		zoo keeper roll calling all the animals in the zoo
		z.rollCallAnimals(list);

		System.out.println("-------Wakeup the Animals-----------");
//		zoo keeper waking up the animals in the zoo
		z.wakeAnimals(list);

		System.out.println("----------Feeding the Animals------------");
//		zoo keeper feeding the Animals in the zoo
		z.feedTheAnimals(list);
		System.out.println("----------Exercise The Animals-------------");
//		zoo keeper making the animals in the zoo to exercise
		z.exerciseTheAnimals(list);
		System.out.println("----------Random Behaviour in Cat-----------");
//		cat random behavior
		Code.randombehav();
		System.out.println("---------Shutting Down the Zoo---------------");
//		zoo keeper shutting the zoo
		z.shutZoo();
		
		
	}
}
