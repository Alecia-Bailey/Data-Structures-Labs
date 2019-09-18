
public class Rail {
	private int code;
	private float length;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public Rail() {
		this.code = 0;
		this.length = 0.0f;
	}
	public Rail(int code, float length) {
		super();
		this.code = code;
		this.length = length;
	}
	@Override
	public String toString() {
		return "Rail [code=" + code + ", length=" + length + "]";
	}
	
	
}
