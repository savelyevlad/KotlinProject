package javaClasses;

import mainPackage.DispatcherKt;

public class PublicStaticObjects {

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void start() {
        int a = DispatcherKt.getA();
        int b = DispatcherKt.getB();

        System.out.println(a + " " + b);
    }
}
