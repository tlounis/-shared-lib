package com.oxiane.jenkins.lib
import java.net.URL
import java.net.InetAddress
class IpRetriever {
 static def getMainAddress(String sUrl) {
 def url = new URL(sUrl)
 def local = InetAddress.getByName(url.getHost())
 return local.getHostAddress()
 }
}
