<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Payment</name>
   <tag></tag>
   <elementGuidId>48875a29-657c-4816-b9dd-68839591ebd7</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n    \&quot;name\&quot;:\&quot;aku\&quot;,\r\n    \&quot;provider\&quot;:\&quot;DANA\&quot;,\r\n    \&quot;credentials\&quot;:\&quot;081234567890\&quot;,\r\n    \&quot;price\&quot;:50000\r\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <katalonVersion>8.2.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${serverUrl}/v1/payment/</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.serverUrl</defaultValue>
      <description></description>
      <id>1f2ac32e-9e5f-4d9b-9b3c-0c7a3aa6db4b</id>
      <masked>false</masked>
      <name>serverUrl</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
