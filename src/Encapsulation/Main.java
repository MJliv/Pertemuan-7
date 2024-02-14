package Encapsulation;

public class Main {

	public static void main(String[] args) {
		Mahasiswa m1 = new Mahasiswa("Dennis", 20);
		Mahasiswa m2 = new Mahasiswa("Izza", 20);
		
		// ctrl + alt + arrow bawah/atas
		System.out.println(m1.getNama());
		System.out.println(m1.getAge());
		m1.belajar();
		System.out.println();
		
		// ubah nilai 
		m1.setNama("Putu");
		System.out.println(m1.getNama());
		System.out.println();
		
		// mahasiswa kedua
		System.out.println(m2.getNama());
		System.out.println(m2.getAge());
		m2.nugas();
		

	}

}
