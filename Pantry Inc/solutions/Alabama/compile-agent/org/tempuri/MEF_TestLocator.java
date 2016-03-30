/**
 * MEF_TestLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package org.tempuri;

public class MEF_TestLocator extends org.apache.axis.client.Service implements org.tempuri.MEF_Test {

    public MEF_TestLocator() {
    }


    public MEF_TestLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MEF_TestLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MEF_Test_Interface
    private java.lang.String MEF_Test_Interface_address = "http://lansa01:1099/cgi-bin/jsmdirect?soapstatic";

    public java.lang.String getMEF_Test_InterfaceAddress() {
        return MEF_Test_Interface_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MEF_Test_InterfaceWSDDServiceName = "MEF_Test_Interface";

    public java.lang.String getMEF_Test_InterfaceWSDDServiceName() {
        return MEF_Test_InterfaceWSDDServiceName;
    }

    public void setMEF_Test_InterfaceWSDDServiceName(java.lang.String name) {
        MEF_Test_InterfaceWSDDServiceName = name;
    }

    public org.tempuri.MEF_Test_Interface getMEF_Test_Interface() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MEF_Test_Interface_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMEF_Test_Interface(endpoint);
    }

    public org.tempuri.MEF_Test_Interface getMEF_Test_Interface(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.MEF_Test_InterfaceStub _stub = new org.tempuri.MEF_Test_InterfaceStub(portAddress, this);
            _stub.setPortName(getMEF_Test_InterfaceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMEF_Test_InterfaceEndpointAddress(java.lang.String address) {
        MEF_Test_Interface_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.MEF_Test_Interface.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.MEF_Test_InterfaceStub _stub = new org.tempuri.MEF_Test_InterfaceStub(new java.net.URL(MEF_Test_Interface_address), this);
                _stub.setPortName(getMEF_Test_InterfaceWSDDServiceName());
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
        if ("MEF_Test_Interface".equals(inputPortName)) {
            return getMEF_Test_Interface();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "MEF_Test");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "MEF_Test_Interface"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MEF_Test_Interface".equals(portName)) {
            setMEF_Test_InterfaceEndpointAddress(address);
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
