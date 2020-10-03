/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardinput;
import java.util.Stack;


public class StandardInput {
    
     static final String leftbraces= "(";
    static final String rightbraces= ")";
    static final String space= " ";
    static final String mult= "*";
    static final String add= "+";
    static final String sub= "-";
    String data;
    
    
    public String getStandardInput (String data) {
        
        this.data=data;
        
        Stack<String> opStack = new Stack();
        Stack<String> expStack = new Stack();
        
        for(int i=0;i<data.length();i++) {
            
            String s=Character.toString(data.charAt(i));
            
            if (s.equals(mult)
                    || s.equals(add)
                    || s.equals(sub)) {
                opStack.push(s);
            }
            else if (s.equals(rightbraces)) {
                String operandMostRecent = expStack.pop();
                String operandSecondMostRecent = expStack.pop();
                String operation = opStack.pop();
                //Build subexpression with left and right parentheses and operation, e.g. ( ( 3 - 4 ) * ( 5 - 6 ) )
                String infixSubExpression = leftbraces
                        + space
                        + operandSecondMostRecent
                        + space
                        + operation
                        + space
                        + operandMostRecent
                        + space
                        + s;
                expStack.push(infixSubExpression);
            }
            else {
                expStack.push(s);
            }
        }
        
        System.out.println(expStack.pop());
        
        return null;
        
    
    
    }
            

    public static void main(String [] args) {
        
        String data="1+2)*3-4)*5-6)))";
        
        StandardInput a=new StandardInput();
        a.getStandardInput(data);
        
        
    }

 

 

}
 
   
