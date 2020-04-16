package redis.redisutil;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-31 14:06
 **/
public class RedisUtils {

    private JedisCluster cluster;

    public JedisCluster getCluster() {
        return cluster;
    }

    public void setCluster(JedisCluster cluster) {
        this.cluster = cluster;
    }

    public RedisUtils(){
        if(cluster == null){
            System.out.println("非空");
            JedisPoolConfig poolConfig = new JedisPoolConfig();
            // 最大连接数
            poolConfig.setMaxTotal(1);
            // 最大空闲数
            poolConfig.setMaxIdle(1);
            // 最大允许等待时间，如果超过这个时间还未获取到连接，则会报JedisException异常：
            // Could not get a resource from the pool
            poolConfig.setMaxWaitMillis(1000);
            Set<HostAndPort> nodes = new LinkedHashSet<HostAndPort>();
            nodes.add(new HostAndPort("127.0.0.1", 7000));
            nodes.add(new HostAndPort("127.0.0.1", 7001));
            nodes.add(new HostAndPort("127.0.0.1", 7002));
            nodes.add(new HostAndPort("127.0.0.1", 7003));
            nodes.add(new HostAndPort("127.0.0.1", 7004));
            nodes.add(new HostAndPort("127.0.0.1", 7005));
            this.cluster =  new JedisCluster(nodes, 5000, 5000, 5, "mall", poolConfig);
        }
        System.out.println("不为空！");
    }

}
