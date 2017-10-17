
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
<<<<<<< HEAD
// @DATE:Sat Sep 02 14:47:31 SAST 2017
=======
// @DATE:Mon Oct 16 01:08:43 SAST 2017
>>>>>>> Customer-Management-Dev

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:17
package controllers.User {

  // @LINE:117
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:123
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Edit")
    }
  
    // @LINE:125
    def doEdit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/Edit")
    }
  
    // @LINE:119
    def getAdminDashUpdate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Dashboard/Update")
    }
  
    // @LINE:121
    def manageUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Manage/Users")
    }
  
    // @LINE:122
    def manageDiscounts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Manage/Discounts")
    }
  
    // @LINE:117
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Dashboard")
    }
  
    // @LINE:171
    def adminJSRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/adminJSRoutes")
    }
  
    // @LINE:120
    def manageMeals(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Manage/Meals")
    }
  
  }

  // @LINE:34
  class ReverseCustomerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def paymentHistory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Purchases")
    }
  
    // @LINE:49
    def doCompleteRegistration(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register/Completing")
    }
  
    // @LINE:41
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Profile")
    }
  
    // @LINE:47
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register")
    }
  
    // @LINE:45
    def viewPayment(paymentId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Payment/" + implicitly[play.api.mvc.PathBindable[String]].unbind("paymentId", play.core.routing.dynamicString(paymentId)))
    }
  
    // @LINE:42
    def orderHistory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Orders")
    }
  
    // @LINE:44
    def viewOrder(orderId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Order/" + implicitly[play.api.mvc.PathBindable[String]].unbind("orderId", play.core.routing.dynamicString(orderId)))
    }
  
    // @LINE:37
    def getCustomerDashUpdate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Dashboard/Update")
    }
  
    // @LINE:39
    def completeRegistration(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Register/Completing")
    }
  
    // @LINE:34
    def redirectHome(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User")
    }
  
    // @LINE:38
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Register")
    }
  
    // @LINE:48
    def reverify(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register/Reverify")
    }
  
    // @LINE:50
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Profile")
    }
  
    // @LINE:170
    def customerJSRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/customerJSRoutes")
    }
  
    // @LINE:35
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Dashboard")
    }
  
    // @LINE:40
    def verifyCustomer(token:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Verify/" + implicitly[play.api.mvc.PathBindable[String]].unbind("token", play.core.routing.dynamicString(token)))
    }
  
    // @LINE:51
    def activeOrders(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/ActiveOrders")
    }
  
  }

  // @LINE:27
  class ReverseDeliveryStaffController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:101
    def deliverOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Order/Deliver")
    }
  
    // @LINE:172
    def deliveryJSRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/deliveryJSRoutes")
    }
  
    // @LINE:106
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/User/Edit")
    }
  
    // @LINE:102
    def checkoutOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Order/Checkout")
    }
  
    // @LINE:108
    def doEdit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Delivery/User/Edit")
    }
  
    // @LINE:99
    def getDeliveryDashUpdate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Dashboard/Update")
    }
  
    // @LINE:103
    def viewCompletedDeliveries(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Orders/Completed")
    }
  
    // @LINE:105
    def viewWaitingDeliveries(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Orders/Waiting")
    }
  
    // @LINE:100
    def viewOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Order")
    }
  
    // @LINE:27
    def index(): Call = {
    
      () match {
      
        // @LINE:27
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "Staff")
      
      }
    
    }
  
    // @LINE:104
    def viewActiveDeliveries(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Orders/Active")
    }
  
  }

  // @LINE:80
  class ReverseKitchenStaffController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:82
    def getKitchenDashUpdate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Dashboard/Update")
    }
  
    // @LINE:87
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/User/Edit")
    }
  
    // @LINE:89
    def doEdit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Kitchen/User/Edit")
    }
  
    // @LINE:173
    def kitchenJSRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/kitchenJSRoutes")
    }
  
    // @LINE:84
    def viewActiveOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Orders/Active")
    }
  
    // @LINE:85
    def viewCompletedOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Orders/Completed")
    }
  
    // @LINE:83
    def viewOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Order")
    }
  
    // @LINE:86
    def viewQueuedOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Orders/Queued")
    }
  
    // @LINE:80
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Dashboard")
    }
  
  }

  // @LINE:17
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Login")
    }
  
    // @LINE:18
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Logout")
    }
  
    // @LINE:17
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Login")
    }
  
  }


}
