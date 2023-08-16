
public class LightAlarm extends Alarm {
	private boolean bulb;

	public LightAlarm() {
		this.bulb = false;
	}

	public boolean isLightOn() {
		return bulb;
	}

	public void setBulb(boolean bulb) {
		this.bulb = bulb;
	}

	public void lightUp() {
		this.setBulb(true);
		System.out.println("Click! light is on!");
	}

	@Override
	public String check() {
		String bellStatus = super.check();
		if (bellStatus.equals("RIIIIIIIIIIINNG")) {
			lightUp();
		}
		return bellStatus;
	}

	@Override
	public void disableAlarm() {
		super.disableAlarm();
		this.setBulb(false);
	}

}
