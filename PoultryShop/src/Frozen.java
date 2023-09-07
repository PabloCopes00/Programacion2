import java.time.LocalDate;

public class Frozen extends ChilledProduct {

	private String frozenMethod;
	private String frozenInfo;

	public Frozen(LocalDate packagingDate, LocalDate expiryDate, String info, String originFarm, int regulatoryCode,
			double storageTemperature, String frozenMethod, String frozenInfo) {
		super(packagingDate, expiryDate, info, originFarm, regulatoryCode, storageTemperature);
		this.frozenInfo = frozenInfo;
		this.frozenMethod = frozenMethod;
	}

	public String getFrozenMethod() {
		return frozenMethod;
	}

	public void setFrozenMethod(String frozenMethod) {
		this.frozenMethod = frozenMethod;
	}

	public String getFrozenInfo() {
		return frozenInfo;
	}

	public void setFrozenInfo(String frozenInfo) {
		this.frozenInfo = frozenInfo;
	}

	@Override
	public String toString() {
		return super.toString() + "\nFrozen Method: " + this.getFrozenMethod() + "\nFrozen Info: "
				+ this.getFrozenInfo();
	}
}
