package org.jackbraj.jni;

public class HelloWorldJNI {
    static {
        System.loadLibrary("native");
    }

    public static void main(String[] args) {
        new HelloWorldJNI().sayHello();
        System.out.println(new HelloWorldJNI().sumIntegers(3, 8));
        System.out.println(new HelloWorldJNI().sayHelloToMe("Jack", false));
    }

    private native void sayHello();

    private native long sumIntegers(int first, int second);

    private native String sayHelloToMe(String name, boolean isFemale);
}