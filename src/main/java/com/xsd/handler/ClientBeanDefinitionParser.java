package com.xsd.handler;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class ClientBeanDefinitionParser implements BeanDefinitionParser {

	public BeanDefinition parse(Element element, ParserContext parserContext) {
		String id = element.getAttribute("id");
        String type = element.getAttribute("type");
        String inter = element.getAttribute("interface");
        int timeout = Integer.parseInt(element.getAttribute("timeout"));
        boolean async = Boolean.parseBoolean(element.getAttribute("async"));
        int port = Integer.parseInt(element.getAttribute("port"));
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setLazyInit(false);
        beanDefinition.setBeanClass(ReferenceBean.class);
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.add("id",id);
        propertyValues.add("type",type);
        propertyValues.add("interfaceClass",inter);
        propertyValues.add("timeout",timeout);
        propertyValues.add("async",async);
        propertyValues.add("port",port);
        propertyValues.add("client","com.xsd.net.connection.netty.NettyClient");
        beanDefinition.setPropertyValues(propertyValues); 
		return beanDefinition;
	}

}
