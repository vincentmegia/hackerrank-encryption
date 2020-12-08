package com.vincentmegia;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        var start = LocalTime.now();
        for (var i = 0; i < 1000000; i++) {
//            System.out.println("i: " + i);
        }
        var end = LocalTime.now();
        var diff = Duration.between(start, end);
        System.out.println(diff.toNanos());
    }

    static String encryption(String s) {
        var noSpace = s.replace(" ", "");
        var squared = Math.sqrt(noSpace.length());
        var rows = (squared % 1 == 0) ? (int)(squared - 1) : (int)Math.floor(squared);
        var columns = (int)Math.ceil(squared);
        var result = "";
        for (var i = 0; i <= rows; i++) {
            var j = i;
            while (j < noSpace.length()) {
                result += noSpace.substring(j, j + 1);
                j += columns;
            }
            result += " ";
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }
}
