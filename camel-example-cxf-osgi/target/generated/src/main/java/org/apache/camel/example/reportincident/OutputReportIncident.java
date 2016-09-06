
package org.apache.camel.example.reportincident;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code"
})
@XmlRootElement(name = "outputReportIncident")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-03-07T02:05:18-06:00", comments = "JAXB RI v2.2.5.1")
public class OutputReportIncident {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-03-07T02:05:18-06:00", comments = "JAXB RI v2.2.5.1")
    protected String code;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-03-07T02:05:18-06:00", comments = "JAXB RI v2.2.5.1")
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-03-07T02:05:18-06:00", comments = "JAXB RI v2.2.5.1")
    public void setCode(String value) {
        this.code = value;
    }

}
