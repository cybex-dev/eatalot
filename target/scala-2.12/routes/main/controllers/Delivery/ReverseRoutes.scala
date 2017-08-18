
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Fri Aug 18 19:03:52 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:67
package controllers.Delivery {

  // @LINE:67
  class ReverseDeliveryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:67
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/User")
    }
  
  }


}
