#Simple JNI Example

An example of how we can call native OS library's methods using Java Native Interface.

## To Run on Mac

- Clone the repository
- `javac -h .  org/jackbraj/jni/HelloWorldJNI.java`
- `g++ -c -fPIC -I${JAVA_HOME}/include/ -I${JAVA_HOME}/include/darwin ./org_jackbraj_jni_HelloWorldJNI.cpp`
- `g++ -dynamiclib -o libnative.dylib org_jackbraj_jni_HelloWorldJNI.o -lc`
- `java   -Djava.library.path="/Users/jackbraj/Documents/Projects/jni-test/" org.jackbraj.jni.HelloWorldJNI`