
package aps;
/**
 * Classe Abstrata Produto que serve de classe Mae
 */

public abstract class Produto {
	/**
	 * Atributo de nome
	 */
	protected String nome;  
	/**
	 * Atributo de preco
	 */
	protected double preco;
	/**
	 * atributo de quantidade disponivel no estoque
	 */
	protected int quantidadeEmEstoque;
	
	/**
	 * 
	 * @param nome atributo nome
	 * @param preco atributo preco
	 * @param quantidadeEmEstoque atributo de quantidade disponivel
	 */
	public Produto(String nome, double preco, int quantidadeEmEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	/**
     * Obtem o nome do produto.
     * @return O nome do produto.
     */
	public String getNome() {
		return nome;
	}
	
	 /**
     * Define o nome do produto.
     * @param nome O novo nome do produto.
     */
	public void setNome(String nome) {
		this.nome = nome;
	}
	 /**
     * obtem o preço do produto.
     * @return preco O novo preço do produto.
     */
	public double getPreco() {
		return preco;
	}
	 /**
     * Define o preço do produto.
     * @param preco O novo preço do produto.
     */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	 /**
     * Obtem a quantidade em estoque do produto.
     * @return A quantidade em estoque do produto.
     */
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	
	/**
     * Define a quantidade em estoque do produto.
     * @param quantidadeEmEstoque A nova quantidade em estoque do produto.
     */
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

}
