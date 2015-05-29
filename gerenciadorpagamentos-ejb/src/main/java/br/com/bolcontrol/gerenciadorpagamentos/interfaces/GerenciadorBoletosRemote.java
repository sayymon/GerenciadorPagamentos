/**
 * 
 */
package br.com.bolcontrol.gerenciadorpagamentos.interfaces;

import javax.ejb.Remote;

import org.jrimum.bopepo.Boleto;

import br.com.bolcontrol.gerenciadorpagamentos.exception.GerenciadorPagamentosException;

/**
 * @author Saymon
 *
 */
@Remote
public interface GerenciadorBoletosRemote {
	public void gerarBoleto(final Boleto boleto,final String pathArquivo) throws GerenciadorPagamentosException;
}
