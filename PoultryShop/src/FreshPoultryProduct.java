import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FreshPoultryProduct {

	private int lotNumber;
	private static int id = 1;
	private LocalDate packagingDate;
	private LocalDate expiryDate;
	private String info;
	private String originFarm;

	public FreshPoultryProduct(LocalDate packagingDate, LocalDate expiryDate, String info, String originFarm) {
		super();
		this.lotNumber = id;
		this.packagingDate = packagingDate;
		this.expiryDate = expiryDate;
		this.info = info;
		this.originFarm = originFarm;
		id++;
	}

	public String getPackagingDate() {
		LocalDate packagingD = this.packagingDate;
		String pattern = "dd/MM/yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		String date = packagingD.format(formatter);
		return date;

	}

	public void setPackagingDate(LocalDate packagingDate) {
		this.packagingDate = packagingDate;
	}

	public String getExpiryDate() {
		LocalDate expiryD = this.expiryDate;
		String pattern = "dd/MM/yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		String date = expiryD.format(formatter);
		return date;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getOriginFarm() {
		return this.originFarm;
	}

	public void setOriginFarm(String originFarm) {
		this.originFarm = originFarm;
	}

	public int getLotNumber() {
		return this.lotNumber;
	}

	@Override
	public String toString() {
		return "\nLot Number: " + this.getLotNumber() + "\nPackaging Date: " + this.getPackagingDate()
				+ "\nExpiry Date: " + this.getExpiryDate() + "\nInfo: " + this.getInfo() + "\nOrigin Farm: "
				+ this.getOriginFarm();
	}

}
