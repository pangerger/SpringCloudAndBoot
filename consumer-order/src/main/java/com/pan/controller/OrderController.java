package com.pan.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.pan.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    /**
     * Spring 提供的获取rest接口的模板对象
     */
    @Autowired
    private RestTemplate restTemplate;

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    @Value("${user.url}")
    private String url;

    /**
     * 访问另一个微服务，获取数据
     *
     * @param id
     * @return
     */
    @GetMapping("/order/get/{id}")
    public User getOderById(@PathVariable Long id) {
//        String url="http://localhost:7900/user/";
        // 通过访问 rest得到的对象
        // 通过寻找服务的方式
        InstanceInfo nextServerFromEureka = eurekaClient.getNextServerFromEureka("provider-user", false);
        String homePageUrl = nextServerFromEureka.getHomePageUrl();
        User user = restTemplate.getForObject(homePageUrl+"/user/" + id, User.class);
        return user;
    }
}
