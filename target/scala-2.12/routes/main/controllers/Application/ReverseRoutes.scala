
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Wed Oct 18 00:03:01 SAST 2017

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

  
    // @LINE:8
    def unknown(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "unknown")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:202
    def invalidRoute(path:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + implicitly[play.api.mvc.PathBindable[String]].unbind("path", path))
    }
  
    // @LINE:7
    def forbiddenAccess(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "forbidden")
    }
  
  }


}
