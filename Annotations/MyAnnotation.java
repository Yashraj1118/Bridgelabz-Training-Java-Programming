package AdvanceJava.Annotations;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target({
        ElementType.TYPE,         // class
        ElementType.FIELD,        // field
        ElementType.METHOD,       // method
        ElementType.CONSTRUCTOR   // constructor
})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    String value() default "Default Value dgea..";
    int age() default 0;
}