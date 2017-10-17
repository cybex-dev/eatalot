
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Mon Oct 16 01:08:43 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:143
package controllers {

  // @LINE:182
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:182
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:176
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:176
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:179
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:179
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:143
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:163
    def submitCart(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submit")
    }
  
    // @LINE:143
    def getMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu")
    }
  
    // @LINE:161
    def removeMealFromOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/removemeal" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:145
    def switchMenu(menutype:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("menutype", menutype))
    }
  
    // @LINE:153
    def addMeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "postmeal")
    }
  
    // @LINE:149
    def addMealToOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addmealtoorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:151
    def getAddMealToMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addmeal")
    }
  
    // @LINE:159
    def getCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
  }

  // @LINE:147
  class ReverseAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:155
    def doLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dologin")
    }
  
    // @LINE:147
    def getSignUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:157
    def doSignOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dosignout")
    }
  
  }


}
