
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Mon Oct 23 01:02:05 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:249
package controllers {

  // @LINE:249
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:249
    def versioned(file:Asset): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:249
        case (file)  =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
          Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
      
      }
    
    }
  
  }


}
