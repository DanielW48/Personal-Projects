
public class sf {
	
	private int eblx;
	private int ebrx;
	private int eflx;
	private int efrx;
	
	private int ebly;
	private int ebry;
	private int efly;
	private int efry;
	
	private int ebx;
	private int erx;
	private int efx;
	private int elx;
	
	private int eby;
	private int ery;
	private int efy;
	private int ely;
	
	private int cx;
	private int cy;
	
	public sf(int[] sx, int[] sy){
		eblx = sx[0]; ebrx = sx[1]; eflx = sx[2]; efrx = sx[3];
		ebly = sy[0]; ebry = sy[1]; efly = sy[2]; efry = sy[3];
		ebx = (eblx + ebrx)/2;
		erx = (ebrx + efrx)/2;
		efx = (efrx + eflx)/2;
		elx = (eflx + eblx)/2;
		eby = (ebly + ebry)/2;
		ery = (ebry + efry)/2;
		efy = (efry + efly)/2;
		ely = (efly + ebly)/2;
		cx = (elx + erx)/2;
		cy = (eby + ebx)/2;
	}
	public int[] x() {
		int[] a = new int[4];
		a[0] = eblx;
		a[1] = ebrx;
		a[2] = eflx;
		a[3] = efrx;
		return a;
	}
	public int[] y() {
		int[] a = new int[4];
		a[0] = ebly;
		a[1] = ebry;
		a[2] = efly;
		a[3] = efry;
		return a;
	}
	public int[] blx() {
		int[] a = new int[4];
		a[0] = eblx;
		a[1] = ebx;
		a[2] = cx;
		a[3] = elx;
		return a;
	}
	public int[] bly() {
		int[] a = new int[4];
		a[0] = ebly;
		a[1] = eby;
		a[2] = cy;
		a[3] = ely;
		return a;
	}
	
	
	public int[] brx() {
		int[] a = new int[4];
		a[0] = ebrx;
		a[1] = erx;
		a[2] = cx;
		a[3] = ebx;
		return a;
	}
	public int[] bry() {
		int[] a = new int[4];
		a[0] = ebry;
		a[1] = ery;
		a[2] = cy;
		a[3] = eby;
		return a;
	}
	
	
	public int[] frx() {
		int[] a = new int[4];
		a[0] = efrx;
		a[1] = efx;
		a[2] = cx;
		a[3] = erx;
		return a;
	}
	public int[] fry() {
		int[] a = new int[4];
		a[0] = efry;
		a[1] = efy;
		a[2] = cy;
		a[3] = ery;
		return a;
	}
	
	
	public int[] flx() {
		int[] a = new int[4];
		a[0] = eflx;
		a[1] = efx;
		a[2] = cx;
		a[3] = elx;
		return a;
	}
	public int[] fly() {
		int[] a = new int[4];
		a[0] = efly;
		a[1] = efy;
		a[2] = cy;
		a[3] = ely;
		return a;
	}
	public int hx1() {
		return elx;
	}
	public int hx2() {
		return erx;
	}
	public int hy1() {
		return ely;
	}
	public int hy2() {
		return ery;
	}
	public int vx1() {
		return efx;
	}
	public int vx2() {
		return ebx;
	}
	public int vy1() {
		return efy;
	}
	public int vy2() {
		return eby;
	}
	public void setx(int[] a) {
		eblx = a[0];
		ebrx = a[1];
		efrx = a[2];
		eflx = a[3];
	}
	public void sety(int[] a) {
		ebly = a[0];
		ebry = a[1];
		efry = a[2];
		efly = a[3];
	}
}
