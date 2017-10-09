
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Oct 08 23:34:50 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:94
package controllers.Finance {

  // @LINE:94
  class ReverseUserFinance(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:96
    def doAddFunds(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/AddFunds")
    }
  
    // @LINE:94
    def addFunds(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/AddFunds")
    }
  
  }


}
