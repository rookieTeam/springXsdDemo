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
	private String host; // Զ������ip
	private String port;  // �˿ں�
	private String timeout; // ��ȡ��ʱʱ��
	private String type; // ��Ϣ����
	private Class interfaceClass; // ����ӿ�
	private boolean async; // trueΪ�첽�� falseΪͬ��
	private boolean seqInherit; // trueΪ�ӵ�ǰ�̼̳߳���ˮ�ţ�false�����µ���ˮ��
	private boolean receipt; // true��Ҫ��ִ��false����Ҫ
	private Class<?> clientImpl; // �ͻ���ʵ����
	private Class<?> serializerImpl; // ���л���ʵ����

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
