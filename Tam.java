package NguyenTanHoangVu_23657941;

public class Tam {
	
private String ten;
private double x;
   private double y;
   public String getTen() {
 		return ten;
 	}
 	public void setTen(String ten) throws Exception {
 		if (ten !=null)
 		{
 			this.ten = ten;
 		} else
 		{
 			throw new Exception("Loi");
 		}
 		
 	}
 	public double getX() {
 		return x;
 	}
 	public void setX(double x) {
 		this.x = x;
 	}
 	public double getY() {
 		return y;
 	}
 	public void setY(double y) {
 		this.y = y;
 	}
public Tam() {}
public Tam(String ten, double x, double y) throws Exception {
	if (ten !=null)
		{
			this.ten = ten;
		} else
		{
			throw new Exception("Loi");
		}
	this.x = x;
	this.y = y;
}
@Override
public String toString() {
	String s="";
	s=s+s.format("%2s,(%2s,%2s)",getTen(),getX(),getY());
	return s;
}
}


