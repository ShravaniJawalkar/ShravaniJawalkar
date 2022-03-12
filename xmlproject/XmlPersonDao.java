package com.example.demo.xmlproject;

//import org.springframework.beans.factory.annotation.Autowired;

public class XmlPersonDao {
	private XmlChildConnection xmlChildConnection;
	private XmlConstructorInjection xmlConstructorInjection;

	public XmlPersonDao() {System.out.println("---person dao----");}

	public XmlChildConnection getXmlChildConnection() {
		return xmlChildConnection;
	}

	public void setXmlChildConnection(XmlChildConnection xmlChildConnection) {
		this.xmlChildConnection = xmlChildConnection;}
	
//	S

	public XmlConstructorInjection getXmlConstructorInjection() {
		return xmlConstructorInjection;
	}

	public void setXmlConstructorInjection(XmlConstructorInjection xmlConstructorInjection) {
		this.xmlConstructorInjection = xmlConstructorInjection;
	}
}
