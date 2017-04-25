package com.xsd.net.connection.netty;

import java.io.IOException;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;


public class NettyWriter {
	private Channel channel;
	
	public NettyWriter(Channel channel) {
		this.channel = channel;
	}

	public void write(byte[] dataPacket) throws IOException {
		ChannelBuffer buffer = ChannelBuffers.buffer(dataPacket.length);
		buffer.writeBytes(dataPacket);
		channel.write(buffer);
	}

	public void close() {
		channel.close();
	}
}
