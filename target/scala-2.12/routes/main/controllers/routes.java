
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/eatalot-temp/conf/routes
// @DATE:Sat Oct 21 09:12:55 SAST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
