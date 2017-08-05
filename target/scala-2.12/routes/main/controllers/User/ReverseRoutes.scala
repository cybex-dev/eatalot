
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Aug 05 21:16:56 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:14
package controllers.User {

  // @LINE:29
  class ReverseCustomerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User")
    }
  
  }

  // @LINE:14
  class ReverseAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def verify(token:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Verify/" + implicitly[play.api.mvc.PathBindable[String]].unbind("token", play.core.routing.dynamicString(token)))
    }
  
    // @LINE:15
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Register")
    }
  
    // @LINE:22
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Login")
    }
  
    // @LINE:17
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Logout")
    }
  
    // @LINE:21
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register")
    }
  
    // @LINE:14
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User")
    }
  
    // @LINE:16
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Login")
    }
  
  }


}
