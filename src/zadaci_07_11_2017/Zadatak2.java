package zadaci_07_11_2017;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner unos= new Scanner(System.in);
		 System.out.println("Unosite brojeve (0 prekida unos) : ");
		 
		    int broj = unos.nextInt();
		    int suma = 0;
		    int negativni = 0;
		    int pozitivni = 0;
		    
		  while (broj != 0) {
			 suma += broj;
			  
		    if (broj > 0) {
		     System.out.println("Broj je pozitivan");
		     pozitivni++;
		     }
		    if (broj < 0){
		     System.out.println("Broj je negativan");
		     negativni++;
		    }
		    System.out.println("Unosite brojeve (0 prekida unos)");
	        broj = unos.nextInt();
		  }
		  System.out.println("Suma brojeva je : " +suma);
		     System.out.println("Broj negativnih brojeva je : " + negativni);
		      System.out.println("Broj pozitivnih brojeva je : " + pozitivni);

	}

}
