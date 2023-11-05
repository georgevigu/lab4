package lab4;

public class Rectangle {
	int w, l;
	
	Rectangle() {
		this.w=0;
		this.l=0;
	}
	
	void set(int x, int y) {
		this.w=x;
		this.l=y;
	}
	
	int getWidth() { return this.w; }
	int getLength() { return this.l; }
	
	int aria() {
		return l*w;
	}
	
	int perimetru() {
		return 2*l + 2*w;
	}
}
