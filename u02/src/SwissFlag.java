public class SwissFlag {   
    public static void main(String[] args) {
    	printObereZeile();
    	printLeerlinie();
    	printLeerlinie();
    	printObererTeil();
    	printObererTeil();
    	printObererTeil();
    	printMittlererTeil();
    	printMittlererTeil();
    	printMittlererTeil();
    	printObererTeil();
    	printObererTeil();
    	printObererTeil();
    	printLeerlinie();
    	printLeerlinie();
    	printObereZeile();
    	
    }	//main
    public static void printObereZeile()	{
    System.out.println("-----------------------------------");
    }	//Obere Zeile
    
    public static void printLeerlinie()	{
    	System.out.println("|\t\t\t\t  |");
    }	//Leere Zeile
    
    public static void printObererTeil()	{
    	System.out.println("|\t\t+++++++\t\t  |");
    }	//Oberer Teil
    
    public static void printMittlererTeil()	{
    	System.out.println("|\t+++++++++++++++++++++\t  |");
    }	//Mittlerer Teil
}
