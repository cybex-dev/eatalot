
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Oct 14 13:03:12 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:17
package controllers.User {

  // @LINE:109
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:113
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Edit")
    }
  
    // @LINE:115
    def doEdit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/Edit")
    }
  
    // @LINE:111
    def manageUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Manage/Users")
    }
  
    // @LINE:112
    def manageDiscounts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Manage/Discounts")
    }
  
    // @LINE:109
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Dashboard")
    }
  
    // @LINE:110
    def manageMeals(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Manage/Meals")
    }
  
  }

  // @LINE:34
  class ReverseCustomerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def paymentHistory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Purchases")
    }
  
    // @LINE:46
    def doCompleteRegistration(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register/Completing")
    }
  
    // @LINE:38
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Profile")
    }
  
    // @LINE:44
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register")
    }
  
    // @LINE:42
    def viewPayment(paymentId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Payment/" + implicitly[play.api.mvc.PathBindable[String]].unbind("paymentId", play.core.routing.dynamicString(paymentId)))
    }
  
    // @LINE:39
    def orderHistory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Orders")
    }
  
    // @LINE:41
    def viewOrder(orderId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/History/Order/" + implicitly[play.api.mvc.PathBindable[String]].unbind("orderId", play.core.routing.dynamicString(orderId)))
    }
  
    // @LINE:36
    def completeRegistration(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Register/Completing")
    }
  
    // @LINE:35
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Register")
    }
  
    // @LINE:45
    def reverify(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Register/Reverify")
    }
  
    // @LINE:47
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/Profile")
    }
  
    // @LINE:34
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Dashboard")
    }
  
    // @LINE:37
    def verifyCustomer(token:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/Verify/" + implicitly[play.api.mvc.PathBindable[String]].unbind("token", play.core.routing.dynamicString(token)))
    }
  
    // @LINE:48
    def activeOrders(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/ActiveOrders")
    }
  
  }

  // @LINE:27
  class ReverseDeliveryStaffController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:93
    def deliverOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Order/Deliver")
    }
  
    // @LINE:98
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/User/Edit")
    }
  
    // @LINE:94
    def checkoutOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Order/Checkout")
    }
  
    // @LINE:100
    def doEdit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Delivery/User/Edit")
    }
  
    // @LINE:95
    def viewCompletedDeliveries(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Orders/Completed")
    }
  
    // @LINE:97
    def viewWaitingDeliveries(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Orders/Waiting")
    }
  
    // @LINE:92
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
  
    // @LINE:96
    def viewActiveDeliveries(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Delivery/Orders/Active")
    }
  
  }

  // @LINE:76
  class ReverseKitchenStaffController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:81
    def edit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/User/Edit")
    }
  
    // @LINE:83
    def doEdit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Kitchen/User/Edit")
    }
  
    // @LINE:78
    def viewActiveOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Orders/Active")
    }
  
    // @LINE:79
    def viewCompletedOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Orders/Completed")
    }
  
    // @LINE:77
    def viewOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Order")
    }
  
    // @LINE:80
    def viewQueuedOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Kitchen/Orders/Queued")
    }
  
    // @LINE:76
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
