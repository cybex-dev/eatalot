
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Fri Oct 13 07:57:43 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:114
package controllers.Finance.javascript {

  // @LINE:114
  class ReverseUserFinance(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:116
    def doAddFunds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Finance.UserFinance.doAddFunds",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/AddFunds"})
        }
      """
    )
  
    // @LINE:114
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
