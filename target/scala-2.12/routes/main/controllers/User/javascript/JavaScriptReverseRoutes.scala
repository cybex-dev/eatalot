
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Aug 05 21:16:56 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:14
package controllers.User.javascript {

  // @LINE:29
  class ReverseCustomerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAccountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def verify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AccountController.verify",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Verify/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:15
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AccountController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register"})
        }
      """
    )
  
    // @LINE:22
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AccountController.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Login"})
        }
      """
    )
  
    // @LINE:17
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AccountController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Logout"})
        }
      """
    )
  
    // @LINE:21
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AccountController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register"})
        }
      """
    )
  
    // @LINE:14
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AccountController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User"})
        }
      """
    )
  
    // @LINE:16
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AccountController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Login"})
        }
      """
    )
  
  }


}
