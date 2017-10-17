
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Mon Oct 16 01:08:43 SAST 2017

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
      
      Call("POST", _prefix + { _defaultPrefix } + "User/AddFunds")
    }
  
    // @LINE:133
    def addFunds(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/AddFunds")
    }
  
  }


}
