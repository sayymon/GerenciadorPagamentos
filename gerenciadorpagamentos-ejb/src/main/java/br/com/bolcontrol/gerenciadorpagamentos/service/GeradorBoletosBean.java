/**
 * 
 */
package br.com.bolcontrol.gerenciadorpagamentos.service;

import java.io.File;
import java.io.Serializable;

import javax.ejb.Stateless;

import org.jrimum.bopepo.Boleto;

import br.com.bolcontrol.gerenciadorpagamentos.interfaces.GerenciadorBoletosLocal;
import br.com.bolcontrol.gerenciadorpagamentos.interfaces.GerenciadorBoletosRemote;
import br.com.bolcontrol.gerenciadorpagamentos.util.BoletosHelper;


/**
 * @author Saymon
 *
 */
@Stateless
public class GeradorBoletosBean implements Serializable,GerenciadorBoletosLocal,GerenciadorBoletosRemote {

	/**
	 * Serializador padrão
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void gerarBoleto(final Boleto boleto,final String pathArquivo) {
		File boletoLocal = BoletosHelper.gerarBoletoLocal(boleto, pathArquivo);
		if (boletoLocal == null) {
			//throw new GerenciadorPagamentosException("Falha ao gerar boleto");
		}
	}

}
