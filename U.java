
public class U {
	
	private static char ubl;
	private static char ubr;
	private static char ufl;
	private static char ufr;
	
	public U(char UBL, char UBR, char UFL, char UFR) {
		ubl = UBL;
		ubr = UBR;
		ufl = UFL;
		ufr = UFR;
	}
	
	public static char UBL() {
		return ubl;
	}
	
	public static char UBR() {
		return ubr;
	}
	
	public static char UFL() {
		return ufl;
	}
	
	public static char UFR() {
		return ufr;
	}
	
	public void toUBL(char a) {
		ubl = a;
	}
	
	public void toUBR(char a) {
		ubr = a;
	}
	
	public void toUFL(char a) {
		ufl = a;
	}
	
	public void toUFR(char a) {
		ufr = a;
	}
}
