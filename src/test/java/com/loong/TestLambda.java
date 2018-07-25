package com.loong;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestLambda {

    /**
     * 该方法用于测试列表遍历
     */
    @Test
    public void testList(){

        List<User> userList=new ArrayList();
        userList.add(new User("user1","1@qq.com","上海浦东"));
        userList.add(new User("user2","2@qq.com","上海浦东"));
        userList.add(new User("user3","3@qq.com","上海浦东"));
        userList.add(new User("user4","4@qq.com","上海浦东"));
        userList.add(new User("user5","5@qq.com","上海浦东"));
        userList.add(new User("user6","6@qq.com","上海浦东"));

        //1、只遍历用户名称
        //userList.forEach(user -> System.out.println(user.getName()));
        userList.forEach(System.out::println);
        //2、遍历用户信息
//        userList.forEach(user -> {
//            String infomation = "名称："+user.getName()+" 邮箱："+user.getEmail()
//                    +"地址："+user.getAddress();
//            System.out.println(infomation);
//        });
    }
}
