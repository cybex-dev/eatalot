
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Oct 08 23:34:50 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:53
package controllers.Order {

  // @LINE:78
  class ReverseKitchenController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/User")
    }
  
  }

  // @LINE:70
  class ReverseMenuController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Menu")
    }
  
  }

  // @LINE:53
  class ReverseScheduleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def doAddOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/AddOrder")
    }
  
    // @LINE:60
    def updateScheduleName(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/Edit")
    }
  
    // @LINE:63
    def clearSchedule(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/Clear")
    }
  
    // @LINE:58
    def removeOrder(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/Delete/" + implicitly[play.api.mvc.PathBindable[String]].unbind("orderId", play.core.routing.dynamicString(orderId)))
    }
  
    // @LINE:56
    def editScheduleName(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule/Edit")
    }
  
    // @LINE:55
    def addOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule/AddOrder")
    }
  
    // @LINE:54
    def createSchedule(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule/New")
    }
  
    // @LINE:61
    def doCreateSchedule(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/New")
    }
  
    // @LINE:59
    def setScheduleState(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/State")
    }
  
    // @LINE:53
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule")
    }
  
  }


}
