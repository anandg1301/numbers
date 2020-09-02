
public class Calc {

	public static void main(String[] args) {
		int add = new Calc().add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println(add);
	}

	public int add(int a,int b) {
		return a+b;
	}
}
