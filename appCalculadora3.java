package prjCalculadora3;
import java.util.Scanner;

public class appCalculadora3 {
	public static void main(String[] args) {
		
		double n1,n2;
		Scanner in = new Scanner (System.in);
		Calculadora3 calc = new Calculadora3();
		
		System.out.println("Digite o primeiro numero");
		//calc.setN1 (in.nextDouble());
		n1=in.nextDouble();
		System.out.println("Digite o segundo numero");
		//calc.setN2 (in.nextDouble());
		n2=in.nextDouble();
		
		Calculadora3 calc2 = new Calculadora3(n1,n2);
		
		calc2.soma();
		System.out.println("Soma dos dois numeros � " +calc2.getResultado());
		
		System.out.println("Subtracao de dois numeros � "+calc2.getResultado());
		
		calc2.multiplicacao(calc2.getN1(),calc2.getN2());
		System.out.println("A multiplica�ao dos dois numeros � "+calc2.getResultado());
		if(calc2.getN1()==0 || calc2.getN2() == 0) {
		System.out.println("Nao � possivel dividir por zero ");
		}else {
		System.out.println("A divis�o de dos dois numeros �  "+calc2.divisao(calc2.getN1(),calc2.getN2()));
		}
		
	}

}
