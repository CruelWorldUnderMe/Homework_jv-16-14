package home3;
/**
 * Homework_3
 * @author CruelWorld
 */
/*
вывести все элементы массива в прямом и обратном порядке
вывести все четные элементы массива
вывести все нечетные элементы массива
сумму элементов, кратных 7
произведение элементов, кратных 3
*/
public class app {
	private static int sum = 0;
	private static int product = 1;
//-------------------------------------------------------------	
   static void write1(int[]m){
	   for (int i = 0; i < m.length; i++){
			  System.out.print(m[i] + " ");  
   }System.out.println();
   }
//-------------------------------------------------------------  
   static void write2(int[]m){
		   for (int i = m.length - 1; i >= 0 ; i--){
				  System.out.print(m[i] + " ");  
   }System.out.println(); 
   }
//-------------------------------------------------------------    
   static void odd(int[]m){
	   System.out.println("Нечетные :");
	   for (int i = m.length - 1; i >= 0 ; i--){
		   if (m[i] % 2 == 1)
			  System.out.print(m[i] + " ");  
   }System.out.println(); 
   }
//-------------------------------------------------------------    
   static void even(int[]m){
	   System.out.println("Четные :");
	   for (int i = m.length - 1; i >= 0 ; i--){
		   if (m[i] % 2 == 0)
			  System.out.print(m[i] + " ");  
   }System.out.println(); 
   }
//-------------------------------------------------------------      
   static int sum1(int[]m){
	   for (int i = m.length - 1; i >= 0 ; i--){
		   if (m[i] % 7 == 0) sum += m[i];
			   
   }  System.out.println(); 
	   return sum;
}
//-------------------------------------------------------------
   static int product1(int[]m){
	   for (int i = m.length - 1; i >= 0 ; i--){
		   if (m[i] % 3 == 0) product *= m[i];
			   
   }  System.out.println(); 
	   return product;
}
//-------------------------------------------------------------   
	public static void main(String[]args){
		
		int[] mas = new int[10];
	   for (int i = 0; i < mas.length; i++){
		   mas[i] = (int) (Math.random()*100);
	 }
	  write1(mas);
	  write2(mas);
	  odd(mas);
	  even(mas);
	  System.out.println("Сумма кратных 7: " + sum1(mas));
	  System.out.println("Произведение кратных 3: " + product1(mas));
	}
}
