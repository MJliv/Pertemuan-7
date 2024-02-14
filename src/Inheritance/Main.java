package Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Rey", 25);
		Programmer programmer = new Programmer("Mey", 18, "Java");
		
		p1.bicara();
		p1.makan();
		
		programmer.bicara();
		programmer.makan();
		programmer.coding();
	}

}
