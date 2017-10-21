
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Oct 21 11:02:12 SAST 2017

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
  
    // @LINE:209
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

  // @LINE:147
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:169
    def submitCart(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/submitcart")
    }
  
    // @LINE:147
    def getMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu")
    }
  
    // @LINE:173
    def getViewOrder(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "history/order" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderId", orderId)))))
    }
  
    // @LINE:167
    def getSubmitPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/submit")
    }
  
    // @LINE:165
    def removeMealFromOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/removemeal" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:171
    def getHistoryPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "history")
    }
  
    // @LINE:149
    def switchMenu(menutype:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("menutype", menutype))
    }
  
    // @LINE:157
    def addMeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "postmeal")
    }
  
    // @LINE:153
    def addMealToOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addmealtoorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:155
    def getAddMealToMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addmeal")
    }
  
    // @LINE:163
    def getCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
  }

  // @LINE:177
  class ReverseKitchenController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:193
    def getOrderPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/customerorders")
    }
  
    // @LINE:195
    def getPendingOrderPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/pendingorders")
    }
  
    // @LINE:181
    def getIngredientPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/ingredients")
    }
  
    // @LINE:187
    def getNewIngredientPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/ingredient/ordernew")
    }
  
    // @LINE:189
    def addIngredient(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/ingredient/add")
    }
  
    // @LINE:201
    def updateOrderStatus(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/customerorders/mealorder/update" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderId", orderId)))))
    }
  
    // @LINE:177
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen")
    }
  
    // @LINE:199
    def getMealOrderPage(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/customerorders/mealorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderId", orderId)))))
    }
  
    // @LINE:197
    def getProcessingOrderPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/processingorders")
    }
  
    // @LINE:185
    def editIngredient(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/ingredient/order/op" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("id", id)))))
    }
  
    // @LINE:183
    def getIngredientOrderPage(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/ingredients/order" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("id", id)))))
    }
  
  }

  // @LINE:151
  class ReverseAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:159
    def doLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dologin")
    }
  
    // @LINE:151
    def getSignUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:161
    def doSignOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dosignout")
    }
  
  }


}
