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
  <xsl:for-each select="/TaxAndShipChargesRequest/Order/Destination/Parts/Part">
    <xsl:call-template name="list-level-0"/>
  </xsl:for-each>
</rdml:list>

</rdml:function>

</xsl:template>

<xsl:template name="function-level">    <!-- /TaxAndShipChargesRequest -->
</xsl:template>

<xsl:template name="list-level-0">    <!-- /TaxAndShipChargesRequest/Order/Destination/Parts/Part -->

  <rdml:entry>
    <rdml:field name="XBINPART" value="{PartNumber}"/>
    <rdml:field name="XBSDORQT" value="{OrderQty}"/>
    <rdml:field name="XBSDSEPR" value="{UnitPrice}"/>
    <rdml:field name="XBSDSEAM" value="{ExtPrice}"/>
    <rdml:field name="XBSDLCAM" value="{LineCharge}"/>
    <rdml:field name="XBCOCN" value="{CostCenter}"/>
    <rdml:field name="XBOHUSER" value="{../../../User}"/>
    <rdml:field name="XBOHORDT" value="{../../../OrderDate}"/>
    <rdml:field name="XBRECNBR" value="{../../RecipientNumber}"/>
    <rdml:field name="XBSHNAME" value="{../../Name}"/>
    <rdml:field name="XBSHADR1" value="{../../Address1}"/>
    <rdml:field name="XBSHADR2" value="{../../Address2}"/>
    <rdml:field name="XBSHCITY" value="{../../City}"/>
    <rdml:field name="XBSHSTAT" value="{../../State}"/>
    <rdml:field name="XBSHZIPC" value="{../../PostalCode}"/>
    <rdml:field name="XBSHCOCD" value="{../../Country}"/>
    <rdml:field name="XBOHEMAD" value="{../../Email}"/>
    <rdml:field name="XBSHS1PH" value="{../../Phone}"/>
    <rdml:field name="XBSVCACD" value="{../../ShipVia}"/>
    <rdml:field name="XBOHSITE" value="{../../../../Site}"/>
    <rdml:field name="XBOHOCAM" value="{../../OrderCharge}"/>
  </rdml:entry>

</xsl:template>

</xsl:transform>
