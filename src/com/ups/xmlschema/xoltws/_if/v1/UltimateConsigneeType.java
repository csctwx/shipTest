
package com.ups.xmlschema.xoltws._if.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UltimateConsigneeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UltimateConsigneeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}AddressType"/>
 *         &lt;element name="UltimateConsigneeType" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}UltimateConsigneeTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UltimateConsigneeType", propOrder = {
    "companyName",
    "address",
    "ultimateConsigneeType"
})
public class UltimateConsigneeType {

    @XmlElement(name = "CompanyName", required = true)
    protected String companyName;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "UltimateConsigneeType")
    protected UltimateConsigneeTypeType ultimateConsigneeType;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the ultimateConsigneeType property.
     * 
     * @return
     *     possible object is
     *     {@link UltimateConsigneeTypeType }
     *     
     */
    public UltimateConsigneeTypeType getUltimateConsigneeType() {
        return ultimateConsigneeType;
    }

    /**
     * Sets the value of the ultimateConsigneeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UltimateConsigneeTypeType }
     *     
     */
    public void setUltimateConsigneeType(UltimateConsigneeTypeType value) {
        this.ultimateConsigneeType = value;
    }

}
