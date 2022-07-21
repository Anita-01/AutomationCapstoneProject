<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Shopping Transaction</name>
   <tag></tag>
   <elementGuidId>d4b169db-2056-4221-b747-86f9e2ff584d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n    \&quot;descriptions\&quot;: \&quot;Belanja di Tokopedia\&quot;,\r\n    \&quot;status\&quot;: \&quot;Success\&quot;,\r\n    \&quot;points\&quot;: 50000,\r\n    \&quot;user\&quot;:{\r\n        \&quot;username\&quot;:\&quot;yusril-adr\&quot;\r\n    },\r\n    \&quot;category\&quot;: \&quot;shopping\&quot;,\r\n    \&quot;denom\&quot;: 5000000,\r\n    \&quot;credentials\&quot;: \&quot;\&quot;,\r\n    \&quot;provider\&quot;: \&quot;Tokopedia\&quot;\r\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <katalonVersion>8.2.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${serverUrl}/v1/transaction/new</restUrl>
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
      <id>82e4f895-b2a9-4dda-ba66-6f884621fb2b</id>
      <masked>false</masked>
      <name>serverUrl</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
