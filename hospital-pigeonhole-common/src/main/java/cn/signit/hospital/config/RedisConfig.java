package cn.signit.hospital.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 复述,配置
 *
 * @author merlynr
 * @date 2020/11/12
 */
@Component
@PropertySource("classpath:redis.properties")
public class RedisConfig {
    private Logger log = LoggerFactory.getLogger(RedisConfig.class);

    @Value("${redis.server.host:#{'127.0.0.1' }}")
    private String host;

    @Value("${redis.server.port:#{6379}}")
    private int port;

    @Value("${redis.server.password:#{123456}}")
    private String password;


    @Bean
    public JedisPoolConfig getRedisConfig() {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        return poolConfig;
    }




    @Bean
    public JedisPool getJedisPool() {
        JedisPoolConfig config = getRedisConfig();
        JedisPool pool = new JedisPool(config,host,port,2000,password);
        log.info("init JredisPool ...");
        return pool;
    }

}