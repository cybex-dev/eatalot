
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Thu Oct 12 01:28:03 SAST 2017

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
  // @LINE:17
  UserController_5: controllers.User.UserController,
  // @LINE:27
  StaffController_9: controllers.User.StaffController,
  // @LINE:34
  CustomerController_8: controllers.User.CustomerController,
  // @LINE:52
  ScheduleController_4: controllers.Order.ScheduleController,
  // @LINE:69
  MenuController_1: controllers.Order.MenuController,
  // @LINE:77
  KitchenController_10: controllers.Order.KitchenController,
  // @LINE:85
  DeliveryController_7: controllers.Delivery.DeliveryController,
  // @LINE:93
  AdminController_12: controllers.User.AdminController,
  // @LINE:101
  UserFinance_2: controllers.Finance.UserFinance,
  // @LINE:111
  OrderController_13: controllers.OrderController,
  // @LINE:115
  AccountController_14: controllers.AccountController,
  // @LINE:136
  CountController_0: controllers.CountController,
  // @LINE:139
  AsyncController_3: controllers.AsyncController,
  // @LINE:142
  Assets_11: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_6: controllers.Application.HomeController,
    // @LINE:17
    UserController_5: controllers.User.UserController,
    // @LINE:27
    StaffController_9: controllers.User.StaffController,
    // @LINE:34
    CustomerController_8: controllers.User.CustomerController,
    // @LINE:52
    ScheduleController_4: controllers.Order.ScheduleController,
    // @LINE:69
    MenuController_1: controllers.Order.MenuController,
    // @LINE:77
    KitchenController_10: controllers.Order.KitchenController,
    // @LINE:85
    DeliveryController_7: controllers.Delivery.DeliveryController,
    // @LINE:93
    AdminController_12: controllers.User.AdminController,
    // @LINE:101
    UserFinance_2: controllers.Finance.UserFinance,
    // @LINE:111
    OrderController_13: controllers.OrderController,
    // @LINE:115
    AccountController_14: controllers.AccountController,
    // @LINE:136
    CountController_0: controllers.CountController,
    // @LINE:139
    AsyncController_3: controllers.AsyncController,
    // @LINE:142
    Assets_11: controllers.Assets
  ) = this(errorHandler, HomeController_6, UserController_5, StaffController_9, CustomerController_8, ScheduleController_4, MenuController_1, KitchenController_10, DeliveryController_7, AdminController_12, UserFinance_2, OrderController_13, AccountController_14, CountController_0, AsyncController_3, Assets_11, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_6, UserController_5, StaffController_9, CustomerController_8, ScheduleController_4, MenuController_1, KitchenController_10, DeliveryController_7, AdminController_12, UserFinance_2, OrderController_13, AccountController_14, CountController_0, AsyncController_3, Assets_11, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.HomeController.index()"""),
    ("""GET""", this.prefix, """controllers.Application.HomeController.forbiddenAccess()"""),
    ("""GET""", this.prefix, """controllers.Application.HomeController.unknown()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Login""", """controllers.User.UserController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Logout""", """controllers.User.UserController.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Login""", """controllers.User.UserController.doLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Staff""", """controllers.User.StaffController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Dashboard""", """controllers.User.CustomerController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register""", """controllers.User.CustomerController.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register/Completing""", """controllers.User.CustomerController.completeRegistration()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Verify/""" + "$" + """token<[^/]+>""", """controllers.User.CustomerController.verifyCustomer(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Profile""", """controllers.User.CustomerController.edit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/History/Orders""", """controllers.User.CustomerController.orderHistory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/History/Purchases""", """controllers.User.CustomerController.paymentHistory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/History/Order/""" + "$" + """orderId<[^/]+>""", """controllers.User.CustomerController.viewOrder(orderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/History/Payment/""" + "$" + """paymentId<[^/]+>""", """controllers.User.CustomerController.viewPayment(paymentId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register""", """controllers.User.CustomerController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register/Reverify""", """controllers.User.CustomerController.reverify()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register/Completing""", """controllers.User.CustomerController.doCompleteRegistration()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Profile""", """controllers.User.CustomerController.update()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/ActiveOrders""", """controllers.User.CustomerController.activeOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule""", """controllers.Order.ScheduleController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/New""", """controllers.Order.ScheduleController.createSchedule()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/AddOrder""", """controllers.Order.ScheduleController.addOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/Edit""", """controllers.Order.ScheduleController.editScheduleName()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/Delete/""" + "$" + """orderId<[^/]+>""", """controllers.Order.ScheduleController.removeOrder(orderId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/State""", """controllers.Order.ScheduleController.setScheduleState()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/Edit""", """controllers.Order.ScheduleController.updateScheduleName()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/New""", """controllers.Order.ScheduleController.doCreateSchedule()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/AddOrder""", """controllers.Order.ScheduleController.doAddOrder()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/Clear""", """controllers.Order.ScheduleController.clearSchedule()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Menu""", """controllers.Order.MenuController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen""", """controllers.Order.KitchenController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/User""", """controllers.Delivery.DeliveryController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Dashboard""", """controllers.User.AdminController.index()"""),
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

  // @LINE:7
  private[this] lazy val controllers_Application_HomeController_forbiddenAccess1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_HomeController_forbiddenAccess1_invoker = createInvoker(
    HomeController_6.forbiddenAccess(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application.HomeController",
      "forbiddenAccess",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_HomeController_unknown2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_HomeController_unknown2_invoker = createInvoker(
    HomeController_6.unknown(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application.HomeController",
      "unknown",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_User_UserController_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Login")))
  )
  private[this] lazy val controllers_User_UserController_login3_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_User_UserController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Logout")))
  )
  private[this] lazy val controllers_User_UserController_logout4_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_User_UserController_doLogin5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Login")))
  )
  private[this] lazy val controllers_User_UserController_doLogin5_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_User_StaffController_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Staff")))
  )
  private[this] lazy val controllers_User_StaffController_index6_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_User_CustomerController_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Dashboard")))
  )
  private[this] lazy val controllers_User_CustomerController_index7_invoker = createInvoker(
    CustomerController_8.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "index",
      Nil,
      "GET",
      this.prefix + """User/Dashboard""",
      """ Customer Controller""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_User_CustomerController_register8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_CustomerController_register8_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_User_CustomerController_completeRegistration9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register/Completing")))
  )
  private[this] lazy val controllers_User_CustomerController_completeRegistration9_invoker = createInvoker(
    CustomerController_8.completeRegistration(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "completeRegistration",
      Nil,
      "GET",
      this.prefix + """User/Register/Completing""",
      """""",
      Seq()
    )
  )

  // @LINE:37
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

  // @LINE:38
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

  // @LINE:39
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

  // @LINE:40
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

  // @LINE:41
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

  // @LINE:42
  private[this] lazy val controllers_User_CustomerController_viewPayment15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Payment/"), DynamicPart("paymentId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_CustomerController_viewPayment15_invoker = createInvoker(
    CustomerController_8.viewPayment(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "viewPayment",
      Seq(classOf[String]),
      "GET",
      this.prefix + """User/History/Payment/""" + "$" + """paymentId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_User_CustomerController_create16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_CustomerController_create16_invoker = createInvoker(
    CustomerController_8.create(),
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

  // @LINE:45
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

  // @LINE:46
  private[this] lazy val controllers_User_CustomerController_doCompleteRegistration18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register/Completing")))
  )
  private[this] lazy val controllers_User_CustomerController_doCompleteRegistration18_invoker = createInvoker(
    CustomerController_8.doCompleteRegistration(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "doCompleteRegistration",
      Nil,
      "POST",
      this.prefix + """User/Register/Completing""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_User_CustomerController_update19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Profile")))
  )
  private[this] lazy val controllers_User_CustomerController_update19_invoker = createInvoker(
    CustomerController_8.update(),
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

  // @LINE:48
  private[this] lazy val controllers_User_CustomerController_activeOrders20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/ActiveOrders")))
  )
  private[this] lazy val controllers_User_CustomerController_activeOrders20_invoker = createInvoker(
    CustomerController_8.activeOrders(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "activeOrders",
      Nil,
      "POST",
      this.prefix + """User/ActiveOrders""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Order_ScheduleController_index21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule")))
  )
  private[this] lazy val controllers_Order_ScheduleController_index21_invoker = createInvoker(
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
  private[this] lazy val controllers_Order_ScheduleController_createSchedule22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/New")))
  )
  private[this] lazy val controllers_Order_ScheduleController_createSchedule22_invoker = createInvoker(
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
  private[this] lazy val controllers_Order_ScheduleController_addOrder23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/AddOrder")))
  )
  private[this] lazy val controllers_Order_ScheduleController_addOrder23_invoker = createInvoker(
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

  // @LINE:55
  private[this] lazy val controllers_Order_ScheduleController_editScheduleName24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Edit")))
  )
  private[this] lazy val controllers_Order_ScheduleController_editScheduleName24_invoker = createInvoker(
    ScheduleController_4.editScheduleName(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "editScheduleName",
      Nil,
      "GET",
      this.prefix + """User/Schedule/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_Order_ScheduleController_removeOrder25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Delete/"), DynamicPart("orderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Order_ScheduleController_removeOrder25_invoker = createInvoker(
    ScheduleController_4.removeOrder(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "removeOrder",
      Seq(classOf[String]),
      "POST",
      this.prefix + """User/Schedule/Delete/""" + "$" + """orderId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Order_ScheduleController_setScheduleState26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/State")))
  )
  private[this] lazy val controllers_Order_ScheduleController_setScheduleState26_invoker = createInvoker(
    ScheduleController_4.setScheduleState(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "setScheduleState",
      Nil,
      "POST",
      this.prefix + """User/Schedule/State""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_Order_ScheduleController_updateScheduleName27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Edit")))
  )
  private[this] lazy val controllers_Order_ScheduleController_updateScheduleName27_invoker = createInvoker(
    ScheduleController_4.updateScheduleName(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "updateScheduleName",
      Nil,
      "POST",
      this.prefix + """User/Schedule/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Order_ScheduleController_doCreateSchedule28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/New")))
  )
  private[this] lazy val controllers_Order_ScheduleController_doCreateSchedule28_invoker = createInvoker(
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

  // @LINE:61
  private[this] lazy val controllers_Order_ScheduleController_doAddOrder29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/AddOrder")))
  )
  private[this] lazy val controllers_Order_ScheduleController_doAddOrder29_invoker = createInvoker(
    ScheduleController_4.doAddOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "doAddOrder",
      Nil,
      "POST",
      this.prefix + """User/Schedule/AddOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_Order_ScheduleController_clearSchedule30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Clear")))
  )
  private[this] lazy val controllers_Order_ScheduleController_clearSchedule30_invoker = createInvoker(
    ScheduleController_4.clearSchedule(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "clearSchedule",
      Nil,
      "POST",
      this.prefix + """User/Schedule/Clear""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_Order_MenuController_index31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Menu")))
  )
  private[this] lazy val controllers_Order_MenuController_index31_invoker = createInvoker(
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

  // @LINE:77
  private[this] lazy val controllers_Order_KitchenController_index32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen")))
  )
  private[this] lazy val controllers_Order_KitchenController_index32_invoker = createInvoker(
    KitchenController_10.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "index",
      Nil,
      "GET",
      this.prefix + """Kitchen""",
      """""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_Delivery_DeliveryController_index33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/User")))
  )
  private[this] lazy val controllers_Delivery_DeliveryController_index33_invoker = createInvoker(
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

  // @LINE:93
  private[this] lazy val controllers_User_AdminController_index34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Dashboard")))
  )
  private[this] lazy val controllers_User_AdminController_index34_invoker = createInvoker(
    AdminController_12.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "index",
      Nil,
      "GET",
      this.prefix + """Admin/Dashboard""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_Finance_UserFinance_addFunds35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_addFunds35_invoker = createInvoker(
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

  // @LINE:103
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds36_invoker = createInvoker(
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

  // @LINE:111
  private[this] lazy val controllers_OrderController_getMenu37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu")))
  )
  private[this] lazy val controllers_OrderController_getMenu37_invoker = createInvoker(
    OrderController_13.getMenu(),
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

  // @LINE:113
  private[this] lazy val controllers_OrderController_switchMenu38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/"), DynamicPart("menutype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_switchMenu38_invoker = createInvoker(
    OrderController_13.switchMenu(fakeValue[Integer]),
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

  // @LINE:115
  private[this] lazy val controllers_AccountController_getSignUp39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_AccountController_getSignUp39_invoker = createInvoker(
    AccountController_14.getSignUp,
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

  // @LINE:117
  private[this] lazy val controllers_OrderController_addMealToOrder40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmealtoorder")))
  )
  private[this] lazy val controllers_OrderController_addMealToOrder40_invoker = createInvoker(
    OrderController_13.addMealToOrder(fakeValue[String]),
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

  // @LINE:119
  private[this] lazy val controllers_OrderController_getAddMealToMenu41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmeal")))
  )
  private[this] lazy val controllers_OrderController_getAddMealToMenu41_invoker = createInvoker(
    OrderController_13.getAddMealToMenu,
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

  // @LINE:121
  private[this] lazy val controllers_OrderController_addMeal42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postmeal")))
  )
  private[this] lazy val controllers_OrderController_addMeal42_invoker = createInvoker(
    OrderController_13.addMeal,
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

  // @LINE:123
  private[this] lazy val controllers_AccountController_doLogin43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dologin")))
  )
  private[this] lazy val controllers_AccountController_doLogin43_invoker = createInvoker(
    AccountController_14.doLogin(),
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

  // @LINE:125
  private[this] lazy val controllers_AccountController_doSignOut44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dosignout")))
  )
  private[this] lazy val controllers_AccountController_doSignOut44_invoker = createInvoker(
    AccountController_14.doSignOut(),
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

  // @LINE:127
  private[this] lazy val controllers_OrderController_getCart45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_OrderController_getCart45_invoker = createInvoker(
    OrderController_13.getCart(),
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

  // @LINE:129
  private[this] lazy val controllers_OrderController_removeMealFromOrder46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/removemeal")))
  )
  private[this] lazy val controllers_OrderController_removeMealFromOrder46_invoker = createInvoker(
    OrderController_13.removeMealFromOrder(fakeValue[String]),
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

  // @LINE:131
  private[this] lazy val controllers_OrderController_submitCart47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit")))
  )
  private[this] lazy val controllers_OrderController_submitCart47_invoker = createInvoker(
    OrderController_13.submitCart(),
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

  // @LINE:136
  private[this] lazy val controllers_CountController_count48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count48_invoker = createInvoker(
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

  // @LINE:139
  private[this] lazy val controllers_AsyncController_message49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message49_invoker = createInvoker(
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

  // @LINE:142
  private[this] lazy val controllers_Assets_versioned50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned50_invoker = createInvoker(
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

  // @LINE:156
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
  
    // @LINE:7
    case controllers_Application_HomeController_forbiddenAccess1_route(params) =>
      call { 
        controllers_Application_HomeController_forbiddenAccess1_invoker.call(HomeController_6.forbiddenAccess())
      }
  
    // @LINE:8
    case controllers_Application_HomeController_unknown2_route(params) =>
      call { 
        controllers_Application_HomeController_unknown2_invoker.call(HomeController_6.unknown())
      }
  
    // @LINE:17
    case controllers_User_UserController_login3_route(params) =>
      call { 
        controllers_User_UserController_login3_invoker.call(UserController_5.login())
      }
  
    // @LINE:18
    case controllers_User_UserController_logout4_route(params) =>
      call { 
        controllers_User_UserController_logout4_invoker.call(UserController_5.logout())
      }
  
    // @LINE:20
    case controllers_User_UserController_doLogin5_route(params) =>
      call { 
        controllers_User_UserController_doLogin5_invoker.call(UserController_5.doLogin())
      }
  
    // @LINE:27
    case controllers_User_StaffController_index6_route(params) =>
      call { 
        controllers_User_StaffController_index6_invoker.call(StaffController_9.index())
      }
  
    // @LINE:34
    case controllers_User_CustomerController_index7_route(params) =>
      call { 
        controllers_User_CustomerController_index7_invoker.call(CustomerController_8.index())
      }
  
    // @LINE:35
    case controllers_User_CustomerController_register8_route(params) =>
      call { 
        controllers_User_CustomerController_register8_invoker.call(CustomerController_8.register())
      }
  
    // @LINE:36
    case controllers_User_CustomerController_completeRegistration9_route(params) =>
      call { 
        controllers_User_CustomerController_completeRegistration9_invoker.call(CustomerController_8.completeRegistration())
      }
  
    // @LINE:37
    case controllers_User_CustomerController_verifyCustomer10_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_User_CustomerController_verifyCustomer10_invoker.call(CustomerController_8.verifyCustomer(token))
      }
  
    // @LINE:38
    case controllers_User_CustomerController_edit11_route(params) =>
      call { 
        controllers_User_CustomerController_edit11_invoker.call(CustomerController_8.edit())
      }
  
    // @LINE:39
    case controllers_User_CustomerController_orderHistory12_route(params) =>
      call { 
        controllers_User_CustomerController_orderHistory12_invoker.call(CustomerController_8.orderHistory())
      }
  
    // @LINE:40
    case controllers_User_CustomerController_paymentHistory13_route(params) =>
      call { 
        controllers_User_CustomerController_paymentHistory13_invoker.call(CustomerController_8.paymentHistory())
      }
  
    // @LINE:41
    case controllers_User_CustomerController_viewOrder14_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_User_CustomerController_viewOrder14_invoker.call(CustomerController_8.viewOrder(orderId))
      }
  
    // @LINE:42
    case controllers_User_CustomerController_viewPayment15_route(params) =>
      call(params.fromPath[String]("paymentId", None)) { (paymentId) =>
        controllers_User_CustomerController_viewPayment15_invoker.call(CustomerController_8.viewPayment(paymentId))
      }
  
    // @LINE:44
    case controllers_User_CustomerController_create16_route(params) =>
      call { 
        controllers_User_CustomerController_create16_invoker.call(CustomerController_8.create())
      }
  
    // @LINE:45
    case controllers_User_CustomerController_reverify17_route(params) =>
      call { 
        controllers_User_CustomerController_reverify17_invoker.call(CustomerController_8.reverify())
      }
  
    // @LINE:46
    case controllers_User_CustomerController_doCompleteRegistration18_route(params) =>
      call { 
        controllers_User_CustomerController_doCompleteRegistration18_invoker.call(CustomerController_8.doCompleteRegistration())
      }
  
    // @LINE:47
    case controllers_User_CustomerController_update19_route(params) =>
      call { 
        controllers_User_CustomerController_update19_invoker.call(CustomerController_8.update())
      }
  
    // @LINE:48
    case controllers_User_CustomerController_activeOrders20_route(params) =>
      call { 
        controllers_User_CustomerController_activeOrders20_invoker.call(CustomerController_8.activeOrders())
      }
  
    // @LINE:52
    case controllers_Order_ScheduleController_index21_route(params) =>
      call { 
        controllers_Order_ScheduleController_index21_invoker.call(ScheduleController_4.index())
      }
  
    // @LINE:53
    case controllers_Order_ScheduleController_createSchedule22_route(params) =>
      call { 
        controllers_Order_ScheduleController_createSchedule22_invoker.call(ScheduleController_4.createSchedule())
      }
  
    // @LINE:54
    case controllers_Order_ScheduleController_addOrder23_route(params) =>
      call { 
        controllers_Order_ScheduleController_addOrder23_invoker.call(ScheduleController_4.addOrder())
      }
  
    // @LINE:55
    case controllers_Order_ScheduleController_editScheduleName24_route(params) =>
      call { 
        controllers_Order_ScheduleController_editScheduleName24_invoker.call(ScheduleController_4.editScheduleName())
      }
  
    // @LINE:57
    case controllers_Order_ScheduleController_removeOrder25_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_Order_ScheduleController_removeOrder25_invoker.call(ScheduleController_4.removeOrder(orderId))
      }
  
    // @LINE:58
    case controllers_Order_ScheduleController_setScheduleState26_route(params) =>
      call { 
        controllers_Order_ScheduleController_setScheduleState26_invoker.call(ScheduleController_4.setScheduleState())
      }
  
    // @LINE:59
    case controllers_Order_ScheduleController_updateScheduleName27_route(params) =>
      call { 
        controllers_Order_ScheduleController_updateScheduleName27_invoker.call(ScheduleController_4.updateScheduleName())
      }
  
    // @LINE:60
    case controllers_Order_ScheduleController_doCreateSchedule28_route(params) =>
      call { 
        controllers_Order_ScheduleController_doCreateSchedule28_invoker.call(ScheduleController_4.doCreateSchedule())
      }
  
    // @LINE:61
    case controllers_Order_ScheduleController_doAddOrder29_route(params) =>
      call { 
        controllers_Order_ScheduleController_doAddOrder29_invoker.call(ScheduleController_4.doAddOrder())
      }
  
    // @LINE:62
    case controllers_Order_ScheduleController_clearSchedule30_route(params) =>
      call { 
        controllers_Order_ScheduleController_clearSchedule30_invoker.call(ScheduleController_4.clearSchedule())
      }
  
    // @LINE:69
    case controllers_Order_MenuController_index31_route(params) =>
      call { 
        controllers_Order_MenuController_index31_invoker.call(MenuController_1.index())
      }
  
    // @LINE:77
    case controllers_Order_KitchenController_index32_route(params) =>
      call { 
        controllers_Order_KitchenController_index32_invoker.call(KitchenController_10.index())
      }
  
    // @LINE:85
    case controllers_Delivery_DeliveryController_index33_route(params) =>
      call { 
        controllers_Delivery_DeliveryController_index33_invoker.call(DeliveryController_7.index())
      }
  
    // @LINE:93
    case controllers_User_AdminController_index34_route(params) =>
      call { 
        controllers_User_AdminController_index34_invoker.call(AdminController_12.index())
      }
  
    // @LINE:101
    case controllers_Finance_UserFinance_addFunds35_route(params) =>
      call { 
        controllers_Finance_UserFinance_addFunds35_invoker.call(UserFinance_2.addFunds())
      }
  
    // @LINE:103
    case controllers_Finance_UserFinance_doAddFunds36_route(params) =>
      call { 
        controllers_Finance_UserFinance_doAddFunds36_invoker.call(UserFinance_2.doAddFunds())
      }
  
    // @LINE:111
    case controllers_OrderController_getMenu37_route(params) =>
      call { 
        controllers_OrderController_getMenu37_invoker.call(OrderController_13.getMenu())
      }
  
    // @LINE:113
    case controllers_OrderController_switchMenu38_route(params) =>
      call(params.fromPath[Integer]("menutype", None)) { (menutype) =>
        controllers_OrderController_switchMenu38_invoker.call(OrderController_13.switchMenu(menutype))
      }
  
    // @LINE:115
    case controllers_AccountController_getSignUp39_route(params) =>
      call { 
        controllers_AccountController_getSignUp39_invoker.call(AccountController_14.getSignUp)
      }
  
    // @LINE:117
    case controllers_OrderController_addMealToOrder40_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_OrderController_addMealToOrder40_invoker.call(OrderController_13.addMealToOrder(mealId))
      }
  
    // @LINE:119
    case controllers_OrderController_getAddMealToMenu41_route(params) =>
      call { 
        controllers_OrderController_getAddMealToMenu41_invoker.call(OrderController_13.getAddMealToMenu)
      }
  
    // @LINE:121
    case controllers_OrderController_addMeal42_route(params) =>
      call { 
        controllers_OrderController_addMeal42_invoker.call(OrderController_13.addMeal)
      }
  
    // @LINE:123
    case controllers_AccountController_doLogin43_route(params) =>
      call { 
        controllers_AccountController_doLogin43_invoker.call(AccountController_14.doLogin())
      }
  
    // @LINE:125
    case controllers_AccountController_doSignOut44_route(params) =>
      call { 
        controllers_AccountController_doSignOut44_invoker.call(AccountController_14.doSignOut())
      }
  
    // @LINE:127
    case controllers_OrderController_getCart45_route(params) =>
      call { 
        controllers_OrderController_getCart45_invoker.call(OrderController_13.getCart())
      }
  
    // @LINE:129
    case controllers_OrderController_removeMealFromOrder46_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_OrderController_removeMealFromOrder46_invoker.call(OrderController_13.removeMealFromOrder(mealId))
      }
  
    // @LINE:131
    case controllers_OrderController_submitCart47_route(params) =>
      call { 
        controllers_OrderController_submitCart47_invoker.call(OrderController_13.submitCart())
      }
  
    // @LINE:136
    case controllers_CountController_count48_route(params) =>
      call { 
        controllers_CountController_count48_invoker.call(CountController_0.count)
      }
  
    // @LINE:139
    case controllers_AsyncController_message49_route(params) =>
      call { 
        controllers_AsyncController_message49_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:142
    case controllers_Assets_versioned50_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned50_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:156
    case controllers_Application_HomeController_invalidRoute51_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_HomeController_invalidRoute51_invoker.call(HomeController_6.invalidRoute(path))
      }
  }
}
