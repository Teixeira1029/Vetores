package Aula_08;

public class vet03 {

	public static void main(String[] args) {
		int[] A = new int[5];
		int[] B = new int[5];


		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < A.length; i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			A[i] = scanner.nextInt();
		}


		System.out.println("Digite os valores do vector B:");
		for (int i = 0; i < B.length; i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			B[i] = scanner.nextInt();
		}        



	}
}
