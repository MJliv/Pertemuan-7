package Inheritance;

public class Person {
	private String nama;
	private int umur;
	
	public Person(String nama, int umur) {
		this.nama = nama;
		this.umur = umur;
	}
	
	public void bicara() {
		System.out.println("halo aku " + nama);
	}
	
	public void makan() {
		System.out.println("makan enak");
	}

}
