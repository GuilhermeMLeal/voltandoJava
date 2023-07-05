package contaBancaria;

import java.util.*;

public class ContaBancaria {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Bem-vindos ao Banco Martins");
                System.out.println("Insira o seu nome:");
                String name = scan.next();
                System.out.println("Insira o seu sobrenome:");
                String sobrenome = scan.next();
                System.out.println("Insira o seu saldo:");
                double saldo = scan.nextDouble();
                System.out.println("Digite Agência:");
                String agencia = scan.next();
                System.out.println("Digite seu número de conta:");
                String numeroConta = scan.next();
                System.out.println("Digite sua idade:");
                int age = scan.nextInt();
                if (age < 18) {
                    System.out.println("Você não pode criar conta, me desculpe!");
                    break;
                }

                System.out.println("Parabéns " + name + " " + sobrenome + ", sua conta foi criada!");
                System.out.println("Seu saldo é " + saldo);
                System.out.println("Seu número de conta é " + numeroConta + " e a agência é " + agencia);
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            scan.close();
        }
    }
}

