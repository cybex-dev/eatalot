
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sat Aug 05 21:16:56 SAST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.Application.HomeController,
  // @LINE:14
  AccountController_1: controllers.User.AccountController,
  // @LINE:29
  CustomerController_4: controllers.User.CustomerController,
  // @LINE:35
  CountController_0: controllers.CountController,
  // @LINE:37
  AsyncController_2: controllers.AsyncController,
  // @LINE:40
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.Application.HomeController,
    // @LINE:14
    AccountController_1: controllers.User.AccountController,
    // @LINE:29
    CustomerController_4: controllers.User.CustomerController,
    // @LINE:35
    CountController_0: controllers.CountController,
    // @LINE:37
    AsyncController_2: controllers.AsyncController,
    // @LINE:40
    Assets_5: controllers.Assets
  ) = this(errorHandler, HomeController_3, AccountController_1, CustomerController_4, CountController_0, AsyncController_2, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, AccountController_1, CustomerController_4, CountController_0, AsyncController_2, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User""", """controllers.User.AccountController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register""", """controllers.User.AccountController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Login""", """controllers.User.AccountController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Logout""", """controllers.User.AccountController.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Verify/""" + "$" + """token<[^/]+>""", """controllers.User.AccountController.verify(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register""", """controllers.User.AccountController.save()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Login""", """controllers.User.AccountController.doLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User""", """controllers.User.CustomerController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_HomeController_index0_invoker = createInvoker(
    HomeController_3.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Shows EatAloT home page""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_User_AccountController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User")))
  )
  private[this] lazy val controllers_User_AccountController_index1_invoker = createInvoker(
    AccountController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AccountController",
      "index",
      Nil,
      "GET",
      this.prefix + """User""",
      """Account Controller""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_User_AccountController_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_AccountController_create2_invoker = createInvoker(
    AccountController_1.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AccountController",
      "create",
      Nil,
      "GET",
      this.prefix + """User/Register""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_User_AccountController_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Login")))
  )
  private[this] lazy val controllers_User_AccountController_login3_invoker = createInvoker(
    AccountController_1.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AccountController",
      "login",
      Nil,
      "GET",
      this.prefix + """User/Login""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_User_AccountController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Logout")))
  )
  private[this] lazy val controllers_User_AccountController_logout4_invoker = createInvoker(
    AccountController_1.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AccountController",
      "logout",
      Nil,
      "GET",
      this.prefix + """User/Logout""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_User_AccountController_verify5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Verify/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_AccountController_verify5_invoker = createInvoker(
    AccountController_1.verify(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AccountController",
      "verify",
      Seq(classOf[String]),
      "GET",
      this.prefix + """User/Verify/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_User_AccountController_save6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_AccountController_save6_invoker = createInvoker(
    AccountController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AccountController",
      "save",
      Nil,
      "POST",
      this.prefix + """User/Register""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_User_AccountController_doLogin7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Login")))
  )
  private[this] lazy val controllers_User_AccountController_doLogin7_invoker = createInvoker(
    AccountController_1.doLogin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AccountController",
      "doLogin",
      Nil,
      "POST",
      this.prefix + """User/Login""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_User_CustomerController_index8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User")))
  )
  private[this] lazy val controllers_User_CustomerController_index8_invoker = createInvoker(
    CustomerController_4.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "index",
      Nil,
      "GET",
      this.prefix + """User""",
      """CustomerController""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_CountController_count9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count9_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_AsyncController_message10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message10_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_HomeController_index0_route(params) =>
      call { 
        controllers_Application_HomeController_index0_invoker.call(HomeController_3.index())
      }
  
    // @LINE:14
    case controllers_User_AccountController_index1_route(params) =>
      call { 
        controllers_User_AccountController_index1_invoker.call(AccountController_1.index())
      }
  
    // @LINE:15
    case controllers_User_AccountController_create2_route(params) =>
      call { 
        controllers_User_AccountController_create2_invoker.call(AccountController_1.create())
      }
  
    // @LINE:16
    case controllers_User_AccountController_login3_route(params) =>
      call { 
        controllers_User_AccountController_login3_invoker.call(AccountController_1.login())
      }
  
    // @LINE:17
    case controllers_User_AccountController_logout4_route(params) =>
      call { 
        controllers_User_AccountController_logout4_invoker.call(AccountController_1.logout())
      }
  
    // @LINE:18
    case controllers_User_AccountController_verify5_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_User_AccountController_verify5_invoker.call(AccountController_1.verify(token))
      }
  
    // @LINE:21
    case controllers_User_AccountController_save6_route(params) =>
      call { 
        controllers_User_AccountController_save6_invoker.call(AccountController_1.save())
      }
  
    // @LINE:22
    case controllers_User_AccountController_doLogin7_route(params) =>
      call { 
        controllers_User_AccountController_doLogin7_invoker.call(AccountController_1.doLogin())
      }
  
    // @LINE:29
    case controllers_User_CustomerController_index8_route(params) =>
      call { 
        controllers_User_CustomerController_index8_invoker.call(CustomerController_4.index())
      }
  
    // @LINE:35
    case controllers_CountController_count9_route(params) =>
      call { 
        controllers_CountController_count9_invoker.call(CountController_0.count)
      }
  
    // @LINE:37
    case controllers_AsyncController_message10_route(params) =>
      call { 
        controllers_AsyncController_message10_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:40
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
