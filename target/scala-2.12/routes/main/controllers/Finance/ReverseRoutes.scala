
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Oct 14 13:03:12 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:123
package controllers.Finance {

  // @LINE:123
  class ReverseUserFinance(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:125
    def doAddFunds(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/AddFunds")
    }
  
    // @LINE:123
    def addFunds(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/AddFunds")
    }
  
  }


}
