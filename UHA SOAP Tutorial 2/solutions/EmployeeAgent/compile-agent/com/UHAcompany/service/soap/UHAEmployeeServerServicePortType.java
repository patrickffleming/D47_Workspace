/**
 * UHAEmployeeServerServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.UHAcompany.service.soap;

public interface UHAEmployeeServerServicePortType extends java.rmi.Remote {
    public void noop() throws java.rmi.RemoteException;
    public com.UHAcompany.service.soap.Employee[] getEmployees(java.lang.String departmentCode, java.lang.String sectionCode) throws java.rmi.RemoteException;
}
