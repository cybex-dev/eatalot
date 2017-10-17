
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
<<<<<<< HEAD
// @DATE:Tue Oct 03 05:59:33 SAST 2017
=======
// @DATE:Tue Oct 17 20:48:49 SAST 2017
>>>>>>> Customer-Management

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:143
package controllers {

<<<<<<< HEAD
  // @LINE:88
=======
  // @LINE:191
>>>>>>> Customer-Management
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:88
=======
    // @LINE:191
>>>>>>> Customer-Management
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

<<<<<<< HEAD
  // @LINE:83
=======
  // @LINE:185
>>>>>>> Customer-Management
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:83
=======
    // @LINE:185
>>>>>>> Customer-Management
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

<<<<<<< HEAD
  // @LINE:85
=======
  // @LINE:188
>>>>>>> Customer-Management
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:188
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

<<<<<<< HEAD
  // @LINE:90
=======
  // @LINE:143
>>>>>>> Customer-Management
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:110
=======
    // @LINE:163
>>>>>>> Customer-Management
    def submitCart(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submit")
    }
  
<<<<<<< HEAD
    // @LINE:90
=======
    // @LINE:143
>>>>>>> Customer-Management
    def getMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu")
    }
  
<<<<<<< HEAD
    // @LINE:108
=======
    // @LINE:161
>>>>>>> Customer-Management
    def removeMealFromOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cart/removemeal" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
<<<<<<< HEAD
    // @LINE:92
=======
    // @LINE:145
>>>>>>> Customer-Management
    def switchMenu(menutype:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "menu/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("menutype", menutype))
    }
  
<<<<<<< HEAD
    // @LINE:100
=======
    // @LINE:153
>>>>>>> Customer-Management
    def addMeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "postmeal")
    }
  
<<<<<<< HEAD
    // @LINE:96
=======
    // @LINE:149
>>>>>>> Customer-Management
    def addMealToOrder(mealId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addmealtoorder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mealId", mealId)))))
    }
  
<<<<<<< HEAD
    // @LINE:98
=======
    // @LINE:151
>>>>>>> Customer-Management
    def getAddMealToMenu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addmeal")
    }
  
<<<<<<< HEAD
    // @LINE:106
=======
    // @LINE:159
>>>>>>> Customer-Management
    def getCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
  }

<<<<<<< HEAD
  // @LINE:94
=======
  // @LINE:147
>>>>>>> Customer-Management
  class ReverseAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:102
=======
    // @LINE:155
>>>>>>> Customer-Management
    def doLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dologin")
    }
  
<<<<<<< HEAD
    // @LINE:94
=======
    // @LINE:147
>>>>>>> Customer-Management
    def getSignUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
<<<<<<< HEAD
    // @LINE:104
=======
    // @LINE:157
>>>>>>> Customer-Management
    def doSignOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dosignout")
    }
  
  }


}
