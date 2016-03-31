package by.training.epam.mk;

public class Main {

	public static void main(String[] args) {
		Worker w1 = new Worker("Worker1");

		Pen p1 = new Pen();
		WriteTools p2 = new Pen();
		Stationery p3 = new Pen();

		Marker m1 = new Marker();
		WriteTools m2 = new Marker();
		Stationery m3 = new Marker();
		
		Test t1 = new Test();
		
		//доступны все методы
		p1.setPrice(100);
		p1.setProducer("pen1");
		p1.setColor("red");
		p1.write("P1 can write");
		p1.setType("Ball pen");

		p2.setPrice(200);
		p2.setProducer("pen2");
		p2.setColor("black");
		p2.write("P2 can write");

		//p2.setType("Ink pen");//no access
		Pen np2 = (Pen) p2;
		np2.setType("Ink pen");
		System.out.println(np2.toString());

		m1.setPrice(10);
		m2.setPrice(20);
		m1.setProducer("mark1");
		m2.setProducer("mark2");
		m1.write("M1 can also write");
		m1.draw("M1 can draw");
		//m2.draw("M1 can draw");//no access
		
		//w1.addStationery(p1, p2, m1, t1);//экземпл€р другого класса компил€тор не пропускает
		w1.addStationery(p1, p2, m1, m2);
		//w1.showStationery();
		System.out.println(w1.costStationery());
		
		try {
			Worker w2 = w1.clone();
			Worker w3 = (Worker) w1.clone();
			w2.setName("Worker2");

			p3.setPrice(30);
			p3.setProducer("pen3");

			WriteTools np3 = (Pen) p3;
			np3.setColor("blue");
			np3.write("I can write " + np3.getColor());// + np3.getType);

			m1.setPrice(30);
			m2.setPrice(40);
			m1.setProducer("mark1");
			m2.setProducer("mark2");
			w2.addStationery(p3, m3);
			//w2.showStationery();
			System.out.println(w2.costStationery());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
