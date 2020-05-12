import java.util.Scanner;

public class Schulhaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String klasse1A="28 5 9 12 45 105 62";
		String klasse1B="3 5 6 7 8 9";
		Scanner scanner=new Scanner(klasse1A);
		LinkedIntList klasse1AList;
		klasse1AList=new LinkedIntList();
		
		while(scanner.hasNextInt()) {
			int schuelerNr=scanner.nextInt();
			klasse1AList.addFirst(schuelerNr);
		}
		
		Scanner scannerB=new Scanner(klasse1B);
		LinkedIntList klasse1BList;
		klasse1BList=new LinkedIntList();
		klasse1BList.print();
		while(scannerB.hasNextInt()) {
			int schuelerNr=scannerB.nextInt();
			klasse1BList.addLast(schuelerNr);
		}
		
		klasse1AList.print();
		klasse1BList.print();
		System.out.print(klasse1BList.get(3));

	}

}
