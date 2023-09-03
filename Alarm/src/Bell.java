
public class Bell {
	private static final String RING = "RIIIIIIIIIIINNG";
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
		this.bellActive(true);  //SYSTEM ACA
		return RING;
	}

	public String bellSound() {
		return RING;
	}

	public boolean isBellActive() {
		return bellSound;
	}

	public void bellActive(boolean bellSound) {
		this.bellSound = bellSound;
	}

}
