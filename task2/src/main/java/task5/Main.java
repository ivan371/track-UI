package task5;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        //Get class
        ExampleClass obj = new ExampleClass();
        Class<?> c = obj.getClass();

        //Get class methods
        Method[] methods = c.getMethods();

        //Get methods annotations
        Argument valueAnnotation = (Argument) methods[0].getDeclaredAnnotation(Argument.class);

        //Get value of annotation
        int number = valueAnnotation.value();
        for (int i = 1; i < number; ++i) {
            for (int j = 1; j < number; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}

