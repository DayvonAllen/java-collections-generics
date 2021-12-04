package sort;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// this annotation can be detected at runtime
@Retention(RetentionPolicy.RUNTIME)
// means this annotation can be used on methods
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    public String authorName();
}
