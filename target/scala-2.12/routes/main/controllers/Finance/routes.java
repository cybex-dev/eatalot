
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Sep 02 14:47:31 SAST 2017

package controllers.Finance;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.Finance.ReverseUserFinance UserFinance = new controllers.Finance.ReverseUserFinance(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.Finance.javascript.ReverseUserFinance UserFinance = new controllers.Finance.javascript.ReverseUserFinance(RoutesPrefix.byNamePrefix());
  }

}
