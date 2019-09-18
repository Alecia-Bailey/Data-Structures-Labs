
public class Driver {

	public static void main(String[] args) {
		int a, b=3;
		Rail[] rails = new Rail[3];
		rails[0]= new Rail();
		rails[0].setLength(57.8f);
		System.out.println("Someone stole the railing \n " + rails[0]);
		System.out.println("----All Railings-----");
		for(Rail rail : rails) {
			System.out.println(rail);
		}

	}

}
