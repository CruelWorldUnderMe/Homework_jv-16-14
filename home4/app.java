package home4;
/**
 * Homework_4
 * @author CruelWorld
 */
/*
 ����������� ������ � ������ � �������� �������
��� ������ ������ ������ ������� ��� ������ �������� �������
��� ������� ��������� ������� ������� ��� �������� �������� �������
����� ���� ���������, ������� 7 � ������ �������
������������ ���������, ������� 3 � �������� �������

 */
public class app {
	
	private static int sum = 0;
	private static int product = 1;
	
	static void write1(int[][]m){
		for(int i = 0; i < m.length; i++) {
			System.out.println();
			  for(int j = 0; j < m.length; j++){
				  System.out.print(m[i][j] + " ");
			        }
			   }System.out.println();
		}
	
	static void write2(int[][]m){
		for(int i = m.length-1; i >= 0; i--) {
			System.out.println();
			  for(int j = m.length-1; j >= 0; j--){
				  System.out.print(m[i][j] + " ");
			        }
			   }System.out.println();
		}
	
	static void even(int[][]m){
		System.out.println("������ ������ :");
		for(int i = 0; i < m.length; i++) {
			if (i % 2 == 0) System.out.println();
			  for(int j = 0; j < m.length; j++){
				  if (i % 2 == 0)
				  System.out.print(m[i][j] + " ");
			        }
			   }System.out.println();
	}
	
    static void odd(int[][]m){
    	System.out.println("�������� �������:");
    	for(int i = 0; i < m.length; i++) {
			System.out.println();
			  for(int j = 0; j < m.length; j++){
				  if (j % 2 == 1)
				  System.out.print(m[i][j] + " ");
			        }
			   }System.out.println();
	}	
    static int sum1(int[][]m){
    	System.out.println("����� ���� ���������, ������� 7 � ������ ������� :");
    	for(int i = 0; i < m.length; i++) {
	         for(int j = 0; j < m.length; j++){
				  if (i % 2 == 0 && m[i][j] % 7 ==0)
				  sum += m[i][j];
			        }
			   }System.out.println();
			   return sum;
	}	
    static int product1(int[][]m){
    	System.out.println("������������ ���������, ������� 3 � �������� ������� :");
    	for(int i = 0; i < m.length; i++) {
	         for(int j = 0; j < m.length; j++){
				  if (i % 2 == 1 && m[i][j] % 3 ==0)
				  product *= m[i][j];
			        }
			   }System.out.println();
			   return product;
	}	
	public static void main(String[]args){
		int[][] mas = new int[4][4];
		for(int i = 0; i < mas.length; i++){
		  for(int j = 0; j < mas[i].length; j++)
		  {
		    mas[i][j] = (int)(Math.random()*10);
		 }
		   }
		write1(mas);
		write2(mas);
		even(mas);
		odd(mas);
		System.out.println(sum1(mas));
		System.out.println(product1(mas));
		
		
		
	}
}
