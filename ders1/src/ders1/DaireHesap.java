package ders1;

import java.util.Scanner;

public class DaireHesap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double Pİ=3.14159;
		
		System.out.println("Yaricap girin.");
		double yaricap=scanner.nextDouble();
		
		double cevre=2*Pİ*yaricap;
		double alan=Pİ*yaricap*yaricap;
		
		System.out.println("Cevre:"+cevre);
		System.out.println("Alan:"+alan);
		
		System.out.printf("Cevre:%.3f",cevre);
		
		
			
		
	}

}
