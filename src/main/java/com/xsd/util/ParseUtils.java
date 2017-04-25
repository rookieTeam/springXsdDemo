package com.xsd.util;

import java.util.HashMap;
import java.util.Map;

import com.xsd.net.connection.netty.NettyClient;

public class ParseUtils {
	private static Map<String, Class<?>> servers = new HashMap<String, Class<?>>();
	private static Map<String, Class<?>> clients = new HashMap<String, Class<?>>();
	private static Map<String, Class<?>> serializations = new HashMap<String, Class<?>>();
	static {
		clients.put("netty", NettyClient.class);
	}
}
