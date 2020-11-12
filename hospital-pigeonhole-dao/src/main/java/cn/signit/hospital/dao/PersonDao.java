package cn.signit.hospital.dao;

import cn.signit.hospital.po.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * 人刀
 *
 * @author merlynr
 * @date 2020/11/11
 */
@Mapper
public interface PersonDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}