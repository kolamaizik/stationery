package by.training.epam.mk;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Worker w1 = new Worker("Worker1");

		Pen p1 = new Pen();
		WritingTools p2 = new Pen();
		Stationery p3 = new Pen();

		Marker m1 = new Marker();
		WritingTools m2 = new Marker();
		Stationery m3 = new Marker();
		
		Test t1 = new Test();
		
		//all methods
		p1.setName("Pen 1");
		p1.setPrice(100);
		p1.setProducer("Producer pen 1");
		p1.setColor("red");
		p1.write("P1 can write");
		p1.setType("Ball pen");

		p2.setName("Pen 2");
		p2.setPrice(200);
		p2.setProducer("Producer pen 2");
		p2.setColor("black");
		p2.write("P2 can write");

		//p2.setType("Ink pen");//no access
		Pen np2 = (Pen) p2;
		np2.setType("Ink pen");
		//System.out.println(np2.getInfo());

		m1.setName("Marker 1");
		m1.setPrice(10);
		m1.setProducer("Producer mark 1");
		m1.write("M1 can also write");
		m1.draw("M1 can draw");

		m2.setName("Marker 2");
		m2.setPrice(20);
		m2.setProducer("Producer mark 2");
		//m2.draw("M1 can draw");//no access
		
		w1.addStationery(p1, np2, m1, m2);
		w1.showStationery();
		System.out.println("all cost stationery w1 = " + w1.costStationery());
		
		try {
			Worker w2 = w1.clone();
			//Worker w3 = (Worker) w1.clone();
			w2.setName("Worker2");
			p3.setName("Pen 3");
			p3.setPrice(30);
			p3.setProducer("pen3");

			WritingTools np3 = (Pen) p3;
			np3.setColor("blue");
			np3.write("I can write " + np3.getColor());// + np3.getType);

			w2.addStationery(p3, np3, m3);
			w2.showStationery();
			System.out.println("all cost stationery w2 = " + w2.costStationery());
			//w2.compareTo(p1);
			System.out.println("-------------------------------------------------");
			
			//sort price
			Collections.sort(w1.getArr());
			for (Stationery a : w1.getArr()) {
				System.out.println(a.getName() + " " + a.getPrice());
			}

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
