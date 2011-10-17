package grupo1;

public class Exec4_clearTheNLeastSignificantDigits {
	
	public static int clearTheNLeastSignificantDigits( int x, int n ){
		
		if (n==0) return x;
		return (clearTheNLeastSignificantDigits((x/10),(n-1))*10);
		
	}
	public static void main (String[] arg){
		
		int number = 7654321;
		int numbersToClear = 2;
		int result = clearTheNLeastSignificantDigits(number,numbersToClear);
		System.out.println("Original Number -->"+number);
		System.out.println("Resultado final -->"+result);
	}


}
