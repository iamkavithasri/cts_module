import java.lang.reflect.*;

public class ReflectionDemo {
    public void hello(String name) {
        System.out.println("Hello, " + name);
    }
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectionDemo");
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods)
            System.out.println("Method: " + m.getName());
        Method hello = cls.getDeclaredMethod("hello", String.class);
        hello.invoke(obj, "World");
    }
}

