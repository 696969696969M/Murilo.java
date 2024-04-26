package condicional;

public class murilo26042024 {
	
	import java.util.Scanner;

	public class Salarios {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Informe o salário de Carlos: ");
	        double salarioCarlos = scanner.nextDouble();

	        double salarioJoao = salarioCarlos /3;

	        double valorCarlos = salarioCarlos;
	        double valorJoao = salarioJoao;

	        int meses = 0;

	        while (valorJoao < valorCarlos) {
	            valorCarlos += valorCarlos * 0.6/100; // 0.6% de juros ao mês
	            valorJoao += valorJoao * 1/100; // 1% de juros ao mês
	            meses += 1;
	        }

	        System.out.println("Serão necessários " + meses + " meses para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos.");
	    }
	}

