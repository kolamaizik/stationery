package by.training.epam.mk;

public class Main {

	public static void main(String[] args) {
		Worker w1 = new Worker();
		Pen p1 = new Pen();
		Marker m1 = new Marker();
		p1.setCost(100);
		w1.addStationery(p1, m1);
		w1.showStationery();
	}

}
