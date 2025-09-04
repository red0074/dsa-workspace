package day4.collections.stacks;

import java.util.*;
public class StackCollection {
    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(11);
        st.push(12);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
