
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Fri Oct 13 07:57:43 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:124
package controllers {

  // @LINE:158
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:158
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:152
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:152
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:155
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:155
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:124
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:144
    def submitCart(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submit")
    }
  
    // @LINE:124
    def getMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu")
    }
  
    // @LINE:142
    def removeMealFromOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/removemeal" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:126
    def switchMenu(menutype:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("menutype", menutype))
    }
  
    // @LINE:134
    def addMeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "postmeal")
    }
  
    // @LINE:130
    def addMealToOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addmealtoorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:132
    def getAddMealToMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addmeal")
    }
  
    // @LINE:140
    def getCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
  }

  // @LINE:128
  class ReverseAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:136
    def doLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dologin")
    }
  
    // @LINE:128
    def getSignUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:138
    def doSignOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dosignout")
    }
  
  }


}
