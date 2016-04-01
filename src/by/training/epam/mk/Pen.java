package by.training.epam.mk;

public class Pen extends WritingTools {
	private String type;

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("%s, price = %s, producer - %s, type - %s", getName(), getPrice(), getProducer(), getType());
	}
}
