package home1;
/**
 * Homework_1
 * @author CruelWorld
 */
/*
 � ������������������ ����� �� 0 �� 100 ������� ��� �������� ������� 2, 3, 5, 7
������� ����� ����� ��� ������ �� ���� �������������������
��������� �������� ���� ������������������ �����, ������� 7 � 2
��������� ��������� ������������������ �����, ������� 5 � ������������������ �����, ������� 3

 */
public class app  {
	static double divide_sum(int a){
		int sum = 0;
		for(int i = 0; i < 101; i++){
			if (i % a == 0){
			sum += i;
			}
		}
		
		return sum;
	}
	static void divide(int a){
		System.out.print("                          ");
		System.out.println("�������� ����� " + a + " :");
		int sum = 0;
		for(int i = 0; i < 101; i++){
			if (i % a == 0){
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("C���� ������������������ ��������� ����� " + a + " :");
		System.out.println(sum);
	}
	public static void main(String[]args){
		divide(2);
		divide(3);
		divide(5);
		divide(7);
		double deduction_7_2 = divide_sum(7)- divide_sum(2);
		double ratio_5_3 = divide_sum(5) / divide_sum(3);
		System.out.println("�������� ���� ������������������ �����, ������� 7 � 2 : " + deduction_7_2);
		System.out.println("��������� ������������������ �����, ������� 5 � ������������������ �����, ������� 3 : " + ratio_5_3);
		
	}

}
