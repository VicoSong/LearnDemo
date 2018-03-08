
package com.phicomm.ws.pi021;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.phicomm.ws.pi021 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeliveryListRes_QNAME = new QName("http://phicomm.com/WMS/PI021/DeliveryList", "DeliveryList_Res");
    private final static QName _DeliveryListReq_QNAME = new QName("http://phicomm.com/WMS/PI021/DeliveryList", "DeliveryList_Req");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.phicomm.ws.pi021
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeliveryListRes }
     * 
     */
    public DeliveryListRes createDeliveryListRes() {
        return new DeliveryListRes();
    }

    /**
     * Create an instance of {@link DeliveryListRes.ETDELIVERYITEM }
     * 
     */
    public DeliveryListRes.ETDELIVERYITEM createDeliveryListResETDELIVERYITEM() {
        return new DeliveryListRes.ETDELIVERYITEM();
    }

    /**
     * Create an instance of {@link DeliveryListReq }
     * 
     */
    public DeliveryListReq createDeliveryListReq() {
        return new DeliveryListReq();
    }

    /**
     * Create an instance of {@link DeliveryListRes.ESDELIVERYSTOHEADER }
     * 
     */
    public DeliveryListRes.ESDELIVERYSTOHEADER createDeliveryListResESDELIVERYSTOHEADER() {
        return new DeliveryListRes.ESDELIVERYSTOHEADER();
    }

    /**
     * Create an instance of {@link DeliveryListRes.ERETURN }
     * 
     */
    public DeliveryListRes.ERETURN createDeliveryListResERETURN() {
        return new DeliveryListRes.ERETURN();
    }

    /**
     * Create an instance of {@link DeliveryListRes.ETDELIVERYITEM.ITEM }
     * 
     */
    public DeliveryListRes.ETDELIVERYITEM.ITEM createDeliveryListResETDELIVERYITEMITEM() {
        return new DeliveryListRes.ETDELIVERYITEM.ITEM();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryListRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://phicomm.com/WMS/PI021/DeliveryList", name = "DeliveryList_Res")
    public JAXBElement<DeliveryListRes> createDeliveryListRes(DeliveryListRes value) {
        return new JAXBElement<DeliveryListRes>(_DeliveryListRes_QNAME, DeliveryListRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryListReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://phicomm.com/WMS/PI021/DeliveryList", name = "DeliveryList_Req")
    public JAXBElement<DeliveryListReq> createDeliveryListReq(DeliveryListReq value) {
        return new JAXBElement<DeliveryListReq>(_DeliveryListReq_QNAME, DeliveryListReq.class, null, value);
    }

}
