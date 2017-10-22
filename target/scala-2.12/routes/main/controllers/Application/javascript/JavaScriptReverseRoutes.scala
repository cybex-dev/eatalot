
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Desktop/eatalot/eatalot/conf/routes
// @DATE:Sun Oct 22 14:40:06 SAST 2017

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

  
    // @LINE:7
    def contactUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.HomeController.contactUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ContactUs"})
        }
      """
    )
  
    // @LINE:262
    def invalidRoute: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.HomeController.invalidRoute",
      """
        function(path0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("path", path0)})
        }
      """
    )
  
    // @LINE:8
    def forbiddenAccess: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.HomeController.forbiddenAccess",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Forbidden"})
        }
      """
    )
  
    // @LINE:9
    def unknown: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.HomeController.unknown",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Unknown"})
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
  
  }


}
