package com.loong.interfaces;

import java.util.concurrent.Callable;
import java.util.function.*;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-09-17 17:50
 **/
public class DemoTest{
    public static void main(String[] arg) throws Exception {

        //类似于消费者 需要传入参数，不返回
        Consumer<String> c = (e)-> System.out.println(e);
        //bi = binary 二元的意思 即有两个参数的消费者
        BiConsumer<String,Integer> bc = (e, e2)-> System.out.println(e+e2);
        c.accept("zsq");
        bc.accept("zsq",22);


        //类似于生产者 不需要传入参数，但有返回值
        Supplier<String> s = ()-> {return "zsq";};
        System.out.println(s.get());
//Callable是concurent包的接口
        Callable<String> ca = ()->{return "zsq333";};
        System.out.println(ca.call());

        //function 有输入有输出
        Function<Integer, Boolean> f = (t)->t>3;
        BiFunction<Integer, Integer, Boolean> bf = (e1, e2)->e1+e2>4;
        System.out.println(f.apply(4));
        System.out.println(bf.apply(4,4));


        //Predicate 判断函数，接受参数 经过判断后 返回判断值
        Predicate<String> p = (e)->e.equals("null");
        BiPredicate<Integer, Integer> bp = (e1,e2)->e1==e2;
        System.out.println(p.test("null"));
        System.out.println(bp.test(3,4));
    }
}

