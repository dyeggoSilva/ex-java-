package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Retangulo;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("entre com os valores de base e altura");
		System.out.println("qual o valor da  base:");
		retangulo.base= sc.nextDouble();
		System.out.println("qual o valor da altura:");
		retangulo.altura = sc.nextDouble();
		
		System.out.println(retangulo.toString());
		System.out.println(retangulo.toString1());
		System.out.println(retangulo.toString2());
		
		sc.close();
	

	}

}
