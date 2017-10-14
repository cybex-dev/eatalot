
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Oct 14 13:03:12 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:123
package controllers.Finance.javascript {

  // @LINE:123
  class ReverseUserFinance(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:125
    def doAddFunds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Finance.UserFinance.doAddFunds",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/AddFunds"})
        }
      """
    )
  
    // @LINE:123
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
