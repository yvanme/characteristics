package com.loong.stream;


import com.sun.webkit.Timer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class ParallelArrays {
    public static void main( String[] args ) {
        long[] arrayOfLong = new long [ 20000 ];

        Arrays.parallelSetAll( arrayOfLong,
                index -> ThreadLocalRandom.current().nextInt( 1000000 ) );
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach(
                i -> System.out.print( i + " " ) );
        System.out.println();

        Arrays.parallelSort( arrayOfLong );
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach(
                i -> System.out.print( i + " " ) );
        System.out.println("UUID:");
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        System.out.println(uuid.toString());


    }

}

