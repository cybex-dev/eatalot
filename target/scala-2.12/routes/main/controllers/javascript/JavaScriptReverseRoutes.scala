
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
<<<<<<< HEAD
// @DATE:Sat Sep 02 14:47:31 SAST 2017
=======
// @DATE:Sun Sep 24 22:44:55 SAST 2017
>>>>>>> Order-Managment-Dev

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

<<<<<<< HEAD
// @LINE:83
package controllers.javascript {

  // @LINE:85
  class ReverseAsyncController(_prefix: => String) {
=======
// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
>>>>>>> Order-Managment-Dev

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
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
>>>>>>> Order-Managment-Dev
        }
      """
    )
  
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
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
=======
    // @LINE:31
    def submitCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.submitCart",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submit"})
        }
      """
    )
  
    // @LINE:11
    def getMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getMenu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu"})
        }
      """
    )
  
    // @LINE:29
    def removeMealFromOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.removeMealFromOrder",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/removemeal" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mealId", mealId0)])})
        }
      """
    )
  
    // @LINE:13
    def switchMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.switchMenu",
      """
        function(menutype0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/" + (""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("menutype", menutype0)})
        }
      """
    )
  
    // @LINE:21
    def addMeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addMeal",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postmeal"})
        }
      """
    )
  
    // @LINE:17
    def addMealToOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addMealToOrder",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addmealtoorder" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mealId", mealId0)])})
        }
      """
    )
  
    // @LINE:19
    def getAddMealToMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getAddMealToMenu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addmeal"})
        }
      """
    )
  
    // @LINE:27
    def getCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAccountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.doLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dologin"})
        }
      """
    )
  
    // @LINE:15
    def getSignUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.getSignUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:25
    def doSignOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.doSignOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dosignout"})
>>>>>>> Order-Managment-Dev
        }
      """
    )
  
  }


}
