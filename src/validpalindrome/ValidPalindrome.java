/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validpalindrome;

import java.util.Stack;

/**
 *
 * @author Ande404
 */
public class ValidPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String test = "mom";
        
        System.out.println(isPalindrome(test));
    }
    
    private static boolean isPalindrome(String s) {

        if(s.isEmpty()) 
            return true;
        
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        int left = 0;
        int right = s.length()-1;
        
        while (left < right) {
            if(s.charAt(left) != s.charAt(right))
                return false;
            ++left;
            --right;
        }
        
        return true;
            
        
        
        
    }
    
}
