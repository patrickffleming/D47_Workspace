<?xml version="1.0" encoding="utf-8"?>

<!-- Outbound transformation created by LANSA Integrator XML Wizard -->

<xsl:transform version="1.0" exclude-result-prefixes="xalan rdml" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:rdml="http://www.lansa.com/2000/XML/Function" xmlns:xalan="http://xml.apache.org/xalan">

<xsl:output method="xml" omit-xml-declaration="no" indent="yes" xalan:indent-amount="0"/>

<xsl:template match="/">

<CurrencyResponse>
    <Status><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='WK_STATUS']/@value"/></Status>
    <ErrorMsg><xsl:value-of select="/rdml:function/rdml:fields/rdml:field[@name='WK_TXT01']/@value"/></ErrorMsg>
    <Currencies>

        <xsl:for-each select="/rdml:function/rdml:list/rdml:entry">
            <Currency>
                <CurrencyCode><xsl:value-of select="rdml:field[@name='FSCUCD']/@value"/></CurrencyCode>
                <CurrencyDescription><xsl:value-of select="rdml:field[@name='FSDESC']/@value"/></CurrencyDescription>
                <ExchangeRate><xsl:value-of select="rdml:field[@name='FTCURT']/@value"/></ExchangeRate>
                <ExchangeRateDate><xsl:value-of select="rdml:field[@name='WK_DAT10A']/@value"/></ExchangeRateDate>
            </Currency>
        </xsl:for-each>

    </Currencies>
</CurrencyResponse>

</xsl:template>

</xsl:transform>
