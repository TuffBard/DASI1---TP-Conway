/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conway;

/**
 *
 * @author Administrateur
 */
public class Conway {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String number = "11";
        String res = getNext(number);
        System.out.println(res);
        
    }
    
    public static String getNext(String term)
    {
        char current;
        int count = 0;
        String result ="";
        
        if(term.length() > 0){
            current = term.charAt(0);
            count++;
        }
        else {
            return null;
        }
        for(int i = 1;i < term.length();i++)
        {
            if(current == term.charAt(i))
                count++;
            else{
                result += String.valueOf(count);
                result += current;
                count = 1;
                current = term.charAt(i);
            }
        }
        result += String.valueOf(count);
        result += current;
        return result;
    }
    
}
