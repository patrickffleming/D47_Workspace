/**
 * Invoices.java
 *
 * This file was generated by LANSA Integrator SOAP Server Wizard
 */
package com.acme.service.soap ;

public class Invoices implements java.io.Serializable
{
    private Integer control ;

    /**
     * Sets the control value for this Invoices.
     *
     * @param control
     */
    public void setControl ( Integer control )
    {
        this.control = control ;
    }

    /**
     * Gets the control value for this Invoices.
     *
     * @return control
     */
    public Integer getControl ()
    {
        return control ;
    }

    /*
        Apache Axis Meta-Data
    */

    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc ( Invoices.class, true ) ; 

    static
    {
        typeDesc.setXmlType ( new javax.xml.namespace.QName ( "http://soap.service.acme.com", "Invoices" ) ) ;

        org.apache.axis.description.ElementDesc elemField = null ;

        elemField = new org.apache.axis.description.ElementDesc () ;
        elemField.setFieldName ( "control" ) ;
        elemField.setXmlName ( new javax.xml.namespace.QName ( "http://soap.service.acme.com", "control" ) ) ;
        elemField.setXmlType ( new javax.xml.namespace.QName ( "http://www.w3.org/2001/XMLSchema", "int" ) ) ;
        elemField.setMinOccurs ( 0 ) ;
        elemField.setNillable ( true ) ;
        typeDesc.addFieldDesc ( elemField ) ;
    }

    public static org.apache.axis.description.TypeDesc getTypeDesc ()
    {
        return typeDesc ;
    }

    public static org.apache.axis.encoding.Serializer getSerializer ( java.lang.String _mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType )
    {
        return new org.apache.axis.encoding.ser.BeanSerializer ( _javaType, _xmlType, typeDesc ) ;
    }

    public static org.apache.axis.encoding.Deserializer getDeserializer ( java.lang.String _mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType )
    {
        return new org.apache.axis.encoding.ser.BeanDeserializer ( _javaType, _xmlType, typeDesc ) ;
    }
}
