package home5;
/**
 * Homework_1
 * @author CruelWorld
 */
/*
по горизонтали
по вертикали
по горизонтали и вертикали одновременно  
*/
public class app {
	
	static void write1(int[][]m){
		for(int i = 0; i < m.length; i++) {
			System.out.println();
			  for(int j = 0; j <= i; j++){
				  System.out.print(m[i][j] + " ");
			        }
			   }System.out.println();
		}
	static void write2(int[][]m){
		for(int i = 0; i < m.length; i++) {
			System.out.println();
			  for(int j = 0; j < m.length - i; j++){
				  System.out.print(m[i][j] + " ");
			        }
			   }System.out.println();
		}
	static void write3(String[][]m){
		for(int i = 0; i < m.length; i++) {
			
           for(int j = 0; j < m.length - i-1; j++){
					m[i][j] =" ";
				 }
           
			   }for(int i = 0; i < m.length; i++) {
					System.out.println();
					  for(int j = 0; j < m.length; j++){
						  System.out.print(m[i][j] + " ");
					        }
			   }
		System.out.println();
		}
	
	
	public static void main(String[]args){
		int[][] mas = new int[4][4];
		String[][] mas2 = new String[4][4];
		for(int i = 0; i < mas.length; i++){
			  for(int j = 0; j < mas.length; j++){
			    mas[i][j] = 1;
			 }}
		for(int i = 0; i < mas2.length; i++){
		  for(int j = 0; j < mas2.length; j++){
		    mas2[i][j] = "1";
		 }}
	write3(mas2);	
	write1(mas);	
	write2(mas);	

		
	
	}
}
