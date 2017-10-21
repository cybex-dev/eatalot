
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Oct 21 11:02:12 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:135
package controllers.Finance.javascript {

  // @LINE:135
  class ReverseUserFinance(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:137
    def doAddFunds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Finance.UserFinance.doAddFunds",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/AddFunds"})
        }
      """
    )
  
    // @LINE:135
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
