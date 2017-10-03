
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Sep 24 23:41:08 SAST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_5: controllers.Application.HomeController,
  // @LINE:15
  UserController_4: controllers.User.UserController,
  // @LINE:25
  StaffController_8: controllers.User.StaffController,
  // @LINE:36
  CustomerController_7: controllers.User.CustomerController,
  // @LINE:51
  MenuController_1: controllers.Order.MenuController,
  // @LINE:59
  KitchenController_9: controllers.Order.KitchenController,
  // @LINE:67
  DeliveryController_6: controllers.Delivery.DeliveryController,
  // @LINE:75
  UserFinance_2: controllers.Finance.UserFinance,
  // @LINE:83
  CountController_0: controllers.CountController,
  // @LINE:85
  AsyncController_3: controllers.AsyncController,
  // @LINE:88
  Assets_10: controllers.Assets,
  // @LINE:93
  OrderController_11: controllers.OrderController,
  // @LINE:97
  AccountController_12: controllers.AccountController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_5: controllers.Application.HomeController,
    // @LINE:15
    UserController_4: controllers.User.UserController,
    // @LINE:25
    StaffController_8: controllers.User.StaffController,
    // @LINE:36
    CustomerController_7: controllers.User.CustomerController,
    // @LINE:51
    MenuController_1: controllers.Order.MenuController,
    // @LINE:59
    KitchenController_9: controllers.Order.KitchenController,
    // @LINE:67
    DeliveryController_6: controllers.Delivery.DeliveryController,
    // @LINE:75
    UserFinance_2: controllers.Finance.UserFinance,
    // @LINE:83
    CountController_0: controllers.CountController,
    // @LINE:85
    AsyncController_3: controllers.AsyncController,
    // @LINE:88
    Assets_10: controllers.Assets,
    // @LINE:93
    OrderController_11: controllers.OrderController,
    // @LINE:97
    AccountController_12: controllers.AccountController
  ) = this(errorHandler, HomeController_5, UserController_4, StaffController_8, CustomerController_7, MenuController_1, KitchenController_9, DeliveryController_6, UserFinance_2, CountController_0, AsyncController_3, Assets_10, OrderController_11, AccountController_12, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_5, UserController_4, StaffController_8, CustomerController_7, MenuController_1, KitchenController_9, DeliveryController_6, UserFinance_2, CountController_0, AsyncController_3, Assets_10, OrderController_11, AccountController_12, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/AddFunds""", """controllers.Finance.UserFinance.addFunds()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/AddFunds""", """controllers.Finance.UserFinance.doAddFunds()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """path<.+>""", """controllers.Application.HomeController.invalidRoute(path:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu""", """controllers.OrderController.getMenu()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/""" + "$" + """menutype<[^/]+>""", """controllers.OrderController.switchMenu(menutype:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.AccountController.getSignUp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addmealtoorder""", """controllers.OrderController.addMealToOrder(mealId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addmeal""", """controllers.OrderController.getAddMealToMenu"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postmeal""", """controllers.OrderController.addMeal"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dologin""", """controllers.AccountController.doLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dosignout""", """controllers.AccountController.doSignOut()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.OrderController.getCart()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/removemeal""", """controllers.OrderController.removeMealFromOrder(mealId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submit""", """controllers.OrderController.submitCart()"""),
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
    HomeController_5.index(),
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
    UserController_4.login(),
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
    UserController_4.logout(),
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
    UserController_4.doLogin(),
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
    StaffController_8.index(),
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
    StaffController_8.login(),
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
    StaffController_8.logout(),
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
    StaffController_8.doLogin(),
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
    CustomerController_7.index(),
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
    CustomerController_7.register(),
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
    CustomerController_7.verifyCustomer(fakeValue[String]),
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
    CustomerController_7.edit(),
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
    CustomerController_7.create(),
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
    CustomerController_7.reverify(),
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
    CustomerController_7.completeRegistration(),
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
    CustomerController_7.update(),
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
    KitchenController_9.index(),
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
    DeliveryController_6.index(),
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

  // @LINE:75
  private[this] lazy val controllers_Finance_UserFinance_addFunds19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_addFunds19_invoker = createInvoker(
    UserFinance_2.addFunds(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Finance.UserFinance",
      "addFunds",
      Nil,
      "GET",
      this.prefix + """User/AddFunds""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds20_invoker = createInvoker(
    UserFinance_2.doAddFunds(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Finance.UserFinance",
      "doAddFunds",
      Nil,
      "POST",
      this.prefix + """User/AddFunds""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_CountController_count21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count21_invoker = createInvoker(
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

  // @LINE:85
  private[this] lazy val controllers_AsyncController_message22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message22_invoker = createInvoker(
    AsyncController_3.message,
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

  // @LINE:88
  private[this] lazy val controllers_Assets_versioned23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned23_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:89
  private[this] lazy val controllers_Application_HomeController_invalidRoute24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("path", """.+""",false)))
  )
  private[this] lazy val controllers_Application_HomeController_invalidRoute24_invoker = createInvoker(
    HomeController_5.invalidRoute(fakeValue[String]),
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

  // @LINE:93
  private[this] lazy val controllers_OrderController_getMenu25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu")))
  )
  private[this] lazy val controllers_OrderController_getMenu25_invoker = createInvoker(
    OrderController_11.getMenu(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getMenu",
      Nil,
      "GET",
      this.prefix + """menu""",
      """# Javascript routes
GET     /javascriptRoutes        controllers.JavascriptRoutesController""",
      Seq()
    )
  )

  // @LINE:95
  private[this] lazy val controllers_OrderController_switchMenu26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/"), DynamicPart("menutype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_switchMenu26_invoker = createInvoker(
    OrderController_11.switchMenu(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "switchMenu",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """menu/""" + "$" + """menutype<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val controllers_AccountController_getSignUp27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_AccountController_getSignUp27_invoker = createInvoker(
    AccountController_12.getSignUp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccountController",
      "getSignUp",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val controllers_OrderController_addMealToOrder28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmealtoorder")))
  )
  private[this] lazy val controllers_OrderController_addMealToOrder28_invoker = createInvoker(
    OrderController_11.addMealToOrder(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addMealToOrder",
      Seq(classOf[String]),
      "POST",
      this.prefix + """addmealtoorder""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_OrderController_getAddMealToMenu29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmeal")))
  )
  private[this] lazy val controllers_OrderController_getAddMealToMenu29_invoker = createInvoker(
    OrderController_11.getAddMealToMenu,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getAddMealToMenu",
      Nil,
      "GET",
      this.prefix + """addmeal""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_OrderController_addMeal30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postmeal")))
  )
  private[this] lazy val controllers_OrderController_addMeal30_invoker = createInvoker(
    OrderController_11.addMeal,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addMeal",
      Nil,
      "POST",
      this.prefix + """postmeal""",
      """""",
      Seq()
    )
  )

  // @LINE:105
  private[this] lazy val controllers_AccountController_doLogin31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dologin")))
  )
  private[this] lazy val controllers_AccountController_doLogin31_invoker = createInvoker(
    AccountController_12.doLogin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccountController",
      "doLogin",
      Nil,
      "GET",
      this.prefix + """dologin""",
      """""",
      Seq()
    )
  )

  // @LINE:107
  private[this] lazy val controllers_AccountController_doSignOut32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dosignout")))
  )
  private[this] lazy val controllers_AccountController_doSignOut32_invoker = createInvoker(
    AccountController_12.doSignOut(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccountController",
      "doSignOut",
      Nil,
      "GET",
      this.prefix + """dosignout""",
      """""",
      Seq()
    )
  )

  // @LINE:109
  private[this] lazy val controllers_OrderController_getCart33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_OrderController_getCart33_invoker = createInvoker(
    OrderController_11.getCart(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getCart",
      Nil,
      "GET",
      this.prefix + """cart""",
      """""",
      Seq()
    )
  )

  // @LINE:111
  private[this] lazy val controllers_OrderController_removeMealFromOrder34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/removemeal")))
  )
  private[this] lazy val controllers_OrderController_removeMealFromOrder34_invoker = createInvoker(
    OrderController_11.removeMealFromOrder(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "removeMealFromOrder",
      Seq(classOf[String]),
      "POST",
      this.prefix + """cart/removemeal""",
      """""",
      Seq()
    )
  )

  // @LINE:113
  private[this] lazy val controllers_OrderController_submitCart35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit")))
  )
  private[this] lazy val controllers_OrderController_submitCart35_invoker = createInvoker(
    OrderController_11.submitCart(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "submitCart",
      Nil,
      "POST",
      this.prefix + """submit""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_HomeController_index0_route(params) =>
      call { 
        controllers_Application_HomeController_index0_invoker.call(HomeController_5.index())
      }
  
    // @LINE:15
    case controllers_User_UserController_login1_route(params) =>
      call { 
        controllers_User_UserController_login1_invoker.call(UserController_4.login())
      }
  
    // @LINE:16
    case controllers_User_UserController_logout2_route(params) =>
      call { 
        controllers_User_UserController_logout2_invoker.call(UserController_4.logout())
      }
  
    // @LINE:18
    case controllers_User_UserController_doLogin3_route(params) =>
      call { 
        controllers_User_UserController_doLogin3_invoker.call(UserController_4.doLogin())
      }
  
    // @LINE:25
    case controllers_User_StaffController_index4_route(params) =>
      call { 
        controllers_User_StaffController_index4_invoker.call(StaffController_8.index())
      }
  
    // @LINE:26
    case controllers_User_StaffController_login5_route(params) =>
      call { 
        controllers_User_StaffController_login5_invoker.call(StaffController_8.login())
      }
  
    // @LINE:27
    case controllers_User_StaffController_logout6_route(params) =>
      call { 
        controllers_User_StaffController_logout6_invoker.call(StaffController_8.logout())
      }
  
    // @LINE:29
    case controllers_User_StaffController_doLogin7_route(params) =>
      call { 
        controllers_User_StaffController_doLogin7_invoker.call(StaffController_8.doLogin())
      }
  
    // @LINE:36
    case controllers_User_CustomerController_index8_route(params) =>
      call { 
        controllers_User_CustomerController_index8_invoker.call(CustomerController_7.index())
      }
  
    // @LINE:37
    case controllers_User_CustomerController_register9_route(params) =>
      call { 
        controllers_User_CustomerController_register9_invoker.call(CustomerController_7.register())
      }
  
    // @LINE:38
    case controllers_User_CustomerController_verifyCustomer10_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_User_CustomerController_verifyCustomer10_invoker.call(CustomerController_7.verifyCustomer(token))
      }
  
    // @LINE:39
    case controllers_User_CustomerController_edit11_route(params) =>
      call { 
        controllers_User_CustomerController_edit11_invoker.call(CustomerController_7.edit())
      }
  
    // @LINE:41
    case controllers_User_CustomerController_create12_route(params) =>
      call { 
        controllers_User_CustomerController_create12_invoker.call(CustomerController_7.create())
      }
  
    // @LINE:42
    case controllers_User_CustomerController_reverify13_route(params) =>
      call { 
        controllers_User_CustomerController_reverify13_invoker.call(CustomerController_7.reverify())
      }
  
    // @LINE:43
    case controllers_User_CustomerController_completeRegistration14_route(params) =>
      call { 
        controllers_User_CustomerController_completeRegistration14_invoker.call(CustomerController_7.completeRegistration())
      }
  
    // @LINE:44
    case controllers_User_CustomerController_update15_route(params) =>
      call { 
        controllers_User_CustomerController_update15_invoker.call(CustomerController_7.update())
      }
  
    // @LINE:51
    case controllers_Order_MenuController_index16_route(params) =>
      call { 
        controllers_Order_MenuController_index16_invoker.call(MenuController_1.index())
      }
  
    // @LINE:59
    case controllers_Order_KitchenController_index17_route(params) =>
      call { 
        controllers_Order_KitchenController_index17_invoker.call(KitchenController_9.index())
      }
  
    // @LINE:67
    case controllers_Delivery_DeliveryController_index18_route(params) =>
      call { 
        controllers_Delivery_DeliveryController_index18_invoker.call(DeliveryController_6.index())
      }
  
    // @LINE:75
    case controllers_Finance_UserFinance_addFunds19_route(params) =>
      call { 
        controllers_Finance_UserFinance_addFunds19_invoker.call(UserFinance_2.addFunds())
      }
  
    // @LINE:76
    case controllers_Finance_UserFinance_doAddFunds20_route(params) =>
      call { 
        controllers_Finance_UserFinance_doAddFunds20_invoker.call(UserFinance_2.doAddFunds())
      }
  
    // @LINE:83
    case controllers_CountController_count21_route(params) =>
      call { 
        controllers_CountController_count21_invoker.call(CountController_0.count)
      }
  
    // @LINE:85
    case controllers_AsyncController_message22_route(params) =>
      call { 
        controllers_AsyncController_message22_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:88
    case controllers_Assets_versioned23_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned23_invoker.call(Assets_10.versioned(path, file))
      }
  
    // @LINE:89
    case controllers_Application_HomeController_invalidRoute24_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_HomeController_invalidRoute24_invoker.call(HomeController_5.invalidRoute(path))
      }
  
    // @LINE:93
    case controllers_OrderController_getMenu25_route(params) =>
      call { 
        controllers_OrderController_getMenu25_invoker.call(OrderController_11.getMenu())
      }
  
    // @LINE:95
    case controllers_OrderController_switchMenu26_route(params) =>
      call(params.fromPath[Integer]("menutype", None)) { (menutype) =>
        controllers_OrderController_switchMenu26_invoker.call(OrderController_11.switchMenu(menutype))
      }
  
    // @LINE:97
    case controllers_AccountController_getSignUp27_route(params) =>
      call { 
        controllers_AccountController_getSignUp27_invoker.call(AccountController_12.getSignUp)
      }
  
    // @LINE:99
    case controllers_OrderController_addMealToOrder28_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_OrderController_addMealToOrder28_invoker.call(OrderController_11.addMealToOrder(mealId))
      }
  
    // @LINE:101
    case controllers_OrderController_getAddMealToMenu29_route(params) =>
      call { 
        controllers_OrderController_getAddMealToMenu29_invoker.call(OrderController_11.getAddMealToMenu)
      }
  
    // @LINE:103
    case controllers_OrderController_addMeal30_route(params) =>
      call { 
        controllers_OrderController_addMeal30_invoker.call(OrderController_11.addMeal)
      }
  
    // @LINE:105
    case controllers_AccountController_doLogin31_route(params) =>
      call { 
        controllers_AccountController_doLogin31_invoker.call(AccountController_12.doLogin())
      }
  
    // @LINE:107
    case controllers_AccountController_doSignOut32_route(params) =>
      call { 
        controllers_AccountController_doSignOut32_invoker.call(AccountController_12.doSignOut())
      }
  
    // @LINE:109
    case controllers_OrderController_getCart33_route(params) =>
      call { 
        controllers_OrderController_getCart33_invoker.call(OrderController_11.getCart())
      }
  
    // @LINE:111
    case controllers_OrderController_removeMealFromOrder34_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_OrderController_removeMealFromOrder34_invoker.call(OrderController_11.removeMealFromOrder(mealId))
      }
  
    // @LINE:113
    case controllers_OrderController_submitCart35_route(params) =>
      call { 
        controllers_OrderController_submitCart35_invoker.call(OrderController_11.submitCart())
      }
  }
}
