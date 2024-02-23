package edu.dio;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\n");

        System.out.println("Por favor, digite o número da Agência!");
        String numeroAgencia = scanner.next();

        System.out.println("Usuário: ");
        int numeroUsuario = scanner.nextInt();

        System.out.println("Insira o seu Nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Informe o saldo: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia +", conta "+ numeroUsuario +" e seu saldo " + saldoConta + " já está disponível para saque.");
    }
}