package com.xsd.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SuppressWarnings("rawtypes")
public class ReferenceBean<T> implements FactoryBean, ApplicationContextAware, InitializingBean, DisposableBean {

	private static final Logger LOG = LoggerFactory.getLogger(ReferenceBean.class);

	private String id;
	private String host; // 远程主机ip
	private String port;  // 端口号
	private String timeout; // 读取超时时间
	private String type; // 消息类型
	private Class interfaceClass; // 服务接口
	private boolean async; // true为异步， false为同步
	private boolean seqInherit; // true为从当前线程继承流水号，false生成新的流水号
	private boolean receipt; // true需要回执，false不需要
	private Class<?> clientImpl; // 客户端实现类
	private Class<?> serializerImpl; // 序列化的实现类

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Class getInterfaceClass() {
		return interfaceClass;
	}

	public void setInterfaceClass(Class interfaceClass) {
		this.interfaceClass = interfaceClass;
	}

	public boolean isAsync() {
		return async;
	}

	public void setAsync(boolean async) {
		this.async = async;
	}

	public boolean isSeqInherit() {
		return seqInherit;
	}

	public void setSeqInherit(boolean seqInherit) {
		this.seqInherit = seqInherit;
	}
	
	public boolean isRecipt() {
		return receipt;
	}
	
	public void setReceipt(boolean receipt) {
		this.receipt = receipt;
	}

	public Class<?> getClient() {
		return clientImpl;
	}

	public void setClient(Class<?> client) {
		clientImpl = client;
	}

	public Class<?> getSerialization() {
		return serializerImpl;
	}

	public void setSerialization(Class<?> serialization) {
		serializerImpl = serialization;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	public Object getObject() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Class getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
