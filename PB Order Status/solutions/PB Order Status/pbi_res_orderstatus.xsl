<?xml version="1.0" encoding="utf-8"?>

<!-- Outbound transformation created by LANSA Integrator XML Wizard -->

<xsl:transform version="1.0" exclude-result-prefixes="xalan rdml" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:rdml="http://www.lansa.com/2000/XML/Function" xmlns:xalan="http://xml.apache.org/xalan">

<xsl:output method="xml" omit-xml-declaration="no" indent="yes" xalan:indent-amount="0"/>

<xsl:template match="/">

<OrderStatusResponse>
    <Site><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='XBOHSITE']/@value"/></Site>
    <OrderNumber><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='XBOHNUMB']/@value"/></OrderNumber>
    <Status><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='WK_STATUS']/@value"/></Status>
    <ErrorMsg><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='WK_TXT01']/@value"/></ErrorMsg>
    <OrderStatusDetails>

        <xsl:for-each select="/rdml:function/rdml:list/rdml:entry">
            <OrderStatusDetail>
                <EcomNumber><xsl:value-of select="rdml:field[@name='SFNUMB']/@value"/></EcomNumber>
                <OrderDate><xsl:value-of select="rdml:field[@name='WK_DAT10A']/@value"/></OrderDate>
                <Status><xsl:value-of select="rdml:field[@name='WK_ACDESC']/@value"/></Status>
                <Tracking><xsl:value-of select="rdml:field[@name='OJTRNO']/@value"/></Tracking>
            </OrderStatusDetail>
        </xsl:for-each>

    </OrderStatusDetails>
</OrderStatusResponse>

</xsl:template>

</xsl:transform>
