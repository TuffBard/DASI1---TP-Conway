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
        String number = "112";
        int n = 45;
        String res = getNNext(n,number);
        System.out.println(res);
    }
    
    public static String getNext(String term)
    {
        int current;
        int count = 0;
        String result ="";
        
        int[] nbterm = new int[term.length()];
        for(int i = 0;i<term.length();i++)
        {
            nbterm[i] = Character.getNumericValue(term.charAt(i));
        }
        
        if(term.length() > 0){
            current = nbterm[0];
            count++;
        }
        else {
            return null;
        }
        for(int i = 1;i < term.length();i++)
        {
            if(current == nbterm[i])
                count++;
            else{
                result += String.valueOf(count);
                result += current;
                count = 1;
                current = nbterm[i];
            }
        }
        result += String.valueOf(count);
        result += current;
        return result;
    }
    
    public static String getNNext(int n,String term)
    {
        for(int i=0;i<n;i++)
            term = getNext(term);
        return term;
    }
}
