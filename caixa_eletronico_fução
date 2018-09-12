package atividade.pkg1;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Atividade1 obj = new Atividade1();
        double saldo = 0;
        boolean sair = false;

        while (sair == false) {
            obj.menu();
            int opcao = tcl.nextInt();
            switch (opcao) {
                case 1:
                    obj.saldo(saldo);
                    break;
                case 2:
                    saldo = obj.depositar(saldo);
                    break;
                case 3:
                    saldo = obj.Sacar(saldo);
                    break;
                case 4:
                    obj.sair();
                    break;
                default:
                    System.out.println("Coloque uma opção valida");
            }
        }

    }

    public void menu() {
        System.out.println("Caixa Eletronico");
        System.out.println("");
        System.out.println("1 - Ver Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 Sair");
    }

    public void saldo(double saldo) {
        System.out.println("Seu saldo é " + saldo);

    }

    public double depositar(double saldo) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite quanto quer Depositar");
        double depositar = tcl.nextDouble();
        return saldo + depositar;
    }

    public double Sacar(double saldo) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite quanto quer Sacar");
        double Sacar = tcl.nextDouble();
        return saldo - Sacar;
    }

    public double sair() {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deseja realmente sair. Se sim digite 1 se não digite 2");
        double receber = tcl.nextDouble();
        if (receber == 1) {
            boolean sair = true;
        } else {
            boolean sair = false;
        }
        return 2;
    }
}
