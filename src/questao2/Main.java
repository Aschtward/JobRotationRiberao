package questao2;

public class Main {

	public static void main(String[] args) {
		fibo(90);

	}
	
	public static void fibo(int n) {//Algoritmo basicamente calcula todos os numeros da sequencia até chegar no desejado, se passar ele considera que não está na sequencia
		
		int f = 0,fim = 1;
		
		while(fim < n) {
			fim += f;
			f = fim - f;
		}
		
		if(fim == n) {
			System.out.println("Pertence");
		}else {
			System.out.println("Nao pertence");
		}
	}

}
