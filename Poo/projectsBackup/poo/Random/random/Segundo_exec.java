package random;

public class Segundo_exec {
	
	public static int[] lastTwo (int val) {
		
		if(Math.abs(val) < 10) return null;
		
		if((Math.abs(val)/10 >= 0)&&(Math.abs(val)/10 <= 9)){
			int[] valArray = new int[2];
			valArray[0] =val/10; //(Math.abs(val)/10);
			valArray[1] =val%10; //(Math.abs(val)%10);
			
			return valArray;
		}
		
		return lastTwo(val/10);
		
	}
	
	public static void main(String[] args){
		
		int[] valArray;
		valArray = lastTwo(-12);
		
		if(valArray==null) System.out.println("Null");
		
		for (int i = 0;(valArray!=null) && i<valArray.length  ;i++){
			System.out.println("Resultado --> "+valArray[i]);
		}
		
		//System.out.println("resultado: "+(a/10)+"divisao inteira ");
		//System.out.println("resultado: "+(a%10)+"resto ");
		
	}
	
	

}
