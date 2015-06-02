import AlgoTools.IO;
public class Prog_A {

	public static void main(String[] args) {

		titel("Faktorielle - Tabelle");
		
		for (int i=0; i<=15; i++) {
			IO.print("\t\t");
			IO.print(i,6);
			IO.print("! = ");
			IO.println(fakt(i),13);
		}
		
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
	
	
	//Faktorielle rekursiv
	static long fakt(int n) {
		if (n<2)
			return 1;
		else
			return n*fakt(n-1);
	}
	
	
	//Ausgabe der Verabschiedung
	static void verabschiedung() {
			
		System.out.println("\n\n\t Have A Nice Day!");
	}	
}
