package annotations.Routing;

import annotations.CheckCSRF;
import play.mvc.With;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@With(CheckCSRF.class)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface NoneAllowed {
    Class<? extends NoneAllowedHandler> value() default NoneAllowedHandler.class;
}
