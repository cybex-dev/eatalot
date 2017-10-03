
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
<<<<<<< HEAD
// @DATE:Sun Sep 24 23:41:08 SAST 2017
=======
// @DATE:Tue Oct 03 04:34:55 SAST 2017
>>>>>>> Order-Management-Devel

package controllers;

import router.RoutesPrefix;

public class routes {
  
<<<<<<< HEAD
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCountController CountController = new controllers.ReverseCountController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAsyncController AsyncController = new controllers.ReverseAsyncController(RoutesPrefix.byNamePrefix());
=======
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
>>>>>>> Order-Management-Devel
  public static final controllers.ReverseOrderController OrderController = new controllers.ReverseOrderController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAccountController AccountController = new controllers.ReverseAccountController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
<<<<<<< HEAD
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCountController CountController = new controllers.javascript.ReverseCountController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAsyncController AsyncController = new controllers.javascript.ReverseAsyncController(RoutesPrefix.byNamePrefix());
=======
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
>>>>>>> Order-Management-Devel
    public static final controllers.javascript.ReverseOrderController OrderController = new controllers.javascript.ReverseOrderController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAccountController AccountController = new controllers.javascript.ReverseAccountController(RoutesPrefix.byNamePrefix());
  }

}
