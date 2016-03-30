/**
 * MLQEmployeeServerServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.lansa.SOAPServer.mlqtutorial;

public interface MLQEmployeeServerServicePortType extends java.rmi.Remote {
    public com.lansa.SOAPServer.mlqtutorial.EMPLOYEE[] MLQGetEmployees(java.lang.String departmentCode, java.lang.String sectionCode) throws java.rmi.RemoteException;
}
