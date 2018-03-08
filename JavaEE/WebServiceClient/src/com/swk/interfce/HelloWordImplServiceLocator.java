/**
 * HelloWordImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.swk.interfce;

public class HelloWordImplServiceLocator extends org.apache.axis.client.Service implements com.swk.interfce.HelloWordImplService {

    public HelloWordImplServiceLocator() {
    }


    public HelloWordImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloWordImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloWordImplPort
    private java.lang.String HelloWordImplPort_address = "http://localhost:8080/WebServiceDemo/services";

    public java.lang.String getHelloWordImplPortAddress() {
        return HelloWordImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloWordImplPortWSDDServiceName = "HelloWordImplPort";

    public java.lang.String getHelloWordImplPortWSDDServiceName() {
        return HelloWordImplPortWSDDServiceName;
    }

    public void setHelloWordImplPortWSDDServiceName(java.lang.String name) {
        HelloWordImplPortWSDDServiceName = name;
    }

    public com.swk.interfce.HelloWordInterface getHelloWordImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloWordImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloWordImplPort(endpoint);
    }

    public com.swk.interfce.HelloWordInterface getHelloWordImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.swk.interfce.HelloWordImplServiceSoapBindingStub _stub = new com.swk.interfce.HelloWordImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloWordImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloWordImplPortEndpointAddress(java.lang.String address) {
        HelloWordImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.swk.interfce.HelloWordInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.swk.interfce.HelloWordImplServiceSoapBindingStub _stub = new com.swk.interfce.HelloWordImplServiceSoapBindingStub(new java.net.URL(HelloWordImplPort_address), this);
                _stub.setPortName(getHelloWordImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloWordImplPort".equals(inputPortName)) {
            return getHelloWordImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://interfce.swk.com/", "HelloWordImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://interfce.swk.com/", "HelloWordImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloWordImplPort".equals(portName)) {
            setHelloWordImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
