
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Oct 08 23:34:50 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:104
package controllers {

  // @LINE:135
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:135
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:129
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:129
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:132
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:132
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:104
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:124
    def submitCart(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submit")
    }
  
    // @LINE:104
    def getMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu")
    }
  
    // @LINE:122
    def removeMealFromOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/removemeal" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:106
    def switchMenu(menutype:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("menutype", menutype))
    }
  
    // @LINE:114
    def addMeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "postmeal")
    }
  
    // @LINE:110
    def addMealToOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addmealtoorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:112
    def getAddMealToMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addmeal")
    }
  
    // @LINE:120
    def getCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
  }

  // @LINE:108
  class ReverseAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:116
    def doLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dologin")
    }
  
    // @LINE:108
    def getSignUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:118
    def doSignOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dosignout")
    }
  
  }


}
