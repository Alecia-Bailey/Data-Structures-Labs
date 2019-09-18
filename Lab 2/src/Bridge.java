import java.util.Arrays;

public class Bridge {
	private int refNo;
	private String name;
	private Rail rail[];
	
	public int getRefNo() {
		return refNo;
	}
	public void setRefNo(int refNo) {
		this.refNo = refNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Rail[] getRail() {
		return rail;
	}
	public void setRail(Rail[] rail) {
		this.rail = rail;
	}
	public Bridge(int refNo, String name, Rail[] rail) {
		super();
		this.refNo = refNo;
		this.name = name;
		this.rail = rail;
	}
	public Bridge() {
		super();
	}
	@Override
	public String toString() {
		return "Bridge [refNo=" + refNo + ", name=" + name + ", rail=" + Arrays.toString(rail) + "]";
	}
	
	
}
