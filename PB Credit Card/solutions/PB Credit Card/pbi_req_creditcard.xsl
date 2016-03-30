<?xml version="1.0" encoding="utf-8"?>

<!-- Inbound transformation created by LANSA Integrator XML Wizard -->

<xsl:transform version="1.0" exclude-result-prefixes="xalan" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:rdml="http://www.lansa.com/2000/XML/Function" xmlns:xalan="http://xml.apache.org/xalan">

<xsl:output method="xml" indent="yes" xalan:indent-amount="0"/>

<xsl:template match="/">

<rdml:function>

<rdml:fields>
  <xsl:call-template name="function-level"/>
</rdml:fields>

<rdml:list>
</rdml:list>

</rdml:function>

</xsl:template>

<xsl:template name="function-level">    <!-- /ccInfo -->
  <rdml:field name="XBOHSITE" value="{/ccInfo/site}"/>
  <rdml:field name="XBOHUSER" value="{/ccInfo/crosstrioUser}"/>
  <rdml:field name="XBOHRQDT" value="{/ccInfo/DateTime}"/>
  <rdml:field name="XBCCCRNO" value="{/ccInfo/ccNumber}"/>
  <rdml:field name="XBCDTYCD" value="{/ccInfo/ccType}"/>
  <rdml:field name="XBCCEXMO" value="{/ccInfo/ccExpMonth}"/>
  <rdml:field name="XBCCEXYR" value="{/ccInfo/ccExpYear}"/>
  <rdml:field name="XBCJNAME" value="{/ccInfo/ccName}"/>
  <rdml:field name="XBCJADR1" value="{/ccInfo/ccAddr1}"/>
  <rdml:field name="XBCJADR2" value="{/ccInfo/ccAddr2}"/>
  <rdml:field name="XBCJCITY" value="{/ccInfo/ccCity}"/>
  <rdml:field name="XBCJSTAT" value="{/ccInfo/ccState}"/>
  <rdml:field name="XBZCZIPC" value="{/ccInfo/ccZip}"/>
  <rdml:field name="XBCTCOCD" value="{/ccInfo/ccCountry}"/>
  <rdml:field name="XBCJMEAM" value="{/ccInfo/PaymentAmount}"/>
</xsl:template>

</xsl:transform>
