package Projeto;

import javax.swing.JOptionPane;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.*;

import Atv7.MembroBanda;

public class TesteOficina {

	public static void main(String[] args) {
		
		
		Carro c1 = new Carro("Civic",4,25000f);
		Seguradora s1 = new Seguradora("Civic-----",75000,true);
		Seguradora s2 = new Seguradora("Eclipse---",50000,false);
		Seguradora s3 = new Seguradora("Corola----",60000,true);
		Seguradora s4 = new Seguradora("Uno-------",20000,false);
		Fornecedor f1 = new Fornecedor("Vinix",150,99);
		Dono d1 = new Dono("Ricardo",992900999,"Tesla");
		Programa programa = new Programa("Mecanica","Entrar123");
		
		f1.setPrecoTotal(18000);
		
		List <Seguradora> tabela = new ArrayList<Seguradora>();
		tabela.add(s1);
		tabela.add(s2);
		tabela.add(s3);
		tabela.add(s4);
	
		String login = JOptionPane.showInputDialog("Escreva seu login");
		String senha = JOptionPane.showInputDialog("Escreva sua senha:");
		//JOptionPane.showMessageDialog(null,senha + programa.getSenha());
		//String senha = "Entrar123";
		
		if (senha.equals(programa.getSenha()) || login.equals(programa.getLogin())) {
			JOptionPane.showMessageDialog(null,"Você fez login!!");
		}else {
			JOptionPane.showMessageDialog(null,"Seus dados não coincidem com os de nosso sistema!!");
			System.exit(0);
		}
		
		int opcao;
		int opcao2;
		String escolha;
		int escolha2;
		float escolha3;
		String problema;
		do {
			escolha = JOptionPane.showInputDialog("Selecione uma opcao\n 1-- Carro \n 2-- Seguradora \n 3-- Fornecedor \n 4-- Login \n 0-- SAIR");
			opcao2 =Integer.parseInt(escolha);
			switch (opcao2) {
			case 0:
				JOptionPane.showMessageDialog(null,"Voltando...");
				break;
			case 1:
				
				do {
					escolha = JOptionPane.showInputDialog("Selecione uma opcao \n 1-- Modelo \n 2-- Anos de uso\n 3-- Kilometragem \n 4-- Reporte de problema \n 5-- Troca de peças\n 0-- SAIR");
					opcao = Integer.parseInt(escolha);
					switch (opcao) {
					case 0:
						JOptionPane.showMessageDialog(null,"Voltando...");
						break;
					case 1:
						opcao=JOptionPane.showConfirmDialog(null,"O modelo cadastrado e:  " + c1.getModelo()+"\nGostaria de altera-lo?", "O modelo cadastrado " , JOptionPane.YES_NO_OPTION);

							switch (opcao) {
							case JOptionPane.YES_OPTION:
								escolha = JOptionPane.showInputDialog("Digite o Modelo:");
								c1.setModelo(escolha);
								break;
							case JOptionPane.NO_OPTION:
								JOptionPane.showMessageDialog(null,"Voltando...");
								break;
							default:
								JOptionPane.showMessageDialog(null,"Escolha uma opçao");
								break;
							}
						
						break;
					case 2:
						opcao=JOptionPane.showConfirmDialog(null,"A quantidade de anos de uso e:  " + c1.getAnosUso()+"\nGostaria de altera-lo?", " Anos de uso " , JOptionPane.YES_NO_OPTION);
						
							switch (opcao) {
							case JOptionPane.YES_OPTION :
								escolha = JOptionPane.showInputDialog("Digite quantos anos de uso:");
								escolha2 = Integer.parseInt(escolha);
								c1.setAnosUso(escolha2);
								break;
							case JOptionPane.NO_OPTION:
								JOptionPane.showMessageDialog(null,"voltando...");
								break;
							default:
								JOptionPane.showMessageDialog(null,"Escolha uma opçao");
								break;
							}
						break;
					case 3:
						opcao=JOptionPane.showConfirmDialog(null,"A kilometragem andada e de:"+ c1.getkMetragem()+"\nGostaria de altera-la?", "Kmetragem " , JOptionPane.YES_NO_OPTION);
							switch (opcao) {
							case JOptionPane.YES_OPTION:
								escolha = JOptionPane.showInputDialog("Digite quantos Km:");
								escolha2 = Integer.parseInt(escolha);
								c1.setkMetragem(escolha2);
								break;
							case JOptionPane.NO_OPTION:
								JOptionPane.showMessageDialog(null,"Voltando...");
								break;
							default:
								JOptionPane.showMessageDialog(null,"Escolha uma opçao");
								break;
							}
						break;
					case 4:
						opcao= JOptionPane.showConfirmDialog(null,"O veiculo possui algum problema?  ", " Problema " , JOptionPane.YES_NO_OPTION);
						switch (opcao) {
						case JOptionPane.YES_OPTION :
							escolha = JOptionPane.showInputDialog("Digite qual o problema:");
							JOptionPane.showMessageDialog(null,"O problema "+ escolha +" já foi agendado e será resolvido");
							break;
						case JOptionPane.NO_OPTION:
							JOptionPane.showMessageDialog(null,"Voltando...");
							break;
						default:
							JOptionPane.showMessageDialog(null,"Escolha uma opçao");
							break;
						}
						break;
					case 5:
						opcao= JOptionPane.showConfirmDialog(null,"O veiculo possui alguma peça para ser trocada?", " Troca " , JOptionPane.YES_NO_OPTION);
						switch (opcao) {
						case JOptionPane.YES_OPTION :
							escolha = JOptionPane.showInputDialog("Digite qual peça será trocada:");
							JOptionPane.showMessageDialog(null,"A peça "+ escolha +" está a caminho");
							break;
						case JOptionPane.NO_OPTION:
							JOptionPane.showMessageDialog(null,"Voltando...");
							break;
						default:
							JOptionPane.showMessageDialog(null,"Escolha uma opçao");
							break;
						}
					break;
					}
				}while(opcao != 0);
				
				break;
				
				
				
			case 2:

				do {
					escolha = JOptionPane.showInputDialog("Selecione uma opcao\n 1-- Tabela Fipe \n 2-- Seguro \n 3-- Condição \n 4-- Media de duracao \n 0-- SAIR");
					opcao =Integer.parseInt(escolha);
					switch (opcao) {
					case 0:
							JOptionPane.showMessageDialog(null,"Voltando...");
						break;
					case 1:
						for (Seguradora olho : tabela) {
							JOptionPane.showMessageDialog(null,"\n Os Carros da Tabela Fipe sao:"+ olho.getNomec()+ "\n"+ olho.getPrecoc());
						}
						break;
					case 2:
						
						if (s1.isSeguro() == true) {
							int ii= JOptionPane.showConfirmDialog(null,"Voce possui seguro, gostaria de retiralo?", " Seguro " , JOptionPane.YES_NO_OPTION);
							if (ii ==JOptionPane.YES_OPTION ) {
								JOptionPane.showMessageDialog(null,"Voce nao possui mais seguro");
								s1.setSeguro(false);
							}
						}else if (s1.isSeguro() == false) {
							int ii= JOptionPane.showConfirmDialog(null,"Voce nao possui seguro, gostaria de contrata-lo?", " Seguro " , JOptionPane.YES_NO_OPTION);
							if (ii ==JOptionPane.YES_OPTION ) {
								JOptionPane.showMessageDialog(null,"Voce adicionou um seguro");
								s1.setSeguro(true);
							}
						}
						break;
					case 3:
						escolha = JOptionPane.showInputDialog("Escreva qual a condição de seu carro:");
						s1.setCondição(escolha);
						JOptionPane.showMessageDialog(null,"A condição atual é "+ s1.getCondição());
						break;
					case 4:
						JOptionPane.showMessageDialog(null,"A média de duracao para cada peça e de:\n oleo-----1 Ano ou 10km\n manutenção de rotina------2 Anos\n pneu-----5 Até Anos");
						break;
					default:
						JOptionPane.showMessageDialog(null,"Escolha uma opçao");
						break;
					}
				}while(opcao != 0);
				
				break;
			case 3:
				
				do {
					escolha = JOptionPane.showInputDialog("Selecione uma opcao\n 1-- Nome \n 2-- Produtos \n 3-- Preco \n 4-- Preco Total \n 0-- SAIR");
					opcao =Integer.parseInt(escolha);
					switch (opcao) {
					case 0:
						JOptionPane.showMessageDialog(null,"Voltando...");
						break;
					case 1:
						int ii = JOptionPane.showConfirmDialog(null,"O nome salvo é "+ f1.getNome()+" Gostaria de altera-lo?", "Nome" ,JOptionPane.YES_NO_OPTION);
						if (ii ==JOptionPane.YES_OPTION ) {
							escolha = JOptionPane.showInputDialog("Escreva o nome que gostaria de salvar:");
							f1.setNome(escolha);
						}
						break;
					case 2:
							ii = JOptionPane.showConfirmDialog(null,"No momento a "+ f1.getProdutos()+" produtos,Gostaria de comprar mais?", "Produtos" ,JOptionPane.YES_NO_OPTION);
						if (ii ==JOptionPane.YES_OPTION ) {
							escolha = JOptionPane.showInputDialog("Quantos produtos pretende comprar?");
							int x=Integer.parseInt(escolha);
							x = x + f1.getProdutos();
							f1.setProdutos(x);	
						}
						break;
					case 3:
							ii = JOptionPane.showConfirmDialog(null,"O preco médio de cada revisão é de:"+ f1.getPreco()+ " Gostaria de altera-lo?", "Preco" ,JOptionPane.YES_NO_OPTION);
							if (ii ==JOptionPane.YES_OPTION ) {
								escolha = JOptionPane.showInputDialog("Qual o valor na qual gostaria de cobrar?");
								int x=Integer.parseInt(escolha);
								f1.setPreco(x);
							}
						break;
					case 4:
							ii = JOptionPane.showConfirmDialog(null,"Atualmente possui uma renda total de 18000 no mes, Gostaria de adicionar uma nova venda?", "Venda" ,JOptionPane.YES_NO_OPTION);
							if (ii ==JOptionPane.YES_OPTION ) {
								escolha = JOptionPane.showInputDialog("Qual o valor da nova venda?");
								float x=Integer.parseInt(escolha);
								x = x + f1.getPrecoTotal();
								JOptionPane.showMessageDialog(null,"O valor total da nova renda e "+ x);
						}
						break;
					default:
						JOptionPane.showMessageDialog(null,"Escolha uma opçao");
						break;
					}
				}while(opcao != 0);
				
				break;
			case 4:
				int ii = JOptionPane.showConfirmDialog(null,"A pessoa logada e "+ d1.getNome()+ " com o telefone: " + d1.getTelefone() + " E o nome da empresa "+ d1.getNomeEmpre() , "Nome" ,JOptionPane.YES_NO_OPTION);
				if (ii ==JOptionPane.YES_OPTION ) {
					escolha = JOptionPane.showInputDialog("Escreva o nome:");
					d1.setNome(escolha);
					escolha = JOptionPane.showInputDialog("Escreva o telefone:");
					escolha2 = Integer.parseInt(escolha);
					d1.setTelefone(escolha2);
					escolha = JOptionPane.showInputDialog("Escreva o nome da empresa:");
					d1.setNomeEmpre(escolha);

				}
				break;
			default:
				JOptionPane.showMessageDialog(null,"Escolha uma opçao");
				break;
			}
		}while(opcao2 != 0);
	}
}
