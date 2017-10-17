
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
<<<<<<< HEAD
// @DATE:Tue Oct 03 05:59:33 SAST 2017
=======
// @DATE:Tue Oct 17 20:48:49 SAST 2017
>>>>>>> Customer-Management

package controllers.Order;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.Order.ReverseMenuController MenuController = new controllers.Order.ReverseMenuController(RoutesPrefix.byNamePrefix());
  public static final controllers.Order.ReverseScheduleController ScheduleController = new controllers.Order.ReverseScheduleController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.Order.javascript.ReverseMenuController MenuController = new controllers.Order.javascript.ReverseMenuController(RoutesPrefix.byNamePrefix());
    public static final controllers.Order.javascript.ReverseScheduleController ScheduleController = new controllers.Order.javascript.ReverseScheduleController(RoutesPrefix.byNamePrefix());
  }

}
