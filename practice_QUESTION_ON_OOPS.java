/*
abstract class Pen{
	abstract void write();
	abstract void refill();
}
class FountainPen extends Pen{
									
	void refill(){
		System.out.println("refilling........");
	}
	void write(){
		System.out.println("Writing.......");
	}
	void changeNip(){
			System.out.println("Changing Nip......");
	}
} */
//-> Q3
class Monkey {
	void jump() {
		System.out.println("Jumping jumpang.....");
	}

	void bite() {
		System.out.println("Biting.........");
	}
}

interface BasicAnimal {
	public void eat();

	public void sleep();
}

class Human extends Monkey implements BasicAnimal {
	void Speak() {
		System.out.println("Speaking...");

	}

	@Override
	public void eat() {
		System.out.println("Eating...");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping.....");
	}
}

// --> Q4
/*
 * abstract class Telephone {
 * abstract void ring();
 * abstract void lift();
 * abstract void disConnect();
 * }
 * class SmartTelephone{
 * void ring(){
 * System.out.println("ringing...");
 * }
 * void lift(){
 * System.out.println("Lifting...");
 * }
 * void disconnect(){
 * System.out.println("Disconnecting....");
 * }
 * }
 */
interface TvRemote {
	public void click();

	public void batteryLife();
}

interface SmartTvRemote extends TvRemote {
	public void sound();

	public void automatic();
}

class Tv implements SmartTvRemote {
	public void sound() {
		System.out.println("voice");
	}

	public void automatic() {
		System.out.println("Automatic light system");
	}

	public void click() {
		System.out.println("Clicking buttons");
	}

	public void batterLife() {
		System.out.println("1--> 100%");
	}

	@Override
	public void batteryLife() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'batteryLife'");
	}

}

public class practice_QUESTION_ON_OOPS {
	public static void main(String[] args) {
		// FountainPen s = new FountainPen();
		// s.changeNip();
		// -->Q3
		// Human obj = new Human();
		// obj.eat();
		// obj.sleep();
		/// obj.bite();
		// obj.jump();
		// Monkey m1 = new Human();
		// m1.bite();
		// BasicAnimal lovish = new Human();
		// lovish.eat();
		// lovish.sleep();
		Tv t = new Tv();
		t.click();
	}
}