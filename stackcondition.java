import java.util.*;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> a1=new Stack<>();
        a1.push(5);
        a1.push(4);
        a1.push(9);
        a1.push(7);
        a1.push(3);
        a1.push(6);
        System.out.println("before the condition"+a1);
        Stack<Integer> a2=new Stack<>();
        for(Integer a3:a1){
            if(a3>=5){
                a2.push(a3);
            }
        }
        Collections.sort(a2);
        System.out.println("After the condition"+a2);
    }
}