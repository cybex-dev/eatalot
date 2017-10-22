package annotations.Routing;

import annotations.CheckCSRF;
import play.mvc.With;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@With(CheckCSRF.class)
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface NoneAllowed {
    Class<? extends NoneAllowedHandler> value() default NoneAllowedHandler.class;
}