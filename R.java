
public class R {
	
	private static char ruf;
	private static char rub;
	private static char rdf;
	private static char rdb;

	public R(char RUF, char RUB, char RDF, char RDB) {
		ruf = RUF;
		rub = RUB;
		rdf = RDF;
		rdb = RDB;
	}
	
	public static char RUF() {
		return ruf;
	}
	
	public static char RUB() {
		return rub;
	}
	
	public static char RDF() {
		return rdf;
	}
	
	public static char RDB() {
		return rdb;
	}
	
	public void toRUF(char a) {
		ruf = a;
	}
	
	public void toRUB(char a) {
		rub = a;
	}
	
	public void toRDF(char a) {
		rdf = a;
	}
	
	public void toRDB(char a) {
		rdb = a;
	}
}
