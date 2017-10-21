
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/eatalot-temp/conf/routes
// @DATE:Sat Oct 21 09:12:55 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:144
package controllers {

  // @LINE:144
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:144
    def versioned(file:Asset): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:144
        case (file)  =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
          Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
      
      }
    
    }
  
  }


}
