/**
 * TaskListStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class TaskListStruct  implements java.io.Serializable {
    private java.lang.String guid;

    private java.lang.String name;

    private java.lang.String processId;

    private java.lang.String initialTask;

    public TaskListStruct() {
    }

    public TaskListStruct(
           java.lang.String guid,
           java.lang.String name,
           java.lang.String processId,
           java.lang.String initialTask) {
           this.guid = guid;
           this.name = name;
           this.processId = processId;
           this.initialTask = initialTask;
    }


    /**
     * Gets the guid value for this TaskListStruct.
     * 
     * @return guid
     */
    public java.lang.String getGuid() {
        return guid;
    }


    /**
     * Sets the guid value for this TaskListStruct.
     * 
     * @param guid
     */
    public void setGuid(java.lang.String guid) {
        this.guid = guid;
    }


    /**
     * Gets the name value for this TaskListStruct.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TaskListStruct.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the processId value for this TaskListStruct.
     * 
     * @return processId
     */
    public java.lang.String getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this TaskListStruct.
     * 
     * @param processId
     */
    public void setProcessId(java.lang.String processId) {
        this.processId = processId;
    }


    /**
     * Gets the initialTask value for this TaskListStruct.
     * 
     * @return initialTask
     */
    public java.lang.String getInitialTask() {
        return initialTask;
    }


    /**
     * Sets the initialTask value for this TaskListStruct.
     * 
     * @param initialTask
     */
    public void setInitialTask(java.lang.String initialTask) {
        this.initialTask = initialTask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskListStruct)) return false;
        TaskListStruct other = (TaskListStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.guid==null && other.getGuid()==null) || 
             (this.guid!=null &&
              this.guid.equals(other.getGuid()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.processId==null && other.getProcessId()==null) || 
             (this.processId!=null &&
              this.processId.equals(other.getProcessId()))) &&
            ((this.initialTask==null && other.getInitialTask()==null) || 
             (this.initialTask!=null &&
              this.initialTask.equals(other.getInitialTask())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGuid() != null) {
            _hashCode += getGuid().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProcessId() != null) {
            _hashCode += getProcessId().hashCode();
        }
        if (getInitialTask() != null) {
            _hashCode += getInitialTask().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskListStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", "taskListStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "guid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "processId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialTask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "initialTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
