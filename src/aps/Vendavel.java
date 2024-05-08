package aps;

/**
 * Interface Vendavel que define um contrato para objetos que podem ser vendidos.
 */
public interface Vendavel {
	
	/**
     * Método para vender uma certa quantidade de um objeto vendável.
     * @param quantidade A quantidade a ser vendida.
     * @throws Exception Se houver algum erro ao vender o objeto.
     */
	public abstract void vender(int quantidade) throws Exception;
}
