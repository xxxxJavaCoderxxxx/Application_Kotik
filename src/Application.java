import package_Kotik.Kotik;

public class Application {
	public static void main(String args[]) {
		Kotik kotik = new Kotik(1,1,1,"����","���-���");
		Kotik newKotik = new Kotik();
		newKotik.setKotik(1, 1, 1, "����2", "���-���-���");
		kotik.liveAnotherDay();
		if (kotik.getMeow() == newKotik.getMeow()) {
			System.out.println("���������� meow");
		} else {
			System.out.println("������ meow");
		}
		System.out.println("���������� ��������� �������:"+" "+Kotik.getCount());
    }
}
