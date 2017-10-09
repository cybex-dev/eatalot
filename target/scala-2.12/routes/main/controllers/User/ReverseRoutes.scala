
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Oct 08 23:34:50 SAST 2017

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

  
    // @LINE:41
    def paymentHistory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Purchases")
    }
  
    // @LINE:39
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Profile")
    }
  
    // @LINE:45
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register")
    }
  
    // @LINE:43
    def viewPayment(paymentId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Payment/" + implicitly[play.api.mvc.PathBindable[String]].unbind("paymentId", play.core.routing.dynamicString(paymentId)))
    }
  
    // @LINE:40
    def orderHistory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Orders")
    }
  
    // @LINE:42
    def viewOrder(orderId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Order/" + implicitly[play.api.mvc.PathBindable[String]].unbind("orderId", play.core.routing.dynamicString(orderId)))
    }
  
    // @LINE:47
    def completeRegistration(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register/Completing")
    }
  
    // @LINE:37
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Register")
    }
  
    // @LINE:46
    def reverify(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register/Reverify")
    }
  
    // @LINE:48
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Profile")
    }
  
    // @LINE:36
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Dashboard")
    }
  
    // @LINE:38
    def verifyCustomer(token:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Verify/" + implicitly[play.api.mvc.PathBindable[String]].unbind("token", play.core.routing.dynamicString(token)))
    }
  
    // @LINE:49
    def activeOrders(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/ActiveOrders")
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
