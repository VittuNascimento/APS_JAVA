package aps;

/**
 * Classe Brinquedo que herda Produto e implementa a Vendavel.
 */
public class Brinquedo extends Produto implements Vendavel {

	private String material;
	
	/**
	 * 
	 * @param nome atributo de nome
	 * @param preco tributo de preeco 
	 * @param quantidadeEmEstoque atributo da quantidade 
	 * @param material atributo do material 
	 */
	public Brinquedo(String nome, double preco, int quantidadeEmEstoque, String material) {
		super(nome, preco, quantidadeEmEstoque);
			this.material = material;
	}
	
	 /**
     * Obtém o material do brinquedo.
     * @return O material do brinquedo.
     */
	
	public String getMaterial() {
		return material;
	}
	 /**
     * Define o material do brinquedo.
     * @param material O novo material do brinquedo.
     */
	
	public void setMaterial(String material) {
		this.material = material;
	}

	  /**
     * Implementação do método vender da interface Vendavel.
     */
	@Override
	public void vender(int quantidade) throws Exception {
		 if (quantidade <= quantidadeEmEstoque) {
	            quantidadeEmEstoque -= quantidade;
	        } else {
	            throw new EstoqueInsuficienteException("Estoque insuficiente para vender " + quantidade + " unidades de " + nome);
	        }
		
	}
	
	
}
