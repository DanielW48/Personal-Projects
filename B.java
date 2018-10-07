
public class B {

	private char bur;
	private char bul;
	private char bdr;
	private char bdl;

	public B(char BUR, char BUL, char BDR, char BDL) {
		bur = BUR;
		bul = BUL;
		bdr = BDR;
		bdl = BDL;
	}
	
	public char BUR() {
		return bur;
	}
	
	public char BUL() {
		return bul;
	}
	
	public char BDR() {
		return bdr;
	}
	
	public char BDL() {
		return bdl;
	}
	
	public void toBUR(char a) {
		bur = a;
	}
	
	public void toBUL(char a) {
		bul = a;
	}
	
	public void toBDR(char a) {
		bdr = a;
	}
	
	public void toBDL(char a) {
		bdl = a;
	}
}
