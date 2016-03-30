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

<xsl:template name="function-level">    <!-- /CurrencyRequest -->
</xsl:template>

</xsl:transform>
