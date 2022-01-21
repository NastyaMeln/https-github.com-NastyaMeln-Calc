
package calc;

import static calc.Operators.isOperator;
import static calc.Romans.isRomans;
import static calc.Romans.getValue;
import java.util.Scanner;

        
public class Calc {

    public static void main(String[] args) throws Exception {
    Scanner scanner=new Scanner(System.in);
   String [] elements=scanner.nextLine().split(" ");//считываем строку ввода, получаем массив из элементов, разделенных пробелом
   if(elements.length!=3){
       throw new Exception ("wrong arount elements!");
   }  else{
       if(isOperator(elements[1])){//если операция из перечисления
           if((isRomans(elements[0]))&&(isRomans(elements[2]))){ //и первый и третий элементы -  римская цифра
            int a=Romans.getNumber(elements[0]);
            int b=Romans.getNumber(elements[2]);
 String operator=elements[1]; 
            switch(operator){
            case "+":
                System.out.println(Romans.getVolue((a + b)));
                break;
            case "-": 
                System.out.println(Romans.getVolue((a - b)));
               break;
            case "*":
                System.out.println(Romans.getVolue((a * b)));
                break;
            case "/":
                System.out.println(Romans.getVolue(a / b));
                break;            
        } 
           }else{
            int a=Integer.parseInt(elements[0]);
            int b=Integer.parseInt(elements[2]);
       String operator=elements[1]; 
       if( a > 0 && a <=10){
           if(b > 0 && b <= 10){
            switch(operator){
            case "+":
                System.out.println(a + b);
                break;
            case "-": 
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(Math.round(a / b));
                break;
            }
} else{ throw new Exception ("wrong arount elements!");
    }  
}
    }
}
   }
    }
}
    