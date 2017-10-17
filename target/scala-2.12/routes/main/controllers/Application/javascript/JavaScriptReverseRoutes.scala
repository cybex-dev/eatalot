
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
<<<<<<< HEAD
// @DATE:Tue Oct 03 05:59:33 SAST 2017
=======
// @DATE:Tue Oct 17 20:48:49 SAST 2017
>>>>>>> Customer-Management

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

  
    // @LINE:8
    def unknown: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.HomeController.unknown",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unknown"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
<<<<<<< HEAD
=======
    // @LINE:202
    def invalidRoute: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.HomeController.invalidRoute",
      """
        function(path0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("path", path0)})
        }
      """
    )
  
    // @LINE:7
    def forbiddenAccess: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.HomeController.forbiddenAccess",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forbidden"})
        }
      """
    )
  
>>>>>>> Customer-Management
  }


}
