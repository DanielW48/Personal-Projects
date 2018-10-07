import java.util.Random;

public class cube {

	private static U U;
	private static D D;
	private static R R;
	private static L L;
	private static F F;
	private static B B;
	
	public static void solve() {
		U = new U('y', 'y', 'y', 'y');
		D = new D('w', 'w', 'w', 'w');
		R = new R('r', 'r', 'r', 'r');
		L = new L('o', 'o', 'o', 'o');
		F = new F('b', 'b', 'b', 'b');
		B = new B('g', 'g', 'g', 'g');
	}
	
	public static void scramble() {
		for(int i = 0; i<50; i++) {
			Random b = new Random();
			int a = b.nextInt(18) +1;
			if(a==1){
				u();
			}else if(a==2){
				ui();
			}else if(a==3){
				u2();
			}else if(a==4){
				d();
			}else if(a==5){
				di();
			}else if(a==6){
				d2();
			}else if(a==7){
				r();
			}else if(a==8){
				ri();
			}else if(a==9){
				r2();
			}else if(a==10){
				l();
			}else if(a==11){
				li();
			}else if(a==12){
				l2();
			}else if(a==13){
				f();
			}else if(a==14){
				fi();
			}else if(a==15){
				f2();
			}else if(a==16){
				b();
			}else if(a==17){
				bi();
			}else{
				b2();
			}
		}
	}
	
	public static void u() {
		char a = U.UBR();
		char b = U.UFR();
		char c = U.UFL();
		U.toUBR(U.UBL());
		U.toUFR(a);
		U.toUFL(b);
		U.toUBL(c);
		char d = R.RUB();
		char e = F.FUR();
		char f = L.LUF();
		R.toRUB(B.BUL());
		F.toFUR(d);
		L.toLUF(e);
		B.toBUL(f);
		char g = B.BUR();
		char h = R.RUF();
		char i = F.FUL();
		B.toBUR(L.LUB());
		R.toRUF(g);
		F.toFUL(h);
		L.toLUB(i);
	}
	public static void ui() {
		u();
		u();
		u();
	}
	public static void u2() {
		u();
		u();
	}
	
	public static void di() {
		char a = D.DBR();
		char b = D.DFR();
		char c = D.DFL();
		D.toDBR(D.DBL());
		D.toDFR(a);
		D.toDFL(b);
		D.toDBL(c);
		char d = R.RDB();
		char e = F.FDR();
		char f = L.LDF();
		R.toRDB(B.BDL());
		F.toFDR(d);
		L.toLDF(e);
		B.toBDL(f);
		char g = B.BDR();
		char h = R.RDF();
		char i = F.FDL();
		B.toBDR(L.LDB());
		R.toRDF(g);
		F.toFDL(h);
		L.toLDB(i);
	}
	public static void d() {
		di();
		di();
		di();
	}
	public static void d2() {
		di();
		di();
	}
	
	public static void r() {
		char a = R.RUB();
		char b = R.RDB();
		char c = R.RDF();
		R.toRUB(R.RUF());
		R.toRDB(a);
		R.toRDF(b);
		R.toRUF(c);
		char d = B.BUR();
		char e = D.DBR();
		char f = F.FDR();
		B.toBUR(U.UFR());
		D.toDBR(d);
		F.toFDR(e);
		U.toUFR(f);
		char g = U.UBR();
		char h = B.BDR();
		char i = D.DFR();
		U.toUBR(F.FUR());
		B.toBDR(g);
		D.toDFR(h);
		F.toFUR(i);
	}
	public static void ri() {
		r();
		r();
		r();
	}
	public static void r2() {
		r();
		r();
	}
	
	public static void li() {
		char a = L.LUB();
		char b = L.LDB();
		char c = L.LDF();
		L.toLUB(L.LUF());
		L.toLDB(a);
		L.toLDF(b);
		L.toLUF(c);
		char d = B.BUL();
		char e = D.DBL();
		char f = F.FDL();
		B.toBUL(U.UFL());
		D.toDBL(d);
		F.toFDL(e);
		U.toUFL(f);
		char g = U.UBL();
		char h = B.BDL();
		char i = D.DFL();
		U.toUBL(F.FUL());
		B.toBDL(g);
		D.toDFL(h);
		F.toFUL(i);
	}
	public static void l() {
		li();
		li();
		li();
	}
	public static void l2() {
		li();
		li();
	}
	
	public static void f() {
		char a = F.FUR();
		char b = F.FDR();
		char c = F.FDL();
		F.toFUR(F.FUL());
		F.toFDR(a);
		F.toFDL(b);
		F.toFUL(c);
		char d = R.RUF();
		char e = D.DFR();
		char f = L.LDF();
		R.toRUF(U.UFL());
		D.toDFR(d);
		L.toLDF(e);
		U.toUFL(f);
		char g = U.UFR();
		char h = R.RDF();
		char i = D.DFL();
		U.toUFR(L.LUF());
		R.toRDF(g);
		D.toDFL(h);
		L.toLUF(i);
	}
	public static void fi() {
		f();
		f();
		f();
	}
	public static void f2() {
		f();
		f();
	}

	public static void bi() {
		char a = B.BUR();
		char b = B.BDR();
		char c = B.BDL();
		B.toBUR(B.BUL());
		B.toBDR(a);
		B.toBDL(b);
		B.toBUL(c);
		char d = R.RUB();
		char e = D.DBR();
		char f = L.LDB();
		R.toRUB(U.UBL());
		D.toDBR(d);
		L.toLDB(e);
		U.toUBL(f);
		char g = U.UBR();
		char h = R.RDB();
		char i = D.DBL();
		U.toUBR(L.LUB());
		R.toRDB(g);
		D.toDBL(h);
		L.toLUB(i);
	}
	public static void b() {
		bi();
		bi();
		bi();
	}
	public static void b2() {
		bi();
		bi();
	}
	
	public static void y() {
		u();
		di();
	}
	public static void yi() {
		ui();
		d();
	}
	public static void y2() {
		u2();
		d2();
	}
	
	public static void x() {
		r();
		li();
	}
	public static void xi() {
		ri();
		l();
	}
	public static void x2() {
		r2();
		l2();
	}
	
	public static void z() {
		f();
		bi();
	}
	public static void zi() {
		fi();
		b();
	}
	public static void z2() {
		f2();
		b2();
	}
}
