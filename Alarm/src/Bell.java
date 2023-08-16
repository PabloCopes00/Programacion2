
public class Bell {

	private int alarmVolume;
	private boolean bellSound;

	public Bell() {
		this.alarmVolume = 10;
		this.bellSound = false;
	}

	public int getAlarmVolume() {
		return alarmVolume;
	}

	public void setAlarmVolume(int alarmVolume) {
		this.alarmVolume = alarmVolume;
	}

	public String ring() {
		this.bellSound(true);
		return "RIIIIIIIIIIINNG";
	}

	public boolean getBellSound() {
		return bellSound;
	}

	public void bellSound(boolean bellSound) {
		this.bellSound = bellSound;
	}

}
