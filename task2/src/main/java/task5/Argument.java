package task5;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Annotation
@Retention(value=RetentionPolicy.RUNTIME)
//We can apply annotation only for methods
@Target(ElementType.METHOD)
public @interface Argument {
    int value();
}

