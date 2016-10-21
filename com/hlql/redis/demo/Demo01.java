package com.hlql.redis.demo;

import org.jredis.RedisException;
import org.jredis.ri.alphazero.JRedisClient;

public class Demo01 {

	public static void main(String[] args) throws RedisException {
		JRedisClient jedis = new JRedisClient();
		jedis.set("aaaaa", "bbbb");
		System.out.println(jedis.get("aaaaa").toString());
	}
}
