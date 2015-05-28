/**
 * 
 */
package br.com.bolcontrol.gerenciadorpagamentos.interfaces;

import javax.ejb.Local;

/**
 * @author Saymon
 *
 */
@Local
public interface GerenciadorBoletosLocal {
	public void gerarBoleto();
}
