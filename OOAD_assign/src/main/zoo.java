package main;

import java.util.ArrayList;
import java.util.List;

import OOAD_assign.Cat;
import OOAD_assign.Dog;
import OOAD_assign.Elephant;
import OOAD_assign.Hippo;
import OOAD_assign.Lion;
import OOAD_assign.Rhino;
import OOAD_assign.Tiger;
import OOAD_assign.Wolf;

public class zoo {
	public static void main(String args[]) {
		Cat Cassie = new Cat("Cassie");
		Cat Coldmann = new Cat("Coldmann");
		Dog Dasie = new Dog("Dasie");
		Dog Donald = new Dog("Donald");
		Elephant Eastman = new Elephant("Eastman");
		Elephant Edward = new Elephant("Edward");
		Hippo Heman = new Hippo("Heman");
		Hippo Hogan = new Hippo("Hogan");
		Lion Letterman = new Lion("Letterman");
		Lion Luke = new Lion("Luke");
		Rhino Ray = new Rhino("Ray");
		Rhino Rambo = new Rhino("Rambo");
		Tiger Tina = new Tiger("Tina");
		Tiger Trey = new Tiger("Trey");
		Wolf Wright = new Wolf("Wright");
		Wolf Wyomn = new Wolf("Wyomn");
		List<Object> list=new ArrayList<Object>();
		list.add(Cassie);
		list.add(Coldmann);
		list.add(Dasie);
		list.add(Donald);
		list.add(Eastman);
		list.add(Edward);
		list.add(Heman);
		list.add(Hogan);
		list.add(Letterman);
		list.add(Luke);
		list.add(Ray);
		list.add(Rambo);
		list.add(Tina);
		list.add(Trey);
		list.add(Wright);
		list.add(Wyomn);
		System.out.println(list);
	}

}