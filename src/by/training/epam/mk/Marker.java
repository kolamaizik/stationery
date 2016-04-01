package by.training.epam.mk;

public class Marker extends WritingTools {
	private String type;

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	public void draw(String str) {
		System.out.println(String.format("%s - %s", getClass().getSimpleName(), str));
	}

	@Override
	public String toString() {
			return String.format("%s, price = %s, producer - %s, type - %s", getName(), getPrice(), getProducer(), getType());
	}
}
