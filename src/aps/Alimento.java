package aps;

/**
 * Classe Alimento que herda Produto e implementa a Vendavel.
 */
public class Alimento extends Produto implements Vendavel {
	
	
	private String marca;

	
	/**
     * Construtor da classe Alimento.
     * @param nome O nome do alimento.
     * @param preco O preço do alimento.
     * @param quantidadeEmEstoque A quantidade em estoque do alimento.
     * @param marca A marca do alimento.
     */
	public Alimento(String nome, double preco, int quantidadeEmEstoque, String marca) {
		super(nome, preco, quantidadeEmEstoque);
		this.marca = marca;
	}
	
	/**
     * Obtem a marca do alimento.
     * @return A marca do alimento.
     */
	public String getMarca() {
		return marca;
	}
	
	/**
     * Define a marca do alimento.
     * @param marca A nova marca do alimento.
     */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	 /**
     * Implementacao do metodo vender da interface Vendavel.
     */
	@Override
	public void vender(int quantidade) throws EstoqueInsuficienteException{
		if (quantidade <= quantidadeEmEstoque) {
			quantidadeEmEstoque -= quantidade;
		} else {
			throw new EstoqueInsuficienteException("Estoque é insuficiente para vender " + quantidade + "unidades de" + nome );
		}
		
	}
	
	

}
