package com.loong.supplier;

import org.junit.Test;

import java.util.function.Supplier;

public class SupplierTest {
    @Test
    public void test(){
        Supplier<String> supplier = ()->new String("supplier test");
        String text = supplier.get();
        System.out.println(text);
    }
}
