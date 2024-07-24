package question09;

class TV2{
	private static int size;
	public TV2(int size) {this.size=size;}
	protected static int getSize() {return size;}
}

class ColorTV2 extends TV2{
	private int nColors;
	public ColorTV2(int size, int nColors) {
		super(size);
		this.nColors = nColors;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+nColors+"컬러");
	}
}
public class IPTV extends ColorTV2{
	private String ipAddr;
	public IPTV(String ipAddr, int size, int nColors) {
		super(size, nColors);
		this.ipAddr = ipAddr;
	}
	public void printProperty() {
		System.out.print("나의 IPTV는 "+ipAddr+"주소의 ");
		super.printProperty();
	}
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}













