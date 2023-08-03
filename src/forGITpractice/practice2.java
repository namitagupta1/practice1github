package forGITpractice;

public class practice2 {
	public static void main(String[] args) {

		 int i=1;
		int n=0;
		do {
			 //n =sum of numbers
			 n= n+i;
			 System.out.println("i=" +i); 
			 i++;
			 
		}
	while( i <=50); 
		System.out.println(" n =" +n);
		//average = n/50
		float avg = n/50f ;
		System.out.println("avg =" +avg);
		
		System.out.println("changed");
		
	}

}

