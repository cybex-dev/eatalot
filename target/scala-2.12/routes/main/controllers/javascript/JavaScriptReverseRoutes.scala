
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
<<<<<<< HEAD
// @DATE:Tue Oct 03 05:59:33 SAST 2017
=======
// @DATE:Tue Oct 17 20:48:49 SAST 2017
>>>>>>> Customer-Management

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:143
package controllers.javascript {

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
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
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
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
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
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
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
    def submitCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.submitCart",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submit"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:90
=======
    // @LINE:143
>>>>>>> Customer-Management
    def getMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getMenu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:108
=======
    // @LINE:161
>>>>>>> Customer-Management
    def removeMealFromOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.removeMealFromOrder",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/removemeal" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mealId", mealId0)])})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:92
=======
    // @LINE:145
>>>>>>> Customer-Management
    def switchMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.switchMenu",
      """
        function(menutype0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/" + (""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("menutype", menutype0)})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:100
=======
    // @LINE:153
>>>>>>> Customer-Management
    def addMeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addMeal",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postmeal"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:96
=======
    // @LINE:149
>>>>>>> Customer-Management
    def addMealToOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addMealToOrder",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addmealtoorder" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mealId", mealId0)])})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:98
=======
    // @LINE:151
>>>>>>> Customer-Management
    def getAddMealToMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getAddMealToMenu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addmeal"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:106
=======
    // @LINE:159
>>>>>>> Customer-Management
    def getCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
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
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.doLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dologin"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:94
=======
    // @LINE:147
>>>>>>> Customer-Management
    def getSignUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.getSignUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:104
=======
    // @LINE:157
>>>>>>> Customer-Management
    def doSignOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.doSignOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dosignout"})
        }
      """
    )
  
  }


}
