
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Documents/project/goaway/eatalot-master/conf/routes
// @DATE:Thu Oct 05 23:12:55 SAST 2017

package controllers.Finance;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.Finance.ReverseUserFinance UserFinance = new controllers.Finance.ReverseUserFinance(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.Finance.javascript.ReverseUserFinance UserFinance = new controllers.Finance.javascript.ReverseUserFinance(RoutesPrefix.byNamePrefix());
  }

}
