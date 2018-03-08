/**
 * HelloWordImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.swk.interfce;

public interface HelloWordImplService extends javax.xml.rpc.Service {
    public java.lang.String getHelloWordImplPortAddress();

    public com.swk.interfce.HelloWordInterface getHelloWordImplPort() throws javax.xml.rpc.ServiceException;

    public com.swk.interfce.HelloWordInterface getHelloWordImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
