package redis;

import org.junit.Test;
import redis.clients.jedis.JedisCluster;
import redis.redisutil.RedisUtils;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-07 15:42
 **/
public class RedisTest {

    @Test
    public void test() {
        long l = System.currentTimeMillis();

        RedisUtils u = new RedisUtils();
        JedisCluster j = u.getCluster();
        j.set("123","123");
        long e = System.currentTimeMillis();
        System.out.println(e - l);
    }
}
