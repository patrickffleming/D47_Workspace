/**
 * ProcessMakerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public interface ProcessMakerService extends javax.xml.rpc.Service {

/**
 * ProcessMaker Web Service
 */
    public java.lang.String getProcessMakerServiceSoapAddress();

    public com.processmaker.www.ProcessMakerServiceSoap getProcessMakerServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.processmaker.www.ProcessMakerServiceSoap getProcessMakerServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
