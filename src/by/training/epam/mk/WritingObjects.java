package by.training.epam.mk;

public abstract class WritingObjects extends OfficeObjects {
	private String color;

	public abstract String getType();
	public abstract void setType(String type);

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void write(String str){
		System.out.println(String.format("%s - %s", getName(), str));
	}
}