
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Desktop/eatalot/eatalot/conf/routes
// @DATE:Sun Oct 22 14:40:06 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:56
package controllers.Order.javascript {

  // @LINE:192
  class ReverseKitchenController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:208
    def getOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getOrderPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/customerorders"})
        }
      """
    )
  
    // @LINE:210
    def getPendingOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getPendingOrderPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/pendingorders"})
        }
      """
    )
  
    // @LINE:220
    def doOrderCancellation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.doOrderCancellation",
      """
        function(orderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/customerorders/mealorder/docancel" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderId", orderId0)])})
        }
      """
    )
  
    // @LINE:196
    def getIngredientPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getIngredientPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredients"})
        }
      """
    )
  
    // @LINE:218
    def getCancelOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getCancelOrderPage",
      """
        function(orderId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/customerorders/mealorder/cancel" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderId", orderId0)])})
        }
      """
    )
  
    // @LINE:202
    def getNewIngredientPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getNewIngredientPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredient/ordernew"})
        }
      """
    )
  
    // @LINE:204
    def addIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.addIngredient",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredient/add"})
        }
      """
    )
  
    // @LINE:216
    def updateOrderStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.updateOrderStatus",
      """
        function(orderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/customerorders/mealorder/update" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderId", orderId0)])})
        }
      """
    )
  
    // @LINE:192
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen"})
        }
      """
    )
  
    // @LINE:214
    def getMealOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getMealOrderPage",
      """
        function(orderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/customerorders/mealorder" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderId", orderId0)])})
        }
      """
    )
  
    // @LINE:212
    def getProcessingOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getProcessingOrderPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/processingorders"})
        }
      """
    )
  
    // @LINE:200
    def editIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.editIngredient",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredient/order/op" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:198
    def getIngredientOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getIngredientOrderPage",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredients/order" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
  }

  // @LINE:74
  class ReverseMenuController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.MenuController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Menu"})
        }
      """
    )
  
  }

  // @LINE:56
  class ReverseScheduleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:67
    def doAddOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.doAddOrder",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/AddOrder"})
        }
      """
    )
  
    // @LINE:228
    def scheduleJSRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.scheduleJSRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/scheduleJSRoutes"})
        }
      """
    )
  
    // @LINE:65
    def updateScheduleName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.updateScheduleName",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/Edit"})
        }
      """
    )
  
    // @LINE:68
    def clearSchedule: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.clearSchedule",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/Clear"})
        }
      """
    )
  
    // @LINE:62
    def removeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.removeOrder",
      """
        function(orderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/Delete/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("orderId", encodeURIComponent(orderId0))})
        }
      """
    )
  
    // @LINE:59
    def editScheduleName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.editScheduleName",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/Edit"})
        }
      """
    )
  
    // @LINE:58
    def addOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.addOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/AddOrder"})
        }
      """
    )
  
    // @LINE:57
    def createSchedule: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.createSchedule",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/New"})
        }
      """
    )
  
    // @LINE:66
    def doCreateSchedule: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.doCreateSchedule",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/New"})
        }
      """
    )
  
    // @LINE:64
    def setScheduleState: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.setScheduleState",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule/ChangeState"})
        }
      """
    )
  
    // @LINE:56
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.ScheduleController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Schedule"})
        }
      """
    )
  
  }

  // @LINE:166
  class ReverseOrderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:182
    def submitCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.submitCart",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/submitcart"})
        }
      """
    )
  
    // @LINE:166
    def getMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getMenu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu"})
        }
      """
    )
  
    // @LINE:184
    def getViewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getViewOrder",
      """
        function(orderId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activeorders/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("orderId", encodeURIComponent(orderId0))})
        }
      """
    )
  
    // @LINE:180
    def getSubmitPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getSubmitPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/submit"})
        }
      """
    )
  
    // @LINE:178
    def removeMealFromOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.removeMealFromOrder",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/removemeal" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mealId", mealId0)])})
        }
      """
    )
  
    // @LINE:186
    def getActiveOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getActiveOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activeorders"})
        }
      """
    )
  
    // @LINE:188
    def activeOrderAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.activeOrderAction",
      """
        function(orderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "orderaction" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderId", orderId0)])})
        }
      """
    )
  
    // @LINE:168
    def switchMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.switchMenu",
      """
        function(menutype0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/" + (""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("menutype", menutype0)})
        }
      """
    )
  
    // @LINE:174
    def addMeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.addMeal",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postmeal"})
        }
      """
    )
  
    // @LINE:170
    def addMealToOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.addMealToOrder",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addmealtoorder" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mealId", mealId0)])})
        }
      """
    )
  
    // @LINE:172
    def getAddMealToMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getAddMealToMenu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addmeal"})
        }
      """
    )
  
    // @LINE:176
    def getCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
  }


}
