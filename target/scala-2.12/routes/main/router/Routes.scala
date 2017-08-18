
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Fri Aug 18 19:03:52 SAST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_4: controllers.Application.HomeController,
  // @LINE:15
  UserController_3: controllers.User.UserController,
  // @LINE:25
  StaffController_7: controllers.User.StaffController,
  // @LINE:36
  CustomerController_6: controllers.User.CustomerController,
  // @LINE:51
  MenuController_1: controllers.Order.MenuController,
  // @LINE:59
  KitchenController_8: controllers.Order.KitchenController,
  // @LINE:67
  DeliveryController_5: controllers.Delivery.DeliveryController,
  // @LINE:74
  CountController_0: controllers.CountController,
  // @LINE:76
  AsyncController_2: controllers.AsyncController,
  // @LINE:79
  Assets_9: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_4: controllers.Application.HomeController,
    // @LINE:15
    UserController_3: controllers.User.UserController,
    // @LINE:25
    StaffController_7: controllers.User.StaffController,
    // @LINE:36
    CustomerController_6: controllers.User.CustomerController,
    // @LINE:51
    MenuController_1: controllers.Order.MenuController,
    // @LINE:59
    KitchenController_8: controllers.Order.KitchenController,
    // @LINE:67
    DeliveryController_5: controllers.Delivery.DeliveryController,
    // @LINE:74
    CountController_0: controllers.CountController,
    // @LINE:76
    AsyncController_2: controllers.AsyncController,
    // @LINE:79
    Assets_9: controllers.Assets
  ) = this(errorHandler, HomeController_4, UserController_3, StaffController_7, CustomerController_6, MenuController_1, KitchenController_8, DeliveryController_5, CountController_0, AsyncController_2, Assets_9, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, UserController_3, StaffController_7, CustomerController_6, MenuController_1, KitchenController_8, DeliveryController_5, CountController_0, AsyncController_2, Assets_9, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Login""", """controllers.User.UserController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Logout""", """controllers.User.UserController.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Login""", """controllers.User.UserController.doLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Staff""", """controllers.User.StaffController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Staff/Login""", """controllers.User.StaffController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Staff/Logout""", """controllers.User.StaffController.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Staff/Login""", """controllers.User.StaffController.doLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User""", """controllers.User.CustomerController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register""", """controllers.User.CustomerController.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Verify/""" + "$" + """token<[^/]+>""", """controllers.User.CustomerController.verifyCustomer(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Profile""", """controllers.User.CustomerController.edit()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register""", """controllers.User.CustomerController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Registration/Reverify""", """controllers.User.CustomerController.reverify()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Registration/Completing""", """controllers.User.CustomerController.completeRegistration()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Profile""", """controllers.User.CustomerController.update()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Menu""", """controllers.Order.MenuController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/User""", """controllers.Order.KitchenController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/User""", """controllers.Delivery.DeliveryController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """path<.+>""", """controllers.Application.HomeController.invalidRoute(path:String)"""),
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
    HomeController_4.index(),
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

  // @LINE:15
  private[this] lazy val controllers_User_UserController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Login")))
  )
  private[this] lazy val controllers_User_UserController_login1_invoker = createInvoker(
    UserController_3.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.UserController",
      "login",
      Nil,
      "GET",
      this.prefix + """User/Login""",
      """User Controller""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_User_UserController_logout2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Logout")))
  )
  private[this] lazy val controllers_User_UserController_logout2_invoker = createInvoker(
    UserController_3.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.UserController",
      "logout",
      Nil,
      "GET",
      this.prefix + """User/Logout""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_User_UserController_doLogin3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Login")))
  )
  private[this] lazy val controllers_User_UserController_doLogin3_invoker = createInvoker(
    UserController_3.doLogin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.UserController",
      "doLogin",
      Nil,
      "POST",
      this.prefix + """User/Login""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_User_StaffController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Staff")))
  )
  private[this] lazy val controllers_User_StaffController_index4_invoker = createInvoker(
    StaffController_7.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.StaffController",
      "index",
      Nil,
      "GET",
      this.prefix + """Staff""",
      """Staff Controller""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_User_StaffController_login5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Staff/Login")))
  )
  private[this] lazy val controllers_User_StaffController_login5_invoker = createInvoker(
    StaffController_7.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.StaffController",
      "login",
      Nil,
      "GET",
      this.prefix + """Staff/Login""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_User_StaffController_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Staff/Logout")))
  )
  private[this] lazy val controllers_User_StaffController_logout6_invoker = createInvoker(
    StaffController_7.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.StaffController",
      "logout",
      Nil,
      "GET",
      this.prefix + """Staff/Logout""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_User_StaffController_doLogin7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Staff/Login")))
  )
  private[this] lazy val controllers_User_StaffController_doLogin7_invoker = createInvoker(
    StaffController_7.doLogin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.StaffController",
      "doLogin",
      Nil,
      "POST",
      this.prefix + """Staff/Login""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_User_CustomerController_index8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User")))
  )
  private[this] lazy val controllers_User_CustomerController_index8_invoker = createInvoker(
    CustomerController_6.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "index",
      Nil,
      "GET",
      this.prefix + """User""",
      """Customer Controller""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_User_CustomerController_register9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_CustomerController_register9_invoker = createInvoker(
    CustomerController_6.register(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "register",
      Nil,
      "GET",
      this.prefix + """User/Register""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_User_CustomerController_verifyCustomer10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Verify/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_CustomerController_verifyCustomer10_invoker = createInvoker(
    CustomerController_6.verifyCustomer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "verifyCustomer",
      Seq(classOf[String]),
      "GET",
      this.prefix + """User/Verify/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_User_CustomerController_edit11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Profile")))
  )
  private[this] lazy val controllers_User_CustomerController_edit11_invoker = createInvoker(
    CustomerController_6.edit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "edit",
      Nil,
      "GET",
      this.prefix + """User/Profile""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_User_CustomerController_create12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_CustomerController_create12_invoker = createInvoker(
    CustomerController_6.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "create",
      Nil,
      "POST",
      this.prefix + """User/Register""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_User_CustomerController_reverify13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Registration/Reverify")))
  )
  private[this] lazy val controllers_User_CustomerController_reverify13_invoker = createInvoker(
    CustomerController_6.reverify(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "reverify",
      Nil,
      "POST",
      this.prefix + """User/Registration/Reverify""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_User_CustomerController_completeRegistration14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Registration/Completing")))
  )
  private[this] lazy val controllers_User_CustomerController_completeRegistration14_invoker = createInvoker(
    CustomerController_6.completeRegistration(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "completeRegistration",
      Nil,
      "POST",
      this.prefix + """User/Registration/Completing""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_User_CustomerController_update15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Profile")))
  )
  private[this] lazy val controllers_User_CustomerController_update15_invoker = createInvoker(
    CustomerController_6.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "update",
      Nil,
      "POST",
      this.prefix + """User/Profile""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Order_MenuController_index16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Menu")))
  )
  private[this] lazy val controllers_Order_MenuController_index16_invoker = createInvoker(
    MenuController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.MenuController",
      "index",
      Nil,
      "GET",
      this.prefix + """Menu""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_Order_KitchenController_index17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/User")))
  )
  private[this] lazy val controllers_Order_KitchenController_index17_invoker = createInvoker(
    KitchenController_8.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "index",
      Nil,
      "GET",
      this.prefix + """Kitchen/User""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_Delivery_DeliveryController_index18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/User")))
  )
  private[this] lazy val controllers_Delivery_DeliveryController_index18_invoker = createInvoker(
    DeliveryController_5.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Delivery.DeliveryController",
      "index",
      Nil,
      "GET",
      this.prefix + """Delivery/User""",
      """""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_CountController_count19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count19_invoker = createInvoker(
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

  // @LINE:76
  private[this] lazy val controllers_AsyncController_message20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message20_invoker = createInvoker(
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

  // @LINE:79
  private[this] lazy val controllers_Assets_versioned21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned21_invoker = createInvoker(
    Assets_9.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:80
  private[this] lazy val controllers_Application_HomeController_invalidRoute22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("path", """.+""",false)))
  )
  private[this] lazy val controllers_Application_HomeController_invalidRoute22_invoker = createInvoker(
    HomeController_4.invalidRoute(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application.HomeController",
      "invalidRoute",
      Seq(classOf[String]),
      "GET",
      this.prefix + """""" + "$" + """path<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_HomeController_index0_route(params) =>
      call { 
        controllers_Application_HomeController_index0_invoker.call(HomeController_4.index())
      }
  
    // @LINE:15
    case controllers_User_UserController_login1_route(params) =>
      call { 
        controllers_User_UserController_login1_invoker.call(UserController_3.login())
      }
  
    // @LINE:16
    case controllers_User_UserController_logout2_route(params) =>
      call { 
        controllers_User_UserController_logout2_invoker.call(UserController_3.logout())
      }
  
    // @LINE:18
    case controllers_User_UserController_doLogin3_route(params) =>
      call { 
        controllers_User_UserController_doLogin3_invoker.call(UserController_3.doLogin())
      }
  
    // @LINE:25
    case controllers_User_StaffController_index4_route(params) =>
      call { 
        controllers_User_StaffController_index4_invoker.call(StaffController_7.index())
      }
  
    // @LINE:26
    case controllers_User_StaffController_login5_route(params) =>
      call { 
        controllers_User_StaffController_login5_invoker.call(StaffController_7.login())
      }
  
    // @LINE:27
    case controllers_User_StaffController_logout6_route(params) =>
      call { 
        controllers_User_StaffController_logout6_invoker.call(StaffController_7.logout())
      }
  
    // @LINE:29
    case controllers_User_StaffController_doLogin7_route(params) =>
      call { 
        controllers_User_StaffController_doLogin7_invoker.call(StaffController_7.doLogin())
      }
  
    // @LINE:36
    case controllers_User_CustomerController_index8_route(params) =>
      call { 
        controllers_User_CustomerController_index8_invoker.call(CustomerController_6.index())
      }
  
    // @LINE:37
    case controllers_User_CustomerController_register9_route(params) =>
      call { 
        controllers_User_CustomerController_register9_invoker.call(CustomerController_6.register())
      }
  
    // @LINE:38
    case controllers_User_CustomerController_verifyCustomer10_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_User_CustomerController_verifyCustomer10_invoker.call(CustomerController_6.verifyCustomer(token))
      }
  
    // @LINE:39
    case controllers_User_CustomerController_edit11_route(params) =>
      call { 
        controllers_User_CustomerController_edit11_invoker.call(CustomerController_6.edit())
      }
  
    // @LINE:41
    case controllers_User_CustomerController_create12_route(params) =>
      call { 
        controllers_User_CustomerController_create12_invoker.call(CustomerController_6.create())
      }
  
    // @LINE:42
    case controllers_User_CustomerController_reverify13_route(params) =>
      call { 
        controllers_User_CustomerController_reverify13_invoker.call(CustomerController_6.reverify())
      }
  
    // @LINE:43
    case controllers_User_CustomerController_completeRegistration14_route(params) =>
      call { 
        controllers_User_CustomerController_completeRegistration14_invoker.call(CustomerController_6.completeRegistration())
      }
  
    // @LINE:44
    case controllers_User_CustomerController_update15_route(params) =>
      call { 
        controllers_User_CustomerController_update15_invoker.call(CustomerController_6.update())
      }
  
    // @LINE:51
    case controllers_Order_MenuController_index16_route(params) =>
      call { 
        controllers_Order_MenuController_index16_invoker.call(MenuController_1.index())
      }
  
    // @LINE:59
    case controllers_Order_KitchenController_index17_route(params) =>
      call { 
        controllers_Order_KitchenController_index17_invoker.call(KitchenController_8.index())
      }
  
    // @LINE:67
    case controllers_Delivery_DeliveryController_index18_route(params) =>
      call { 
        controllers_Delivery_DeliveryController_index18_invoker.call(DeliveryController_5.index())
      }
  
    // @LINE:74
    case controllers_CountController_count19_route(params) =>
      call { 
        controllers_CountController_count19_invoker.call(CountController_0.count)
      }
  
    // @LINE:76
    case controllers_AsyncController_message20_route(params) =>
      call { 
        controllers_AsyncController_message20_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:79
    case controllers_Assets_versioned21_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned21_invoker.call(Assets_9.versioned(path, file))
      }
  
    // @LINE:80
    case controllers_Application_HomeController_invalidRoute22_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_HomeController_invalidRoute22_invoker.call(HomeController_4.invalidRoute(path))
      }
  }
}
