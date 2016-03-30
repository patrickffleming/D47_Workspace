/**
 * UHAEmployeeServerServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.UHAcompany.service.soap;

public class UHAEmployeeServerServiceServiceLocator extends org.apache.axis.client.Service implements com.UHAcompany.service.soap.UHAEmployeeServerServiceService {

    public UHAEmployeeServerServiceServiceLocator() {
    }


    public UHAEmployeeServerServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UHAEmployeeServerServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UHAEmployeeServerServicePort
    private java.lang.String UHAEmployeeServerServicePort_address = "http://solutions.lansa.com:8561/cgi-bin/jsmdirect?UHAemployeeserver";

    public java.lang.String getUHAEmployeeServerServicePortAddress() {
        return UHAEmployeeServerServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UHAEmployeeServerServicePortWSDDServiceName = "UHAEmployeeServerServicePort";

    public java.lang.String getUHAEmployeeServerServicePortWSDDServiceName() {
        return UHAEmployeeServerServicePortWSDDServiceName;
    }

    public void setUHAEmployeeServerServicePortWSDDServiceName(java.lang.String name) {
        UHAEmployeeServerServicePortWSDDServiceName = name;
    }

    public com.UHAcompany.service.soap.UHAEmployeeServerServicePortType getUHAEmployeeServerServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UHAEmployeeServerServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUHAEmployeeServerServicePort(endpoint);
    }

    public com.UHAcompany.service.soap.UHAEmployeeServerServicePortType getUHAEmployeeServerServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.UHAcompany.service.soap.UHAEmployeeServerServiceBindingStub _stub = new com.UHAcompany.service.soap.UHAEmployeeServerServiceBindingStub(portAddress, this);
            _stub.setPortName(getUHAEmployeeServerServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUHAEmployeeServerServicePortEndpointAddress(java.lang.String address) {
        UHAEmployeeServerServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.UHAcompany.service.soap.UHAEmployeeServerServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.UHAcompany.service.soap.UHAEmployeeServerServiceBindingStub _stub = new com.UHAcompany.service.soap.UHAEmployeeServerServiceBindingStub(new java.net.URL(UHAEmployeeServerServicePort_address), this);
                _stub.setPortName(getUHAEmployeeServerServicePortWSDDServiceName());
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
        if ("UHAEmployeeServerServicePort".equals(inputPortName)) {
            return getUHAEmployeeServerServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.service.UHAcompany.com", "UHAEmployeeServerServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.service.UHAcompany.com", "UHAEmployeeServerServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UHAEmployeeServerServicePort".equals(portName)) {
            setUHAEmployeeServerServicePortEndpointAddress(address);
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
