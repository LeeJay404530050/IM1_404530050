/*
 * [A]96
 * [TA's advise]
 * 1.Object(這是一個Class)本身有提供一個method為public String toString, 本次作業希望你們要overridding, 而不是透過另建method的方式進行呼叫
 * 下方提供給你使用方法, 這部分酌量扣2分.
 * 2.getHeight()與getWidth()是個沒有作用的method, 你的寫法是讓他收了一個double值, 但什麼都不作直接傳回去, 想想看如果是這樣的話那何必要開這個method呢? 酌量扣2分.
 * 3.以下有稍微修正你的程式碼提供給你參考, 如果有問題歡迎與我聯繫.
 * 4.OO的概念需要加強一下喔.
 * */

package myPackage;
public class RectangleTester {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(18, 57, 25, 15);
		R1.tostring();
		Rectangle R2 = new Rectangle(47, 60, 12, 0);
		R2.tostring();
		System.out.println();
		System.out.println("End of Output!");
	}

}

class Rectangle {
	static double height, width, Y, X;

	Rectangle() {
	}

	Rectangle(double h, double w, double y, double x) {
		//這邊賦值無須透過funtion call
		//this.height=h;
		//this.width=w;
		
		this.height = getHeight(h);
		this.width = getWidth(w);
		this.Y = y;
		this.X = x;
	}

	//overridding
	/*
	 * public String toString(){
	 * 	return "java.Rectangle[x=" + X + " ,y=" + Y + " ,height=" + height + " ,width=" + width + "]";
	 * }
	 * */
	
	public void tostring() {
		System.out.println();
		System.out.println("java.Rectangle[x=" + X + " ,y=" + Y + " ,height=" + height + " ,width=" + width + "]");
		System.out.println("Area=" + height * width);
		System.out.println("Perimeter=" + (height + width) * 2);
	}

	
	//修正getHeight() method, getWidth()同.
	/*
	 * public double getHeight(){
	 * 	return this.h;
	 * }
	 * */
	//這樣的寫法是讓他取值, 有點像是C#中的set/get的get.
	
	public double getHeight(double h) {
		
		return h;
	}

	public double getWidth(double w) {
		return w;
	}

}