package by.training.epam.mk;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Worker w1 = new Worker("Worker1");

		Pen p1 = new Pen();
		WritingObjects p2 = new Pen();
		OfficeObjects p3 = new Pen();

		Marker m1 = new Marker();
		WritingObjects m2 = new Marker();

		p1.setName("Pen 1");
		p1.setPrice(100);

		p2.setName("Pen 1");
		p2.setPrice(22);

		p3.setName("Pen 3");
		p3.setPrice(20);

		m1.setName("Marker 1");
		m1.setPrice(100);

		m2.setName("Marker 2");
		m2.setPrice(23);

		w1.addStationery(p1, p2, m1, m2, p3);
		System.out.println(String.format("Full cost office supplies %s = %s", w1.getName(), w1.costStationery()));

		System.out.println("--------------SortedByName-----------------------");
		Collections.sort(w1.getArr(), new SortedByName());
		for (OfficeObjects a : w1.getArr()) {
			System.out.println(a.getName() + " " + a.getPrice());
		}

		System.out.println("--------------SortedByPrice----------------------");
		Collections.sort(w1.getArr(), new SortedByPrice());
		for (OfficeObjects a : w1.getArr()) {
			System.out.println(a.getName() + " " + a.getPrice());
		}

		System.out.println("--------SortedByName-SortedByPrice---------------");
		Collections.sort(w1.getArr(), new SortedByName().thenComparing(new SortedByPrice()));
		for (OfficeObjects a : w1.getArr()) {
			System.out.println(a.getName() + " " + a.getPrice());
		}

		try {
			System.out.println("-----------------clone worker-----------------");
			Worker w2 = w1.clone();
			// Worker w3 = (Worker) w1.clone();
			w2.setName("Worker2");
			p3.setName("Pen 3");
			p3.setPrice(30);
			WritingObjects np3 = (Pen) p3;
			np3.setColor("blue");

			w2.addStationery(p3, np3);
			w2.showStationery();
			System.out.println("----------------------------------------------");
			System.out.println(String.format("Full cost office supplies %s = %s", w2.getName(), w2.costStationery()));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
