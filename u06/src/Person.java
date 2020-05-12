/**
 * Eine Person mit diversen Eigenschaften, inkl. Alter, Gewichts, Grösse, Geschlecht und einigen
 * spezielleren Körper-Eigenschaften.
 */
public class Person {
    /**
     * Erstellt eine neue Person mit den gegebenen Werten für die Eigenschaften.
     */
	int alter;
	double gewicht;
	double groesse;
	boolean istMaennlich;
	double schulterBreite;
	double brustTiefe;
	double brustBreite;
	
	public Person(int alter, double gewicht, double groesse, boolean istMaennlich,
            double schulterBreite, double brustTiefe, double brustBreite) {
        // TODO
    	this.alter=alter;
    	this.gewicht=gewicht;
    	this.groesse=groesse;
    	this.istMaennlich=istMaennlich;
    	this.schulterBreite=schulterBreite;
    	this.brustTiefe=brustTiefe;
    	this.brustBreite=brustBreite;
    }
    
    String beschreibung() {
        return "Person ("+istMaennlich+", "+alter+" Jahre, "+groesse+" cm, "+gewicht+" kg)";
    }
    
    public void print() {
    	System.out.println(this.beschreibung());
    }
    
    double bodyMassIndex() {
    	double  bmi= gewicht/Math.pow(groesse/100, 2);
        return bmi;
    }
    
}
