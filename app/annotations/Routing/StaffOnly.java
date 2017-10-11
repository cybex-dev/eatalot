package annotations.Routing;

import annotations.CheckCSRF;
import play.mvc.With;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@With(CheckCSRF.class)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface StaffOnly {
    Class<? extends KitchenStaffOnlyHandler> value() default KitchenStaffOnlyHandler.class;
}
