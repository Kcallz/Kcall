import java.util.Date;

public class Test01 {
	private String sno;
	private String sname;
	private String ssex;
	private Object sbir;
	private int scredits;
	public Test01(String sno, String sname, String ssex, Object sbir, int scredits) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.ssex = ssex;
		this.sbir = sbir;
		this.scredits = scredits;
	}
	public Test01() {
		super();
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public Object getSbir() {
		return sbir;
	}
	public void setSbir(Object sbir) {
		this.sbir = sbir;
	}
	public int getScredits() {
		return scredits;
	}
	public void setScredits(int scredits) {
		this.scredits = scredits;
	}
	@Override
	public String toString() {
		return "Test01 [sno=" + sno + ", sname=" + sname + ", ssex=" + ssex + ", sbir=" + sbir + ", scredits="
				+ scredits + "]";
	}
	
}
