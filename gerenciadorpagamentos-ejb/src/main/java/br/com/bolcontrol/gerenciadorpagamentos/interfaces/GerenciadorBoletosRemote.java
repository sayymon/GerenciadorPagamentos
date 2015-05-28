/**
 * 
 */
package br.com.bolcontrol.gerenciadorpagamentos.interfaces;

import javax.ejb.Remote;

/**
 * @author Saymon
 *
 */
@Remote
public interface GerenciadorBoletosRemote {
	public void gerarBoleto();
}
