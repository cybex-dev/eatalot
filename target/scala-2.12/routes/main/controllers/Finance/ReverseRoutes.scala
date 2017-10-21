
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/eatalot-temp/conf/routes
// @DATE:Sat Oct 21 09:12:55 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:133
package controllers.Finance {

  // @LINE:133
  class ReverseUserFinance(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:135
    def doAddFunds(): Call = {
    
      () match {
      
        // @LINE:135
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "User/AddFunds")
      
      }
    
    }
  
    // @LINE:133
    def addFunds(): Call = {
    
      () match {
      
        // @LINE:133
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "User/AddFunds")
      
      }
    
    }
  
  }


}
