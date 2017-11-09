package zadaci_08_11_2017;
import java.util.Scanner;
public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		int broj=0;
	    int obrat =0;
	    
	    System.out.println("Unesi broj: ");
	     
	    broj = unos.nextInt();
	      
	    while( broj != 0 )
	      {
	       obrat = obrat * 10;
	       obrat = obrat + broj%10;
	       broj = broj/10;
	      }

	     System.out.println("Obrnut broj je : "+ obrat);
	      
unos.close();
	}

}
