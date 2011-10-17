package grupo0;

public class Exec1_MatrixUtil {
	
	public static void print( double[][] m ){
		
		for (int i=0; i<m.length; i++){
			for (int j=0; j<m[i].length; j++){
				if (m[i][j]<10)System.out.print(" ");
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	
	public static void copyLineWithoutElement( double[][] m, int row, int column, double[] l ){
		
		int tempCol = 0;
		
		for (int i=row; i==row; i++){
			for (int j=0; j<m[i].length; j++){
				
				if(j!=column){
					l[tempCol] = m[i][j];
					tempCol++;
				}
			}
		}
		
	}
	
	public static void copyWithoutRowAndColumn(double[][] m, int row, int column, double[][] destM){
		
		int tempRow = 0;
		int tempCol = 0;
		
		for (int i=0; i<m.length; i++){
			
			if (i != row){
				for (int j=0; j<m[i].length; j++){
					
					if(j!=column){
						
						destM[tempRow][tempCol] = m[i][j];
						tempCol++;
					}
				}
				tempCol =0;
				tempRow++;
			}
			
		}
		
	}
	
	public static void main(String [] args){
		
		int row 			= 0;
		int column 			= 1;
		double[][] dArray	= new double[10][10];
		double[]   lArray 	= new double [(dArray[0].length)-1];
		double[][] destArray= new double [(dArray.length)-1]  [(dArray[0].length)-1];
		double count 		= 1;
		
		
		for (int i=0; i<dArray.length; i++){
			for (int j=0; j<dArray[i].length; j++){
				
				dArray[i][j] = count;
				count++;
			}
		}
		
		print(dArray);
		copyLineWithoutElement(dArray, row, column, lArray);
		copyWithoutRowAndColumn(dArray,  row, column, destArray);
		
		System.out.println("");
		
		for (int i=0; i<lArray.length; i++){
			System.out.print(lArray[i]+" ");
		}
		
		System.out.println("");
		System.out.println("");
		print(destArray);
		
	}

}
