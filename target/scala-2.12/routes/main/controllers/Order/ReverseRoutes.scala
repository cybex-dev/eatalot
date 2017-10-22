
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Mon Oct 23 01:02:05 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:56
package controllers.Order {

  // @LINE:74
  class ReverseMenuController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Menu")
    }
  
  }

  // @LINE:56
  class ReverseScheduleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:67
    def doAddOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/AddOrder")
    }
  
    // @LINE:230
    def scheduleJSRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/scheduleJSRoutes")
    }
  
    // @LINE:65
    def updateScheduleName(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/Edit")
    }
  
    // @LINE:68
    def clearSchedule(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/Clear")
    }
  
    // @LINE:62
    def removeOrder(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/Delete/" + implicitly[play.api.mvc.PathBindable[String]].unbind("orderId", play.core.routing.dynamicString(orderId)))
    }
  
    // @LINE:59
    def editScheduleName(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule/Edit")
    }
  
    // @LINE:58
    def addOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule/AddOrder")
    }
  
    // @LINE:57
    def createSchedule(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule/New")
    }
  
    // @LINE:66
    def doCreateSchedule(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/New")
    }
  
    // @LINE:64
    def setScheduleState(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Schedule/ChangeState")
    }
  
    // @LINE:56
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Schedule")
    }
  
  }

  // @LINE:168
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:190
    def submitCart(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/submitcart")
    }
  
    // @LINE:168
    def getMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu")
    }
  
    // @LINE:194
    def getViewOrder(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "history/order" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderId", orderId)))))
    }
  
    // @LINE:188
    def getSubmitPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/submit")
    }
  
    // @LINE:186
    def removeMealFromOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/removemeal" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:192
    def getHistoryPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "history")
    }
  
    // @LINE:170
    def switchMenu(menutype:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("menutype", menutype))
    }
  
    // @LINE:178
    def addMeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "postmeal")
    }
  
    // @LINE:174
    def addMealToOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addmealtoorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:176
    def getAddMealToMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addmeal")
    }
  
    // @LINE:184
    def getCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
  }

  // @LINE:198
  class ReverseKitchenController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:214
    def getOrderPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/customerorders")
    }
  
    // @LINE:216
    def getPendingOrderPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/pendingorders")
    }
  
    // @LINE:202
    def getIngredientPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/ingredients")
    }
  
    // @LINE:208
    def getNewIngredientPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/ingredient/ordernew")
    }
  
    // @LINE:210
    def addIngredient(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/ingredient/add")
    }
  
    // @LINE:222
    def updateOrderStatus(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/customerorders/mealorder/update" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderId", orderId)))))
    }
  
    // @LINE:198
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen")
    }
  
    // @LINE:220
    def getMealOrderPage(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/customerorders/mealorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderId", orderId)))))
    }
  
    // @LINE:218
    def getProcessingOrderPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/processingorders")
    }
  
    // @LINE:206
    def editIngredient(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/ingredient/order/op" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("id", id)))))
    }
  
    // @LINE:204
    def getIngredientOrderPage(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/ingredients/order" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("id", id)))))
    }
  
  }

  // @LINE:172
  class ReverseAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:180
    def doLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dologin")
    }
  
    // @LINE:172
    def getSignUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:182
    def doSignOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dosignout")
    }
  
  }


}
