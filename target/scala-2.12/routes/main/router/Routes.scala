
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Oct 08 23:34:50 SAST 2017

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
  // @LINE:53
  ScheduleController_4: controllers.Order.ScheduleController,
  // @LINE:70
  MenuController_1: controllers.Order.MenuController,
  // @LINE:78
  KitchenController_10: controllers.Order.KitchenController,
  // @LINE:86
  DeliveryController_7: controllers.Delivery.DeliveryController,
  // @LINE:94
  UserFinance_2: controllers.Finance.UserFinance,
  // @LINE:104
  OrderController_12: controllers.OrderController,
  // @LINE:108
  AccountController_13: controllers.AccountController,
  // @LINE:129
  CountController_0: controllers.CountController,
  // @LINE:132
  AsyncController_3: controllers.AsyncController,
  // @LINE:135
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
    // @LINE:53
    ScheduleController_4: controllers.Order.ScheduleController,
    // @LINE:70
    MenuController_1: controllers.Order.MenuController,
    // @LINE:78
    KitchenController_10: controllers.Order.KitchenController,
    // @LINE:86
    DeliveryController_7: controllers.Delivery.DeliveryController,
    // @LINE:94
    UserFinance_2: controllers.Finance.UserFinance,
    // @LINE:104
    OrderController_12: controllers.OrderController,
    // @LINE:108
    AccountController_13: controllers.AccountController,
    // @LINE:129
    CountController_0: controllers.CountController,
    // @LINE:132
    AsyncController_3: controllers.AsyncController,
    // @LINE:135
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Dashboard""", """controllers.User.CustomerController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register""", """controllers.User.CustomerController.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Verify/""" + "$" + """token<[^/]+>""", """controllers.User.CustomerController.verifyCustomer(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Profile""", """controllers.User.CustomerController.edit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/History/Orders""", """controllers.User.CustomerController.orderHistory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/History/Purchases""", """controllers.User.CustomerController.paymentHistory()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/History/Order/""" + "$" + """orderId<[^/]+>""", """controllers.User.CustomerController.viewOrder(orderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/History/Payment/""" + "$" + """paymentId<[^/]+>""", """controllers.User.CustomerController.viewPayment(paymentId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register""", """controllers.User.CustomerController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register/Reverify""", """controllers.User.CustomerController.reverify()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Register/Completing""", """controllers.User.CustomerController.completeRegistration()"""),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Dashboard")))
  )
  private[this] lazy val controllers_User_CustomerController_index8_invoker = createInvoker(
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
      "viewPayment",
      Seq(classOf[String]),
      "GET",
      this.prefix + """User/History/Payment/""" + "$" + """paymentId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
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

  // @LINE:49
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

  // @LINE:53
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

  // @LINE:54
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

  // @LINE:55
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

  // @LINE:56
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

  // @LINE:58
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

  // @LINE:59
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

  // @LINE:60
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

  // @LINE:61
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

  // @LINE:62
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

  // @LINE:63
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

  // @LINE:70
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

  // @LINE:78
  private[this] lazy val controllers_Order_KitchenController_index32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/User")))
  )
  private[this] lazy val controllers_Order_KitchenController_index32_invoker = createInvoker(
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

  // @LINE:86
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

  // @LINE:94
  private[this] lazy val controllers_Finance_UserFinance_addFunds34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_addFunds34_invoker = createInvoker(
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

  // @LINE:96
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds35_invoker = createInvoker(
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

  // @LINE:104
  private[this] lazy val controllers_OrderController_getMenu36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu")))
  )
  private[this] lazy val controllers_OrderController_getMenu36_invoker = createInvoker(
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

  // @LINE:106
  private[this] lazy val controllers_OrderController_switchMenu37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/"), DynamicPart("menutype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_switchMenu37_invoker = createInvoker(
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

  // @LINE:108
  private[this] lazy val controllers_AccountController_getSignUp38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_AccountController_getSignUp38_invoker = createInvoker(
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

  // @LINE:110
  private[this] lazy val controllers_OrderController_addMealToOrder39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmealtoorder")))
  )
  private[this] lazy val controllers_OrderController_addMealToOrder39_invoker = createInvoker(
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

  // @LINE:112
  private[this] lazy val controllers_OrderController_getAddMealToMenu40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmeal")))
  )
  private[this] lazy val controllers_OrderController_getAddMealToMenu40_invoker = createInvoker(
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

  // @LINE:114
  private[this] lazy val controllers_OrderController_addMeal41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postmeal")))
  )
  private[this] lazy val controllers_OrderController_addMeal41_invoker = createInvoker(
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

  // @LINE:116
  private[this] lazy val controllers_AccountController_doLogin42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dologin")))
  )
  private[this] lazy val controllers_AccountController_doLogin42_invoker = createInvoker(
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

  // @LINE:118
  private[this] lazy val controllers_AccountController_doSignOut43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dosignout")))
  )
  private[this] lazy val controllers_AccountController_doSignOut43_invoker = createInvoker(
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

  // @LINE:120
  private[this] lazy val controllers_OrderController_getCart44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_OrderController_getCart44_invoker = createInvoker(
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

  // @LINE:122
  private[this] lazy val controllers_OrderController_removeMealFromOrder45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/removemeal")))
  )
  private[this] lazy val controllers_OrderController_removeMealFromOrder45_invoker = createInvoker(
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

  // @LINE:124
  private[this] lazy val controllers_OrderController_submitCart46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit")))
  )
  private[this] lazy val controllers_OrderController_submitCart46_invoker = createInvoker(
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

  // @LINE:129
  private[this] lazy val controllers_CountController_count47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count47_invoker = createInvoker(
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

  // @LINE:132
  private[this] lazy val controllers_AsyncController_message48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message48_invoker = createInvoker(
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

  // @LINE:135
  private[this] lazy val controllers_Assets_versioned49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned49_invoker = createInvoker(
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

  // @LINE:149
  private[this] lazy val controllers_Application_HomeController_invalidRoute50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("path", """.+""",false)))
  )
  private[this] lazy val controllers_Application_HomeController_invalidRoute50_invoker = createInvoker(
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
  
    // @LINE:49
    case controllers_User_CustomerController_activeOrders20_route(params) =>
      call { 
        controllers_User_CustomerController_activeOrders20_invoker.call(CustomerController_8.activeOrders())
      }
  
    // @LINE:53
    case controllers_Order_ScheduleController_index21_route(params) =>
      call { 
        controllers_Order_ScheduleController_index21_invoker.call(ScheduleController_4.index())
      }
  
    // @LINE:54
    case controllers_Order_ScheduleController_createSchedule22_route(params) =>
      call { 
        controllers_Order_ScheduleController_createSchedule22_invoker.call(ScheduleController_4.createSchedule())
      }
  
    // @LINE:55
    case controllers_Order_ScheduleController_addOrder23_route(params) =>
      call { 
        controllers_Order_ScheduleController_addOrder23_invoker.call(ScheduleController_4.addOrder())
      }
  
    // @LINE:56
    case controllers_Order_ScheduleController_editScheduleName24_route(params) =>
      call { 
        controllers_Order_ScheduleController_editScheduleName24_invoker.call(ScheduleController_4.editScheduleName())
      }
  
    // @LINE:58
    case controllers_Order_ScheduleController_removeOrder25_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_Order_ScheduleController_removeOrder25_invoker.call(ScheduleController_4.removeOrder(orderId))
      }
  
    // @LINE:59
    case controllers_Order_ScheduleController_setScheduleState26_route(params) =>
      call { 
        controllers_Order_ScheduleController_setScheduleState26_invoker.call(ScheduleController_4.setScheduleState())
      }
  
    // @LINE:60
    case controllers_Order_ScheduleController_updateScheduleName27_route(params) =>
      call { 
        controllers_Order_ScheduleController_updateScheduleName27_invoker.call(ScheduleController_4.updateScheduleName())
      }
  
    // @LINE:61
    case controllers_Order_ScheduleController_doCreateSchedule28_route(params) =>
      call { 
        controllers_Order_ScheduleController_doCreateSchedule28_invoker.call(ScheduleController_4.doCreateSchedule())
      }
  
    // @LINE:62
    case controllers_Order_ScheduleController_doAddOrder29_route(params) =>
      call { 
        controllers_Order_ScheduleController_doAddOrder29_invoker.call(ScheduleController_4.doAddOrder())
      }
  
    // @LINE:63
    case controllers_Order_ScheduleController_clearSchedule30_route(params) =>
      call { 
        controllers_Order_ScheduleController_clearSchedule30_invoker.call(ScheduleController_4.clearSchedule())
      }
  
    // @LINE:70
    case controllers_Order_MenuController_index31_route(params) =>
      call { 
        controllers_Order_MenuController_index31_invoker.call(MenuController_1.index())
      }
  
    // @LINE:78
    case controllers_Order_KitchenController_index32_route(params) =>
      call { 
        controllers_Order_KitchenController_index32_invoker.call(KitchenController_10.index())
      }
  
    // @LINE:86
    case controllers_Delivery_DeliveryController_index33_route(params) =>
      call { 
        controllers_Delivery_DeliveryController_index33_invoker.call(DeliveryController_7.index())
      }
  
    // @LINE:94
    case controllers_Finance_UserFinance_addFunds34_route(params) =>
      call { 
        controllers_Finance_UserFinance_addFunds34_invoker.call(UserFinance_2.addFunds())
      }
  
    // @LINE:96
    case controllers_Finance_UserFinance_doAddFunds35_route(params) =>
      call { 
        controllers_Finance_UserFinance_doAddFunds35_invoker.call(UserFinance_2.doAddFunds())
      }
  
    // @LINE:104
    case controllers_OrderController_getMenu36_route(params) =>
      call { 
        controllers_OrderController_getMenu36_invoker.call(OrderController_12.getMenu())
      }
  
    // @LINE:106
    case controllers_OrderController_switchMenu37_route(params) =>
      call(params.fromPath[Integer]("menutype", None)) { (menutype) =>
        controllers_OrderController_switchMenu37_invoker.call(OrderController_12.switchMenu(menutype))
      }
  
    // @LINE:108
    case controllers_AccountController_getSignUp38_route(params) =>
      call { 
        controllers_AccountController_getSignUp38_invoker.call(AccountController_13.getSignUp)
      }
  
    // @LINE:110
    case controllers_OrderController_addMealToOrder39_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_OrderController_addMealToOrder39_invoker.call(OrderController_12.addMealToOrder(mealId))
      }
  
    // @LINE:112
    case controllers_OrderController_getAddMealToMenu40_route(params) =>
      call { 
        controllers_OrderController_getAddMealToMenu40_invoker.call(OrderController_12.getAddMealToMenu)
      }
  
    // @LINE:114
    case controllers_OrderController_addMeal41_route(params) =>
      call { 
        controllers_OrderController_addMeal41_invoker.call(OrderController_12.addMeal)
      }
  
    // @LINE:116
    case controllers_AccountController_doLogin42_route(params) =>
      call { 
        controllers_AccountController_doLogin42_invoker.call(AccountController_13.doLogin())
      }
  
    // @LINE:118
    case controllers_AccountController_doSignOut43_route(params) =>
      call { 
        controllers_AccountController_doSignOut43_invoker.call(AccountController_13.doSignOut())
      }
  
    // @LINE:120
    case controllers_OrderController_getCart44_route(params) =>
      call { 
        controllers_OrderController_getCart44_invoker.call(OrderController_12.getCart())
      }
  
    // @LINE:122
    case controllers_OrderController_removeMealFromOrder45_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_OrderController_removeMealFromOrder45_invoker.call(OrderController_12.removeMealFromOrder(mealId))
      }
  
    // @LINE:124
    case controllers_OrderController_submitCart46_route(params) =>
      call { 
        controllers_OrderController_submitCart46_invoker.call(OrderController_12.submitCart())
      }
  
    // @LINE:129
    case controllers_CountController_count47_route(params) =>
      call { 
        controllers_CountController_count47_invoker.call(CountController_0.count)
      }
  
    // @LINE:132
    case controllers_AsyncController_message48_route(params) =>
      call { 
        controllers_AsyncController_message48_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:135
    case controllers_Assets_versioned49_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned49_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:149
    case controllers_Application_HomeController_invalidRoute50_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_HomeController_invalidRoute50_invoker.call(HomeController_6.invalidRoute(path))
      }
  }
}
