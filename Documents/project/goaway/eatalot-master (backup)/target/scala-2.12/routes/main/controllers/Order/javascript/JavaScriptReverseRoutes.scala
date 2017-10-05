
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Documents/project/goaway/eatalot-master/conf/routes
// @DATE:Thu Oct 05 23:12:55 SAST 2017

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

  
    // @LINE:134
    def getOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getOrderPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/customerorders"})
        }
      """
    )
  
    // @LINE:136
    def getPendingOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getPendingOrderPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/pendingorders"})
        }
      """
    )
  
    // @LINE:122
    def getIngredientPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getIngredientPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredients"})
        }
      """
    )
  
    // @LINE:128
    def getNewIngredientPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getNewIngredientPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredient/ordernew"})
        }
      """
    )
  
    // @LINE:130
    def addIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.addIngredient",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/ingredient/add"})
        }
      """
    )
  
    // @LINE:142
    def updateOrderStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.updateOrderStatus",
      """
        function(orderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/customerorders/mealorder/update" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderId", orderId0)])})
        }
      """
    )
  
    // @LINE:118
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen"})
        }
      """
    )
  
    // @LINE:140
    def getMealOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getMealOrderPage",
      """
        function(orderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/customerorders/mealorder" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderId", orderId0)])})
        }
      """
    )
  
    // @LINE:138
    def getProcessingOrderPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.KitchenController.getProcessingOrderPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kitchen/processingorders"})
        }
      """
    )
  
    // @LINE:126
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
  
    // @LINE:124
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

  // @LINE:90
  class ReverseOrderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:110
    def submitCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.submitCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submit"})
        }
      """
    )
  
    // @LINE:90
    def getMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getMenu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu"})
        }
      """
    )
  
    // @LINE:114
    def getViewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getViewOrder",
      """
        function(orderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "history/order" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderId", orderId0)])})
        }
      """
    )
  
    // @LINE:108
    def removeMealFromOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.removeMealFromOrder",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/removemeal" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mealId", mealId0)])})
        }
      """
    )
  
    // @LINE:112
    def getHistoryPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getHistoryPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history"})
        }
      """
    )
  
    // @LINE:92
    def switchMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.switchMenu",
      """
        function(menutype0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/" + (""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("menutype", menutype0)})
        }
      """
    )
  
    // @LINE:100
    def addMeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.addMeal",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postmeal"})
        }
      """
    )
  
    // @LINE:96
    def addMealToOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.addMealToOrder",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addmealtoorder" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mealId", mealId0)])})
        }
      """
    )
  
    // @LINE:98
    def getAddMealToMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getAddMealToMenu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addmeal"})
        }
      """
    )
  
    // @LINE:106
    def getCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.OrderController.getCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
  }

  // @LINE:94
  class ReverseAccountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:102
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.AccountController.doLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dologin"})
        }
      """
    )
  
    // @LINE:94
    def getSignUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Order.AccountController.getSignUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:104
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
