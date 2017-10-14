
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Oct 14 13:03:12 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:17
package controllers.User.javascript {

  // @LINE:109
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:113
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.edit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Edit"})
        }
      """
    )
  
    // @LINE:115
    def doEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.doEdit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Edit"})
        }
      """
    )
  
    // @LINE:111
    def manageUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.manageUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Users"})
        }
      """
    )
  
    // @LINE:112
    def manageDiscounts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.manageDiscounts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Discounts"})
        }
      """
    )
  
    // @LINE:109
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Dashboard"})
        }
      """
    )
  
    // @LINE:110
    def manageMeals: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.manageMeals",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Meals"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseCustomerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def paymentHistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.paymentHistory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/History/Purchases"})
        }
      """
    )
  
    // @LINE:46
    def doCompleteRegistration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.doCompleteRegistration",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register/Completing"})
        }
      """
    )
  
    // @LINE:38
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.edit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Profile"})
        }
      """
    )
  
    // @LINE:44
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register"})
        }
      """
    )
  
    // @LINE:42
    def viewPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.viewPayment",
      """
        function(paymentId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/History/Payment/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("paymentId", encodeURIComponent(paymentId0))})
        }
      """
    )
  
    // @LINE:39
    def orderHistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.orderHistory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/History/Orders"})
        }
      """
    )
  
    // @LINE:41
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.viewOrder",
      """
        function(orderId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/History/Order/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("orderId", encodeURIComponent(orderId0))})
        }
      """
    )
  
    // @LINE:36
    def completeRegistration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.completeRegistration",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register/Completing"})
        }
      """
    )
  
    // @LINE:35
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register"})
        }
      """
    )
  
    // @LINE:45
    def reverify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.reverify",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register/Reverify"})
        }
      """
    )
  
    // @LINE:47
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Profile"})
        }
      """
    )
  
    // @LINE:34
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Dashboard"})
        }
      """
    )
  
    // @LINE:37
    def verifyCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.verifyCustomer",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Verify/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:48
    def activeOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.activeOrders",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/ActiveOrders"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseDeliveryStaffController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:93
    def deliverOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.deliverOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Order/Deliver"})
        }
      """
    )
  
    // @LINE:98
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.edit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/User/Edit"})
        }
      """
    )
  
    // @LINE:94
    def checkoutOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.checkoutOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Order/Checkout"})
        }
      """
    )
  
    // @LINE:100
    def doEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.doEdit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/User/Edit"})
        }
      """
    )
  
    // @LINE:95
    def viewCompletedDeliveries: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.viewCompletedDeliveries",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Orders/Completed"})
        }
      """
    )
  
    // @LINE:97
    def viewWaitingDeliveries: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.viewWaitingDeliveries",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Orders/Waiting"})
        }
      """
    )
  
    // @LINE:92
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.viewOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Order"})
        }
      """
    )
  
    // @LINE:27
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Staff"})
          }
        
        }
      """
    )
  
    // @LINE:96
    def viewActiveDeliveries: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.viewActiveDeliveries",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Orders/Active"})
        }
      """
    )
  
  }

  // @LINE:76
  class ReverseKitchenStaffController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:81
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.edit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/User/Edit"})
        }
      """
    )
  
    // @LINE:83
    def doEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.doEdit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/User/Edit"})
        }
      """
    )
  
    // @LINE:78
    def viewActiveOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.viewActiveOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/Orders/Active"})
        }
      """
    )
  
    // @LINE:79
    def viewCompletedOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.viewCompletedOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/Orders/Completed"})
        }
      """
    )
  
    // @LINE:77
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.viewOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/Order"})
        }
      """
    )
  
    // @LINE:80
    def viewQueuedOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.viewQueuedOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/Orders/Queued"})
        }
      """
    )
  
    // @LINE:76
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/Dashboard"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.UserController.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Login"})
        }
      """
    )
  
    // @LINE:18
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.UserController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Logout"})
        }
      """
    )
  
    // @LINE:17
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
