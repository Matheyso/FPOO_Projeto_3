package Cinema_Matheus_Carvalho;

import java.util.Scanner;

import Aula_0409.Livro;

import java.util.List;
import java.util.ArrayList;

public class TesteCinema {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		Cinema cinema1 = new Cinema("Cinema Estrela", "Rua das Flores 123");
		Bilhete biFilme1 = new Bilhete(50);
		Bilhete biFilme2 = new Bilhete(60);
		Bilhete biFilme3 = new Bilhete(55);
		Bilhete biFilme4 = new Bilhete(50);
		Sala sa1 = new Sala(1, 150);
		Sala sa2 = new Sala(2, 160);
		Sala sa3 = new Sala(3, 145);
		Filme fi1 = new Filme("Enrolados", 12 );
		Filme fi2 = new Filme("Disenchantment", 16);
		Filme fi3 = new Filme("Oppenheimer", 18);
		Filme fi4 = new Filme("Spider Man - Into the SpiderVerse", 12);
		Lanchonete la1 = new Lanchonete();
		Comida co1 = new Comida("Lanche", 15.90);
		Comida co2 = new Comida("Pipoca", 12.50);
		Comida co3 = new Comida("Doce", 6.90);
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		Pedido pe1 = new Pedido();
		ArrayList<Comida> pedidos = new ArrayList<Comida>();

		
		System.out.println("Seja Bem Vindo(a) ao " + cinema1.getNome());
		System.out.println("Escolha um dos nossos filmes disponíveis: ");
		
		int opcaoFilme;
		int opcaoComida;
		do {
			System.out.println("1 - Enrolados");
			System.out.println("2 - Disenchantment");
			System.out.println("3 - Oppenheimer");
			System.out.println("4 - Spider Man - Into the SpiderVerse");
			opcaoFilme = entrada.nextInt();
			switch(opcaoFilme) {
			case 1:
				System.out.println(fi1.getNome());
				System.out.println("Classificacao Etaria: " + fi1.getClassificacao() );
				System.out.println("Preco do ingresso: " + biFilme1.getPrecoBi());
				System.out.println("O preco da meia entrada e (com apresentacao dos documentos na hora): " + biFilme1.getPrecoBi()/2);
			break;
			case 2:
				System.out.println(fi2.getNome());
				System.out.println("Classificacao Etaria: " + fi2.getClassificacao() );
				System.out.println("Preco do ingresso: " + biFilme2.getPrecoBi());
				System.out.println("O preco da meia entrada e (com apresentacao dos documentos na hora): " + biFilme2.getPrecoBi()/2);
				break;
			case 3: 
				System.out.println(fi3.getNome());
				System.out.println("Classificacao Etaria: " + fi3.getClassificacao() );
				System.out.println("Preco do ingresso: " + biFilme3.getPrecoBi());
				System.out.println("O preco da meia entrada e (com apresentacao dos documentos na hora): " + biFilme3.getPrecoBi()/2);
				break;
			case 4:
				System.out.println(fi4.getNome());
				System.out.println("Classificacao Etaria: " + fi4.getClassificacao() );
				System.out.println("Preco do ingresso: " + biFilme4.getPrecoBi());
				System.out.println("O preco da meia entrada e (com apresentacao dos documentos na hora): " + biFilme4.getPrecoBi()/2);
				break;
			default:
				System.out.println("Escolha uma opcao valida!");
			}
			
			System.out.println();
		}while(opcaoFilme <= 0);
		
			System.out.println("Deseja algum alimento de acompanhamento? ");
			System.out.println("1 - Sim");
			System.out.println("2 - Nao");
			int escolha = entrada.nextInt();
			if(escolha == 1) {
				
			
	
			System.out.println("Escolha um tipo de lanche: ");
			System.out.println("1 - X-Burguer");
			System.out.println("2 - X-Salada");
			System.out.println("3 - X-Cheddar");
			System.out.println("4 - Nao escolher lanche");

				int opcaoLanche;
				opcaoLanche = entrada.nextInt();
				do {
				switch(opcaoLanche) {
				case 1:
					System.out.println("X-Burguer foi adicionado ao carrinho");
					pedidos.add(co1);
					break;
				case 2:
					System.out.println("X-Salada foi adicionado ao carrinho");
					pedidos.add(co1);
					break;
				case 3:
					System.out.println("X-Cheddar foi adicionado ao carrinho");
					pedidos.add(co1);
					break;
				case 4: 
					System.out.println("Voce nao escolheu lanche");
					
					break;
				}
				}while(opcaoLanche <= 0);
				System.out.println("Escolha um tipo de pipoca: ");
				System.out.println("1 - com sal");
				System.out.println("2 - sem sal");
				System.out.println("3 - nao escolher pipoca");
				int opcaoPipoca;
				opcaoPipoca = entrada.nextInt();
				do {
				switch(opcaoPipoca) {
				case 1:
					System.out.println("Voce escolheu pipoca com sal");
					pedidos.add(co2);
					break;
				case 2:
					System.out.println("Voce escolheu pipoca sem sal");
					pedidos.add(co2);
					break;
				case 3:
					System.out.println("Voce nao escolheu pipoca");
					break;
				}
				}while(opcaoPipoca <= 0);
				System.out.println("Escolha um tipo de Doce: ");
				System.out.println("1 - Chocolate");
				System.out.println("2 - Kit-Kat");
				System.out.println("3 - Charge");
				System.out.println("4 - nao escolher doce");
				int opcaoDoce;
				opcaoDoce = entrada.nextInt();
				do {
				switch(opcaoDoce) {
				case 1:
					System.out.println("Voce escolheu Chocolate");
					pedidos.add(co3);
					break;
				case 2:
					System.out.println("Voce escolheu Kit-Kat");
					pedidos.add(co3);
					break;
				case 3:
					System.out.println("Voce escolheu charge");
					pedidos.add(co3);
					break;
				case 4:
					System.out.println("Voce nao escolheu doce");
					break;
				}
				
				}while(opcaoDoce <= 0);
			}
			for( Comida ver_pedidos : pedidos) { 
				System.out.println("Preco do " + ver_pedidos.getNome() + " adicionado na lista e: " + ver_pedidos.getPreco());
				System.out.println("A opcao do filme escolhida e: " + opcaoFilme);
				
			}
			

			
			
			//int total = (pedidosL ++ pedidosP ++ pedidosD + biFilme1.getPrecoBi());
			//System.out.println("o valor total e " + total);
			
	}
	}


