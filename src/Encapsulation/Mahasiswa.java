package Encapsulation;

public class Mahasiswa {
	// atribut
	private String nama;
	private int age;
	
	// alt + shift + s + o -> constructor
	public Mahasiswa(String nama, int age) {
		this.nama = nama;
		this.age = age;
	}
	
	// method
	public void belajar() {
		System.out.println(nama + " ayo belajar");
	}
	
	public void nugas() {
		System.out.println(nama + " ayo nugas");
	}
	
	// alt + shift + s + r -> getter and setter
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
