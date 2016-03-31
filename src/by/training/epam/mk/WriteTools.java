package by.training.epam.mk;

public abstract class WriteTools extends Stationery {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void write(String str){
		System.out.println(String.format("%s - %s", getClass().getSimpleName(), str));
	}
}