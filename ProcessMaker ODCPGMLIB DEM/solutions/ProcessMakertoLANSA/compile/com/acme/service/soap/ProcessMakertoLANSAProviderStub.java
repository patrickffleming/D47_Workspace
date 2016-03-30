/**
 * ProcessMakertoLANSAProviderStub.java
 *
 * This file was generated by LANSA Integrator SOAP Server Wizard
 */
package com.acme.service.soap ;

public class ProcessMakertoLANSAProviderStub implements com.lansa.jsm.service.SOAPServerProviderStub, ProcessMakertoLANSAProvider
{
    private final static com.lansa.jsm.service.SOAPServerProviderProperties m_providerProperties = new com.lansa.jsm.service.SOAPServerProviderProperties () ; 

    public final static com.lansa.jsm.service.SOAPServerProviderProperties getProviderProperties ()
    {
        return m_providerProperties ;
    }

    static
    {
        m_providerProperties.setStyle ( "wrapped" ) ;
        m_providerProperties.setTypeMappingVersion ( "1.2" ) ;
        m_providerProperties.addReturnType ( "SETEMPLOYEETERMINATIONDATE", new javax.xml.namespace.QName ( "http://www.w3.org/2001/XMLSchema", "string" ) ) ;
        m_providerProperties.addReturnType ( "UPDATEINVOICES", new javax.xml.namespace.QName ( "http://www.w3.org/2001/XMLSchema", "string" ) ) ;
    }

    private com.lansa.jsm.service.SOAPServerParameter[] m_parameterArray = null ;

    /*
        Stub implementation
    */

    public final String getProviderMethods ()
    {
        return "SetEmployeeTerminationDate,updateInvoices" ;
    }

    public final Class[] getProviderClasses ()
    {
        return new Class[] {  } ;
    }

    public final com.lansa.jsm.service.SOAPServerParameter[] getProviderParameters ()
    {
        if ( m_parameterArray == null )
        {
            throw new IllegalArgumentException ( getClass().getName() + ": no parameters" ) ;
        }

        return m_parameterArray ;
    }

    /*
        Service implementation
    */

    public final String SetEmployeeTerminationDate ( String EmployeeNumber, String TerminationDate, String ProcessMakerCaseNumber, String TerminationReason )
    {
        m_parameterArray = new com.lansa.jsm.service.SOAPServerParameter[4] ;

        m_parameterArray[0] = new com.lansa.jsm.service.SOAPServerParameter ( "EMPLOYEENUMBER", EmployeeNumber ) ;
        m_parameterArray[1] = new com.lansa.jsm.service.SOAPServerParameter ( "TERMINATIONDATE", TerminationDate ) ;
        m_parameterArray[2] = new com.lansa.jsm.service.SOAPServerParameter ( "PROCESSMAKERCASENUMBER", ProcessMakerCaseNumber ) ;
        m_parameterArray[3] = new com.lansa.jsm.service.SOAPServerParameter ( "TERMINATIONREASON", TerminationReason ) ;

        return null ;
    }

    public final String updateInvoices ( String processID, String caseID, String control, String company, String partition, String caseNumber, String casePIN, String createUser, String approveUser, String bemsMessageQ, String bemsMessage, String bemsObject, String bemsCommand )
    {
        m_parameterArray = new com.lansa.jsm.service.SOAPServerParameter[13] ;

        m_parameterArray[0] = new com.lansa.jsm.service.SOAPServerParameter ( "PROCESSID", processID ) ;
        m_parameterArray[1] = new com.lansa.jsm.service.SOAPServerParameter ( "CASEID", caseID ) ;
        m_parameterArray[2] = new com.lansa.jsm.service.SOAPServerParameter ( "CONTROL", control ) ;
        m_parameterArray[3] = new com.lansa.jsm.service.SOAPServerParameter ( "COMPANY", company ) ;
        m_parameterArray[4] = new com.lansa.jsm.service.SOAPServerParameter ( "PARTITION", partition ) ;
        m_parameterArray[5] = new com.lansa.jsm.service.SOAPServerParameter ( "CASENUMBER", caseNumber ) ;
        m_parameterArray[6] = new com.lansa.jsm.service.SOAPServerParameter ( "CASEPIN", casePIN ) ;
        m_parameterArray[7] = new com.lansa.jsm.service.SOAPServerParameter ( "CREATEUSER", createUser ) ;
        m_parameterArray[8] = new com.lansa.jsm.service.SOAPServerParameter ( "APPROVEUSER", approveUser ) ;
        m_parameterArray[9] = new com.lansa.jsm.service.SOAPServerParameter ( "BEMSMESSAGEQ", bemsMessageQ ) ;
        m_parameterArray[10] = new com.lansa.jsm.service.SOAPServerParameter ( "BEMSMESSAGE", bemsMessage ) ;
        m_parameterArray[11] = new com.lansa.jsm.service.SOAPServerParameter ( "BEMSOBJECT", bemsObject ) ;
        m_parameterArray[12] = new com.lansa.jsm.service.SOAPServerParameter ( "BEMSCOMMAND", bemsCommand ) ;

        return null ;
    }
}