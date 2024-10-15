package ders1;

import java.util.Scanner;

public class BmiHesap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kilonuzu girin.");
		double kilo = scanner.nextDouble();
		
		System.out.println("Boyunuzu girin.");
		double boy = scanner.nextDouble();
		
		boy=boy/100;
		
		double bmi=kilo/(boy*boy);
		String sinif = null;
		
		if(bmi<=18.5) {
			sinif="zayif";
		}else if(bmi>18.5 && bmi<24.9){
			sinif="normal";
		}else if(bmi>=24.9 && bmi<=29.9){
			sinif="sisman";
		}else if(bmi>=29.9) {
			sinif="obez";  }
		
		System.out.println("BMI sinifiniz: "+sinif);
		
			
		
	}

}
