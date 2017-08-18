
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Fri Aug 18 19:03:52 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:15
package controllers.User {

  // @LINE:36
  class ReverseCustomerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Profile")
    }
  
    // @LINE:41
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register")
    }
  
    // @LINE:43
    def completeRegistration(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Registration/Completing")
    }
  
    // @LINE:37
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Register")
    }
  
    // @LINE:42
    def reverify(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Registration/Reverify")
    }
  
    // @LINE:44
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Profile")
    }
  
    // @LINE:36
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User")
    }
  
    // @LINE:38
    def verifyCustomer(token:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Verify/" + implicitly[play.api.mvc.PathBindable[String]].unbind("token", play.core.routing.dynamicString(token)))
    }
  
  }

  // @LINE:25
  class ReverseStaffController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Staff/Login")
    }
  
    // @LINE:27
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Staff/Logout")
    }
  
    // @LINE:25
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Staff")
    }
  
    // @LINE:26
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Staff/Login")
    }
  
  }

  // @LINE:15
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Login")
    }
  
    // @LINE:16
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Logout")
    }
  
    // @LINE:15
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Login")
    }
  
  }


}
