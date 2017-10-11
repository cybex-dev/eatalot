
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Thu Oct 12 01:28:03 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:85
package controllers.Delivery {

  // @LINE:85
  class ReverseDeliveryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:85
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/User")
    }
  
  }


}
