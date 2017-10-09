
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Oct 08 23:34:50 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:94
package controllers.Finance.javascript {

  // @LINE:94
  class ReverseUserFinance(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:96
    def doAddFunds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Finance.UserFinance.doAddFunds",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/AddFunds"})
        }
      """
    )
  
    // @LINE:94
    def addFunds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Finance.UserFinance.addFunds",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/AddFunds"})
        }
      """
    )
  
  }


}
