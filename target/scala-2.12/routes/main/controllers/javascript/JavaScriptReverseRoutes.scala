
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Mon Oct 23 01:02:05 SAST 2017
=======
// @SOURCE:/home/dylan/Desktop/eatalot/eatalot/conf/routes
// @DATE:Sun Oct 22 14:40:06 SAST 2017
>>>>>>> master

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:249
package controllers.javascript {

  // @LINE:249
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:249
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
          }
        
        }
      """
    )
  
  }


}
