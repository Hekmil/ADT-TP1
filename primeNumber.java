public class Main {

public static void main(String[] args) {
	
	int arg1 = Int.parseInt(args[0]);
	
	
	if(test(arg1)) {
		system.out.println(n + " est pas premier.");
	} else {
		system.out.println(n + " n/'est pas premier.");
	}
}

public boolean test(int n) {

	if (n%n == 0 && n%1 == 0) return true;
	else return false;
	}
}