package prjCalculadora3;
public class Calculadora3 {
	
	private double n1;
	private double n2;
	private double resultado;
	
	public Calculadora3(){ 
		System.out.println("Calculadora PIKA DAS GALAXIAS ");
	}
	
	public Calculadora3(double n1, double n2){
		this.n1=n1;
		this.n2=n2;
	}
	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		 this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		 this.n2 = n2;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public void soma(){
		this.resultado = this.n1 + this.n2;
	}
	
	public void soma(double n1, double n2) {
		resultado = n1 + n2;
	}
	
	public double subtracao(){
		resultado = n1 - n2;
		return resultado;
	}
	public void subtracao(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
		resultado = n1 - n2;
	}
	public void multiplicacao(double n1, double n2 ){
		this.n1=n1;
		this.n2=n2;
		resultado = n1 * n2;
	}  
	public double multiplicacao () {
		this.n1=n1;
		this.n2=n2;
		return resultado = n1 * n2;
	}
	
	public double divisao(double n1, double n2){
		this.n1=n1;
		this.n2=n2;
		resultado = n1 / n2;
		return resultado;
	}
	public void divisao() {
		this.n1=n1;
		this.n2=n2;
		resultado = n1 / n2;
	}
}