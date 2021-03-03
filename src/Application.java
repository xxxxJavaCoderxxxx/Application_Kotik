import package_Kotik.Kotik;

public class Application {
	public static void main(String args[]) {
		Kotik kotik = new Kotik(1,1,1,"Пуся","мяу-мяу");
		Kotik newKotik = new Kotik();
		newKotik.setKotik(1, 1, 1, "Пуся2", "мяу-мяу-мяу");
		kotik.liveAnotherDay();
		if (kotik.getMeow() == newKotik.getMeow()) {
			System.out.println("Одинаковые meow");
		} else {
			System.out.println("Разные meow");
		}
		System.out.println("Количество созданных котиков:"+" "+Kotik.getCount());
    }
}
