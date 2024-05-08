package aps;

/**
 *excecao lancada quando o estoque de um produto e insuficiente para realizar uma venda.
 */
public class EstoqueInsuficienteException extends Exception {
	
	
	private static final long serialVersionUID = 1L;
	
	/**
     * Construtor da classe EstoqueInsuficienteException.
     * @param mensagem A mensagem de erro associada à exceção.
     */
	public EstoqueInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
