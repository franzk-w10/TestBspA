import AlgoTools.IO;
public class Prog_A {

	public static void main(String[] args) {

		titel("Faktorielle - Tabelle");
		
		long start=System.currentTimeMillis();
		
		for (int i=0; i<=15; i++) {
			IO.print("\t\t");
			IO.print(i,6);
			IO.print("! = ");
			IO.println(fakt2(i),13);
		}
		
		long end=System.currentTimeMillis();
		long dauer=end-start;
		IO.println("\n\tZeit in ms: "+dauer);
		
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
	static long fakt1(int n) {
		if (n<2)
			return 1;
		else
			return n*fakt1(n-1);
	}
	
	//Faktorielle nichtrekursiv
		static long fakt2(int n) {
			if (n<2)
				return 1;
			long f=1;
			for (int i=2; i<=n; i++)
				f*=i;
			return f;
		}
	
	
	//Ausgabe der Verabschiedung
	static void verabschiedung() {
			
		System.out.println("\n\n\t Have A Nice Day!");
	}	
}
