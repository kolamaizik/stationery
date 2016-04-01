package by.training.epam.mk;

import java.util.*;

public class Worker implements Cloneable {

	public Worker() {
	}

	public Worker(String name) {
		this.name = name;
	}

	private int id;
	private String name;
	private List<Stationery> arr = new ArrayList<Stationery>();

	public List<Stationery> getArr() {
		return arr;
	}

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
			arr.add(stationery);
		}
	}

	public void showStationery() {
		for (Stationery a : arr) {
			System.out.println(a.toString());
		}
	}

	public double costStationery() {
		double cost = 0;
		for (Stationery stationery : arr) {
			cost = cost + stationery.getPrice();
		}
		return cost;
	}

	public Worker clone() throws CloneNotSupportedException {
		Worker obj = (Worker) super.clone();
		return obj;
	}
}
