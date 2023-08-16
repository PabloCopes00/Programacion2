
public class Main {

	public static void main(String[] args) {
		Alarm a1 = new Alarm();
		LightAlarm a2 = new LightAlarm();

		System.out.println("a1: " + a1.check());
		System.out.println("a2: " + a2.check() + "\n");
		a2.setBrokeGlass(true);
		System.out.println("a1: " + a1.check());
		System.out.println("a2: " + a2.check() + "\n");
		a2.disableAlarm();
		System.out.println("a1: " + a1.check());
		System.out.println("a2: " + a2.check() + "\n");
		a1.setDetectedMovement(true);
		System.out.println("a1: " + a1.check());
		System.out.println("a2: " + a2.check() + "\n");
		a1.disableAlarm();
		System.out.println("a1: " + a1.check());
		System.out.println("a2: " + a2.check() + "\n");
	}

}
