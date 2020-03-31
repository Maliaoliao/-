package redis.redisutil;

import redis.clients.jedis.Jedis;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-31 14:06
 **/
public class RedisUtils {

    private static Jedis jedis = new Jedis("127.0.0.1");

    public static Jedis getJedis() {
        return jedis;
    }

    public static String getValue(String key){
        jedis.exists(key);
        return jedis.get(key);
    }
}
