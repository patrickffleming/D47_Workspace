/**
 * MLQEmployeeServerServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.lansa.SOAPServer.mlqtutorial;

public class MLQEmployeeServerServiceServiceLocator extends org.apache.axis.client.Service implements com.lansa.SOAPServer.mlqtutorial.MLQEmployeeServerServiceService {

    public MLQEmployeeServerServiceServiceLocator() {
    }


    public MLQEmployeeServerServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MLQEmployeeServerServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MLQEmployeeServerServicePort
    private java.lang.String MLQEmployeeServerServicePort_address = "http://solutions.lansa.com:8561/cgi-bin/jsmdirect?mlqtutorial";

    public java.lang.String getMLQEmployeeServerServicePortAddress() {
        return MLQEmployeeServerServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MLQEmployeeServerServicePortWSDDServiceName = "MLQEmployeeServerServicePort";

    public java.lang.String getMLQEmployeeServerServicePortWSDDServiceName() {
        return MLQEmployeeServerServicePortWSDDServiceName;
    }

    public void setMLQEmployeeServerServicePortWSDDServiceName(java.lang.String name) {
        MLQEmployeeServerServicePortWSDDServiceName = name;
    }

    public com.lansa.SOAPServer.mlqtutorial.MLQEmployeeServerServicePortType getMLQEmployeeServerServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MLQEmployeeServerServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMLQEmployeeServerServicePort(endpoint);
    }

    public com.lansa.SOAPServer.mlqtutorial.MLQEmployeeServerServicePortType getMLQEmployeeServerServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.lansa.SOAPServer.mlqtutorial.MLQEmployeeServerServiceBindingStub _stub = new com.lansa.SOAPServer.mlqtutorial.MLQEmployeeServerServiceBindingStub(portAddress, this);
            _stub.setPortName(getMLQEmployeeServerServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMLQEmployeeServerServicePortEndpointAddress(java.lang.String address) {
        MLQEmployeeServerServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.lansa.SOAPServer.mlqtutorial.MLQEmployeeServerServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.lansa.SOAPServer.mlqtutorial.MLQEmployeeServerServiceBindingStub _stub = new com.lansa.SOAPServer.mlqtutorial.MLQEmployeeServerServiceBindingStub(new java.net.URL(MLQEmployeeServerServicePort_address), this);
                _stub.setPortName(getMLQEmployeeServerServicePortWSDDServiceName());
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
        if ("MLQEmployeeServerServicePort".equals(inputPortName)) {
            return getMLQEmployeeServerServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://mlqtutorial.SOAPServer.lansa.com", "MLQEmployeeServerServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://mlqtutorial.SOAPServer.lansa.com", "MLQEmployeeServerServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MLQEmployeeServerServicePort".equals(portName)) {
            setMLQEmployeeServerServicePortEndpointAddress(address);
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
