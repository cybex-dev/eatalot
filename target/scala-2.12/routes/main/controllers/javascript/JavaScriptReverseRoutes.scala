
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
<<<<<<< HEAD
// @DATE:Sun Sep 24 23:41:08 SAST 2017
=======
// @DATE:Tue Oct 03 04:34:55 SAST 2017
>>>>>>> Order-Management-Devel

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

<<<<<<< HEAD
// @LINE:83
package controllers.javascript {

  // @LINE:88
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:88
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:83
  class ReverseCountController(_prefix: => String) {
=======
// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
>>>>>>> Order-Management-Devel

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:83
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
=======
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
>>>>>>> Order-Management-Devel
        }
      """
    )
  
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
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
=======
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
>>>>>>> Order-Management-Devel
        }
      """
    )
  
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
    def submitCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.submitCart",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submit"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:93
=======
    // @LINE:11
>>>>>>> Order-Management-Devel
    def getMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getMenu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:111
=======
    // @LINE:29
>>>>>>> Order-Management-Devel
    def removeMealFromOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.removeMealFromOrder",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/removemeal" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mealId", mealId0)])})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:95
=======
    // @LINE:13
>>>>>>> Order-Management-Devel
    def switchMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.switchMenu",
      """
        function(menutype0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/" + (""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("menutype", menutype0)})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:103
=======
    // @LINE:21
>>>>>>> Order-Management-Devel
    def addMeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addMeal",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postmeal"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:99
=======
    // @LINE:17
>>>>>>> Order-Management-Devel
    def addMealToOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addMealToOrder",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addmealtoorder" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mealId", mealId0)])})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:101
=======
    // @LINE:19
>>>>>>> Order-Management-Devel
    def getAddMealToMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getAddMealToMenu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addmeal"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:109
=======
    // @LINE:27
>>>>>>> Order-Management-Devel
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
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.doLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dologin"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:97
=======
    // @LINE:15
>>>>>>> Order-Management-Devel
    def getSignUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.getSignUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:107
=======
    // @LINE:25
>>>>>>> Order-Management-Devel
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
