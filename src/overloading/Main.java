package overloading;

class hitung{
	public void jumlah(int a, int b) {
		System.out.println(a + b);
	}
	
	public void jumlah(double a, double b) {
		System.out.println(a + b);
	}
	
	public void jumlah(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hitung h = new hitung();
		
		h.jumlah(6, 8);
		h.jumlah(6.1, 8.2);
		h.jumlah(6, 2, 3);

	}

}
