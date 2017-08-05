
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Aug 05 21:16:56 SAST 2017

package controllers.User;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.User.ReverseCustomerController CustomerController = new controllers.User.ReverseCustomerController(RoutesPrefix.byNamePrefix());
  public static final controllers.User.ReverseAccountController AccountController = new controllers.User.ReverseAccountController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.User.javascript.ReverseCustomerController CustomerController = new controllers.User.javascript.ReverseCustomerController(RoutesPrefix.byNamePrefix());
    public static final controllers.User.javascript.ReverseAccountController AccountController = new controllers.User.javascript.ReverseAccountController(RoutesPrefix.byNamePrefix());
  }

}
