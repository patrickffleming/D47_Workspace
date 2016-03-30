/**
 * PMGLInvoiceProviderStub.java
 *
 * This file was generated by LANSA Integrator SOAP Server Wizard
 */
package com.acme.service.soap ;

public class PMGLInvoiceProviderStub implements com.lansa.jsm.service.SOAPServerProviderStub, PMGLInvoiceProvider
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
        m_providerProperties.addReturnType ( "UPDATEINVOICE", new javax.xml.namespace.QName ( "http://www.w3.org/2001/XMLSchema", "string" ) ) ;
    }

    private com.lansa.jsm.service.SOAPServerParameter[] m_parameterArray = null ;

    /*
        Stub implementation
    */

    public final String getProviderMethods ()
    {
        return "updateInvoice" ;
    }

    public final Class[] getProviderClasses ()
    {
        return new Class[] { com.acme.service.soap.Invoices.class } ;
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

    public final String updateInvoice ( String processID, String caseID, Invoices[] invoice )
    {
        m_parameterArray = new com.lansa.jsm.service.SOAPServerParameter[3] ;

        m_parameterArray[0] = new com.lansa.jsm.service.SOAPServerParameter ( "PROCESSID", processID ) ;
        m_parameterArray[1] = new com.lansa.jsm.service.SOAPServerParameter ( "CASEID", caseID ) ;
        m_parameterArray[2] = new com.lansa.jsm.service.SOAPServerParameter ( "INVOICE", invoice ) ;

        return null ;
    }
}
