
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Documents/project/goaway/eatalot-master/conf/routes
// @DATE:Thu Oct 05 23:12:55 SAST 2017

package controllers.Order;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.Order.ReverseKitchenController KitchenController = new controllers.Order.ReverseKitchenController(RoutesPrefix.byNamePrefix());
  public static final controllers.Order.ReverseMenuController MenuController = new controllers.Order.ReverseMenuController(RoutesPrefix.byNamePrefix());
  public static final controllers.Order.ReverseOrderController OrderController = new controllers.Order.ReverseOrderController(RoutesPrefix.byNamePrefix());
  public static final controllers.Order.ReverseAccountController AccountController = new controllers.Order.ReverseAccountController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.Order.javascript.ReverseKitchenController KitchenController = new controllers.Order.javascript.ReverseKitchenController(RoutesPrefix.byNamePrefix());
    public static final controllers.Order.javascript.ReverseMenuController MenuController = new controllers.Order.javascript.ReverseMenuController(RoutesPrefix.byNamePrefix());
    public static final controllers.Order.javascript.ReverseOrderController OrderController = new controllers.Order.javascript.ReverseOrderController(RoutesPrefix.byNamePrefix());
    public static final controllers.Order.javascript.ReverseAccountController AccountController = new controllers.Order.javascript.ReverseAccountController(RoutesPrefix.byNamePrefix());
  }

}
