//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.17 at 10:55:36 AM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiRequest">
 *       &lt;sequence>
 *         &lt;element name="includeStatistics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="firstSettlementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastSettlementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "includeStatistics",
    "firstSettlementDate",
    "lastSettlementDate"
})
@XmlRootElement(name = "getSettledBatchListRequest")
public class GetSettledBatchListRequest
    extends ANetApiRequest
{

    protected Boolean includeStatistics;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstSettlementDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSettlementDate;

    /**
     * Gets the value of the includeStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeStatistics() {
        return includeStatistics;
    }

    /**
     * Sets the value of the includeStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeStatistics(Boolean value) {
        this.includeStatistics = value;
    }

    /**
     * Gets the value of the firstSettlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstSettlementDate() {
        return firstSettlementDate;
    }

    /**
     * Sets the value of the firstSettlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstSettlementDate(XMLGregorianCalendar value) {
        this.firstSettlementDate = value;
    }

    /**
     * Gets the value of the lastSettlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSettlementDate() {
        return lastSettlementDate;
    }

    /**
     * Sets the value of the lastSettlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSettlementDate(XMLGregorianCalendar value) {
        this.lastSettlementDate = value;
    }

}
