package Inheritance;

public class Programmer extends Person{
	private String bahasa;
	
	public Programmer(String nama, int umur, String bahasa) {
		super(nama, umur);
		this.bahasa = bahasa;
	}
	
	public void coding() {
		System.out.println("mari coding pake " + bahasa);
	}
}
