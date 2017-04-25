package com.xsd.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class NamespaceHandler extends NamespaceHandlerSupport {

	public void init() {
		registerBeanDefinitionParser("client", new ClientBeanDefinitionParser());
	}
    
}
