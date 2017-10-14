
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Oct 14 13:03:12 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:52
package controllers.Order {

  // @LINE:68
  class ReverseMenuController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Menu")
    }
  
  }

  // @LINE:52
  class ReverseScheduleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def doAddOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/AddOrder")
    }
  
    // @LINE:158
    def scheduleJSRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/scheduleJSRoutes")
    }
  
    // @LINE:59
    def updateScheduleName(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/Edit")
    }
  
    // @LINE:62
    def clearSchedule(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/Clear")
    }
  
    // @LINE:57
    def removeOrder(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/Delete/" + implicitly[play.api.mvc.PathBindable[String]].unbind("orderId", play.core.routing.dynamicString(orderId)))
    }
  
    // @LINE:55
    def editScheduleName(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule/Edit")
    }
  
    // @LINE:54
    def addOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule/AddOrder")
    }
  
    // @LINE:53
    def createSchedule(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule/New")
    }
  
    // @LINE:60
    def doCreateSchedule(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/New")
    }
  
    // @LINE:58
    def setScheduleState(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/State")
    }
  
    // @LINE:52
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule")
    }
  
  }


}
