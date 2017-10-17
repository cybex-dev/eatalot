
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/conf/routes
// @DATE:Sat Oct 14 09:33:00 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:51
package controllers.Order.javascript {

  // @LINE:59
  class ReverseKitchenController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:135
    def getOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getOrderPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/customerorders"})
        }
      """
    )
  
    // @LINE:137
    def getPendingOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getPendingOrderPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/pendingorders"})
        }
      """
    )
  
    // @LINE:123
    def getIngredientPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getIngredientPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredients"})
        }
      """
    )
  
    // @LINE:129
    def getNewIngredientPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getNewIngredientPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredient/ordernew"})
        }
      """
    )
  
    // @LINE:131
    def addIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.addIngredient",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredient/add"})
        }
      """
    )
  
    // @LINE:143
    def updateOrderStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.updateOrderStatus",
      """
        function(orderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/customerorders/mealorder/update" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderId", orderId0)])})
        }
      """
    )
  
    // @LINE:119
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen"})
        }
      """
    )
  
    // @LINE:141
    def getMealOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getMealOrderPage",
      """
        function(orderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/customerorders/mealorder" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderId", orderId0)])})
        }
      """
    )
  
    // @LINE:139
    def getProcessingOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getProcessingOrderPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/processingorders"})
        }
      """
    )
  
    // @LINE:127
    def editIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.editIngredient",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredient/order/op" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:59
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/User"})
        }
      """
    )
  
    // @LINE:125
    def getIngredientOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getIngredientOrderPage",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredients/order" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseMenuController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.MenuController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Menu"})
        }
      """
    )
  
  }

  // @LINE:89
  class ReverseOrderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:111
    def submitCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.submitCart",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/submitcart"})
        }
      """
    )
  
    // @LINE:89
    def getMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getMenu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu"})
        }
      """
    )
  
    // @LINE:115
    def getViewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getViewOrder",
      """
        function(orderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "history/order" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderId", orderId0)])})
        }
      """
    )
  
    // @LINE:109
    def getSubmitPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getSubmitPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/submit"})
        }
      """
    )
  
    // @LINE:107
    def removeMealFromOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.removeMealFromOrder",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/removemeal" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mealId", mealId0)])})
        }
      """
    )
  
    // @LINE:113
    def getHistoryPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getHistoryPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history"})
        }
      """
    )
  
    // @LINE:91
    def switchMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.switchMenu",
      """
        function(menutype0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/" + (""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("menutype", menutype0)})
        }
      """
    )
  
    // @LINE:99
    def addMeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.addMeal",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postmeal"})
        }
      """
    )
  
    // @LINE:95
    def addMealToOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.addMealToOrder",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addmealtoorder" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mealId", mealId0)])})
        }
      """
    )
  
    // @LINE:97
    def getAddMealToMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getAddMealToMenu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addmeal"})
        }
      """
    )
  
    // @LINE:105
    def getCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
  }

  // @LINE:93
  class ReverseAccountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:101
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.AccountController.doLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dologin"})
        }
      """
    )
  
    // @LINE:93
    def getSignUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.AccountController.getSignUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:103
    def doSignOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.AccountController.doSignOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dosignout"})
        }
      """
    )
  
  }


}
