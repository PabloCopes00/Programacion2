
public class Alarm {
	private boolean brokeGlass;
	private boolean openedDoorWindow;
	private boolean detectedMovement;

	protected Bell bell;

	public Alarm() {
		this.brokeGlass = false;
		this.openedDoorWindow = false;
		this.detectedMovement = false;
		this.bell = new Bell();

	}

	public boolean isBrokeGlass() {
		return brokeGlass;
	}

	public boolean isOpenedDoor() {
		return openedDoorWindow;
	}

	public boolean detectedMovement() {
		return detectedMovement;
	}

	public void setBrokeGlass(boolean brokeGlass) {
		this.brokeGlass = brokeGlass;
	}

	public void setOpenedDoorWindow(boolean openedDoorWindow) {
		this.openedDoorWindow = openedDoorWindow;
	}

	public void setDetectedMovement(boolean detectedMovement) {
		this.detectedMovement = detectedMovement;
	}

	public String check() {
		return (this.isBrokeGlass() || this.isOpenedDoor() || this.detectedMovement()) ? this.bell.ring()
				: "The house is properly secured";  //BOOLEAN
	}

	public void disableAlarm() {
		this.setBrokeGlass(false);
		this.setDetectedMovement(false);
		this.setOpenedDoorWindow(false);
		this.bell.bellActive(false);
	}
}
