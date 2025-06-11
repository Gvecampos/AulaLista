package lista.objeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Lista {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("digite o numero da questao");

		System.out.println("1  questao Um");
		System.out.println("2  questao Dois");
		System.out.println("3  questao Tres");
		System.out.println("4  questao Quatro");
		System.out.println("5  questao Cinco");
		System.out.println("6  questao Seis");
		System.out.println("7  questao Sete");
		System.out.println("8  questao Oito");
		System.out.println("9  questao nove");
		System.out.println("10  questao dez");

		int num = scan.nextInt();

		if (num == 1) {
			questaoUm();
		}

		else if (num == 2) {
			questaoDois();
		}

		else if (num == 3) {
			questaoTres();
		}

		else if (num == 4) {
			questaoQuatro();
		}

		else if (num == 5) {
			questaoCinco();
		}
		else if (num == 6) {
			questaoSeis();
		} 
		else if (num == 7) {
			questaoSete();
		}
		else if (num == 8) {
			questaoOito();
		}
		else if (num == 9) {
			questaoNove();
		}
		else if (num == 11) {
			questaoDez();
		}
	}

	static void questaoUm() {

		List<String> listaNomes = new ArrayList<String>();

		System.out.println("digite os 5 nomes");
		for (int i = 0; i <= 5; i++) {

			listaNomes.add(scan.nextLine());
		}

		for (String nome : listaNomes) {
			System.out.println(nome);
		}
	}

	static void questaoDois() {

		List<String> listaNomes = new ArrayList<String>();

		System.out.println("digite os 5 nomes");
		for (int i = 0; i <= 5; i++) {

			listaNomes.add(scan.nextLine());
		}

		for (String nome : listaNomes) {
			System.out.println(nome);
		}

		System.out.println("deseja alterar algum nome? se sim digite a posicao e o nome ");
		int p = scan.nextInt();
		String nom = scan.next();
		listaNomes.set(p, nom);

		for (String g : listaNomes) {
			System.out.println(g);
		}

	}

	static void questaoTres() {

		List<String> listaNomes = new ArrayList<String>();

		System.out.println("digite as 3 frutas");
		for (int i = 0; i <= 3; i++) {

			listaNomes.add(scan.nextLine());
		}

		for (String nome : listaNomes) {
			System.out.println(nome);
		}

		System.out.println("digite o nome da fruta que deseja retirar");
		String fruta = scan.next();

		if (listaNomes.contains(fruta)) {

			listaNomes.remove(fruta);
		}

		else {
			System.out.printf("%s essa fruta nao esta em sua lista", fruta);
		}
		System.out.println();
		for (String nome : listaNomes) {
			System.out.println(nome);
		}

	}

	static void questaoQuatro() {

		List<String> listaNomes = new ArrayList<String>();

		listaNomes.add("Internacional");
		listaNomes.add("Palmeiras");
		listaNomes.add("Flamengo");
		listaNomes.add("Sao_Paulo");

		String time = null;
		while (!listaNomes.contains(time)) {
			System.out.println("Digite um time para verificar se tem na lista, Primeira letra Maiuscula");

			time = scan.next();

			if (listaNomes.contains(time)) {

				System.out.println("SIM EXISTE ESSE TIME NA SUA LISTA");
			} else {
				System.out.println(" esse time  nao esta em sua lista");
			}
			System.out.println();

		}

	}

	static void questaoCinco() {

		List<String> listaNomes = new ArrayList<String>();

		System.out.println("digite 5 numeros");
		for (int i = 0; i <= 5; i++) {
			listaNomes.add(scan.nextLine());

		}

		System.out.println();

		System.out.println("agr vamos ordenar");

		Collections.sort(listaNomes);

		for (String g : listaNomes) {
			System.out.println(g);
		}

	}

	static void questaoSeis() {

		List<Integer> listaNomes = new ArrayList<Integer>();

		System.out.println("digite 5 numeros");

		for (int i = 0; i < 5; i++) {
			listaNomes.add(scan.nextInt());

		}

		float soma1 = 0;
		for (int g : listaNomes) {
			soma1 += g;
		}
		System.out.println(soma1);

	}

	static void questaoSete() {

		List<Integer> listaNomes = new ArrayList<Integer>();

		System.out.println("digite quantas notas serao lançadas");
		int n = scan.nextInt();

		System.out.println("digite as notas");

		for (int i = 0; i < n; i++) {
			listaNomes.add(scan.nextInt());

		}

		float soma1 = 0;
		for (int g : listaNomes) {
			soma1 += g;
		}
		System.out.println(soma1 / n);

	}

	static void questaoOito() {

		List<Integer> listaNomes = new ArrayList<Integer>();

		System.out.println("quantos numeros ira digitar?");
		int num = scan.nextInt();

		System.out.println("digite os numeros");

		for (int i = 0; i < num; i++) {
			listaNomes.add(scan.nextInt());

		}
		float cont = 0;
		for (int g : listaNomes) {
			if (g >= 10) {
				cont++;
			}

		}
		System.out.printf("sao %f", cont);

	}

	static void questaoNove() {
		List<Integer> listaNomes = new ArrayList<Integer>();

		System.out.println("digite 3 numeros");

		for (int i = 0; i < 3; i++) {

			listaNomes.add(scan.nextInt());

		}
		System.out.println(listaNomes);

		System.out.println();

		System.out.println("digite agr a posição para realizar a troca de 2 numeros");
		int p1 = scan.nextInt();
		int p2 = scan.nextInt();

		int dadoAnterior = listaNomes.get(p2);
		
		listaNomes.set(p2, listaNomes.get(p1));
		listaNomes.set(p1, dadoAnterior);
		
		System.out.println(listaNomes);

	}

	static void questaoDez(){
		
		List<String>listaUm = new ArrayList<String>();
		
		System.out.println("digite 3 nomes");
		for (int i =0; i<3; i++) {
			listaUm.add(scan.next());
			
		}
		System.out.println(listaUm);
		
		System.out.println();
		
		List<String>listaDois = new ArrayList<String>();
		
		System.out.println("digite 3 nomes");
		for (int i =0; i<3; i++) {
			listaDois.add(scan.next());
			
		}
		System.out.println(listaDois);
		
		System.out.println();
		
		listaUm.addAll(listaDois);
		
		System.out.println(listaUm);
		
	}
	
	
}
