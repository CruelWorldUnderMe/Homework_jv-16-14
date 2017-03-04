package home1;
/**
 * Homework_1
 * @author CruelWorld
 */
/*
 в последовательности чисел от 0 до 100 выводит все значения кратные 2, 3, 5, 7
находит сумму чисел для каждой из этих последовательностей
вычисляет разность сумм последовательности чисел, кратных 7 и 2
вычисляет отношение последовательности чисел, кратных 5 к последовательности чисел, кратных 3

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
		System.out.println("Делители числа " + a + " :");
		int sum = 0;
		for(int i = 0; i < 101; i++){
			if (i % a == 0){
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Cумма последовательности делителей числа " + a + " :");
		System.out.println(sum);
	}
	public static void main(String[]args){
		divide(2);
		divide(3);
		divide(5);
		divide(7);
		double deduction_7_2 = divide_sum(7)- divide_sum(2);
		double ratio_5_3 = divide_sum(5) / divide_sum(3);
		System.out.println("разность сумм последовательности чисел, кратных 7 и 2 : " + deduction_7_2);
		System.out.println("отношение последовательности чисел, кратных 5 к последовательности чисел, кратных 3 : " + ratio_5_3);
		
	}

}
