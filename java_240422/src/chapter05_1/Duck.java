package chapter05_1;

//생명1개, 날개2개, 걷다, 먹는다.+수영한다.+날다.(인터페이스 다중 상속)
public class Duck extends Bird implements Swim2, Fly{
	@Override
	public void swim() {
		System.out.println("ducks swim.");
	}

	@Override
	public void fly() {
		System.out.println("ducks fly.");
	}

}
