/**
 * UHAEmployeeServerServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.lansa.UHASOAPServer.Tutorial;

public interface UHAEmployeeServerServicePortType extends java.rmi.Remote {
    public com.lansa.UHASOAPServer.Tutorial.Employee[] getEmployees(java.lang.String department_code, java.lang.String section_code) throws java.rmi.RemoteException;
    public void noop() throws java.rmi.RemoteException;
}
