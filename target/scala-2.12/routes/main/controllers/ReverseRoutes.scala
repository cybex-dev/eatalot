
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
<<<<<<< HEAD
// @DATE:Sun Sep 24 23:41:08 SAST 2017
=======
// @DATE:Tue Oct 03 04:34:55 SAST 2017
>>>>>>> Order-Management-Devel

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

<<<<<<< HEAD
// @LINE:83
package controllers {

  // @LINE:88
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:88
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:83
  class ReverseCountController(_prefix: => String) {
=======
// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
>>>>>>> Order-Management-Devel
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:83
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
=======
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
>>>>>>> Order-Management-Devel
    }
  
  }

<<<<<<< HEAD
  // @LINE:85
  class ReverseAsyncController(_prefix: => String) {
=======
  // @LINE:9
  class ReverseAssets(_prefix: => String) {
>>>>>>> Order-Management-Devel
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:85
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
=======
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
>>>>>>> Order-Management-Devel
    }
  
  }

<<<<<<< HEAD
  // @LINE:93
=======
  // @LINE:11
>>>>>>> Order-Management-Devel
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:113
=======
    // @LINE:31
>>>>>>> Order-Management-Devel
    def submitCart(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submit")
    }
  
<<<<<<< HEAD
    // @LINE:93
=======
    // @LINE:11
>>>>>>> Order-Management-Devel
    def getMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu")
    }
  
<<<<<<< HEAD
    // @LINE:111
=======
    // @LINE:29
>>>>>>> Order-Management-Devel
    def removeMealFromOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/removemeal" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
<<<<<<< HEAD
    // @LINE:95
=======
    // @LINE:13
>>>>>>> Order-Management-Devel
    def switchMenu(menutype:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("menutype", menutype))
    }
  
<<<<<<< HEAD
    // @LINE:103
=======
    // @LINE:21
>>>>>>> Order-Management-Devel
    def addMeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "postmeal")
    }
  
<<<<<<< HEAD
    // @LINE:99
=======
    // @LINE:17
>>>>>>> Order-Management-Devel
    def addMealToOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addmealtoorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
<<<<<<< HEAD
    // @LINE:101
=======
    // @LINE:19
>>>>>>> Order-Management-Devel
    def getAddMealToMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addmeal")
    }
  
<<<<<<< HEAD
    // @LINE:109
=======
    // @LINE:27
>>>>>>> Order-Management-Devel
    def getCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
  }

<<<<<<< HEAD
  // @LINE:97
=======
  // @LINE:15
>>>>>>> Order-Management-Devel
  class ReverseAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:105
=======
    // @LINE:23
>>>>>>> Order-Management-Devel
    def doLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dologin")
    }
  
<<<<<<< HEAD
    // @LINE:97
=======
    // @LINE:15
>>>>>>> Order-Management-Devel
    def getSignUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
<<<<<<< HEAD
    // @LINE:107
=======
    // @LINE:25
>>>>>>> Order-Management-Devel
    def doSignOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dosignout")
    }
  
  }


}
