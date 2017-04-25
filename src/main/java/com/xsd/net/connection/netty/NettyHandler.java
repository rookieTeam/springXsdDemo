package com.xsd.net.connection.netty;

/**
 * 用于处理NettyClient接收到的消息�?
 * @author liuyonghua
 *
 */
public interface NettyHandler {
	/**
	 * 处理接收到的数据
	 * @param receiveData
	 */
	public void handle(byte[] receiveData);
	
	/**
	 * 处理异常
	 * @param t
	 */
	public void handle(Throwable t);
}
