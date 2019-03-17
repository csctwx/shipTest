
package com.ups.xmlschema.xoltws.ship.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazMatPackageInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazMatPackageInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllPackedInOneIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverPackedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazMatPackageInformationType", propOrder = {
    "allPackedInOneIndicator",
    "overPackedIndicator",
    "qValue"
})
public class HazMatPackageInformationType {

    @XmlElement(name = "AllPackedInOneIndicator")
    protected String allPackedInOneIndicator;
    @XmlElement(name = "OverPackedIndicator")
    protected String overPackedIndicator;
    @XmlElement(name = "QValue")
    protected String qValue;

    /**
     * Gets the value of the allPackedInOneIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllPackedInOneIndicator() {
        return allPackedInOneIndicator;
    }

    /**
     * Sets the value of the allPackedInOneIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllPackedInOneIndicator(String value) {
        this.allPackedInOneIndicator = value;
    }

    /**
     * Gets the value of the overPackedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverPackedIndicator() {
        return overPackedIndicator;
    }

    /**
     * Sets the value of the overPackedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverPackedIndicator(String value) {
        this.overPackedIndicator = value;
    }

    /**
     * Gets the value of the qValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQValue() {
        return qValue;
    }

    /**
     * Sets the value of the qValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQValue(String value) {
        this.qValue = value;
    }

}
