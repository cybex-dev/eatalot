
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Oct 08 23:34:50 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:86
package controllers.Delivery {

  // @LINE:86
  class ReverseDeliveryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:86
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/User")
    }
  
  }


}
