
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Fri Oct 06 21:38:00 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:52
package controllers.Order.javascript {

  // @LINE:73
  class ReverseKitchenController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/User"})
        }
      """
    )
  
  }

  // @LINE:65
  class ReverseMenuController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.MenuController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Menu"})
        }
      """
    )
  
  }

  // @LINE:52
  class ReverseScheduleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def doAddOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.doAddOrder",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/AddOrder"})
        }
      """
    )
  
    // @LINE:58
    def clearSchedule: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.clearSchedule",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/Clear"})
        }
      """
    )
  
    // @LINE:54
    def addOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.addOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/AddOrder"})
        }
      """
    )
  
    // @LINE:53
    def createSchedule: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.createSchedule",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/New"})
        }
      """
    )
  
    // @LINE:56
    def doCreateSchedule: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.doCreateSchedule",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/New"})
        }
      """
    )
  
    // @LINE:52
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule"})
        }
      """
    )
  
  }


}
