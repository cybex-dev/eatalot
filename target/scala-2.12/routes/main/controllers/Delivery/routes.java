
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Thu Oct 12 01:28:03 SAST 2017

package controllers.Delivery;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.Delivery.ReverseDeliveryController DeliveryController = new controllers.Delivery.ReverseDeliveryController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.Delivery.javascript.ReverseDeliveryController DeliveryController = new controllers.Delivery.javascript.ReverseDeliveryController(RoutesPrefix.byNamePrefix());
  }

}