
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Mon Oct 23 01:02:05 SAST 2017

package controllers.Finance;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.Finance.ReverseUserFinanceController UserFinanceController = new controllers.Finance.ReverseUserFinanceController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.Finance.javascript.ReverseUserFinanceController UserFinanceController = new controllers.Finance.javascript.ReverseUserFinanceController(RoutesPrefix.byNamePrefix());
  }

}
