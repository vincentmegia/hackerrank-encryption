package com.vincentmegia;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
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
