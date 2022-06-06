package world;

public class Wand {
	private String wname;
	private double wpower;
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		if(wname.length()<3) {
			throw new IllegalArgumentException("Name Error");
		}else {
			this.wname = wname;
		}
	}
	public double getWpower() {
		return wpower;
	}
	public void setWpower(double wpower) {
		if(wpower>=0.5 && wpower<=100.0) {
			this.wpower=wpower;
		}else {
			throw new IllegalArgumentException("wpower Error");
		}
		
	}
}
// 全体的にwpower以外でのelseは不要かも