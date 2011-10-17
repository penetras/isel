package grupo1;

public class Exec3_leastSignificantDigit {
	
	public static int removeTheNLeastSignificantDigits( int x, int n ) {
		if (n==0) return x;
		return removeTheNLeastSignificantDigits((x/10),(n-1));
	}
	
	public static void main (String[] arg){
		
		int number = 7654321;
		int numbersToRemove = 6;
		
		int result = removeTheNLeastSignificantDigits(number,numbersToRemove);
		System.out.println("Resultado final -->"+result);
	}

}
