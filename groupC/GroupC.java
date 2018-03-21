package groupC;

 
public class GroupC {
	public static void main(String[] args) {

		int arg1 = Integer.parseInt(args[0]);
	
	
		test(arg1);
}

	public static void test(int n) {
		for(int i=2;i<n; i++) {
			if(n%i==0) { 
				System.out.println(n+" n\'est pas premier");
				return;
			}
		}
		System.out.println(n+" est premier.");
	}
}
