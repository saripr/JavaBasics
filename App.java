package co.java.implementslearning;

public class App {

	public static void main(String[] args) {
		Machine m1 = new Machine();
		m1.start();
		Person p1 = new Person("google");
		/*
		 * m1.showInfo(); m1.ShowName(); p1.showInfo(); p1.ShowName();
		 */
		// Info inter=new Info();//this will not work as it is new Info();/so
		// try below
		Info info1 = new Machine();
		info1.showInfo();
		// Info info1=new Person();// or it can be as below
		Info info2 = p1;
		info2.showInfo();
		App.outputinfo(m1);

	}

	public static void outputinfo(Info info) {
		info.showInfo();

	}
}
