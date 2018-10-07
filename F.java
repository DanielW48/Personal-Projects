
public class F {

	private static char ful;
	private static char fur;
	private static char fdl;
	private static char fdr;

	public F(char FUL, char FUR, char FDL, char FDR) {
		ful = FUL;
		fur = FUR;
		fdl = FDL;
		fdr = FDR;
	}
	
	public static char FUL() {
		return ful;
	}
	
	public static char FUR() {
		return fur;
	}
	
	public static char FDL() {
		return fdl;
	}
	
	public static char FDR() {
		return fdr;
	}
	
	public void toFUL(char a) {
		ful = a;
	}
	
	public void toFUR(char a) {
		fur = a;
	}
	
	public void toFDL(char a) {
		fdl = a;
	}
	
	public void toFDR(char a) {
		fdr = a;
	}
}
