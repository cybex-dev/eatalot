
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
<<<<<<< HEAD
// @DATE:Sat Sep 02 14:47:31 SAST 2017
=======
// @DATE:Sun Sep 24 22:44:55 SAST 2017
>>>>>>> Order-Managment-Dev

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

<<<<<<< HEAD
// @LINE:83
package controllers {

  // @LINE:85
  class ReverseAsyncController(_prefix: => String) {
=======
// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
>>>>>>> Order-Managment-Dev
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:85
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
=======
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
>>>>>>> Order-Managment-Dev
    }
  
  }

<<<<<<< HEAD
  // @LINE:88
=======
  // @LINE:9
>>>>>>> Order-Managment-Dev
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:88
=======
    // @LINE:9
>>>>>>> Order-Managment-Dev
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

<<<<<<< HEAD
  // @LINE:83
  class ReverseCountController(_prefix: => String) {
=======
  // @LINE:11
  class ReverseOrderController(_prefix: => String) {
>>>>>>> Order-Managment-Dev
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:83
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
=======
    // @LINE:31
    def submitCart(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submit")
    }
  
    // @LINE:11
    def getMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu")
    }
  
    // @LINE:29
    def removeMealFromOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/removemeal" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:13
    def switchMenu(menutype:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("menutype", menutype))
    }
  
    // @LINE:21
    def addMeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "postmeal")
    }
  
    // @LINE:17
    def addMealToOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addmealtoorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
    // @LINE:19
    def getAddMealToMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addmeal")
    }
  
    // @LINE:27
    def getCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
  }

  // @LINE:15
  class ReverseAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def doLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dologin")
    }
  
    // @LINE:15
    def getSignUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:25
    def doSignOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dosignout")
>>>>>>> Order-Managment-Dev
    }
  
  }


}
