
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/conf/routes
// @DATE:Sat Oct 07 12:59:41 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:51
package controllers.Order {

  // @LINE:59
  class ReverseKitchenController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:133
    def getOrderPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/customerorders")
    }
  
    // @LINE:135
    def getPendingOrderPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/pendingorders")
    }
  
    // @LINE:121
    def getIngredientPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/ingredients")
    }
  
    // @LINE:127
    def getNewIngredientPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/ingredient/ordernew")
    }
  
    // @LINE:129
    def addIngredient(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/ingredient/add")
    }
  
    // @LINE:141
    def updateOrderStatus(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/customerorders/mealorder/update" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderId", orderId)))))
    }
  
    // @LINE:117
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen")
    }
  
    // @LINE:139
    def getMealOrderPage(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/customerorders/mealorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderId", orderId)))))
    }
  
    // @LINE:137
    def getProcessingOrderPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kitchen/processingorders")
    }
  
    // @LINE:125
    def editIngredient(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/ingredient/order/op" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("id", id)))))
    }
  
    // @LINE:59
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/User")
    }
  
    // @LINE:123
    def getIngredientOrderPage(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kitchen/ingredients/order" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("id", id)))))
    }
  
  }

  // @LINE:51
  class ReverseMenuController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Menu")
    }
  
  }

  // @LINE:89
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:109
    def submitCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submit")
    }
  
    // @LINE:89
    def getMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu")
    }
  
    // @LINE:113
    def getViewOrder(orderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "history/order" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderId", orderId)))))
    }
  
    // @LINE:107
    def removeMealFromOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/removemeal" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:111
    def getHistoryPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "history")
    }
  
    // @LINE:91
    def switchMenu(menutype:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("menutype", menutype))
    }
  
    // @LINE:99
    def addMeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "postmeal")
    }
  
    // @LINE:95
    def addMealToOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addmealtoorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:97
    def getAddMealToMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addmeal")
    }
  
    // @LINE:105
    def getCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
  }

  // @LINE:93
  class ReverseAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:101
    def doLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dologin")
    }
  
    // @LINE:93
    def getSignUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:103
    def doSignOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dosignout")
    }
  
  }


}
