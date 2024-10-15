package ders1;

import java.util.Scanner;

public class dort_ıslem {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		int sayi1;
		int sayi2;
		int toplam;
		int fark;
		int carpim;
		int bolum;
		
		
		
		System.out.println("İlk sayiyi girin.");
		sayi1=input.nextInt();
		
		System.out.println("İkinci sayiyi girin.");
		sayi2=input.nextInt();
		
		toplam=sayi1+sayi2;
		fark=sayi1-sayi2;
		carpim=sayi1*sayi2;
		bolum=sayi1/sayi2;
		
		
		System.out.printf("Toplam %d%n",toplam);
		System.out.printf("Fark %d%n",fark);
		System.out.printf("Carpım %d%n",carpim);
		System.out.printf("Bolum %d%n",bolum);

	}

}
