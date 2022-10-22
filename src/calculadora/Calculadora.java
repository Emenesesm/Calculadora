package calculadora;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		System.out.println("Indique la operasion a realizar");
		System.out.println("1-Sumar");
		System.out.println("2-Restar");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		Scanner leer = new Scanner(System.in);
		int operacion = leer.nextInt();
	    
		if(operacion >= 1 && operacion <= 4) {
			System.out.println("Entre los valores ");
			Double valor1 = leer.nextDouble();
			Double valor2 = leer.nextDouble();
			
			Operacion constr = new Operacion();
			
			switch(operacion){
			case 1:
				Double su;
				su =constr.sumar(valor1, valor2);
				System.out.println("El resultado es "+su);
				break;
			case 2:
				Double re;
				re=constr.restar(valor1, valor2);
				System.out.println("El resultado es "+re);
				break;
			case 3:
				Double mu;
				mu=constr.multiplicar(valor1, valor2);
				System.out.println("El resultado es "+mu);
				break;
			case 4:
				Double di;
				di=constr.dividir(valor1, valor2);
				System.out.println("El resultado es "+di);
				break;
				
			}
		} else {
			System.out.println("La opcion escogida no es valida");
		}
	
	}

}
