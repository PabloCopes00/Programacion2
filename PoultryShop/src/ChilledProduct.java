import java.time.LocalDate;

public class ChilledProduct extends FreshPoultryProduct {

	private int regulatoryCode;
	private double storageTemperature;

	public ChilledProduct(LocalDate packagingDate, LocalDate expiryDate, String info, String originFarm,
			int regulatoryCode, double storageTemperature) {
		super(packagingDate, expiryDate, info, originFarm);
		this.regulatoryCode = regulatoryCode;
		this.storageTemperature = storageTemperature;
	}

	public ChilledProduct(LocalDate packagingDate, LocalDate expiryDate, String info, String originFarm,
			double storageTemperature) {
		super(packagingDate, expiryDate, info, originFarm);
		this.storageTemperature = storageTemperature;
		this.setRegulatoryCode();
	}

	public int getRegulatoryCode() {
		return regulatoryCode;
	}

	public void setRegulatoryCode(int regulatoryCode) {
		this.regulatoryCode = regulatoryCode;
	}

	public void setRegulatoryCode() {
		String random = "";
		for (int i = 0; i < 6; i++) {
			random += (Math.random() * 9) + 1;
		}
		int randomCode = Integer.parseInt(random);
		this.regulatoryCode = randomCode;
	}

	public double getStorageTemperature() {
		return storageTemperature;
	}

	public void setStorageTemperature(double storageTemperature) {
		this.storageTemperature = storageTemperature;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRegulatory Code; " + this.getRegulatoryCode() + "\nStorage Temperature: "
				+ this.getStorageTemperature();
	}

}
