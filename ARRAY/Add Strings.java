//You are given two non-negative integers, ‘NUM1’ and ‘NUM2’, in the form of strings. Return the sum of both strings
/*Let ‘NUM1’ be: “5”
Let ‘NUM2’ be: “21”
The sum of both numbers will be: “26”.*/

//code:

import java.util.* ;
import java.io.*; 

public class Solution {

	public static String stringConcatenation(String num1, String num2) {
		// Write your code here.
		 long a=Long.parseLong(num1);
		 long b=Long.parseLong(num2);
	     long c=a+b;
        String s=String.valueOf(c);

		return s;
	}

}
