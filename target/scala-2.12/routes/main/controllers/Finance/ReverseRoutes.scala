
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Desktop/eatalot/eatalot/conf/routes
// @DATE:Sun Oct 22 14:40:06 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:131
package controllers.Finance {

  // @LINE:131
  class ReverseUserFinanceController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:238
    def financeJSRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/financeJSRoutes")
    }
  
    // @LINE:146
    def removeDiscount(discountId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/Manage/Discounts/Remove/" + implicitly[play.api.mvc.PathBindable[String]].unbind("discountId", play.core.routing.dynamicString(discountId)))
    }
  
    // @LINE:154
    def addFunds(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/AddFunds")
    }
  
    // @LINE:156
    def doAddFunds(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/AddFunds")
    }
  
    // @LINE:136
    def updateDiscount(): Call = {
    
      () match {
      
        // @LINE:136
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "Admin/Manage/Discounts/Edit")
      
      }
    
    }
  
    // @LINE:132
    def editDiscount(discountId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Manage/Discounts/Edit/" + implicitly[play.api.mvc.PathBindable[String]].unbind("discountId", play.core.routing.dynamicString(discountId)))
    }
  
    // @LINE:131
    def addDiscount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/Manage/Discounts/Add/")
    }
  
  }


}
