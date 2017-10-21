
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Oct 22 04:28:34 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:18
package controllers.User.javascript {

  // @LINE:119
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:139
    def updateStaff: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.updateStaff",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Users/Staff/Edit"})
        }
      """
    )
  
    // @LINE:126
    def addCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.addCustomer",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Users/Customer/New"})
          }
        
        }
      """
    )
  
    // @LINE:144
    def removeUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.removeUser",
      """
        function(userId0,userType1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Users/Remove/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", encodeURIComponent(userId0)) + "/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userType", encodeURIComponent(userType1))})
        }
      """
    )
  
    // @LINE:133
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.edit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Edit"})
        }
      """
    )
  
    // @LINE:142
    def removeMeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.removeMeal",
      """
        function(mealId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Meals/Remove/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("mealId", encodeURIComponent(mealId0))})
        }
      """
    )
  
    // @LINE:135
    def doEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.doEdit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Edit"})
        }
      """
    )
  
    // @LINE:121
    def getAdminDashUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.getAdminDashUpdate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Dashboard/Update"})
        }
      """
    )
  
    // @LINE:125
    def manageUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.manageUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Users"})
        }
      """
    )
  
    // @LINE:129
    def editStaff: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.editStaff",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Users/Staff/Edit" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", encodeURIComponent(userId0))})
        }
      """
    )
  
    // @LINE:130
    def manageDiscounts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.manageDiscounts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Discounts"})
        }
      """
    )
  
    // @LINE:124
    def editMeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.editMeal",
      """
        function(mealId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Meals/Edit/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("mealId", encodeURIComponent(mealId0))})
        }
      """
    )
  
    // @LINE:138
    def updateCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.updateCustomer",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Users/Customer/Edit"})
        }
      """
    )
  
    // @LINE:123
    def addMeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.addMeal",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Meals/Add"})
        }
      """
    )
  
    // @LINE:128
    def editCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.editCustomer",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Users/Customer/Edit" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", encodeURIComponent(userId0))})
        }
      """
    )
  
    // @LINE:119
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Dashboard"})
        }
      """
    )
  
    // @LINE:137
    def updateMeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.updateMeal",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Meals/Edit"})
        }
      """
    )
  
    // @LINE:232
    def adminJSRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.adminJSRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/adminJSRoutes"})
        }
      """
    )
  
    // @LINE:122
    def manageMeals: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.AdminController.manageMeals",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Meals"})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseCustomerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def paymentHistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.paymentHistory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/History/Purchases"})
        }
      """
    )
  
    // @LINE:50
    def doCompleteRegistration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.doCompleteRegistration",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register/Completing"})
        }
      """
    )
  
    // @LINE:42
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.edit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Profile"})
        }
      """
    )
  
    // @LINE:48
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register"})
        }
      """
    )
  
    // @LINE:46
    def viewPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.viewPayment",
      """
        function(paymentId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/History/Payment/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("paymentId", encodeURIComponent(paymentId0))})
        }
      """
    )
  
    // @LINE:43
    def orderHistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.orderHistory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/History/Orders"})
        }
      """
    )
  
    // @LINE:45
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.viewOrder",
      """
        function(orderId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/History/Order/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("orderId", encodeURIComponent(orderId0))})
        }
      """
    )
  
    // @LINE:38
    def getCustomerDashUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.getCustomerDashUpdate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Dashboard/Update"})
        }
      """
    )
  
    // @LINE:40
    def completeRegistration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.completeRegistration",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register/Completing"})
        }
      """
    )
  
    // @LINE:35
    def redirectHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.redirectHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User"})
        }
      """
    )
  
    // @LINE:39
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register"})
        }
      """
    )
  
    // @LINE:49
    def reverify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.reverify",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Register/Reverify"})
        }
      """
    )
  
    // @LINE:51
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Profile"})
        }
      """
    )
  
    // @LINE:230
    def customerJSRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.customerJSRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/customerJSRoutes"})
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
  
    // @LINE:41
    def verifyCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.verifyCustomer",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Verify/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:52
    def activeOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.CustomerController.activeOrders",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/ActiveOrders"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseDeliveryStaffController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:103
    def deliverOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.deliverOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Order/Deliver"})
        }
      """
    )
  
    // @LINE:234
    def deliveryJSRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.deliveryJSRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/deliveryJSRoutes"})
        }
      """
    )
  
    // @LINE:108
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.edit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/User/Edit"})
        }
      """
    )
  
    // @LINE:104
    def checkoutOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.checkoutOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Order/Checkout"})
        }
      """
    )
  
    // @LINE:110
    def doEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.doEdit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/User/Edit"})
        }
      """
    )
  
    // @LINE:101
    def getDeliveryDashUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.getDeliveryDashUpdate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Dashboard/Update"})
        }
      """
    )
  
    // @LINE:105
    def viewCompletedDeliveries: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.viewCompletedDeliveries",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Orders/Completed"})
        }
      """
    )
  
    // @LINE:107
    def viewWaitingDeliveries: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.viewWaitingDeliveries",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Orders/Waiting"})
        }
      """
    )
  
    // @LINE:102
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.viewOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Order"})
        }
      """
    )
  
    // @LINE:28
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
  
    // @LINE:106
    def viewActiveDeliveries: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.DeliveryStaffController.viewActiveDeliveries",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Delivery/Orders/Active"})
        }
      """
    )
  
  }

  // @LINE:82
  class ReverseKitchenStaffController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def getKitchenDashUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.getKitchenDashUpdate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/Dashboard/Update"})
        }
      """
    )
  
    // @LINE:89
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.edit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/User/Edit"})
        }
      """
    )
  
    // @LINE:91
    def doEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.doEdit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/User/Edit"})
        }
      """
    )
  
    // @LINE:236
    def kitchenJSRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.kitchenJSRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/kitchenJSRoutes"})
        }
      """
    )
  
    // @LINE:86
    def viewActiveOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.viewActiveOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/Orders/Active"})
        }
      """
    )
  
    // @LINE:87
    def viewCompletedOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.viewCompletedOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/Orders/Completed"})
        }
      """
    )
  
    // @LINE:85
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.viewOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/Order"})
        }
      """
    )
  
    // @LINE:88
    def viewQueuedOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.viewQueuedOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/Orders/Queued"})
        }
      """
    )
  
    // @LINE:82
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.KitchenStaffController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Kitchen/Dashboard"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.UserController.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Login"})
        }
      """
    )
  
    // @LINE:19
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.User.UserController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/Logout"})
        }
      """
    )
  
    // @LINE:18
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
