
public class L {

	private static char luf;
	private static char lub;
	private static char ldf;
	private static char ldb;

	public L(char LUF, char LUB, char LDF, char LDB) {
		luf = LUF;
		lub = LUB;
		ldf = LDF;
		ldb = LDB;
	}
	
	public static char LUF() {
		return luf;
	}
	
	public static char LUB() {
		return lub;
	}
	
	public static char LDF() {
		return ldf;
	}
	
	public static char LDB() {
		return ldb;
	}
	
	public void toLUF(char a) {
		luf = a;
	}
	
	public void toLUB(char a) {
		lub = a;
	}
	
	public void toLDF(char a) {
		ldf = a;
	}
	
	public void toLDB(char a) {
		ldb = a;
	}
}
