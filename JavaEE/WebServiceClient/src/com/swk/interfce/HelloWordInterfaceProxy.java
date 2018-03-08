package com.swk.interfce;

public class HelloWordInterfaceProxy implements com.swk.interfce.HelloWordInterface {
  private String _endpoint = null;
  private com.swk.interfce.HelloWordInterface helloWordInterface = null;
  
  public HelloWordInterfaceProxy() {
    _initHelloWordInterfaceProxy();
  }
  
  public HelloWordInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWordInterfaceProxy();
  }
  
  private void _initHelloWordInterfaceProxy() {
    try {
      helloWordInterface = (new com.swk.interfce.HelloWordImplServiceLocator()).getHelloWordImplPort();
      if (helloWordInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWordInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWordInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWordInterface != null)
      ((javax.xml.rpc.Stub)helloWordInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.swk.interfce.HelloWordInterface getHelloWordInterface() {
    if (helloWordInterface == null)
      _initHelloWordInterfaceProxy();
    return helloWordInterface;
  }
  
  public java.lang.String sayHi(java.lang.String arg0) throws java.rmi.RemoteException{
    if (helloWordInterface == null)
      _initHelloWordInterfaceProxy();
    return helloWordInterface.sayHi(arg0);
  }
  
  public java.lang.String sayHello() throws java.rmi.RemoteException{
    if (helloWordInterface == null)
      _initHelloWordInterfaceProxy();
    return helloWordInterface.sayHello();
  }
  
  
}