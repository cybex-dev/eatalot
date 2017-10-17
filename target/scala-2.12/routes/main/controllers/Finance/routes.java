
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Tue Oct 17 20:48:49 SAST 2017

package controllers.Finance;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.Finance.ReverseUserFinance UserFinance = new controllers.Finance.ReverseUserFinance(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.Finance.javascript.ReverseUserFinance UserFinance = new controllers.Finance.javascript.ReverseUserFinance(RoutesPrefix.byNamePrefix());
  }

}
