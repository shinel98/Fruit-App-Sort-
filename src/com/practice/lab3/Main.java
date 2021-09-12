package com.practice.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> list = new ArrayList<>();
		
		Fruit f1 = new Fruit(101, "Apple", 1000);
		list.add(f1);
		list.add(new Fruit(102,"banana", 1500));
		list.add(new Fruit(103,"mango", 2000));
		list.add(new Fruit(104,"strawberry", 2000));
		list.add(new Fruit(105,"blueberry", 2000));
		list.add(new Fruit(106,"peach", 2000));
		list.add(new Fruit(107,"kiwi", 2000));
		list.add(new Fruit(108,"watermellon", 2000));
		list.add(new Fruit(109,"mellon", 2000));
		list.add(new Fruit(110,"dragonfruit", 2000));
		
		System.out.println("Fruit List (ordered by name)");
		Collections.sort(list, new FruitComparator());
		for(Fruit f : list) {
			System.out.println(f);
		}
		System.out.println("Fruit List (reverse ordered by name)");
		Collections.sort(list, new FruitComparatorDes());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
