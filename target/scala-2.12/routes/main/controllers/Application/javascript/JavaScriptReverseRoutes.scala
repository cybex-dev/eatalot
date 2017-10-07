
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/conf/routes
// @DATE:Sat Oct 07 12:59:41 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.Application.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:144
    def invalidRoute: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.HomeController.invalidRoute",
      """
        function(path0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("path", path0)})
        }
      """
    )
  
  }


}
