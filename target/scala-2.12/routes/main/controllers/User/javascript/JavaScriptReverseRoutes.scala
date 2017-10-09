
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Oct 08 23:34:50 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:15
package controllers.User.javascript {

  // @LINE:36
  class ReverseCustomerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def paymentHistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.paymentHistory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/History/Purchases"})
        }
      """
    )
  
    // @LINE:39
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.edit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Profile"})
        }
      """
    )
  
    // @LINE:45
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register"})
        }
      """
    )
  
    // @LINE:43
    def viewPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.viewPayment",
      """
        function(paymentId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/History/Payment/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("paymentId", encodeURIComponent(paymentId0))})
        }
      """
    )
  
    // @LINE:40
    def orderHistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.orderHistory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/History/Orders"})
        }
      """
    )
  
    // @LINE:42
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.viewOrder",
      """
        function(orderId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/History/Order/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("orderId", encodeURIComponent(orderId0))})
        }
      """
    )
  
    // @LINE:47
    def completeRegistration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.completeRegistration",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register/Completing"})
        }
      """
    )
  
    // @LINE:37
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register"})
        }
      """
    )
  
    // @LINE:46
    def reverify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.reverify",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register/Reverify"})
        }
      """
    )
  
    // @LINE:48
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Profile"})
        }
      """
    )
  
    // @LINE:36
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Dashboard"})
        }
      """
    )
  
    // @LINE:38
    def verifyCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.verifyCustomer",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Verify/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:49
    def activeOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.activeOrders",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/ActiveOrders"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseStaffController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.StaffController.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Staff/Login"})
        }
      """
    )
  
    // @LINE:27
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.StaffController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Staff/Logout"})
        }
      """
    )
  
    // @LINE:25
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.StaffController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Staff"})
        }
      """
    )
  
    // @LINE:26
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.StaffController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Staff/Login"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.UserController.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Login"})
        }
      """
    )
  
    // @LINE:16
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.UserController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Logout"})
        }
      """
    )
  
    // @LINE:15
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.UserController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Login"})
        }
      """
    )
  
  }


}
