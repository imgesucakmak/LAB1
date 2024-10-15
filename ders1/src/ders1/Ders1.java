package ders1;
import java.util.Scanner;

public class Ders1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.println("İlk sayiyi girin.");
		number1=input.nextInt();
		
		System.out.println("İkinci sayiyi girin.");
		number2=input.nextInt();
		
		sum=number1+number2;
		
		System.out.printf("Toplam %d%n",sum);

		
        
		

	}

}
