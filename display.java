import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class display extends Applet implements KeyListener, MouseListener, Runnable {
	
	boolean flag;
	int r;
	int g;
	int b;
	boolean gr;
	boolean gg;
	boolean gb;
	int x;
	int y;
	int width;
	int height;
	boolean Start;
	boolean scrambled;
	Thread a;
	int z;
	int time;
	int t;
	boolean using;
	static int size;
	
	public void init() {
		size = 0;
		t = 0;
		a = new Thread(this);
		r = 255;
		g = 0;
		b = 0;
		gr = false;
		gg = true;
		gb = false;
		Start = false;
		z = 0;
		scrambled = false;
		time = 0;
		setSize(750, 750);
		setBackground(new Color(210, 210, 210));
		Cube.solve();
		addKeyListener(this);
		addMouseListener(this);
		a.start();
	}
	
	public static int csize() {
		return size;
	}
	
	public void paint(Graphics G) {
		if(Start){
		int[] x = new int[4]; int[] y = new int[4];

		int d = t%10; int s = (int) (t/10)%60; int m = (int) (t/600)%60; int h = (int) (t/36000);
		String Clock = "" + h + ":";
		if(m<10){
			Clock += "0";
		}
		Clock += m + ":";
		if(s<10){
			Clock += "0";
		}
		Clock += s + "." + d;
		G.setColor(Color.white);
		G.setFont(G.getFont().deriveFont(0, 30));
		G.drawString(Clock, 300, 40);
		
		if(U.UBL() == 'y'){
			G.setColor(Color.yellow);
		}else if(U.UBL() == 'w'){
			G.setColor(Color.white);
		}else if(U.UBL() == 'b'){
			G.setColor(Color.blue);
		}else if(U.UBL() == 'g'){
			G.setColor(Color.green);
		}else if(U.UBL() == 'r'){
			G.setColor(Color.red);
		}else if(U.UBL() == 'o'){
			G.setColor(new Color(255, 128, 0));
		}
		x[0] = 154; x[1] = 232; x[2] = 454; x[3] = 376;
		y[0] = 154; y[1] = 75; y[2] = 75; y[3] = 154;
		G.fillPolygon(x, y, 4);
		
		if(U.UBR() == 'y'){
			G.setColor(Color.yellow);
		}else if(U.UBR() == 'w'){
			G.setColor(Color.white);
		}else if(U.UBR() == 'b'){
			G.setColor(Color.blue);
		}else if(U.UBR() == 'g'){
			G.setColor(Color.green);
		}else if(U.UBR() == 'r'){
			G.setColor(Color.red);
		}else if(U.UBR() == 'o'){
			G.setColor(new Color(255, 128, 0));
		}
		x[0] = 597; x[1] = 675;
		G.fillPolygon(x, y, 4);
		
		if(U.UFR() == 'y'){
			G.setColor(Color.yellow);
		}else if(U.UFR() == 'w'){
			G.setColor(Color.white);
		}else if(U.UFR() == 'b'){
			G.setColor(Color.blue);
		}else if(U.UFR() == 'g'){
			G.setColor(Color.green);
		}else if(U.UFR() == 'r'){
			G.setColor(Color.red);
		}else if(U.UFR() == 'o'){
			G.setColor(new Color(255, 128, 0));
		}
		x[1] = 518; x[2] = 297; y[1] = 232; y[2] = 232;
		G.fillPolygon(x, y, 4);
		
		if(U.UFL() == 'y'){
			G.setColor(Color.yellow);
		}else if(U.UFL() == 'w'){
			G.setColor(Color.white);
		}else if(U.UFL() == 'b'){
			G.setColor(Color.blue);
		}else if(U.UFL() == 'g'){
			G.setColor(Color.green);
		}else if(U.UFL() == 'r'){
			G.setColor(Color.red);
		}else if(U.UFL() == 'o'){
			G.setColor(new Color(255, 128, 0));
		}
		x[0] = 154; x[1] = 75;
		G.fillPolygon(x, y, 4);

		
		if(F.FUL() == 'y'){
			G.setColor(Color.yellow);
		}else if(F.FUL() == 'w'){
			G.setColor(Color.white);
		}else if(F.FUL() == 'b'){
			G.setColor(Color.blue);
		}else if(F.FUL() == 'g'){
			G.setColor(Color.green);
		}else if(F.FUL() == 'r'){
			G.setColor(Color.red);
		}else if(F.FUL() == 'o'){
			G.setColor(new Color(255, 128, 0));
		}
		G.fillRect(75, 232, 222, 222);
		
		if(F.FUR() == 'y'){
			G.setColor(Color.yellow);
		}else if(F.FUR() == 'w'){
			G.setColor(Color.white);
		}else if(F.FUR() == 'b'){
			G.setColor(Color.blue);
		}else if(F.FUR() == 'g'){
			G.setColor(Color.green);
		}else if(F.FUR() == 'r'){
			G.setColor(Color.red);
		}else if(F.FUR() == 'o'){
			G.setColor(new Color(255, 128, 0));
		}
		G.fillRect(297, 232, 222, 222);
		
		if(F.FDL() == 'y'){
			G.setColor(Color.yellow);
		}else if(F.FDL() == 'w'){
			G.setColor(Color.white);
		}else if(F.FDL() == 'b'){
			G.setColor(Color.blue);
		}else if(F.FDL() == 'g'){
			G.setColor(Color.green);
		}else if(F.FDL() == 'r'){
			G.setColor(Color.red);
		}else if(F.FDL() == 'o'){
			G.setColor(new Color(255, 128, 0));
		}
		G.fillRect(75, 454, 222, 222);
		
		if(F.FDR() == 'y'){
			G.setColor(Color.yellow);
		}else if(F.FDR() == 'w'){
			G.setColor(Color.white);
		}else if(F.FDR() == 'b'){
			G.setColor(Color.blue);
		}else if(F.FDR() == 'g'){
			G.setColor(Color.green);
		}else if(F.FDR() == 'r'){
			G.setColor(Color.red);
		}else if(F.FDR() == 'o'){
			G.setColor(new Color(255, 128, 0));
		}
		G.fillRect(297, 454, 222, 222);
		
		if(R.RUF() == 'y'){
			G.setColor(Color.yellow);
		}else if(R.RUF() == 'w'){
			G.setColor(Color.white);
		}else if(R.RUF() == 'b'){
			G.setColor(Color.blue);
		}else if(R.RUF() == 'g'){
			G.setColor(Color.green);
		}else if(R.RUF() == 'r'){
			G.setColor(Color.red);
		}else if(R.RUF() == 'o'){
			G.setColor(new Color(255, 128, 0));
		}
		x[0] = 518; x[1] = 597; x[2] = 597; x[3] = 518; y[0] = 232; y[1] = 154; y[2] = 376; y[3] = 454;
		G.fillPolygon(x, y, 4);
		
		if(R.RUB() == 'y'){
			G.setColor(Color.yellow);
		}else if(R.RUB() == 'w'){
			G.setColor(Color.white);
		}else if(R.RUB() == 'b'){
			G.setColor(Color.blue);
		}else if(R.RUB() == 'g'){
			G.setColor(Color.green);
		}else if(R.RUB() == 'r'){
			G.setColor(Color.red);
		}else if(R.RUB() == 'o'){
			G.setColor(new Color(255, 128, 0));
		}
		x[0] = 675; x[3] = 675; y[0] = 75; y[3] = 297;
		G.fillPolygon(x, y, 4);
		
		if(R.RDB() == 'y'){
			G.setColor(Color.yellow);
		}else if(R.RDB() == 'w'){
			G.setColor(Color.white);
		}else if(R.RDB() == 'b'){
			G.setColor(Color.blue);
		}else if(R.RDB() == 'g'){
			G.setColor(Color.green);
		}else if(R.RDB() == 'r'){
			G.setColor(Color.red);
		}else if(R.RDB() == 'o'){
			G.setColor(new Color(255, 128, 0));
		}
		y[0] = 518; y[1] = 597;
		G.fillPolygon(x, y, 4);
		
		if(R.RDF() == 'y'){
			G.setColor(Color.yellow);
		}else if(R.RDF() == 'w'){
			G.setColor(Color.white);
		}else if(R.RDF() == 'b'){
			G.setColor(Color.blue);
		}else if(R.RDF() == 'g'){
			G.setColor(Color.green);
		}else if(R.RDF() == 'r'){
			G.setColor(Color.red);
		}else if(R.RDF() == 'o'){
			G.setColor(new Color(255, 128, 0));
		}
		x[0] = 518; x[3] = 518; y[0] = 675; y[3] = 454;
		G.fillPolygon(x, y, 4);
		
		G.setColor(Color.black);
		G.drawRect(75, 232, 443, 443);
		x[0] = 75; x[1] = 232; x[2] = 675; x[3] = 518;
		y[0] = 232; y[1] = 75; y[2] = 75; y[3] = 232;
		G.drawPolygon(x, y, 4);
		int a = x[3]; int b = x[2];
		x[0] = a; x[1] = b; y[2] = a; y[3] = b;
		G.drawPolygon(x, y, 4);
		
		G.setColor(Color.black);
		G.drawLine(297, 232, 297, 675);
		G.drawLine(75, 454, 518, 454);
		
		G.drawLine(154, 154, 597, 154);
		G.drawLine(297, 232, 454, 75);
		
		G.drawLine(597, 154, 597, 597);
		G.drawLine(518, 454, 675, 297);

		G.setColor(Color.darkGray);
		G.fillRect(20, 10, 200, 50);
		G.fillRect(530, 10, 200, 50);
		G.setColor(Color.white);
		G.setFont(G.getFont().deriveFont(1, 40));
		G.drawString("Solve", 60, 50);
		G.drawString("Scramble", 535, 50);
		
		if(U.UBL() == U.UBR() && U.UBL() == U.UFL() && U.UBL() == U.UFR()){
			if(D.DBL() == D.DBR() && D.DBL() == D.DFL() && D.DBL() == D.DFR()){
				if(F.FDL() == F.FDR() && F.FDL() == F.FUL() && F.FDL() == F.FUR()){
					if(R.RDB() == R.RDF() && R.RDB() == R.RUB() && R.RDB() == R.RUF()){
						if(L.LDB() == L.LDF() && L.LDB() == L.LUB() && L.LDB() == L.LUF()){
							
						}
					}
				}
			}
		}
		}
		else{
			setBackground(new Color(r, g, b));
			width = 417;
			height = 60;
			x = 375 - (width/2);
			y = 375 - (height/2);
			G.setColor(new Color(0, 102-z, 204-z));
			G.fillRect(x, y, width, height);
			G.setColor(Color.black);
			G.drawRect(x, y, width, height);
			String b = "Start Game";
			G.setFont(G.getFont().deriveFont(1, 50));
			G.setColor(new Color(255-z, 255-z, 255-z));
			G.drawString(b, 236, 394);
		}
	}

	public void keyTyped(KeyEvent e) {
		if(Start){
		using = true;
		if(e.getExtendedKeyCode() == 85){
			if(e.isShiftDown()){
				Cube.ui();
			}else{
				Cube.u();
			}
		}else if(e.getExtendedKeyCode() == 68){
			if(e.isShiftDown()){
				Cube.di();
			}else{
				Cube.d();
			}
		}else if(e.getExtendedKeyCode() == 82){
			if(e.isShiftDown()){
				Cube.ri();
			}else{
				Cube.r();
			}
		}else if(e.getExtendedKeyCode() == 76){
			if(e.isShiftDown()){
				Cube.li();
			}else{
				Cube.l();
			}
		}else if(e.getExtendedKeyCode() == 70){
			if(e.isShiftDown()){
				Cube.fi();
			}else{
				Cube.f();
			}
		}else if(e.getExtendedKeyCode() == 66){
			if(e.isShiftDown()){
				Cube.bi();
			}else{
				Cube.b();
			}
		}else if(e.getExtendedKeyCode() == 88){
			if(e.isShiftDown()){
				Cube.xi();
			}else{
				Cube.x();
			}
		}else if(e.getExtendedKeyCode() == 89){
			if(e.isShiftDown()){
				Cube.yi();
			}else{
				Cube.y();
			}
		}else if(e.getExtendedKeyCode() == 90){
			if(e.isShiftDown()){
				Cube.zi();
			}else{
				Cube.z();
			}
		}
		repaint();
		}
	}

	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}
	

	public void mouseClicked(MouseEvent e) {
		if(Start){
			if(e.getX()>20 && e.getX()<220 && e.getY()>10 && e.getY()<60){
				Cube.solve();
				using = false;
				t = 0;
			}
			if(e.getX()>530 && e.getX()<730 && e.getY()>10 && e.getY()<60){
				Cube.scramble();
				scrambled = true;
				using = true;
				t = 0;
			}
			repaint();
		}
		else{
			if(e.getX()>x && e.getX()<x+width && e.getY()>y && e.getY()<y+height){
				Start = true;
				repaint();
			}
		}
	}
	
	public void mousePressed(MouseEvent e) {
		if(!Start){
			if(e.getX()>x && e.getX()<x+width && e.getY()>y && e.getY()<y+height){
				z = 100;
				repaint();
			}
		}
	}
	

	public void mouseReleased(MouseEvent e) {
		
	}
	

	public void mouseEntered(MouseEvent e) {
		
	}
	

	public void mouseExited(MouseEvent e) {
		
	}

	public void run() {
		while(!Start){
			if(gr){
				b-=1;
				r+=1;
				if(r>255){
					r = 254;
					b = 0;
					g = 1;
					gg = true;
					gr = false;
				}
			}
			else if(gg){
				r-=1;
				g+=1;
				if(g>255){
					g = 254;
					r = 0;
					b = 1;
					gb = true;
					gg = false;
				}
			}
			else{
				g-=1;
				b+=1;
				if(b>255){
					b = 254;
					g = 0;
					r = 1;
					gr = true;
					gb = false;
				}
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
		while(Start){
			if(using){
				t += 1;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
	}
}
