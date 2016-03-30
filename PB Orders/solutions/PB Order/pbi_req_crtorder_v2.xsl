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
  <xsl:for-each select="/OrderInfo/Order/Destination/Parts/Part">
    <xsl:call-template name="list-level-0"/>
  </xsl:for-each>
</rdml:list>

</rdml:function>

</xsl:template>

<xsl:template name="function-level">    <!-- /OrderInfo -->
</xsl:template>

<xsl:template name="list-level-0">    <!-- /OrderInfo/Order/Destination/Parts/Part -->

  <rdml:entry>
    <rdml:field name="XBINPART" value="{PartNumber}"/>
    <rdml:field name="XBSDORQT" value="{OrderQty}"/>
    <rdml:field name="XBOHSITE" value="{../../../../Site}"/>
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
    <rdml:field name="XBSHINST" value="{../../ShipInstructions}"/>
    <rdml:field name="XBOHNUMB" value="{../../../OrderNumber}"/>
    <rdml:field name="XBOHORDT" value="{../../../OrderDate}"/>
    <rdml:field name="XBOHUSER" value="{../../../User}"/>
    <rdml:field name="XBOHROLE" value="{../../../Role}"/>
    <rdml:field name="XBPAYTYP" value="{../../../PaymentType}"/>
    <rdml:field name="XBAUTHID" value="{../../../AuthID}"/>
    <rdml:field name="XBOHOCAM" value="{../../OrderCharge}"/>
    <rdml:field name="XBOHSHAM" value="{../../ShippingAmount}"/>
    <rdml:field name="XBOHSHMG" value="{../../ShippingMessage}"/>
    <rdml:field name="XBOHTXAM" value="{../../TaxAmount}"/>
    <rdml:field name="XBOHTXMG" value="{../../TaxMessage}"/>
    <rdml:field name="XBSDSEPR" value="{UnitPrice}"/>
    <rdml:field name="XBSDSEAM" value="{ExtPrice}"/>
    <rdml:field name="XBSDLCAM" value="{LineCharge}"/>
    <rdml:field name="XBINCOCN" value="{CostCenter}"/>
    <rdml:field name="XBSFCACT" value="{../../ShipViaAccount}"/>
    <rdml:field name="XBDEPART" value="{DestItemNo}"/>
    <rdml:field name="XBCONAME" value="{../../Company}"/>
    <rdml:field name="XBOHEMA1" value="{../../AdditionalEmailAddress1}"/>
    <rdml:field name="XBOHEMA2" value="{../../AdditionalEmailAddress2}"/>
    <rdml:field name="XBOHEMA3" value="{../../AdditionalEmailAddress3}"/>
    <rdml:field name="XBOHEMA4" value="{../../AdditionalEmailAddress4}"/>
    <rdml:field name="XBEBEMAD" value="{EBookEmail}"/>
  </rdml:entry>

</xsl:template>

</xsl:transform>
