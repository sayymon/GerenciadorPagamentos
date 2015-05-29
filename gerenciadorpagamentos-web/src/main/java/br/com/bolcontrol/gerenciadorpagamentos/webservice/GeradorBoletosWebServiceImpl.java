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
@WebService(serviceName="GeradorBoletosWebService/geradorboletoswebservice")
public class GeradorBoletosWebServiceImpl implements GeradorBoletosWebService{
	@Override
	@WebMethod
	public String gerarBoleto(@WebParam(name = "boleto") BoletoVO boleto){
		return "teste";
	}
}
