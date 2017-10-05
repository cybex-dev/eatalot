
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Documents/project/goaway/eatalot-master/conf/routes
// @DATE:Thu Oct 05 23:12:55 SAST 2017

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
