//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.17 at 10:55:36 AM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardArt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardArt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardImageHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardImageWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardArt", propOrder = {
    "cardBrand",
    "cardImageHeight",
    "cardImageUrl",
    "cardImageWidth",
    "cardType"
})
public class CardArt {

    protected String cardBrand;
    protected String cardImageHeight;
    protected String cardImageUrl;
    protected String cardImageWidth;
    protected String cardType;

    /**
     * Gets the value of the cardBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBrand() {
        return cardBrand;
    }

    /**
     * Sets the value of the cardBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBrand(String value) {
        this.cardBrand = value;
    }

    /**
     * Gets the value of the cardImageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardImageHeight() {
        return cardImageHeight;
    }

    /**
     * Sets the value of the cardImageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardImageHeight(String value) {
        this.cardImageHeight = value;
    }

    /**
     * Gets the value of the cardImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardImageUrl() {
        return cardImageUrl;
    }

    /**
     * Sets the value of the cardImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardImageUrl(String value) {
        this.cardImageUrl = value;
    }

    /**
     * Gets the value of the cardImageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardImageWidth() {
        return cardImageWidth;
    }

    /**
     * Sets the value of the cardImageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardImageWidth(String value) {
        this.cardImageWidth = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

}
