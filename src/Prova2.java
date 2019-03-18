
public class Prova2 {

	public static int funzione(long i) {
		if (i<0) return -1;
		if (i == 0) return 0;
		else if (i == 1) return 1;
		else {
			System.out.println(i);
			return funzione(i-1) + funzione(i-2);
		}
	}

	public static void main(String[] args) {
		int i = 8;
		int a = funzione(i);
		System.out.println(a);
	}

}