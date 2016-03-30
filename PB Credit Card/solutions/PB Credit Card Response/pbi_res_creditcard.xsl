<?xml version="1.0" encoding="utf-8"?>

<!-- Outbound transformation created by LANSA Integrator XML Wizard -->

<xsl:transform version="1.0" exclude-result-prefixes="xalan rdml" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:rdml="http://www.lansa.com/2000/XML/Function" xmlns:xalan="http://xml.apache.org/xalan">

<xsl:output method="xml" omit-xml-declaration="no" indent="yes" xalan:indent-amount="0"/>

<xsl:template match="/">

<ccAuth>
    <site><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='XBOHSITE']/@value"/></site>
    <crosstrioUser><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='XBOHUSER']/@value"/></crosstrioUser>
    <RequestDateTime><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='XBOHRQDT']/@value"/></RequestDateTime>
    <ResponseDateTime><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='XBOHRSDT']/@value"/></ResponseDateTime>
    <AuthID><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='XBAUTHID']/@value"/></AuthID>
    <AuthMsg><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='XBAUTHMG']/@value"/></AuthMsg>
</ccAuth>

</xsl:template>

</xsl:transform>
