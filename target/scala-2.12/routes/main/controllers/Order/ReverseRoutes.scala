
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Wed Oct 18 00:03:01 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:55
package controllers.Order {

  // @LINE:72
  class ReverseMenuController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Menu")
    }
  
  }

  // @LINE:55
  class ReverseScheduleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def doAddOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/AddOrder")
    }
  
    // @LINE:207
    def scheduleJSRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/scheduleJSRoutes")
    }
  
    // @LINE:63
    def updateScheduleName(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/Edit")
    }
  
    // @LINE:66
    def clearSchedule(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/Clear")
    }
  
    // @LINE:60
    def removeOrder(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/Delete/" + implicitly[play.api.mvc.PathBindable[String]].unbind("orderId", play.core.routing.dynamicString(orderId)))
    }
  
    // @LINE:58
    def editScheduleName(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule/Edit")
    }
  
    // @LINE:57
    def addOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule/AddOrder")
    }
  
    // @LINE:56
    def createSchedule(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule/New")
    }
  
    // @LINE:64
    def doCreateSchedule(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/New")
    }
  
    // @LINE:62
    def setScheduleState(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/ChangeState")
    }
  
    // @LINE:55
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule")
    }
  
  }

  // @LINE:146
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:168
    def submitCart(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/submitcart")
    }
  
    // @LINE:146
    def getMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu")
    }
  
    // @LINE:172
    def getViewOrder(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "history/order" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderId", orderId)))))
    }
  
    // @LINE:166
    def getSubmitPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/submit")
    }
  
    // @LINE:164
    def removeMealFromOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/removemeal" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:170
    def getHistoryPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "history")
    }
  
    // @LINE:148
    def switchMenu(menutype:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("menutype", menutype))
    }
  
    // @LINE:156
    def addMeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "postmeal")
    }
  
    // @LINE:152
    def addMealToOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addmealtoorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:154
    def getAddMealToMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addmeal")
    }
  
    // @LINE:162
    def getCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
  }

  // @LINE:176
  class ReverseKitchenController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:192
    def getOrderPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/customerorders")
    }
  
    // @LINE:194
    def getPendingOrderPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/pendingorders")
    }
  
    // @LINE:180
    def getIngredientPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/ingredients")
    }
  
    // @LINE:186
    def getNewIngredientPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/ingredient/ordernew")
    }
  
    // @LINE:188
    def addIngredient(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/ingredient/add")
    }
  
    // @LINE:200
    def updateOrderStatus(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/customerorders/mealorder/update" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderId", orderId)))))
    }
  
    // @LINE:176
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen")
    }
  
    // @LINE:198
    def getMealOrderPage(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/customerorders/mealorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderId", orderId)))))
    }
  
    // @LINE:196
    def getProcessingOrderPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/processingorders")
    }
  
    // @LINE:184
    def editIngredient(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/ingredient/order/op" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("id", id)))))
    }
  
    // @LINE:182
    def getIngredientOrderPage(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/ingredients/order" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("id", id)))))
    }
  
  }

  // @LINE:150
  class ReverseAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:158
    def doLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dologin")
    }
  
    // @LINE:150
    def getSignUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:160
    def doSignOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dosignout")
    }
  
  }


}
