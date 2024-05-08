package Aula_08;

import java.util.Scanner;

public class vet02 {

	public static void main(String[] args) {

		String a[] = new String[5];

		Scanner ler = new Scanner(System.in);

		for (int i =0; i<5; i++) {
			System.out.println("Nome " + i+ "...");
			a [i]=ler.next();
		}
		System.out.println("Nome armazenados no vector");
		for (int i =0; i<5; i++) {
			System.out.println(a[i]);
		}
		ler.close();
	}

}


