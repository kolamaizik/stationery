package by.training.epam.mk;

import java.util.*;

public class Worker implements Comparable, Cloneable {

	public Worker() {
	}

	public Worker(String name) {
		this.name = name;
	}

	private int id;
	private String name;
	private List<Stationery> arr = new ArrayList<Stationery>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addStationery(Stationery... st) {
		for (Stationery stationery : st) {
			//if (stationery instanceof Stationery) {
				arr.add(stationery);
			//}
		}
	}

	public void showStationery() {
		for (Stationery a : arr) {
			System.out.println(String.format("Object - %s, price=%s, producer - %s", a.toString(), a.getPrice(), a.getProducer()));
		}
	}

	public double costStationery() {
		double cost = 0;
		for (Stationery stationery : arr) {
			cost = cost + stationery.getPrice();
		}
		return cost;
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	public Worker clone() throws CloneNotSupportedException{
		Worker obj=(Worker)super.clone();
        return obj;
    }
}
