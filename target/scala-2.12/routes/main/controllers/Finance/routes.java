
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Oct 22 04:28:34 SAST 2017

package controllers.Finance;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.Finance.ReverseUserFinanceController UserFinanceController = new controllers.Finance.ReverseUserFinanceController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.Finance.javascript.ReverseUserFinanceController UserFinanceController = new controllers.Finance.javascript.ReverseUserFinanceController(RoutesPrefix.byNamePrefix());
  }

}
