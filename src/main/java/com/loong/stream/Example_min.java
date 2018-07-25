package com.loong.stream;

import java.util.List;

public class Example_min {
    public static void main(String[] args) {

        List<Person> javaProgrammers =Constant.javaProgrammers;
        /**
         * 未加min限制条件之前
         */
        javaProgrammers.forEach(System.out::println);
        System.out.println("------------------------------------------");
        /**
         * 加min限制条件之后
         */
        Person person = javaProgrammers.stream().min((p1,p2) -> (p1.getAge()-p2.getAge())).get();
        System.out.println(person.getFirstName()+":"+person.getAge());
    }
}
