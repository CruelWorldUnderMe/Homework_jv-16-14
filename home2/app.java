package home2;
/**
 * Homework_2
 * @author CruelWorld
 */
/*
 ��������� ����������� switch, ���������� �������������� ��������
  � �������� ��������� ����������� ����������, ������� ������� � 
  ������� ��������� ������������� ���������� ������ ����� � ���������
   �� 0 �� 99 ������������.
 */
import java.util.Scanner;
public class app {
	public static void main(String[]args){
	while (true){
		int parametr=0;
		System.out.println("������� ����� :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num > 99)System.out.print("not a valid value");
		if (num < 0)System.out.print("not a valid value");
				
		double dozens = num / 10;
		int unit = num % 10;
		int s = num;
		
		if (dozens >= 2.0){parametr = 1;}
		if (s <= 9 && s >= 0) {parametr = 2;}
		if (s > 9 && s <20){ parametr = 3;}
		
	switch(parametr) {
	
	    case 1: //�������
	    	if ((int)dozens == 2){
	    		System.out.print("�������� ");
	    		} else  if ((int)dozens == 3){
		    		System.out.print("�������� ");
		    		} else  if ((int)dozens == 4){
			    		System.out.print("����� ");
		    		} else  if ((int)dozens == 5){
			    		System.out.print("��������� ");
		    		} else  if ((int)dozens == 6){
			    		System.out.print("���������� ");
			    	} else  if ((int)dozens == 7){
			    		System.out.print("��������� ");
		    		} else  if ((int)dozens == 8){
			    		System.out.print("���������� ");
		    		} else  if ((int)dozens == 9){
			    		System.out.print("��������� ");
		    		} 
	    	if (unit > 0){
	    		parametr = 2;
	    	}else
	    	System.out.println();
	    	if (unit > 0){
	    		parametr = 2;
	    	}else break;
	    	
	   case 2:  // �������
		   if (unit == 0){
	    	System.out.println("����");
	    		} else if (unit == 1){
	    		    System.out.println("����");
	    		    } else if (unit == 2){
	    		    System.out.println("���");
	    		    } else  if (unit == 3){
		    		System.out.println("���");
		    		} else  if (unit == 4){
			    		System.out.println("������");
		    		} else  if (unit == 5){
			    		System.out.println("����");
		    		} else  if (unit == 6){
			    		System.out.println("�����");
			    	} else  if (unit == 7){
			    		System.out.println("����");
		    		} else  if (unit == 8){
			    		System.out.println("�����");
		    		} else  if (unit == 9){
			    		System.out.println("������");
		    		} break;
	   case 3:  // 10, 11, 12, 13,....,19
		   
			if (num == 18){
	    		System.out.println("������������");
	    		} else if (num == 10){
	    		    System.out.println("������");
	    		    } else  if (num == 15){
		    		System.out.println("����������");
		    		} else  if (num == 11){
			    		System.out.println("����������");
		    		} else  if (num == 12){
			    		System.out.println("����������");
		    		} else  if (num == 13){
			    		System.out.println("����������");
			    	} else  if (num == 14){
			    		System.out.println("������������");
		    		} else  if (num == 16){
			    		System.out.println("����������");
		    		} else  if (num == 17){
			    		System.out.println("����������");
		    		} else  if (num == 19){
			    		System.out.println("������������");}
			    		break;    		
		  }
	}
	}
}
