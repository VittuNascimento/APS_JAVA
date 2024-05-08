package aps;

import java.util.ArrayList;
import java.util.List;

/**Classe de Teste 
 * 
 */
public class AtacadoCorreia {
	/**
	 * 
	 * @param args parametro da classe main
	 * @throws Exception mensagem que da ao dar erro 
	 */
	
	public static void main(String[] args) throws Exception {
		 List<Vendavel> estoque = new ArrayList<>();

	      
	        Alimento alimento1 = new Alimento("Arroz branco", 12.99, 50, "Tio Joao");
	        Alimento alimento2 = new Alimento("Feijão preto ", 4.99, 30, "Tio Joao");
	        Brinquedo brinquedo1 = new Brinquedo("Carrinho Hot wheels", 25.99, 20, "Plástico");
	        Brinquedo brinquedo2 = new Brinquedo("Boneca dora aventureira", 19.99, 15, "Tecido");

	        estoque.add(alimento1);
	        estoque.add(alimento2);
	        estoque.add(brinquedo1);
	        estoque.add(brinquedo2);

	       
	        for (Vendavel produto : estoque) {
	            System.out.println("Nome: " + ((Produto) produto).getNome());
	            System.out.println("Preço: R$" + ((Produto) produto).getPreco());
	            System.out.println("Quantidade em estoque: " + ((Produto) produto).getQuantidadeEmEstoque());
	            System.out.println("-----------------------------------");
	        }
	        
	        

	      
	        try {
	            alimento1.vender(6);
	            alimento2.vender(40);
	            brinquedo1.vender(10);
	            brinquedo2.vender(5);
	        } catch (EstoqueInsuficienteException e) {
	            System.out.println("Erro ao vender produto: " + e.getMessage());
	        }

	      
	        for (Vendavel produto : estoque) {
	            System.out.println("Nome: " + ((Produto) produto).getNome());
	            System.out.println("Preço: R$" + ((Produto) produto).getPreco());
	            System.out.println("Quantidade em estoque: " + ((Produto) produto).getQuantidadeEmEstoque());
	            System.out.println("-----------------------------------");
	        }
	}
}