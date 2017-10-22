
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Desktop/eatalot/eatalot/conf/routes
// @DATE:Sun Oct 22 14:40:06 SAST 2017

package controllers.User;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.User.ReverseAdminController AdminController = new controllers.User.ReverseAdminController(RoutesPrefix.byNamePrefix());
  public static final controllers.User.ReverseCustomerController CustomerController = new controllers.User.ReverseCustomerController(RoutesPrefix.byNamePrefix());
  public static final controllers.User.ReverseDeliveryStaffController DeliveryStaffController = new controllers.User.ReverseDeliveryStaffController(RoutesPrefix.byNamePrefix());
  public static final controllers.User.ReverseKitchenStaffController KitchenStaffController = new controllers.User.ReverseKitchenStaffController(RoutesPrefix.byNamePrefix());
  public static final controllers.User.ReverseUserController UserController = new controllers.User.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.User.javascript.ReverseAdminController AdminController = new controllers.User.javascript.ReverseAdminController(RoutesPrefix.byNamePrefix());
    public static final controllers.User.javascript.ReverseCustomerController CustomerController = new controllers.User.javascript.ReverseCustomerController(RoutesPrefix.byNamePrefix());
    public static final controllers.User.javascript.ReverseDeliveryStaffController DeliveryStaffController = new controllers.User.javascript.ReverseDeliveryStaffController(RoutesPrefix.byNamePrefix());
    public static final controllers.User.javascript.ReverseKitchenStaffController KitchenStaffController = new controllers.User.javascript.ReverseKitchenStaffController(RoutesPrefix.byNamePrefix());
    public static final controllers.User.javascript.ReverseUserController UserController = new controllers.User.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}
