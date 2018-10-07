
public class D {
	
	private static char dbl;
	private static char dbr;
	private static char dfl;
	private static char dfr;

	public D(char DBL, char DBR, char DFL, char DFR) {
		dbl = DBL;
		dbr = DBR;
		dfl = DFL;
		dfr = DFR;
	}
	
	public static char DBL() {
		return dbl;
	}
	
	public static char DBR() {
		return dbr;
	}
	
	public static char DFL() {
		return dfl;
	}
	
	public static char DFR() {
		return dfr;
	}
	
	public void toDBL(char a) {
		dbl = a;
	}
	
	public void toDBR(char a) {
		dbr = a;
	}
	
	public void toDFL(char a) {
		dfl = a;
	}
	
	public void toDFR(char a) {
		dfr = a;
	}
}
