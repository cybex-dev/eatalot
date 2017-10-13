
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Fri Oct 13 07:57:43 SAST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:114
package controllers.Finance {

  // @LINE:114
  class ReverseUserFinance(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:116
    def doAddFunds(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "User/AddFunds")
    }
  
    // @LINE:114
    def addFunds(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "User/AddFunds")
    }
  
  }


}
