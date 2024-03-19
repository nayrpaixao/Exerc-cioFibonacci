package fibonacci;

import java.util.Scanner;

public class exercicio {
	
	public class Fibonacci {
	    
	    public static boolean pertenceSequenciaFibonacci(int numero) {
	        int a = 0, b = 1;
	        while (a <= numero) {
	            if (a == numero) {
	                return true;
	            }
	            int proximo = a + b;
	            a = b;
	            b = proximo;
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
	        int numero = scanner.nextInt();

	        if (pertenceSequenciaFibonacci(numero)) {
	            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
	        }

	        scanner.close();
	    }
	}

}
