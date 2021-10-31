package day02;

import org.w3c.dom.ls.LSOutput;

public class MathematicsMain {
    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.isPrime(0));
        System.out.println(mathematics.isPrime(1));
        System.out.println(mathematics.isPrime(2));
        System.out.println(mathematics.isPrime(3));
        System.out.println(mathematics.isPrime(4));
        System.out.println(mathematics.isPrime(5));
        System.out.println(mathematics.isPrime(6));
        System.out.println(mathematics.isPrime(7));
        System.out.println(mathematics.isPrime(139));
        System.out.println(mathematics.isPrime(197));
        System.out.println(mathematics.isPrime(198));
    }
}
