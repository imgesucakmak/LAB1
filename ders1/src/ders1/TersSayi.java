package ders1;

import java.util.Scanner;

public class TersSayi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayi girin.");
		int sayi=scanner.nextInt();
		
		int ters=0;
		
		while(sayi!=0) {
			int basamak=sayi%10;
			ters=ters*10+basamak;
			sayi /=10;
			
		}
		
		System.out.println("Ters sayi:"+ters);
			
		
	}

}
