
public class el {
	
	private ef T;
	private int y;
	
	public el(ef t) {
		T = t;
		y = display.csize();
	}
	public int[] flx() {
		int[] a = new int[4];
		a[0] = T.flx()[0];
		a[1] = T.flx()[1];
		a[2] = a[1];
		a[3] = a[0];
		return a;
	}
	public int[] fly() {
		int[] a = new int[4];
		a[0] = T.fly()[0];
		a[1] = T.fly()[1];
		a[2] = a[1] - y;
		a[3] = a[0] - y;
		return a;
	}
	public int[] frx() {
		int[] a = new int[4];
		a[0] = T.frx()[0];
		a[1] = T.frx()[1];
		a[2] = a[1];
		a[3] = a[0];
		return a;
	}
	public int[] fry() {
		int[] a = new int[4];
		a[0] = T.fry()[0];
		a[1] = T.fry()[1];
		a[2] = a[1] - y;
		a[3] = a[0] - y;
		return a;
	}
	public int[] rfx() {
		int[] a = new int[4];
		a[0] = T.frx()[0];
		a[1] = T.frx()[3];
		a[2] = a[1];
		a[3] = a[0];
		return a;
	}
	public int[] rfy() {
		int[] a = new int[4];
		a[0] = T.fry()[0];
		a[1] = T.fry()[3];
		a[2] = a[1] - y;
		a[3] = a[0] - y;
		return a;
	}
	public int[] rbx() {
		int[] a = new int[4];
		a[0] = T.brx()[0];
		a[1] = T.brx()[1];
		a[2] = a[1];
		a[3] = a[0];
		return a;
	}
	public int[] rby() {
		int[] a = new int[4];
		a[0] = T.bry()[0];
		a[1] = T.bry()[1];
		a[2] = a[1] - y;
		a[3] = a[0] - y;
		return a;
	}
	public int[] brx() {
		int[] a = new int[4];
		a[0] = T.brx()[0];
		a[1] = T.brx()[3];
		a[2] = a[1];
		a[3] = a[0];
		return a;
	}
	public int[] bry() {
		int[] a = new int[4];
		a[0] = T.bry()[0];
		a[1] = T.bry()[3];
		a[2] = a[1] - y;
		a[3] = a[0] - y;
		return a;
	}
	public int[] blx() {
		int[] a = new int[4];
		a[0] = T.blx()[0];
		a[1] = T.blx()[1];
		a[2] = a[1];
		a[3] = a[0];
		return a;
	}
	public int[] bly() {
		int[] a = new int[4];
		a[0] = T.bly()[0];
		a[1] = T.bly()[1];
		a[2] = a[1] - y;
		a[3] = a[0] - y;
		return a;
	}
	public int[] lbx() {
		int[] a = new int[4];
		a[0] = T.blx()[0];
		a[1] = T.blx()[3];
		a[2] = a[1];
		a[3] = a[0];
		return a;
	}
	public int[] lby() {
		int[] a = new int[4];
		a[0] = T.bly()[0];
		a[1] = T.bly()[3];
		a[2] = a[1] - y;
		a[3] = a[0] - y;
		return a;
	}
	public int[] lfx() {
		int[] a = new int[4];
		a[0] = T.flx()[0];
		a[1] = T.flx()[3];
		a[2] = a[1];
		a[3] = a[0];
		return a;
	}
	public int[] lfy() {
		int[] a = new int[4];
		a[0] = T.fly()[0];
		a[1] = T.fly()[3];
		a[2] = a[1] - y;
		a[3] = a[0] - y;
		return a;
	}
}
