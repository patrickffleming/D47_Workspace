/**
 * MEF_Test_Interface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package org.tempuri;

public interface MEF_Test_Interface extends java.rmi.Remote {
    public java.lang.Object submissionListByTransmissionId(java.lang.String userName, java.lang.String password, java.lang.String transmissionId) throws java.rmi.RemoteException;
    public java.lang.Object submissionListByDate(java.lang.String userName, java.lang.String password, java.lang.String dateFrom, java.lang.String dateTo) throws java.rmi.RemoteException;
    public byte[] newSubmission(java.lang.String userName, java.lang.String password, byte[] file) throws java.rmi.RemoteException;
    public java.lang.Object submissionListByAcknowledgementId(java.lang.String userName, java.lang.String password, java.lang.String acknowledgementId) throws java.rmi.RemoteException;
}
