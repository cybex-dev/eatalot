
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Thu Oct 12 01:28:03 SAST 2017

package controllers.Application;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.Application.ReverseHomeController HomeController = new controllers.Application.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.Application.javascript.ReverseHomeController HomeController = new controllers.Application.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}