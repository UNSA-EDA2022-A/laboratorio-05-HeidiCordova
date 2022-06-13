package com.example.project;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.existenDuplicados(s));
        }
    }

    public boolean existenDuplicados(String str) {
        MyStack<Character> stack = new LinkedListStack<>();
        char[] str1 = str.toCharArray();// almacena cadena en char
        for (char chAr : str1) {

            if (chAr == ')') {
                char pop1 = stack.pop();
                int cont = 0;

                while (pop1 != '(') {
                    cont++;
                    pop1 = stack.pop();
                }

                if (cont < 1) {
                    return true;
                }
            }

            else {
                stack.push(chAr);
            }
        }

        return false;
    }
}
