package zadaci_07_11_2017;
import java.util.Scanner;
public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite iznos uplate i broj mjeseci : ");
		double uplata = unos.nextDouble();
		double kamata = 0.00417;
		double mjesec = unos.nextDouble();
		double ukupno = uplata * (1 + kamata);
		double brojcanik = 0;
		
		while (brojcanik < mjesec) {
			brojcanik+= mjesec;
			System.out.print("Ovo vam je stanje na racunu " + (uplata + ukupno) * (1 + 0.00417));
		
			
			
		}
		
unos.close();
	}

}
