package zadaci_07_11_2017;
import java.util.Scanner;
public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
	
		System.out.println("Koliko želite redova? ");
		int broj = unos.nextInt();
		
	    System.out.println("\n\nPattern A");
	    for (int i = 1; i <= broj; i++) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }

	    System.out.println("\n\nPattern B");
	    for (int i = 1; i <= broj; i++) {
	        for (int j = 1; j <= broj - i; j++) {
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }

	    System.out.println("\n\nPattern C");
	    for (int i = 1; i <= broj; i++) {
	        for (int k = 1; k <= broj; k++) {
	            System.out.print("  ");
	        }
	        for (int j = 1; j <= i; j++) {
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }

	    System.out.println("\n\nPattern D");
	    for (int i = 1; i <= broj - 1; i++) {
	        for (int k = i; k > 1; k--) {
	            System.out.print("  ");
	        }
	        for (int j = 1; j <= broj - i; j++) {
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }

	}

}
