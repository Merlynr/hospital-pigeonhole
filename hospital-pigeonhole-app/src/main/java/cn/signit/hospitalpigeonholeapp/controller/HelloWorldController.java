package cn.signit.hospitalpigeonholeapp.controller;

import cn.signit.hospital.po.Person;
import cn.signit.hospital.service.PersonService;
import cn.signit.hospital.utils.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello world控制器
 *
 * @author merlynr
 * @className: HelloWorldController
 * @description: TODO 类描述
 * @author: Merlynr
 * @date: 2020/11/11
 * @date 2020/11/11
 */

@RestController
public class HelloWorldController {

    @Autowired
    private PersonService personService;

    /**
     * 你好
     *
     * @return {@link String}
     */
    @GetMapping("/api/hello")
    public String hello(){
        LogUtil.info(this.getClass(),"HHHHHHHH");
        return "Hello ";
    }

    /**
     * 通过id获取钞票p
     *
     * @param id id
     * @return {@link Person}
     */
    @GetMapping("/person/{id}")
    public Person getOneyById(@PathVariable("id") int id){
        LogUtil.info(this.getClass(),"用户ID:"+id);
        return personService.getOneById(id);
    }

    @GetMapping("delete/{id}")
    public void deletePersonById(@PathVariable("id") int id){
        personService.deleteById(id);
    }
}
