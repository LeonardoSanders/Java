package NivelIntermediario.Stack;

import java.util.Stack;

public class Aula01 {
    public static void main(String[] args) {
        Stack<String> ninjas = new Stack<>();
        ninjas.push("Naruto");
        ninjas.push("Sasuke");
        ninjas.push("Sakura");
        ninjas.push("Kakashi");

        System.out.println(ninjas);
        System.out.println(ninjas.pop());
        System.out.println(ninjas.peek());
    }
}
