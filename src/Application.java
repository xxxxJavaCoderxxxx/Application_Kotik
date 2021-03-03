import package_Kotik.Kotik;

public class Application {
	public static void main(String args[]) {
		Kotik kotik = new Kotik(1,1,1,"ѕус€","м€у-м€у");
		Kotik newKotik = new Kotik();
		newKotik.setKotik(1, 1, 1, "ѕус€2", "м€у-м€у-м€у");
		kotik.liveAnotherDay();
		if (kotik.getMeow() == newKotik.getMeow()) {
			System.out.println("ќдинаковые meow");
		} else {
			System.out.println("–азные meow");
		}
		System.out.println(" оличество созданных  отиков:"+" "+Kotik.getCount());
    }
}
