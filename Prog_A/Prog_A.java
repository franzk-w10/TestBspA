import AlgoTools.IO;
public class Prog_A {

	public static void main(String[] args) {

		titel("Faktorielle - Tabelle");
		
		verabschiedung();

	}

	//Titelausgabe
	static void titel(String text) {
			
		System.out.print("\n\t\t");
		
		for (int i=0; i<text.length()+6; i++)
			System.out.print("*");
			
		System.out.print("\n\t\t*  "+ text + "  *\n\t\t");
			
		for (int i=0; i<text.length()+6; i++)
			System.out.print("*");
			
		System.out.println("\n");
	}
	
	//Ausgabe der Verabschiedung
	static void verabschiedung() {
			
		System.out.println("\n\n\t Have A Nice Day!");
	}	
}
