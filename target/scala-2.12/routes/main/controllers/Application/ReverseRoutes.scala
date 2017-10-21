
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Oct 22 04:28:34 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.Application {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def contactUs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ContactUs")
    }
  
    // @LINE:262
    def invalidRoute(path:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + implicitly[play.api.mvc.PathBindable[String]].unbind("path", path))
    }
  
    // @LINE:8
    def forbiddenAccess(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Forbidden")
    }
  
    // @LINE:9
    def unknown(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Unknown")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
