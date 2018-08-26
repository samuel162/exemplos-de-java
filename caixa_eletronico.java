import java.util.Scanner;
public class caixa_eletronico{
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		System.out.println("Digite o valor que existe em sua conta");
		double valor = tcl.nextDouble();
		double depositar , sacar = 0;
		double saldo = valor;
		boolean verdade = true;
		while (verdade){
			System.out.println("Caixa ELetronico");
			System.out.println("1 - Sacar");
			System.out.println("2 - Depositar");
			System.out.println("3 - Ver Saldo");
			System.out.println("4 - Sair");
			int aux = tcl.nextInt();
			switch(aux){
			case 1:
				System.out.println("Digite quanto quer sacar");
				sacar = tcl.nextDouble();
				saldo -= sacar;
				break;
			case 2 :
				System.out.println("Digite quanto quer depositar");
				depositar = tcl.nextDouble();
				saldo += depositar;
				break;
			case 3 :
				System.out.println(saldo);
				break;
			case 4 :
				String resposta = "samuel";
				do{
					System.out.println("Deseja realmente sair ?");
					resposta = tcl.next();
					if (resposta.equals("sim")){
						verdade = false;
						break;
					}
					else if (resposta.equals("nao")){
						verdade = true;
						break;
					}
					else{
						System.out.println("Erro!");
					}
					}
					while(resposta != "sim" || resposta != "nao");
					break;
			default:
					System.out.println("o numero nao existe");
			}
		}
	}
}