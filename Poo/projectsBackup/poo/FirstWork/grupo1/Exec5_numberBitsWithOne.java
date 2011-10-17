package grupo1;

public class Exec5_numberBitsWithOne {
	
	public static int numberBitsWithOne( int n ) {
		if(n == 0) return 0;
	
		return (n%2 == 1)?numberBitsWithOne(n/2)+1:numberBitsWithOne(n/2);
	}
	
	public static void main (String[] args){
		int number = 64;
		System.out.println("Original Number --> "+number);
		System.out.println("Number of bits with one --> "+numberBitsWithOne(number));
	}

}
