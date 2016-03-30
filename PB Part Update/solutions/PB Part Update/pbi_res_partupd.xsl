<?xml version="1.0" encoding="utf-8"?>

<!-- Outbound transformation created by LANSA Integrator XML Wizard -->

<xsl:transform version="1.0" exclude-result-prefixes="xalan rdml" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:rdml="http://www.lansa.com/2000/XML/Function" xmlns:xalan="http://xml.apache.org/xalan">

<xsl:output method="xml" omit-xml-declaration="no" indent="yes" xalan:indent-amount="0"/>

<xsl:template match="/">

<PartsInformationResponse>
    <Site><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='XBOHSITE']/@value"/></Site>
    <Status><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='WK_STATUS']/@value"/></Status>
    <ErrorMsg><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='WK_TXT01']/@value"/></ErrorMsg>
    <Parts>

        <xsl:for-each select="/rdml:function/rdml:list/rdml:entry">
            <Part>
                <PartNumber><xsl:value-of select="rdml:field[@name='BNPART']/@value"/></PartNumber>
                <PartDesc><xsl:value-of select="rdml:field[@name='INDESC']/@value"/></PartDesc>
                <Revision><xsl:value-of select="rdml:field[@name='BN01DS']/@value"/></Revision>
                <QtyAllocated><xsl:value-of select="rdml:field[@name='INALQT']/@value"/></QtyAllocated>
                <QtyOnHand><xsl:value-of select="rdml:field[@name='INOHQT']/@value"/></QtyOnHand>
                <QryAvailable><xsl:value-of select="rdml:field[@name='WK_QTY1']/@value"/></QryAvailable>
            </Part>
        </xsl:for-each>

    </Parts>
</PartsInformationResponse>

</xsl:template>

</xsl:transform>
