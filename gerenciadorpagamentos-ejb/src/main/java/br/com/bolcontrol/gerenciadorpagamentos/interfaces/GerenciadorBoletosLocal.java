/**
 * 
 */
package br.com.bolcontrol.gerenciadorpagamentos.interfaces;

import javax.ejb.Local;

import org.jrimum.bopepo.Boleto;

import br.com.bolcontrol.gerenciadorpagamentos.exception.GerenciadorPagamentosException;

/**
 * @author Saymon
 *
 */
@Local
public interface GerenciadorBoletosLocal {
	public void gerarBoleto(final Boleto boleto,final String pathArquivo) throws GerenciadorPagamentosException;
}
