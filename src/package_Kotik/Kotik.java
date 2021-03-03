package package_Kotik;
public class Kotik {
	private int prettiness;
	private int satiety;
	private int weight;
	private String name;
	private String meow;
	private String nameOfEat;
	private static int count;
	public Kotik() {
		count++;
	}
	public Kotik (int prettiness, int satiety, int weight, String name, String meow) {
		this.prettiness = prettiness;
		this.satiety = satiety;
		this.weight = weight;
		this.name = name;
		this.meow = meow;
		count++;
	}
	public void setKotik (int prettiness, int satiety, int weight, String name, String meow) {
		this.prettiness = prettiness;
		this.satiety = satiety;
		this.weight = weight;
		this.name = name;
		this.meow = meow;
	}
	public int getPrettiness(){
		return prettiness;
	}
	public int getSatiety(){
		return satiety;
	}
	public int getWeight(){
		return weight;
	}
	public String getName(){
		return name;
	}
	public String getNameOfEat(){
		return nameOfEat;
	}
	public String getMeow(){
		return meow;
	}
	public static int getCount(){
		return count;
	}
    public void eat(int satiety) {
		this.satiety += satiety;
		System.out.println("Меня покормили");
    }
    public void eat(int satiety, String nameOfEat) {
		this.satiety+= satiety;
		this.nameOfEat = nameOfEat;
		System.out.println("Меня покормили"+" "+this.nameOfEat);
    }
    public void eat() {
    	eat(2, "milk");
    }
	public boolean play() {
		if (satiety <=  0) {
			System.out.println("Покормите");
			return false;
		} else {
			System.out.println("Играю");
			return true;
		}
    }
    public boolean sleep() {
		if (satiety <= 0) {
			System.out.println("Покормите");
			return false;
		} else {
			System.out.println("Сплю");
			return true;
		}
		
    }
	public boolean chaseMouse() {
		if (satiety <=  0) {
			System.out.println("Покормите");
			return false;
		} else {
			System.out.println("Гоняюсь за мышкой");
			return true;
		}
    }
	public boolean lickWool() {
		if (satiety <=  0) {
			System.out.println("Покормите");
			return false;
		} else {
			System.out.println("Облизываю шерсть");
			return true;
		}
    }
	public boolean wagMyTail() {
		if (satiety <=  0) {
			System.out.println("Покормите");
			return false;
		} else {
			System.out.println("Виляю хвостом");
			return true;
		}
    }
	public void liveAnotherDay() {
		 for(int x = 0; x < 24; x = x+1) {
			 int randMethod =  (int) (Math.random() * 5 +1);
			 switch (randMethod)
			 {
				 case 1:
				 if (play() == false) {
					eat(1);
					play();
				 }
				 break;
				 case 2:
				 if (sleep() == false) {
					eat(1);
					sleep();
				 }
				 break;
				 case 3:
				 if (chaseMouse() == false) {
					eat(1);
					chaseMouse();
				 }
				 break;
				 case 4:
				 if (lickWool() == false) {
					eat(1);
					lickWool();
				 } 
				 break;
				 case 5:
				 if (wagMyTail() == false) {
					eat(1);
					wagMyTail();
				 } 
				 break;
			 }
		 }
    }
}
