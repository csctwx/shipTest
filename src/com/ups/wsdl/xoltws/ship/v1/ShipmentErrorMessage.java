
package com.ups.wsdl.xoltws.ship.v1;

import javax.xml.ws.WebFault;
import com.ups.xmlschema.xoltws.error.v1.Errors;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Errors", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Error/v1.1")
public class ShipmentErrorMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Errors faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ShipmentErrorMessage(String message, Errors faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ShipmentErrorMessage(String message, Errors faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.ups.xmlschema.xoltws.error.v1.Errors
     */
    public Errors getFaultInfo() {
        return faultInfo;
    }

}