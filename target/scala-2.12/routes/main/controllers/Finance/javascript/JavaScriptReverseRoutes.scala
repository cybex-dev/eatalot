
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Mon Oct 23 01:02:05 SAST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:131
package controllers.Finance.javascript {

  // @LINE:131
  class ReverseUserFinanceController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:240
    def financeJSRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Finance.UserFinanceController.financeJSRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/financeJSRoutes"})
        }
      """
    )
  
    // @LINE:148
    def removeDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Finance.UserFinanceController.removeDiscount",
      """
        function(discountId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Discounts/Remove/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("discountId", encodeURIComponent(discountId0))})
        }
      """
    )
  
    // @LINE:156
    def addFunds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Finance.UserFinanceController.addFunds",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/AddFunds"})
        }
      """
    )
  
    // @LINE:158
    def doAddFunds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Finance.UserFinanceController.doAddFunds",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "User/AddFunds"})
        }
      """
    )
  
    // @LINE:136
    def updateDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Finance.UserFinanceController.updateDiscount",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Discounts/Edit"})
          }
        
        }
      """
    )
  
    // @LINE:132
    def editDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Finance.UserFinanceController.editDiscount",
      """
        function(discountId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Discounts/Edit/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("discountId", encodeURIComponent(discountId0))})
        }
      """
    )
  
    // @LINE:131
    def addDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Finance.UserFinanceController.addDiscount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/Manage/Discounts/Add/"})
        }
      """
    )
  
  }


}
