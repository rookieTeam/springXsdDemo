package com.xsd.net.connection.netty;

import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;
import org.jboss.netty.util.HashedWheelTimer;
import org.jboss.netty.util.Timer;

/**
 * NettyClient，基于Netty实现的客户端，由于netty采用的是事件驱动机制来获取返回结果，
 * �?��该类提供了setNettyHandler(NettyHandler)方法, 将由NettyHandler处理接收到的数据�?
 * 若没有设置NettyHandler，将采用默认的生成返回结果的NettyHandler，这时刻通过read()方法读取返回信息�?
 * 若设置了NettyHandler�?将调用NettyHandler对接收到的数据进行处理，这时不能再�?过read()方法读取返回信息�?
 * 建议设置NettyHandler来对接收的消息进行处理�?
 * @author liuyonghua
 *
 */
public class NettyClient {
	private static ChannelFactory factory = new NioClientSocketChannelFactory(
		Executors.newCachedThreadPool(), Executors.newCachedThreadPool());
	private ClientBootstrap bootstrap;
	private Channel channel;
	private NettyHandler nettyHandler;
	private Timer timer = new HashedWheelTimer();
	static{
		System.out.println("执行了");
	}
}
