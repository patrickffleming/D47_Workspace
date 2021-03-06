/**
 * MLQEmployeeServerProviderStub.java
 *
 * This file was generated by LANSA Integrator SOAP Server Wizard
 */
package com.lansa.SOAPServer.mlqtutorial ;

public class MLQEmployeeServerProviderStub implements com.lansa.jsm.service.SOAPServerProviderStub, MLQEmployeeServerProvider
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
        m_providerProperties.addReturnType ( "MLQGETEMPLOYEES", new javax.xml.namespace.QName ( "http://mlqtutorial.SOAPServer.lansa.com", "EMPLOYEE" ) ) ;
    }

    private com.lansa.jsm.service.SOAPServerParameter[] m_parameterArray = null ;

    /*
        Stub implementation
    */

    public final String getProviderMethods ()
    {
        return "MLQGetEmployees" ;
    }

    public final Class[] getProviderClasses ()
    {
        return new Class[] { com.lansa.SOAPServer.mlqtutorial.EMPLOYEE.class } ;
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

    public final EMPLOYEE[] MLQGetEmployees ( String departmentCode, String sectionCode )
    {
        m_parameterArray = new com.lansa.jsm.service.SOAPServerParameter[2] ;

        m_parameterArray[0] = new com.lansa.jsm.service.SOAPServerParameter ( "DEPARTMENTCODE", departmentCode ) ;
        m_parameterArray[1] = new com.lansa.jsm.service.SOAPServerParameter ( "SECTIONCODE", sectionCode ) ;

        return null ;
    }
}
