
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Mon Oct 23 01:02:05 SAST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
