/**
 * EMPLOYEE.java
 *
 * This file was generated by LANSA Integrator SOAP Server Wizard
 */
package com.lansa.SOAPServer.mlqtutorial ;

public class EMPLOYEE implements java.io.Serializable
{
    private String employeeID ;
    private String firstName ;
    private String lastName ;
    private Double salary ;

    /**
     * Sets the employeeID value for this EMPLOYEE.
     *
     * @param employeeID
     */
    public void setEmployeeID ( String employeeID )
    {
        this.employeeID = employeeID ;
    }

    /**
     * Gets the employeeID value for this EMPLOYEE.
     *
     * @return employeeID
     */
    public String getEmployeeID ()
    {
        return employeeID ;
    }

    /**
     * Sets the firstName value for this EMPLOYEE.
     *
     * @param firstName
     */
    public void setFirstName ( String firstName )
    {
        this.firstName = firstName ;
    }

    /**
     * Gets the firstName value for this EMPLOYEE.
     *
     * @return firstName
     */
    public String getFirstName ()
    {
        return firstName ;
    }

    /**
     * Sets the lastName value for this EMPLOYEE.
     *
     * @param lastName
     */
    public void setLastName ( String lastName )
    {
        this.lastName = lastName ;
    }

    /**
     * Gets the lastName value for this EMPLOYEE.
     *
     * @return lastName
     */
    public String getLastName ()
    {
        return lastName ;
    }

    /**
     * Sets the salary value for this EMPLOYEE.
     *
     * @param salary
     */
    public void setSalary ( Double salary )
    {
        this.salary = salary ;
    }

    /**
     * Gets the salary value for this EMPLOYEE.
     *
     * @return salary
     */
    public Double getSalary ()
    {
        return salary ;
    }

    /*
        Apache Axis Meta-Data
    */

    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc ( EMPLOYEE.class, true ) ; 

    static
    {
        typeDesc.setXmlType ( new javax.xml.namespace.QName ( "http://mlqtutorial.SOAPServer.lansa.com", "EMPLOYEE" ) ) ;

        org.apache.axis.description.ElementDesc elemField = null ;

        elemField = new org.apache.axis.description.ElementDesc () ;
        elemField.setFieldName ( "employeeID" ) ;
        elemField.setXmlName ( new javax.xml.namespace.QName ( "http://mlqtutorial.SOAPServer.lansa.com", "employeeID" ) ) ;
        elemField.setXmlType ( new javax.xml.namespace.QName ( "http://www.w3.org/2001/XMLSchema", "string" ) ) ;
        elemField.setNillable ( true ) ;
        typeDesc.addFieldDesc ( elemField ) ;

        elemField = new org.apache.axis.description.ElementDesc () ;
        elemField.setFieldName ( "firstName" ) ;
        elemField.setXmlName ( new javax.xml.namespace.QName ( "http://mlqtutorial.SOAPServer.lansa.com", "firstName" ) ) ;
        elemField.setXmlType ( new javax.xml.namespace.QName ( "http://www.w3.org/2001/XMLSchema", "string" ) ) ;
        elemField.setNillable ( true ) ;
        typeDesc.addFieldDesc ( elemField ) ;

        elemField = new org.apache.axis.description.ElementDesc () ;
        elemField.setFieldName ( "lastName" ) ;
        elemField.setXmlName ( new javax.xml.namespace.QName ( "http://mlqtutorial.SOAPServer.lansa.com", "lastName" ) ) ;
        elemField.setXmlType ( new javax.xml.namespace.QName ( "http://www.w3.org/2001/XMLSchema", "string" ) ) ;
        elemField.setNillable ( true ) ;
        typeDesc.addFieldDesc ( elemField ) ;

        elemField = new org.apache.axis.description.ElementDesc () ;
        elemField.setFieldName ( "salary" ) ;
        elemField.setXmlName ( new javax.xml.namespace.QName ( "http://mlqtutorial.SOAPServer.lansa.com", "salary" ) ) ;
        elemField.setXmlType ( new javax.xml.namespace.QName ( "http://www.w3.org/2001/XMLSchema", "double" ) ) ;
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