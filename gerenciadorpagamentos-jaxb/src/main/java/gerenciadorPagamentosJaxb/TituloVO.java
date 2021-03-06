//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.29 at 01:16:31 AM BRT 
//


package gerenciadorPagamentosJaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tituloVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tituloVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acrecimo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cedente" type="{}pessoaVO" minOccurs="0"/>
 *         &lt;element name="contaBancaria" type="{}contaBancariaVO" minOccurs="0"/>
 *         &lt;element name="dataDoDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataDoVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deducao" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="desconto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="digitoDoNossoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mora" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nossoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sacado" type="{}pessoaVO" minOccurs="0"/>
 *         &lt;element name="sacadorAvalista" type="{}pessoaVO" minOccurs="0"/>
 *         &lt;element name="tipoDeDocumento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoDeMoeda" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorCobrado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tituloVO", propOrder = {
    "acrecimo",
    "cedente",
    "contaBancaria",
    "dataDoDocumento",
    "dataDoVencimento",
    "deducao",
    "desconto",
    "digitoDoNossoNumero",
    "mora",
    "nossoNumero",
    "numeroDoDocumento",
    "sacado",
    "sacadorAvalista",
    "tipoDeDocumento",
    "tipoDeMoeda",
    "valor",
    "valorCobrado"
})
public class TituloVO {

    protected BigDecimal acrecimo;
    protected PessoaVO cedente;
    protected ContaBancariaVO contaBancaria;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDoDocumento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDoVencimento;
    protected BigDecimal deducao;
    protected BigDecimal desconto;
    protected String digitoDoNossoNumero;
    protected BigDecimal mora;
    protected String nossoNumero;
    protected String numeroDoDocumento;
    protected PessoaVO sacado;
    protected PessoaVO sacadorAvalista;
    protected Integer tipoDeDocumento;
    protected Integer tipoDeMoeda;
    protected BigDecimal valor;
    protected BigDecimal valorCobrado;

    /**
     * Gets the value of the acrecimo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcrecimo() {
        return acrecimo;
    }

    /**
     * Sets the value of the acrecimo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcrecimo(BigDecimal value) {
        this.acrecimo = value;
    }

    /**
     * Gets the value of the cedente property.
     * 
     * @return
     *     possible object is
     *     {@link PessoaVO }
     *     
     */
    public PessoaVO getCedente() {
        return cedente;
    }

    /**
     * Sets the value of the cedente property.
     * 
     * @param value
     *     allowed object is
     *     {@link PessoaVO }
     *     
     */
    public void setCedente(PessoaVO value) {
        this.cedente = value;
    }

    /**
     * Gets the value of the contaBancaria property.
     * 
     * @return
     *     possible object is
     *     {@link ContaBancariaVO }
     *     
     */
    public ContaBancariaVO getContaBancaria() {
        return contaBancaria;
    }

    /**
     * Sets the value of the contaBancaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaBancariaVO }
     *     
     */
    public void setContaBancaria(ContaBancariaVO value) {
        this.contaBancaria = value;
    }

    /**
     * Gets the value of the dataDoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDoDocumento() {
        return dataDoDocumento;
    }

    /**
     * Sets the value of the dataDoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDoDocumento(XMLGregorianCalendar value) {
        this.dataDoDocumento = value;
    }

    /**
     * Gets the value of the dataDoVencimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDoVencimento() {
        return dataDoVencimento;
    }

    /**
     * Sets the value of the dataDoVencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDoVencimento(XMLGregorianCalendar value) {
        this.dataDoVencimento = value;
    }

    /**
     * Gets the value of the deducao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeducao() {
        return deducao;
    }

    /**
     * Sets the value of the deducao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeducao(BigDecimal value) {
        this.deducao = value;
    }

    /**
     * Gets the value of the desconto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDesconto() {
        return desconto;
    }

    /**
     * Sets the value of the desconto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDesconto(BigDecimal value) {
        this.desconto = value;
    }

    /**
     * Gets the value of the digitoDoNossoNumero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitoDoNossoNumero() {
        return digitoDoNossoNumero;
    }

    /**
     * Sets the value of the digitoDoNossoNumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitoDoNossoNumero(String value) {
        this.digitoDoNossoNumero = value;
    }

    /**
     * Gets the value of the mora property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMora() {
        return mora;
    }

    /**
     * Sets the value of the mora property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMora(BigDecimal value) {
        this.mora = value;
    }

    /**
     * Gets the value of the nossoNumero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNossoNumero() {
        return nossoNumero;
    }

    /**
     * Sets the value of the nossoNumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNossoNumero(String value) {
        this.nossoNumero = value;
    }

    /**
     * Gets the value of the numeroDoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDoDocumento() {
        return numeroDoDocumento;
    }

    /**
     * Sets the value of the numeroDoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDoDocumento(String value) {
        this.numeroDoDocumento = value;
    }

    /**
     * Gets the value of the sacado property.
     * 
     * @return
     *     possible object is
     *     {@link PessoaVO }
     *     
     */
    public PessoaVO getSacado() {
        return sacado;
    }

    /**
     * Sets the value of the sacado property.
     * 
     * @param value
     *     allowed object is
     *     {@link PessoaVO }
     *     
     */
    public void setSacado(PessoaVO value) {
        this.sacado = value;
    }

    /**
     * Gets the value of the sacadorAvalista property.
     * 
     * @return
     *     possible object is
     *     {@link PessoaVO }
     *     
     */
    public PessoaVO getSacadorAvalista() {
        return sacadorAvalista;
    }

    /**
     * Sets the value of the sacadorAvalista property.
     * 
     * @param value
     *     allowed object is
     *     {@link PessoaVO }
     *     
     */
    public void setSacadorAvalista(PessoaVO value) {
        this.sacadorAvalista = value;
    }

    /**
     * Gets the value of the tipoDeDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    /**
     * Sets the value of the tipoDeDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoDeDocumento(Integer value) {
        this.tipoDeDocumento = value;
    }

    /**
     * Gets the value of the tipoDeMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoDeMoeda() {
        return tipoDeMoeda;
    }

    /**
     * Sets the value of the tipoDeMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoDeMoeda(Integer value) {
        this.tipoDeMoeda = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

    /**
     * Gets the value of the valorCobrado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCobrado() {
        return valorCobrado;
    }

    /**
     * Sets the value of the valorCobrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCobrado(BigDecimal value) {
        this.valorCobrado = value;
    }

}
