package groupC;

 
public class GroupC {

	public static void main(String args[]){
		
		int number = Integer.parseInt(args[0]); // I store the agr in a variable
		int nb_division = 0;

		if(number == 1){
			System.out.println(number+" is a prime.");//
		}

		for(int i=1; i<number ; i++){
		
			if(number%i == 0) nb_division++; 
		
		}
	
		if(nb_division>0) System.out.println(number+" is not a prime.");
		
	}
}