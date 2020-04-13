import java.util.Arrays;
import java.util.Scanner;

/*
 * Author: Thomas Greminger
 * 
 * Dieses Programm gibt die Anzahl Primuahlen aus.
 * 
 */

public class Sieb {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein:");
		int limit=console.nextInt();
		System.out.println(limit);
		//potentialprime[i] gibt an ob i eine Primzahl ist oder sein könnte. 
		//Index 0,1 wird ignoriert. 
		boolean[] potentialprime=new boolean[limit+1];
		int[] primes=new int[limit];
		int numberOFPrimes=0;
		Arrays.fill(potentialprime,Boolean.TRUE);
//		System.out.println(Arrays.toString(potentialprime));
		for (int i=2;i<potentialprime.length;i++) {
			if (potentialprime[i]==true) {
				primes[0]=i;
				numberOFPrimes++;
				int k=2;
				while(k*i<potentialprime.length) {
					potentialprime[k*i]=false;
					k++;
				}
			}
		}
		System.out.println("Anzahl Primzahlen kleiner gleich "+limit+" ist "+numberOFPrimes);

	}

}
