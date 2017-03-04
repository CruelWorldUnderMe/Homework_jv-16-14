package home2;
/**
 * Homework_2
 * @author CruelWorld
 */
/*
 Используя конструкцию switch, простейшие арифметические операции
  и операции сравнения реализовать приложение, которое выводит в 
  консоль текстовое представление случайного целого числа в диапазоне
   от 0 до 99 включительно.
 */
import java.util.Scanner;
public class app {
	public static void main(String[]args){
	while (true){
		int parametr=0;
		System.out.println("Введите число :");
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
	
	    case 1: //десятки
	    	if ((int)dozens == 2){
	    		System.out.print("двадцать ");
	    		} else  if ((int)dozens == 3){
		    		System.out.print("тридцать ");
		    		} else  if ((int)dozens == 4){
			    		System.out.print("сорок ");
		    		} else  if ((int)dozens == 5){
			    		System.out.print("пятьдесят ");
		    		} else  if ((int)dozens == 6){
			    		System.out.print("шестьдесят ");
			    	} else  if ((int)dozens == 7){
			    		System.out.print("семьдесят ");
		    		} else  if ((int)dozens == 8){
			    		System.out.print("восемдесят ");
		    		} else  if ((int)dozens == 9){
			    		System.out.print("девяносто ");
		    		} 
	    	if (unit > 0){
	    		parametr = 2;
	    	}else
	    	System.out.println();
	    	if (unit > 0){
	    		parametr = 2;
	    	}else break;
	    	
	   case 2:  // единицы
		   if (unit == 0){
	    	System.out.println("ноль");
	    		} else if (unit == 1){
	    		    System.out.println("один");
	    		    } else if (unit == 2){
	    		    System.out.println("два");
	    		    } else  if (unit == 3){
		    		System.out.println("три");
		    		} else  if (unit == 4){
			    		System.out.println("четыре");
		    		} else  if (unit == 5){
			    		System.out.println("пять");
		    		} else  if (unit == 6){
			    		System.out.println("шесть");
			    	} else  if (unit == 7){
			    		System.out.println("семь");
		    		} else  if (unit == 8){
			    		System.out.println("восем");
		    		} else  if (unit == 9){
			    		System.out.println("девять");
		    		} break;
	   case 3:  // 10, 11, 12, 13,....,19
		   
			if (num == 18){
	    		System.out.println("восемнадцать");
	    		} else if (num == 10){
	    		    System.out.println("десять");
	    		    } else  if (num == 15){
		    		System.out.println("пятнадцать");
		    		} else  if (num == 11){
			    		System.out.println("одинадцать");
		    		} else  if (num == 12){
			    		System.out.println("двенадцать");
		    		} else  if (num == 13){
			    		System.out.println("тринадцать");
			    	} else  if (num == 14){
			    		System.out.println("четырнадцать");
		    		} else  if (num == 16){
			    		System.out.println("шеснадцать");
		    		} else  if (num == 17){
			    		System.out.println("семнадцать");
		    		} else  if (num == 19){
			    		System.out.println("девятнадцать");}
			    		break;    		
		  }
	}
	}
}
