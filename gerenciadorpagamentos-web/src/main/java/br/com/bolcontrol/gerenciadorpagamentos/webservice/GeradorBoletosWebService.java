/**
 * 
 */
package br.com.bolcontrol.gerenciadorpagamentos.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import gerenciadorPagamentosJaxb.BoletoVO;

/**
 * @author Saymon
 *
 */
@WebService
public interface GeradorBoletosWebService {
	@WebMethod
    String gerarBoleto(@WebParam(name = "boleto") BoletoVO boleto);
}
