package cn.signit.hospitalpigeonholeapp.controller;

import cn.signit.hospital.service.ITestService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试复述,
 *
 * @author merlynr
 * @className: TestRedis
 * @description: TODO 类描述
 * @author: Merlynr
 * @date: 2020/11/12
 * @date 2020/11/12
 */

@RestController
public class TestRedis {

    @Autowired
    ITestService itestService;

    @GetMapping("/redis")
    public String helloWorld(@RequestParam(name = "key") String key){
        return itestService.testFunc(key);
    }
}
