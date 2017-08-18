
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Fri Aug 18 19:03:52 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:51
package controllers.Order.javascript {

  // @LINE:59
  class ReverseKitchenController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/User"})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseMenuController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.MenuController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Menu"})
        }
      """
    )
  
  }


}
