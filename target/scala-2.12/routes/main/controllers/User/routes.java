
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Sep 24 23:41:08 SAST 2017

package controllers.User;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.User.ReverseCustomerController CustomerController = new controllers.User.ReverseCustomerController(RoutesPrefix.byNamePrefix());
  public static final controllers.User.ReverseStaffController StaffController = new controllers.User.ReverseStaffController(RoutesPrefix.byNamePrefix());
  public static final controllers.User.ReverseUserController UserController = new controllers.User.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.User.javascript.ReverseCustomerController CustomerController = new controllers.User.javascript.ReverseCustomerController(RoutesPrefix.byNamePrefix());
    public static final controllers.User.javascript.ReverseStaffController StaffController = new controllers.User.javascript.ReverseStaffController(RoutesPrefix.byNamePrefix());
    public static final controllers.User.javascript.ReverseUserController UserController = new controllers.User.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}
