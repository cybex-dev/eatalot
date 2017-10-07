
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Fri Oct 06 21:38:00 SAST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_6: controllers.Application.HomeController,
  // @LINE:15
  UserController_5: controllers.User.UserController,
  // @LINE:25
  StaffController_9: controllers.User.StaffController,
  // @LINE:36
  CustomerController_8: controllers.User.CustomerController,
  // @LINE:52
  ScheduleController_4: controllers.Order.ScheduleController,
  // @LINE:65
  MenuController_1: controllers.Order.MenuController,
  // @LINE:73
  KitchenController_10: controllers.Order.KitchenController,
  // @LINE:81
  DeliveryController_7: controllers.Delivery.DeliveryController,
  // @LINE:89
  UserFinance_2: controllers.Finance.UserFinance,
  // @LINE:99
  OrderController_12: controllers.OrderController,
  // @LINE:103
  AccountController_13: controllers.AccountController,
  // @LINE:124
  CountController_0: controllers.CountController,
  // @LINE:127
  AsyncController_3: controllers.AsyncController,
  // @LINE:130
  Assets_11: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_6: controllers.Application.HomeController,
    // @LINE:15
    UserController_5: controllers.User.UserController,
    // @LINE:25
    StaffController_9: controllers.User.StaffController,
    // @LINE:36
    CustomerController_8: controllers.User.CustomerController,
    // @LINE:52
    ScheduleController_4: controllers.Order.ScheduleController,
    // @LINE:65
    MenuController_1: controllers.Order.MenuController,
    // @LINE:73
    KitchenController_10: controllers.Order.KitchenController,
    // @LINE:81
    DeliveryController_7: controllers.Delivery.DeliveryController,
    // @LINE:89
    UserFinance_2: controllers.Finance.UserFinance,
    // @LINE:99
    OrderController_12: controllers.OrderController,
    // @LINE:103
    AccountController_13: controllers.AccountController,
    // @LINE:124
    CountController_0: controllers.CountController,
    // @LINE:127
    AsyncController_3: controllers.AsyncController,
    // @LINE:130
    Assets_11: controllers.Assets
  ) = this(errorHandler, HomeController_6, UserController_5, StaffController_9, CustomerController_8, ScheduleController_4, MenuController_1, KitchenController_10, DeliveryController_7, UserFinance_2, OrderController_12, AccountController_13, CountController_0, AsyncController_3, Assets_11, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_6, UserController_5, StaffController_9, CustomerController_8, ScheduleController_4, MenuController_1, KitchenController_10, DeliveryController_7, UserFinance_2, OrderController_12, AccountController_13, CountController_0, AsyncController_3, Assets_11, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/History/Orders""", """controllers.User.CustomerController.orderHistory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/History/Purchases""", """controllers.User.CustomerController.paymentHistory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/History/Order/""" + "$" + """orderId<[^/]+>""", """controllers.User.CustomerController.viewOrder(orderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/History/Payment/""" + "$" + """paymentId<[^/]+>""", """controllers.User.CustomerController.viewHistoricPayment(paymentId:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register""", """controllers.User.CustomerController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register/Reverify""", """controllers.User.CustomerController.reverify()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register/Completing""", """controllers.User.CustomerController.completeRegistration()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Profile""", """controllers.User.CustomerController.update()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule""", """controllers.Order.ScheduleController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/New""", """controllers.Order.ScheduleController.createSchedule()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/AddOrder""", """controllers.Order.ScheduleController.addOrder()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/New""", """controllers.Order.ScheduleController.doCreateSchedule()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/AddOrder""", """controllers.Order.ScheduleController.doAddOrder()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/Clear""", """controllers.Order.ScheduleController.clearSchedule()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Menu""", """controllers.Order.MenuController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/User""", """controllers.Order.KitchenController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/User""", """controllers.Delivery.DeliveryController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/AddFunds""", """controllers.Finance.UserFinance.addFunds()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/AddFunds""", """controllers.Finance.UserFinance.doAddFunds()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/User/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/User/Registration/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/Delivery/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/Kitchen/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/Staff/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/History/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
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
    HomeController_6.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_User_UserController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Login")))
  )
  private[this] lazy val controllers_User_UserController_login1_invoker = createInvoker(
    UserController_5.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.UserController",
      "login",
      Nil,
      "GET",
      this.prefix + """User/Login""",
      """ User Controller""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_User_UserController_logout2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Logout")))
  )
  private[this] lazy val controllers_User_UserController_logout2_invoker = createInvoker(
    UserController_5.logout(),
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
    UserController_5.doLogin(),
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
    StaffController_9.index(),
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
    StaffController_9.login(),
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
    StaffController_9.logout(),
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
    StaffController_9.doLogin(),
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
    CustomerController_8.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "index",
      Nil,
      "GET",
      this.prefix + """User""",
      """ Customer Controller""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_User_CustomerController_register9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_CustomerController_register9_invoker = createInvoker(
    CustomerController_8.register(),
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
    CustomerController_8.verifyCustomer(fakeValue[String]),
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
    CustomerController_8.edit(),
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

  // @LINE:40
  private[this] lazy val controllers_User_CustomerController_orderHistory12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Orders")))
  )
  private[this] lazy val controllers_User_CustomerController_orderHistory12_invoker = createInvoker(
    CustomerController_8.orderHistory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "orderHistory",
      Nil,
      "GET",
      this.prefix + """User/History/Orders""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_User_CustomerController_paymentHistory13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Purchases")))
  )
  private[this] lazy val controllers_User_CustomerController_paymentHistory13_invoker = createInvoker(
    CustomerController_8.paymentHistory(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "paymentHistory",
      Nil,
      "GET",
      this.prefix + """User/History/Purchases""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_User_CustomerController_viewOrder14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Order/"), DynamicPart("orderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_CustomerController_viewOrder14_invoker = createInvoker(
    CustomerController_8.viewOrder(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "viewOrder",
      Seq(classOf[String]),
      "GET",
      this.prefix + """User/History/Order/""" + "$" + """orderId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_User_CustomerController_viewPayment15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Payment/"), DynamicPart("paymentId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_CustomerController_viewPayment15_invoker = createInvoker(
    CustomerController_8.viewPayment(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "viewHistoricPayment",
      Seq(classOf[String]),
      "GET",
      this.prefix + """User/History/Payment/""" + "$" + """paymentId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_User_CustomerController_create16_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_CustomerController_create16_invoker = createInvoker(
    CustomerController_8.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "create",
      Nil,
      "PUT",
      this.prefix + """User/Register""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_User_CustomerController_reverify17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register/Reverify")))
  )
  private[this] lazy val controllers_User_CustomerController_reverify17_invoker = createInvoker(
    CustomerController_8.reverify(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "reverify",
      Nil,
      "POST",
      this.prefix + """User/Register/Reverify""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_User_CustomerController_completeRegistration18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register/Completing")))
  )
  private[this] lazy val controllers_User_CustomerController_completeRegistration18_invoker = createInvoker(
    CustomerController_8.completeRegistration(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "completeRegistration",
      Nil,
      "POST",
      this.prefix + """User/Register/Completing""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_User_CustomerController_update19_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Profile")))
  )
  private[this] lazy val controllers_User_CustomerController_update19_invoker = createInvoker(
    CustomerController_8.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "update",
      Nil,
      "PUT",
      this.prefix + """User/Profile""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Order_ScheduleController_index20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule")))
  )
  private[this] lazy val controllers_Order_ScheduleController_index20_invoker = createInvoker(
    ScheduleController_4.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "index",
      Nil,
      "GET",
      this.prefix + """User/Schedule""",
      """ Customer Schedule""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_Order_ScheduleController_createSchedule21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/New")))
  )
  private[this] lazy val controllers_Order_ScheduleController_createSchedule21_invoker = createInvoker(
    ScheduleController_4.createSchedule(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "createSchedule",
      Nil,
      "GET",
      this.prefix + """User/Schedule/New""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Order_ScheduleController_addOrder22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/AddOrder")))
  )
  private[this] lazy val controllers_Order_ScheduleController_addOrder22_invoker = createInvoker(
    ScheduleController_4.addOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "addOrder",
      Nil,
      "GET",
      this.prefix + """User/Schedule/AddOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Order_ScheduleController_doCreateSchedule23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/New")))
  )
  private[this] lazy val controllers_Order_ScheduleController_doCreateSchedule23_invoker = createInvoker(
    ScheduleController_4.doCreateSchedule(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "doCreateSchedule",
      Nil,
      "POST",
      this.prefix + """User/Schedule/New""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_Order_ScheduleController_doAddOrder24_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/AddOrder")))
  )
  private[this] lazy val controllers_Order_ScheduleController_doAddOrder24_invoker = createInvoker(
    ScheduleController_4.doAddOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "doAddOrder",
      Nil,
      "PUT",
      this.prefix + """User/Schedule/AddOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Order_ScheduleController_clearSchedule25_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Clear")))
  )
  private[this] lazy val controllers_Order_ScheduleController_clearSchedule25_invoker = createInvoker(
    ScheduleController_4.clearSchedule(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "clearSchedule",
      Nil,
      "DELETE",
      this.prefix + """User/Schedule/Clear""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_Order_MenuController_index26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Menu")))
  )
  private[this] lazy val controllers_Order_MenuController_index26_invoker = createInvoker(
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

  // @LINE:73
  private[this] lazy val controllers_Order_KitchenController_index27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/User")))
  )
  private[this] lazy val controllers_Order_KitchenController_index27_invoker = createInvoker(
    KitchenController_10.index(),
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

  // @LINE:81
  private[this] lazy val controllers_Delivery_DeliveryController_index28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/User")))
  )
  private[this] lazy val controllers_Delivery_DeliveryController_index28_invoker = createInvoker(
    DeliveryController_7.index(),
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

  // @LINE:89
  private[this] lazy val controllers_Finance_UserFinance_addFunds29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_addFunds29_invoker = createInvoker(
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

  // @LINE:91
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds30_invoker = createInvoker(
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

  // @LINE:99
  private[this] lazy val controllers_OrderController_getMenu31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu")))
  )
  private[this] lazy val controllers_OrderController_getMenu31_invoker = createInvoker(
    OrderController_12.getMenu(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getMenu",
      Nil,
      "GET",
      this.prefix + """menu""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_OrderController_switchMenu32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/"), DynamicPart("menutype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_switchMenu32_invoker = createInvoker(
    OrderController_12.switchMenu(fakeValue[Integer]),
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

  // @LINE:103
  private[this] lazy val controllers_AccountController_getSignUp33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_AccountController_getSignUp33_invoker = createInvoker(
    AccountController_13.getSignUp,
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

  // @LINE:105
  private[this] lazy val controllers_OrderController_addMealToOrder34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmealtoorder")))
  )
  private[this] lazy val controllers_OrderController_addMealToOrder34_invoker = createInvoker(
    OrderController_12.addMealToOrder(fakeValue[String]),
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

  // @LINE:107
  private[this] lazy val controllers_OrderController_getAddMealToMenu35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmeal")))
  )
  private[this] lazy val controllers_OrderController_getAddMealToMenu35_invoker = createInvoker(
    OrderController_12.getAddMealToMenu,
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

  // @LINE:109
  private[this] lazy val controllers_OrderController_addMeal36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postmeal")))
  )
  private[this] lazy val controllers_OrderController_addMeal36_invoker = createInvoker(
    OrderController_12.addMeal,
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

  // @LINE:111
  private[this] lazy val controllers_AccountController_doLogin37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dologin")))
  )
  private[this] lazy val controllers_AccountController_doLogin37_invoker = createInvoker(
    AccountController_13.doLogin(),
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

  // @LINE:113
  private[this] lazy val controllers_AccountController_doSignOut38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dosignout")))
  )
  private[this] lazy val controllers_AccountController_doSignOut38_invoker = createInvoker(
    AccountController_13.doSignOut(),
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

  // @LINE:115
  private[this] lazy val controllers_OrderController_getCart39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_OrderController_getCart39_invoker = createInvoker(
    OrderController_12.getCart(),
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

  // @LINE:117
  private[this] lazy val controllers_OrderController_removeMealFromOrder40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/removemeal")))
  )
  private[this] lazy val controllers_OrderController_removeMealFromOrder40_invoker = createInvoker(
    OrderController_12.removeMealFromOrder(fakeValue[String]),
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

  // @LINE:119
  private[this] lazy val controllers_OrderController_submitCart41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit")))
  )
  private[this] lazy val controllers_OrderController_submitCart41_invoker = createInvoker(
    OrderController_12.submitCart(),
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

  // @LINE:124
  private[this] lazy val controllers_CountController_count42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count42_invoker = createInvoker(
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

  // @LINE:127
  private[this] lazy val controllers_AsyncController_message43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message43_invoker = createInvoker(
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

  // @LINE:130
  private[this] lazy val controllers_Assets_versioned44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned44_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:131
  private[this] lazy val controllers_Assets_versioned45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/User/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned45_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/User/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:132
  private[this] lazy val controllers_Assets_versioned46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/User/Registration/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned46_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/User/Registration/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:133
  private[this] lazy val controllers_Assets_versioned47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/Delivery/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned47_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/Delivery/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:134
  private[this] lazy val controllers_Assets_versioned48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/Kitchen/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned48_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/Kitchen/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:135
  private[this] lazy val controllers_Assets_versioned49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/Staff/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned49_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/Staff/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:136
  private[this] lazy val controllers_Assets_versioned50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/History/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned50_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/History/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:139
  private[this] lazy val controllers_Application_HomeController_invalidRoute51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("path", """.+""",false)))
  )
  private[this] lazy val controllers_Application_HomeController_invalidRoute51_invoker = createInvoker(
    HomeController_6.invalidRoute(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application.HomeController",
      "invalidRoute",
      Seq(classOf[String]),
      "GET",
      this.prefix + """""" + "$" + """path<.+>""",
      """ Default path if not found""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_HomeController_index0_route(params) =>
      call { 
        controllers_Application_HomeController_index0_invoker.call(HomeController_6.index())
      }
  
    // @LINE:15
    case controllers_User_UserController_login1_route(params) =>
      call { 
        controllers_User_UserController_login1_invoker.call(UserController_5.login())
      }
  
    // @LINE:16
    case controllers_User_UserController_logout2_route(params) =>
      call { 
        controllers_User_UserController_logout2_invoker.call(UserController_5.logout())
      }
  
    // @LINE:18
    case controllers_User_UserController_doLogin3_route(params) =>
      call { 
        controllers_User_UserController_doLogin3_invoker.call(UserController_5.doLogin())
      }
  
    // @LINE:25
    case controllers_User_StaffController_index4_route(params) =>
      call { 
        controllers_User_StaffController_index4_invoker.call(StaffController_9.index())
      }
  
    // @LINE:26
    case controllers_User_StaffController_login5_route(params) =>
      call { 
        controllers_User_StaffController_login5_invoker.call(StaffController_9.login())
      }
  
    // @LINE:27
    case controllers_User_StaffController_logout6_route(params) =>
      call { 
        controllers_User_StaffController_logout6_invoker.call(StaffController_9.logout())
      }
  
    // @LINE:29
    case controllers_User_StaffController_doLogin7_route(params) =>
      call { 
        controllers_User_StaffController_doLogin7_invoker.call(StaffController_9.doLogin())
      }
  
    // @LINE:36
    case controllers_User_CustomerController_index8_route(params) =>
      call { 
        controllers_User_CustomerController_index8_invoker.call(CustomerController_8.index())
      }
  
    // @LINE:37
    case controllers_User_CustomerController_register9_route(params) =>
      call { 
        controllers_User_CustomerController_register9_invoker.call(CustomerController_8.register())
      }
  
    // @LINE:38
    case controllers_User_CustomerController_verifyCustomer10_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_User_CustomerController_verifyCustomer10_invoker.call(CustomerController_8.verifyCustomer(token))
      }
  
    // @LINE:39
    case controllers_User_CustomerController_edit11_route(params) =>
      call { 
        controllers_User_CustomerController_edit11_invoker.call(CustomerController_8.edit())
      }
  
    // @LINE:40
    case controllers_User_CustomerController_orderHistory12_route(params) =>
      call { 
        controllers_User_CustomerController_orderHistory12_invoker.call(CustomerController_8.orderHistory())
      }
  
    // @LINE:41
    case controllers_User_CustomerController_paymentHistory13_route(params) =>
      call { 
        controllers_User_CustomerController_paymentHistory13_invoker.call(CustomerController_8.paymentHistory())
      }
  
    // @LINE:42
    case controllers_User_CustomerController_viewOrder14_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_User_CustomerController_viewOrder14_invoker.call(CustomerController_8.viewOrder(orderId))
      }
  
    // @LINE:43
    case controllers_User_CustomerController_viewPayment15_route(params) =>
      call(params.fromPath[String]("paymentId", None)) { (paymentId) =>
        controllers_User_CustomerController_viewPayment15_invoker.call(CustomerController_8.viewPayment(paymentId))
      }
  
    // @LINE:45
    case controllers_User_CustomerController_create16_route(params) =>
      call { 
        controllers_User_CustomerController_create16_invoker.call(CustomerController_8.create())
      }
  
    // @LINE:46
    case controllers_User_CustomerController_reverify17_route(params) =>
      call { 
        controllers_User_CustomerController_reverify17_invoker.call(CustomerController_8.reverify())
      }
  
    // @LINE:47
    case controllers_User_CustomerController_completeRegistration18_route(params) =>
      call { 
        controllers_User_CustomerController_completeRegistration18_invoker.call(CustomerController_8.completeRegistration())
      }
  
    // @LINE:48
    case controllers_User_CustomerController_update19_route(params) =>
      call { 
        controllers_User_CustomerController_update19_invoker.call(CustomerController_8.update())
      }
  
    // @LINE:52
    case controllers_Order_ScheduleController_index20_route(params) =>
      call { 
        controllers_Order_ScheduleController_index20_invoker.call(ScheduleController_4.index())
      }
  
    // @LINE:53
    case controllers_Order_ScheduleController_createSchedule21_route(params) =>
      call { 
        controllers_Order_ScheduleController_createSchedule21_invoker.call(ScheduleController_4.createSchedule())
      }
  
    // @LINE:54
    case controllers_Order_ScheduleController_addOrder22_route(params) =>
      call { 
        controllers_Order_ScheduleController_addOrder22_invoker.call(ScheduleController_4.addOrder())
      }
  
    // @LINE:56
    case controllers_Order_ScheduleController_doCreateSchedule23_route(params) =>
      call { 
        controllers_Order_ScheduleController_doCreateSchedule23_invoker.call(ScheduleController_4.doCreateSchedule())
      }
  
    // @LINE:57
    case controllers_Order_ScheduleController_doAddOrder24_route(params) =>
      call { 
        controllers_Order_ScheduleController_doAddOrder24_invoker.call(ScheduleController_4.doAddOrder())
      }
  
    // @LINE:58
    case controllers_Order_ScheduleController_clearSchedule25_route(params) =>
      call { 
        controllers_Order_ScheduleController_clearSchedule25_invoker.call(ScheduleController_4.clearSchedule())
      }
  
    // @LINE:65
    case controllers_Order_MenuController_index26_route(params) =>
      call { 
        controllers_Order_MenuController_index26_invoker.call(MenuController_1.index())
      }
  
    // @LINE:73
    case controllers_Order_KitchenController_index27_route(params) =>
      call { 
        controllers_Order_KitchenController_index27_invoker.call(KitchenController_10.index())
      }
  
    // @LINE:81
    case controllers_Delivery_DeliveryController_index28_route(params) =>
      call { 
        controllers_Delivery_DeliveryController_index28_invoker.call(DeliveryController_7.index())
      }
  
    // @LINE:89
    case controllers_Finance_UserFinance_addFunds29_route(params) =>
      call { 
        controllers_Finance_UserFinance_addFunds29_invoker.call(UserFinance_2.addFunds())
      }
  
    // @LINE:91
    case controllers_Finance_UserFinance_doAddFunds30_route(params) =>
      call { 
        controllers_Finance_UserFinance_doAddFunds30_invoker.call(UserFinance_2.doAddFunds())
      }
  
    // @LINE:99
    case controllers_OrderController_getMenu31_route(params) =>
      call { 
        controllers_OrderController_getMenu31_invoker.call(OrderController_12.getMenu())
      }
  
    // @LINE:101
    case controllers_OrderController_switchMenu32_route(params) =>
      call(params.fromPath[Integer]("menutype", None)) { (menutype) =>
        controllers_OrderController_switchMenu32_invoker.call(OrderController_12.switchMenu(menutype))
      }
  
    // @LINE:103
    case controllers_AccountController_getSignUp33_route(params) =>
      call { 
        controllers_AccountController_getSignUp33_invoker.call(AccountController_13.getSignUp)
      }
  
    // @LINE:105
    case controllers_OrderController_addMealToOrder34_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_OrderController_addMealToOrder34_invoker.call(OrderController_12.addMealToOrder(mealId))
      }
  
    // @LINE:107
    case controllers_OrderController_getAddMealToMenu35_route(params) =>
      call { 
        controllers_OrderController_getAddMealToMenu35_invoker.call(OrderController_12.getAddMealToMenu)
      }
  
    // @LINE:109
    case controllers_OrderController_addMeal36_route(params) =>
      call { 
        controllers_OrderController_addMeal36_invoker.call(OrderController_12.addMeal)
      }
  
    // @LINE:111
    case controllers_AccountController_doLogin37_route(params) =>
      call { 
        controllers_AccountController_doLogin37_invoker.call(AccountController_13.doLogin())
      }
  
    // @LINE:113
    case controllers_AccountController_doSignOut38_route(params) =>
      call { 
        controllers_AccountController_doSignOut38_invoker.call(AccountController_13.doSignOut())
      }
  
    // @LINE:115
    case controllers_OrderController_getCart39_route(params) =>
      call { 
        controllers_OrderController_getCart39_invoker.call(OrderController_12.getCart())
      }
  
    // @LINE:117
    case controllers_OrderController_removeMealFromOrder40_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_OrderController_removeMealFromOrder40_invoker.call(OrderController_12.removeMealFromOrder(mealId))
      }
  
    // @LINE:119
    case controllers_OrderController_submitCart41_route(params) =>
      call { 
        controllers_OrderController_submitCart41_invoker.call(OrderController_12.submitCart())
      }
  
    // @LINE:124
    case controllers_CountController_count42_route(params) =>
      call { 
        controllers_CountController_count42_invoker.call(CountController_0.count)
      }
  
    // @LINE:127
    case controllers_AsyncController_message43_route(params) =>
      call { 
        controllers_AsyncController_message43_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:130
    case controllers_Assets_versioned44_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned44_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:131
    case controllers_Assets_versioned45_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned45_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:132
    case controllers_Assets_versioned46_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned46_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:133
    case controllers_Assets_versioned47_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned47_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:134
    case controllers_Assets_versioned48_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned48_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:135
    case controllers_Assets_versioned49_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned49_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:136
    case controllers_Assets_versioned50_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned50_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:139
    case controllers_Application_HomeController_invalidRoute51_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_HomeController_invalidRoute51_invoker.call(HomeController_6.invalidRoute(path))
      }
  }
}
