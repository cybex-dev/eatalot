
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Oct 14 13:03:12 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:52
package controllers.Order.javascript {

  // @LINE:68
  class ReverseMenuController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
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

  
    // @LINE:61
    def doAddOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.doAddOrder",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/AddOrder"})
        }
      """
    )
  
    // @LINE:158
    def scheduleJSRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.scheduleJSRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/scheduleJSRoutes"})
        }
      """
    )
  
    // @LINE:59
    def updateScheduleName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.updateScheduleName",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/Edit"})
        }
      """
    )
  
    // @LINE:62
    def clearSchedule: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.clearSchedule",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/Clear"})
        }
      """
    )
  
    // @LINE:57
    def removeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.removeOrder",
      """
        function(orderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/Delete/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("orderId", encodeURIComponent(orderId0))})
        }
      """
    )
  
    // @LINE:55
    def editScheduleName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.editScheduleName",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/Edit"})
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
  
    // @LINE:60
    def doCreateSchedule: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.doCreateSchedule",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/New"})
        }
      """
    )
  
    // @LINE:58
    def setScheduleState: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.setScheduleState",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/State"})
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
