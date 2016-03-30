<?xml version="1.0" encoding="utf-8"?>

<!-- Outbound transformation created by LANSA Integrator XML Wizard -->

<xsl:transform version="1.0" exclude-result-prefixes="xalan rdml" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:rdml="http://www.lansa.com/2000/XML/Function" xmlns:xalan="http://xml.apache.org/xalan">

<xsl:output method="xml" omit-xml-declaration="no" indent="yes" xalan:indent-amount="0"/>

<xsl:template match="/">

<OrderResponse>
    <Status><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='WK_STATUS']/@value"/></Status>
    <ErrorMsg><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='WK_TXT01']/@value"/></ErrorMsg>
</OrderResponse>

</xsl:template>

</xsl:transform>
