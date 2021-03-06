/**
 * ProcessMakerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class ProcessMakerServiceLocator extends org.apache.axis.client.Service implements com.processmaker.www.ProcessMakerService {

/**
 * ProcessMaker Web Service
 */

    public ProcessMakerServiceLocator() {
    }


    public ProcessMakerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProcessMakerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProcessMakerServiceSoap
    private java.lang.String ProcessMakerServiceSoap_address = "http://lanerpf01:8080/sysworkflow/en/classic/services/soap2";

    public java.lang.String getProcessMakerServiceSoapAddress() {
        return ProcessMakerServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProcessMakerServiceSoapWSDDServiceName = "ProcessMakerServiceSoap";

    public java.lang.String getProcessMakerServiceSoapWSDDServiceName() {
        return ProcessMakerServiceSoapWSDDServiceName;
    }

    public void setProcessMakerServiceSoapWSDDServiceName(java.lang.String name) {
        ProcessMakerServiceSoapWSDDServiceName = name;
    }

    public com.processmaker.www.ProcessMakerServiceSoap getProcessMakerServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProcessMakerServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProcessMakerServiceSoap(endpoint);
    }

    public com.processmaker.www.ProcessMakerServiceSoap getProcessMakerServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.processmaker.www.ProcessMakerServiceSoapStub _stub = new com.processmaker.www.ProcessMakerServiceSoapStub(portAddress, this);
            _stub.setPortName(getProcessMakerServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProcessMakerServiceSoapEndpointAddress(java.lang.String address) {
        ProcessMakerServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.processmaker.www.ProcessMakerServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.processmaker.www.ProcessMakerServiceSoapStub _stub = new com.processmaker.www.ProcessMakerServiceSoapStub(new java.net.URL(ProcessMakerServiceSoap_address), this);
                _stub.setPortName(getProcessMakerServiceSoapWSDDServiceName());
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
        if ("ProcessMakerServiceSoap".equals(inputPortName)) {
            return getProcessMakerServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.processmaker.com", "ProcessMakerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.processmaker.com", "ProcessMakerServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProcessMakerServiceSoap".equals(portName)) {
            setProcessMakerServiceSoapEndpointAddress(address);
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
