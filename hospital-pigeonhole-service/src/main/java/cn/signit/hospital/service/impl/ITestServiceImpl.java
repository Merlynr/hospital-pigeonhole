package cn.signit.hospital.service.impl;

import cn.signit.hospital.service.ITestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;

/**
 * 它服务impl
 *
 * @author merlynr
 * @className: ITestServiceImpl
 * @description: TODO 类描述
 * @author: Merlynr
 * @date: 2020/11/12
 * @date 2020/11/12
 */

@Service
public class ITestServiceImpl implements ITestService {

    private final Logger logger= Logger.getLogger(getClass());

    @Autowired
    private JedisPool jedisPool;

    public String testFunc(String value) {
        logger.info(value+"mmmmmmmmmmmmmmmmmmm");
        return jedisPool.getResource().set(value,value);
    }
}
