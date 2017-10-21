
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Oct 21 11:02:12 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:18
package controllers.User {

  // @LINE:119
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:125
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Edit")
    }
  
    // @LINE:127
    def doEdit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/Edit")
    }
  
    // @LINE:121
    def getAdminDashUpdate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Dashboard/Update")
    }
  
    // @LINE:123
    def manageUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Manage/Users")
    }
  
    // @LINE:124
    def manageDiscounts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Manage/Discounts")
    }
  
    // @LINE:119
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Dashboard")
    }
  
    // @LINE:213
    def adminJSRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/adminJSRoutes")
    }
  
    // @LINE:122
    def manageMeals(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Manage/Meals")
    }
  
  }

  // @LINE:35
  class ReverseCustomerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def paymentHistory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Purchases")
    }
  
    // @LINE:50
    def doCompleteRegistration(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register/Completing")
    }
  
    // @LINE:42
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Profile")
    }
  
    // @LINE:48
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register")
    }
  
    // @LINE:46
    def viewPayment(paymentId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Payment/" + implicitly[play.api.mvc.PathBindable[String]].unbind("paymentId", play.core.routing.dynamicString(paymentId)))
    }
  
    // @LINE:43
    def orderHistory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Orders")
    }
  
    // @LINE:45
    def viewOrder(orderId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Order/" + implicitly[play.api.mvc.PathBindable[String]].unbind("orderId", play.core.routing.dynamicString(orderId)))
    }
  
    // @LINE:38
    def getCustomerDashUpdate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Dashboard/Update")
    }
  
    // @LINE:40
    def completeRegistration(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Register/Completing")
    }
  
    // @LINE:35
    def redirectHome(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User")
    }
  
    // @LINE:39
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Register")
    }
  
    // @LINE:49
    def reverify(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register/Reverify")
    }
  
    // @LINE:51
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Profile")
    }
  
    // @LINE:211
    def customerJSRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/customerJSRoutes")
    }
  
    // @LINE:36
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Dashboard")
    }
  
    // @LINE:41
    def verifyCustomer(token:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Verify/" + implicitly[play.api.mvc.PathBindable[String]].unbind("token", play.core.routing.dynamicString(token)))
    }
  
    // @LINE:52
    def activeOrders(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/ActiveOrders")
    }
  
  }

  // @LINE:28
  class ReverseDeliveryStaffController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:103
    def deliverOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Order/Deliver")
    }
  
    // @LINE:215
    def deliveryJSRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/deliveryJSRoutes")
    }
  
    // @LINE:108
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/User/Edit")
    }
  
    // @LINE:104
    def checkoutOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Order/Checkout")
    }
  
    // @LINE:110
    def doEdit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Delivery/User/Edit")
    }
  
    // @LINE:101
    def getDeliveryDashUpdate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Dashboard/Update")
    }
  
    // @LINE:105
    def viewCompletedDeliveries(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Orders/Completed")
    }
  
    // @LINE:107
    def viewWaitingDeliveries(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Orders/Waiting")
    }
  
    // @LINE:102
    def viewOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Order")
    }
  
    // @LINE:28
    def index(): Call = {
    
      () match {
      
        // @LINE:28
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "Staff")
      
      }
    
    }
  
    // @LINE:106
    def viewActiveDeliveries(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Orders/Active")
    }
  
  }

  // @LINE:82
  class ReverseKitchenStaffController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def getKitchenDashUpdate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Dashboard/Update")
    }
  
    // @LINE:89
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/User/Edit")
    }
  
    // @LINE:91
    def doEdit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Kitchen/User/Edit")
    }
  
    // @LINE:217
    def kitchenJSRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/kitchenJSRoutes")
    }
  
    // @LINE:86
    def viewActiveOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Orders/Active")
    }
  
    // @LINE:87
    def viewCompletedOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Orders/Completed")
    }
  
    // @LINE:85
    def viewOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Order")
    }
  
    // @LINE:88
    def viewQueuedOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Orders/Queued")
    }
  
    // @LINE:82
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Dashboard")
    }
  
  }

  // @LINE:18
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Login")
    }
  
    // @LINE:19
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Logout")
    }
  
    // @LINE:18
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Login")
    }
  
  }


}
