<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Transaction</name>
   <tag></tag>
   <elementGuidId>1329a234-c4ca-4097-8b41-6d986a56e9ef</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n    \&quot;descriptions\&quot;:\&quot;Penukaran e-money 30.000\&quot;,\r\n    \&quot;points\&quot;:500,\r\n    \&quot;user\&quot;:{\r\n        \&quot;username\&quot;:\&quot;yusril-adr\&quot;\r\n    },\r\n    \&quot;category\&quot;:\&quot;e-money\&quot;,\r\n    \&quot;credentials\&quot;:\&quot;087854029394\&quot;,\r\n    \&quot;provider\&quot;:\&quot;Dana\&quot;,\r\n    \&quot;denom\&quot;: 30000,\r\n    \&quot;product\&quot;:{\r\n        \&quot;id\&quot;: 7\r\n    }\r\n}&quot;,
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
      <id>b35463c1-6a8e-46da-935e-c14e79ee20f2</id>
      <masked>false</masked>
      <name>serverUrl</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
