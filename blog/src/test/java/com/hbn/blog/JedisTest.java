package com.hbn.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class JedisTest {
    public static Logger logger = LoggerFactory.getLogger(Jedis.class);
    public static void main(String[] args) {
        String masterName = "mymaster";
        Set<String> sentinels = new HashSet<>();
        sentinels.add("192.168.48.131:26379");
        sentinels.add("192.168.48.131:26380");
        sentinels.add("192.168.48.131:26381");
        JedisSentinelPool jedisSentinelPool = new JedisSentinelPool(masterName, sentinels, new JedisPoolConfig());
         int count=0;
        while (true) {
            count++;
            Jedis jedis=null;
            try {
                jedis=jedisSentinelPool.getResource();
                int index = new Random().nextInt(100000);
                String key = "k-" + index;
                String val = "v-" + index;
                jedis.set(key, val);
                if (count % 100==0) {
                    logger.info("{} value is {}",key ,jedis.get(key));
                    System.out.println("=====================");
                }
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (Exception e) {
                logger.info("抛出异常了",e);
            } finally {
                jedis.close();

            }
        }
    }
}
