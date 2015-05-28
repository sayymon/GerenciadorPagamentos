/**
 * 
 */
package br.com.bolcontrol.gerenciadorpagamentos.util;

import java.io.File;

import org.jrimum.bopepo.Boleto;
import org.jrimum.bopepo.view.BoletoViewer;

/**
 * @author Saymon
 *
 */
public final class BoletosHelper {
	/**
	 * Singleton para classes utilitarias
	 */
	private BoletosHelper(){}
	
	public static File gerarBoletoLocal(final Boleto boleto,final String pathArquivo){
		BoletoViewer boletoViewer = new BoletoViewer(boleto);

		return boletoViewer.getPdfAsFile(pathArquivo);		
	}
}
