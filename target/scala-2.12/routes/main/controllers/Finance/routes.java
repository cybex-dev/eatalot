
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Desktop/eatalot/eatalot/conf/routes
// @DATE:Sun Oct 22 13:11:41 SAST 2017

package controllers.Finance;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.Finance.ReverseUserFinanceController UserFinanceController = new controllers.Finance.ReverseUserFinanceController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.Finance.javascript.ReverseUserFinanceController UserFinanceController = new controllers.Finance.javascript.ReverseUserFinanceController(RoutesPrefix.byNamePrefix());
  }

}
