
package com.phicomm.ws.pi021;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeliveryList_Req complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DeliveryList_Req"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="i_vbeln" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryList_Req", propOrder = {
    "iVbeln"
})
public class DeliveryListReq {

    @XmlElement(name = "i_vbeln", required = true)
    protected String iVbeln;

    /**
     * 获取iVbeln属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVbeln() {
        return iVbeln;
    }

    /**
     * 设置iVbeln属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVbeln(String value) {
        this.iVbeln = value;
    }

}
