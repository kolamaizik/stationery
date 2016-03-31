package by.training.epam.mk;

import java.util.*;

public class Worker implements Comparable {
	private String name;
	private List<Stationery> arr = new ArrayList<Stationery>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addStationery(Stationery... st) {
		for (Stationery stationery : st) {
			if (stationery instanceof Stationery){
				arr.add(stationery);
			}
		}
	}

	public void showStationery() {
		for (Stationery a : arr) {
			System.out.println(a.toString());
		}
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
