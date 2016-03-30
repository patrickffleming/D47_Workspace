<?xml version="1.0" encoding="utf-8"?>

<!-- Outbound transformation created by LANSA Integrator XML Wizard -->

<xsl:transform version="1.0" exclude-result-prefixes="xalan rdml" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:rdml="http://www.lansa.com/2000/XML/Function" xmlns:xalan="http://xml.apache.org/xalan">

<xsl:output method="xml" omit-xml-declaration="no" indent="yes" xalan:indent-amount="0"/>

<xsl:template match="/">

<TaxAndShipChargesResponse>
    <Site><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='XBOHSITE']/@value"/></Site>
    <Status><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='WK_STATUS']/@value"/></Status>
    <ErrorMsg><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='WK_TXT01']/@value"/></ErrorMsg>
    <Order>
        <User><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='XBOHUSER']/@value"/></User>
        <OrderDate><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='XBOHDATE']/@value"/></OrderDate>

        <xsl:for-each select="/rdml:function/rdml:list/rdml:entry">
            <Destination>
                <RecipientNumber><xsl:value-of select="rdml:field[@name='XBRECNBR']/@value"/></RecipientNumber>
                <ShipVia><xsl:value-of select="rdml:field[@name='XBSVCACD']/@value"/></ShipVia>
                <ShippingAmount><xsl:value-of select="rdml:field[@name='XBOHSHAM']/@value"/></ShippingAmount>
                <ShippingMessage><xsl:value-of select="rdml:field[@name='XBOHSHMG']/@value"/></ShippingMessage>
                <TaxAmount><xsl:value-of select="rdml:field[@name='XBOHTXAM']/@value"/></TaxAmount>
                <TaxMessage><xsl:value-of select="rdml:field[@name='XBOHTXMG']/@value"/></TaxMessage>
            </Destination>
        </xsl:for-each>

    </Order>
</TaxAndShipChargesResponse>

</xsl:template>

</xsl:transform>
