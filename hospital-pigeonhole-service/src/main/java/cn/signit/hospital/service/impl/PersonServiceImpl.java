package cn.signit.hospital.service.impl;

import cn.signit.hospital.dao.PersonDao;
import cn.signit.hospital.po.Person;
import cn.signit.hospital.service.PersonService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 人服务impl
 *
 * @author merlynr
 * @className: PersonServiceImpl
 * @description: TODO 类描述
 * @author: Merlynr
 * @date: 2020/11/11
 * @date 2020/11/11
 */
@Service
public class PersonServiceImpl implements PersonService {

    private final Logger logger= Logger.getLogger(getClass());


//    TODO 配置完成依旧显示未注入的问题

    @Autowired
    private PersonDao personDao;

    /**
     * 通过id获取一个
     *
     * @param id id
     * @return {@link Person}
     */
    public Person getOneById(int id) {
        logger.info(id);
        logger.info(personDao.selectByPrimaryKey(id));
        return personDao.selectByPrimaryKey(id);
    }

    public void deleteById(int id) {
        logger.info("删除删除");
        personDao.deleteByPrimaryKey(id);
    }
}
