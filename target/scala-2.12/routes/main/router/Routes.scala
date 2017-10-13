
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Fri Oct 13 07:57:43 SAST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_7: controllers.Application.HomeController,
  // @LINE:17
  UserController_6: controllers.User.UserController,
  // @LINE:27
  DeliveryStaffController_1: controllers.User.DeliveryStaffController,
  // @LINE:34
  CustomerController_9: controllers.User.CustomerController,
  // @LINE:52
  ScheduleController_5: controllers.Order.ScheduleController,
  // @LINE:68
  MenuController_2: controllers.Order.MenuController,
  // @LINE:76
  KitchenStaffController_8: controllers.User.KitchenStaffController,
  // @LINE:103
  AdminController_11: controllers.User.AdminController,
  // @LINE:114
  UserFinance_3: controllers.Finance.UserFinance,
  // @LINE:124
  OrderController_12: controllers.OrderController,
  // @LINE:128
  AccountController_13: controllers.AccountController,
  // @LINE:152
  CountController_0: controllers.CountController,
  // @LINE:155
  AsyncController_4: controllers.AsyncController,
  // @LINE:158
  Assets_10: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_7: controllers.Application.HomeController,
    // @LINE:17
    UserController_6: controllers.User.UserController,
    // @LINE:27
    DeliveryStaffController_1: controllers.User.DeliveryStaffController,
    // @LINE:34
    CustomerController_9: controllers.User.CustomerController,
    // @LINE:52
    ScheduleController_5: controllers.Order.ScheduleController,
    // @LINE:68
    MenuController_2: controllers.Order.MenuController,
    // @LINE:76
    KitchenStaffController_8: controllers.User.KitchenStaffController,
    // @LINE:103
    AdminController_11: controllers.User.AdminController,
    // @LINE:114
    UserFinance_3: controllers.Finance.UserFinance,
    // @LINE:124
    OrderController_12: controllers.OrderController,
    // @LINE:128
    AccountController_13: controllers.AccountController,
    // @LINE:152
    CountController_0: controllers.CountController,
    // @LINE:155
    AsyncController_4: controllers.AsyncController,
    // @LINE:158
    Assets_10: controllers.Assets
  ) = this(errorHandler, HomeController_7, UserController_6, DeliveryStaffController_1, CustomerController_9, ScheduleController_5, MenuController_2, KitchenStaffController_8, AdminController_11, UserFinance_3, OrderController_12, AccountController_13, CountController_0, AsyncController_4, Assets_10, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_7, UserController_6, DeliveryStaffController_1, CustomerController_9, ScheduleController_5, MenuController_2, KitchenStaffController_8, AdminController_11, UserFinance_3, OrderController_12, AccountController_13, CountController_0, AsyncController_4, Assets_10, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Staff""", """controllers.User.DeliveryStaffController.index()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/Dashboard""", """controllers.User.KitchenStaffController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/Order""", """controllers.User.KitchenStaffController.viewOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/Orders/Active""", """controllers.User.KitchenStaffController.viewActiveOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/Orders/Completed""", """controllers.User.KitchenStaffController.viewCompletedOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/Orders/Queued""", """controllers.User.KitchenStaffController.viewQueuedOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Dashboard""", """controllers.User.DeliveryStaffController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Order""", """controllers.User.DeliveryStaffController.viewOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Order/Deliver""", """controllers.User.DeliveryStaffController.deliverOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Order/Checkout""", """controllers.User.DeliveryStaffController.checkoutOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Orders/Completed""", """controllers.User.DeliveryStaffController.viewCompletedDeliveries()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Orders/Active""", """controllers.User.DeliveryStaffController.viewActiveDeliveries()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Orders/Waiting""", """controllers.User.DeliveryStaffController.viewWaitingDeliveries()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Dashboard""", """controllers.User.AdminController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Meals""", """controllers.User.AdminController.manageMeals()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Users""", """controllers.User.AdminController.manageUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Discounts""", """controllers.User.AdminController.manageDiscounts()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/scheduleJSRoutes""", """controllers.Order.ScheduleController.scheduleJSRoutes()"""),
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
    HomeController_7.index(),
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
    HomeController_7.forbiddenAccess(),
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
    HomeController_7.unknown(),
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
    UserController_6.login(),
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
    UserController_6.logout(),
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
    UserController_6.doLogin(),
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
  private[this] lazy val controllers_User_DeliveryStaffController_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Staff")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_index6_invoker = createInvoker(
    DeliveryStaffController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
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
    CustomerController_9.index(),
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
    CustomerController_9.register(),
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
    CustomerController_9.completeRegistration(),
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
    CustomerController_9.verifyCustomer(fakeValue[String]),
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
    CustomerController_9.edit(),
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
    CustomerController_9.orderHistory(),
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
    CustomerController_9.paymentHistory(),
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
    CustomerController_9.viewOrder(fakeValue[String]),
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
    CustomerController_9.viewPayment(fakeValue[String]),
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
    CustomerController_9.create(),
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
    CustomerController_9.reverify(),
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
    CustomerController_9.doCompleteRegistration(),
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
    CustomerController_9.update(),
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
    CustomerController_9.activeOrders(),
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
    ScheduleController_5.index(),
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
    ScheduleController_5.createSchedule(),
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
    ScheduleController_5.addOrder(),
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
    ScheduleController_5.editScheduleName(),
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
    ScheduleController_5.removeOrder(fakeValue[String]),
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
    ScheduleController_5.setScheduleState(),
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
    ScheduleController_5.updateScheduleName(),
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
    ScheduleController_5.doCreateSchedule(),
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
    ScheduleController_5.doAddOrder(),
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
    ScheduleController_5.clearSchedule(),
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

  // @LINE:68
  private[this] lazy val controllers_Order_MenuController_index31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Menu")))
  )
  private[this] lazy val controllers_Order_MenuController_index31_invoker = createInvoker(
    MenuController_2.index(),
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

  // @LINE:76
  private[this] lazy val controllers_User_KitchenStaffController_index32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Dashboard")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_index32_invoker = createInvoker(
    KitchenStaffController_8.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.KitchenStaffController",
      "index",
      Nil,
      "GET",
      this.prefix + """Kitchen/Dashboard""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_User_KitchenStaffController_viewOrder33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Order")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_viewOrder33_invoker = createInvoker(
    KitchenStaffController_8.viewOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.KitchenStaffController",
      "viewOrder",
      Nil,
      "GET",
      this.prefix + """Kitchen/Order""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_User_KitchenStaffController_viewActiveOrders34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Orders/Active")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_viewActiveOrders34_invoker = createInvoker(
    KitchenStaffController_8.viewActiveOrders(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.KitchenStaffController",
      "viewActiveOrders",
      Nil,
      "GET",
      this.prefix + """Kitchen/Orders/Active""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_User_KitchenStaffController_viewCompletedOrders35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Orders/Completed")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_viewCompletedOrders35_invoker = createInvoker(
    KitchenStaffController_8.viewCompletedOrders(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.KitchenStaffController",
      "viewCompletedOrders",
      Nil,
      "GET",
      this.prefix + """Kitchen/Orders/Completed""",
      """""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_User_KitchenStaffController_viewQueuedOrders36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Orders/Queued")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_viewQueuedOrders36_invoker = createInvoker(
    KitchenStaffController_8.viewQueuedOrders(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.KitchenStaffController",
      "viewQueuedOrders",
      Nil,
      "GET",
      this.prefix + """Kitchen/Orders/Queued""",
      """""",
      Seq()
    )
  )

  // @LINE:88
  private[this] lazy val controllers_User_DeliveryStaffController_index37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Dashboard")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_index37_invoker = createInvoker(
    DeliveryStaffController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
      "index",
      Nil,
      "GET",
      this.prefix + """Delivery/Dashboard""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_User_DeliveryStaffController_viewOrder38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Order")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_viewOrder38_invoker = createInvoker(
    DeliveryStaffController_1.viewOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
      "viewOrder",
      Nil,
      "GET",
      this.prefix + """Delivery/Order""",
      """""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val controllers_User_DeliveryStaffController_deliverOrder39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Order/Deliver")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_deliverOrder39_invoker = createInvoker(
    DeliveryStaffController_1.deliverOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
      "deliverOrder",
      Nil,
      "GET",
      this.prefix + """Delivery/Order/Deliver""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_User_DeliveryStaffController_checkoutOrder40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Order/Checkout")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_checkoutOrder40_invoker = createInvoker(
    DeliveryStaffController_1.checkoutOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
      "checkoutOrder",
      Nil,
      "GET",
      this.prefix + """Delivery/Order/Checkout""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val controllers_User_DeliveryStaffController_viewCompletedDeliveries41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Orders/Completed")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_viewCompletedDeliveries41_invoker = createInvoker(
    DeliveryStaffController_1.viewCompletedDeliveries(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
      "viewCompletedDeliveries",
      Nil,
      "GET",
      this.prefix + """Delivery/Orders/Completed""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val controllers_User_DeliveryStaffController_viewActiveDeliveries42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Orders/Active")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_viewActiveDeliveries42_invoker = createInvoker(
    DeliveryStaffController_1.viewActiveDeliveries(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
      "viewActiveDeliveries",
      Nil,
      "GET",
      this.prefix + """Delivery/Orders/Active""",
      """""",
      Seq()
    )
  )

  // @LINE:94
  private[this] lazy val controllers_User_DeliveryStaffController_viewWaitingDeliveries43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Orders/Waiting")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_viewWaitingDeliveries43_invoker = createInvoker(
    DeliveryStaffController_1.viewWaitingDeliveries(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
      "viewWaitingDeliveries",
      Nil,
      "GET",
      this.prefix + """Delivery/Orders/Waiting""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_User_AdminController_index44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Dashboard")))
  )
  private[this] lazy val controllers_User_AdminController_index44_invoker = createInvoker(
    AdminController_11.index(),
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

  // @LINE:104
  private[this] lazy val controllers_User_AdminController_manageMeals45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Meals")))
  )
  private[this] lazy val controllers_User_AdminController_manageMeals45_invoker = createInvoker(
    AdminController_11.manageMeals(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "manageMeals",
      Nil,
      "GET",
      this.prefix + """Admin/Manage/Meals""",
      """""",
      Seq()
    )
  )

  // @LINE:105
  private[this] lazy val controllers_User_AdminController_manageUsers46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Users")))
  )
  private[this] lazy val controllers_User_AdminController_manageUsers46_invoker = createInvoker(
    AdminController_11.manageUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "manageUsers",
      Nil,
      "GET",
      this.prefix + """Admin/Manage/Users""",
      """""",
      Seq()
    )
  )

  // @LINE:106
  private[this] lazy val controllers_User_AdminController_manageDiscounts47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Discounts")))
  )
  private[this] lazy val controllers_User_AdminController_manageDiscounts47_invoker = createInvoker(
    AdminController_11.manageDiscounts(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "manageDiscounts",
      Nil,
      "GET",
      this.prefix + """Admin/Manage/Discounts""",
      """""",
      Seq()
    )
  )

  // @LINE:114
  private[this] lazy val controllers_Finance_UserFinance_addFunds48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_addFunds48_invoker = createInvoker(
    UserFinance_3.addFunds(),
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

  // @LINE:116
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds49_invoker = createInvoker(
    UserFinance_3.doAddFunds(),
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

  // @LINE:124
  private[this] lazy val controllers_OrderController_getMenu50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu")))
  )
  private[this] lazy val controllers_OrderController_getMenu50_invoker = createInvoker(
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

  // @LINE:126
  private[this] lazy val controllers_OrderController_switchMenu51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/"), DynamicPart("menutype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_switchMenu51_invoker = createInvoker(
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

  // @LINE:128
  private[this] lazy val controllers_AccountController_getSignUp52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_AccountController_getSignUp52_invoker = createInvoker(
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

  // @LINE:130
  private[this] lazy val controllers_OrderController_addMealToOrder53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmealtoorder")))
  )
  private[this] lazy val controllers_OrderController_addMealToOrder53_invoker = createInvoker(
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

  // @LINE:132
  private[this] lazy val controllers_OrderController_getAddMealToMenu54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmeal")))
  )
  private[this] lazy val controllers_OrderController_getAddMealToMenu54_invoker = createInvoker(
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

  // @LINE:134
  private[this] lazy val controllers_OrderController_addMeal55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postmeal")))
  )
  private[this] lazy val controllers_OrderController_addMeal55_invoker = createInvoker(
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

  // @LINE:136
  private[this] lazy val controllers_AccountController_doLogin56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dologin")))
  )
  private[this] lazy val controllers_AccountController_doLogin56_invoker = createInvoker(
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

  // @LINE:138
  private[this] lazy val controllers_AccountController_doSignOut57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dosignout")))
  )
  private[this] lazy val controllers_AccountController_doSignOut57_invoker = createInvoker(
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

  // @LINE:140
  private[this] lazy val controllers_OrderController_getCart58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_OrderController_getCart58_invoker = createInvoker(
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

  // @LINE:142
  private[this] lazy val controllers_OrderController_removeMealFromOrder59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/removemeal")))
  )
  private[this] lazy val controllers_OrderController_removeMealFromOrder59_invoker = createInvoker(
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

  // @LINE:144
  private[this] lazy val controllers_OrderController_submitCart60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit")))
  )
  private[this] lazy val controllers_OrderController_submitCart60_invoker = createInvoker(
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

  // @LINE:149
  private[this] lazy val controllers_Order_ScheduleController_scheduleJSRoutes61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/scheduleJSRoutes")))
  )
  private[this] lazy val controllers_Order_ScheduleController_scheduleJSRoutes61_invoker = createInvoker(
    ScheduleController_5.scheduleJSRoutes(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "scheduleJSRoutes",
      Nil,
      "GET",
      this.prefix + """assets/javascripts/scheduleJSRoutes""",
      """#############################################################################
 Javascript Routing
GET        /assets/javascripts/routes               controllers.Order.ScheduleController.javascriptRoutes()""",
      Seq()
    )
  )

  // @LINE:152
  private[this] lazy val controllers_CountController_count62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count62_invoker = createInvoker(
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

  // @LINE:155
  private[this] lazy val controllers_AsyncController_message63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message63_invoker = createInvoker(
    AsyncController_4.message,
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

  // @LINE:158
  private[this] lazy val controllers_Assets_versioned64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned64_invoker = createInvoker(
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

  // @LINE:169
  private[this] lazy val controllers_Application_HomeController_invalidRoute65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("path", """.+""",false)))
  )
  private[this] lazy val controllers_Application_HomeController_invalidRoute65_invoker = createInvoker(
    HomeController_7.invalidRoute(fakeValue[String]),
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
        controllers_Application_HomeController_index0_invoker.call(HomeController_7.index())
      }
  
    // @LINE:7
    case controllers_Application_HomeController_forbiddenAccess1_route(params) =>
      call { 
        controllers_Application_HomeController_forbiddenAccess1_invoker.call(HomeController_7.forbiddenAccess())
      }
  
    // @LINE:8
    case controllers_Application_HomeController_unknown2_route(params) =>
      call { 
        controllers_Application_HomeController_unknown2_invoker.call(HomeController_7.unknown())
      }
  
    // @LINE:17
    case controllers_User_UserController_login3_route(params) =>
      call { 
        controllers_User_UserController_login3_invoker.call(UserController_6.login())
      }
  
    // @LINE:18
    case controllers_User_UserController_logout4_route(params) =>
      call { 
        controllers_User_UserController_logout4_invoker.call(UserController_6.logout())
      }
  
    // @LINE:20
    case controllers_User_UserController_doLogin5_route(params) =>
      call { 
        controllers_User_UserController_doLogin5_invoker.call(UserController_6.doLogin())
      }
  
    // @LINE:27
    case controllers_User_DeliveryStaffController_index6_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_index6_invoker.call(DeliveryStaffController_1.index())
      }
  
    // @LINE:34
    case controllers_User_CustomerController_index7_route(params) =>
      call { 
        controllers_User_CustomerController_index7_invoker.call(CustomerController_9.index())
      }
  
    // @LINE:35
    case controllers_User_CustomerController_register8_route(params) =>
      call { 
        controllers_User_CustomerController_register8_invoker.call(CustomerController_9.register())
      }
  
    // @LINE:36
    case controllers_User_CustomerController_completeRegistration9_route(params) =>
      call { 
        controllers_User_CustomerController_completeRegistration9_invoker.call(CustomerController_9.completeRegistration())
      }
  
    // @LINE:37
    case controllers_User_CustomerController_verifyCustomer10_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_User_CustomerController_verifyCustomer10_invoker.call(CustomerController_9.verifyCustomer(token))
      }
  
    // @LINE:38
    case controllers_User_CustomerController_edit11_route(params) =>
      call { 
        controllers_User_CustomerController_edit11_invoker.call(CustomerController_9.edit())
      }
  
    // @LINE:39
    case controllers_User_CustomerController_orderHistory12_route(params) =>
      call { 
        controllers_User_CustomerController_orderHistory12_invoker.call(CustomerController_9.orderHistory())
      }
  
    // @LINE:40
    case controllers_User_CustomerController_paymentHistory13_route(params) =>
      call { 
        controllers_User_CustomerController_paymentHistory13_invoker.call(CustomerController_9.paymentHistory())
      }
  
    // @LINE:41
    case controllers_User_CustomerController_viewOrder14_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_User_CustomerController_viewOrder14_invoker.call(CustomerController_9.viewOrder(orderId))
      }
  
    // @LINE:42
    case controllers_User_CustomerController_viewPayment15_route(params) =>
      call(params.fromPath[String]("paymentId", None)) { (paymentId) =>
        controllers_User_CustomerController_viewPayment15_invoker.call(CustomerController_9.viewPayment(paymentId))
      }
  
    // @LINE:44
    case controllers_User_CustomerController_create16_route(params) =>
      call { 
        controllers_User_CustomerController_create16_invoker.call(CustomerController_9.create())
      }
  
    // @LINE:45
    case controllers_User_CustomerController_reverify17_route(params) =>
      call { 
        controllers_User_CustomerController_reverify17_invoker.call(CustomerController_9.reverify())
      }
  
    // @LINE:46
    case controllers_User_CustomerController_doCompleteRegistration18_route(params) =>
      call { 
        controllers_User_CustomerController_doCompleteRegistration18_invoker.call(CustomerController_9.doCompleteRegistration())
      }
  
    // @LINE:47
    case controllers_User_CustomerController_update19_route(params) =>
      call { 
        controllers_User_CustomerController_update19_invoker.call(CustomerController_9.update())
      }
  
    // @LINE:48
    case controllers_User_CustomerController_activeOrders20_route(params) =>
      call { 
        controllers_User_CustomerController_activeOrders20_invoker.call(CustomerController_9.activeOrders())
      }
  
    // @LINE:52
    case controllers_Order_ScheduleController_index21_route(params) =>
      call { 
        controllers_Order_ScheduleController_index21_invoker.call(ScheduleController_5.index())
      }
  
    // @LINE:53
    case controllers_Order_ScheduleController_createSchedule22_route(params) =>
      call { 
        controllers_Order_ScheduleController_createSchedule22_invoker.call(ScheduleController_5.createSchedule())
      }
  
    // @LINE:54
    case controllers_Order_ScheduleController_addOrder23_route(params) =>
      call { 
        controllers_Order_ScheduleController_addOrder23_invoker.call(ScheduleController_5.addOrder())
      }
  
    // @LINE:55
    case controllers_Order_ScheduleController_editScheduleName24_route(params) =>
      call { 
        controllers_Order_ScheduleController_editScheduleName24_invoker.call(ScheduleController_5.editScheduleName())
      }
  
    // @LINE:57
    case controllers_Order_ScheduleController_removeOrder25_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_Order_ScheduleController_removeOrder25_invoker.call(ScheduleController_5.removeOrder(orderId))
      }
  
    // @LINE:58
    case controllers_Order_ScheduleController_setScheduleState26_route(params) =>
      call { 
        controllers_Order_ScheduleController_setScheduleState26_invoker.call(ScheduleController_5.setScheduleState())
      }
  
    // @LINE:59
    case controllers_Order_ScheduleController_updateScheduleName27_route(params) =>
      call { 
        controllers_Order_ScheduleController_updateScheduleName27_invoker.call(ScheduleController_5.updateScheduleName())
      }
  
    // @LINE:60
    case controllers_Order_ScheduleController_doCreateSchedule28_route(params) =>
      call { 
        controllers_Order_ScheduleController_doCreateSchedule28_invoker.call(ScheduleController_5.doCreateSchedule())
      }
  
    // @LINE:61
    case controllers_Order_ScheduleController_doAddOrder29_route(params) =>
      call { 
        controllers_Order_ScheduleController_doAddOrder29_invoker.call(ScheduleController_5.doAddOrder())
      }
  
    // @LINE:62
    case controllers_Order_ScheduleController_clearSchedule30_route(params) =>
      call { 
        controllers_Order_ScheduleController_clearSchedule30_invoker.call(ScheduleController_5.clearSchedule())
      }
  
    // @LINE:68
    case controllers_Order_MenuController_index31_route(params) =>
      call { 
        controllers_Order_MenuController_index31_invoker.call(MenuController_2.index())
      }
  
    // @LINE:76
    case controllers_User_KitchenStaffController_index32_route(params) =>
      call { 
        controllers_User_KitchenStaffController_index32_invoker.call(KitchenStaffController_8.index())
      }
  
    // @LINE:77
    case controllers_User_KitchenStaffController_viewOrder33_route(params) =>
      call { 
        controllers_User_KitchenStaffController_viewOrder33_invoker.call(KitchenStaffController_8.viewOrder())
      }
  
    // @LINE:78
    case controllers_User_KitchenStaffController_viewActiveOrders34_route(params) =>
      call { 
        controllers_User_KitchenStaffController_viewActiveOrders34_invoker.call(KitchenStaffController_8.viewActiveOrders())
      }
  
    // @LINE:79
    case controllers_User_KitchenStaffController_viewCompletedOrders35_route(params) =>
      call { 
        controllers_User_KitchenStaffController_viewCompletedOrders35_invoker.call(KitchenStaffController_8.viewCompletedOrders())
      }
  
    // @LINE:80
    case controllers_User_KitchenStaffController_viewQueuedOrders36_route(params) =>
      call { 
        controllers_User_KitchenStaffController_viewQueuedOrders36_invoker.call(KitchenStaffController_8.viewQueuedOrders())
      }
  
    // @LINE:88
    case controllers_User_DeliveryStaffController_index37_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_index37_invoker.call(DeliveryStaffController_1.index())
      }
  
    // @LINE:89
    case controllers_User_DeliveryStaffController_viewOrder38_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_viewOrder38_invoker.call(DeliveryStaffController_1.viewOrder())
      }
  
    // @LINE:90
    case controllers_User_DeliveryStaffController_deliverOrder39_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_deliverOrder39_invoker.call(DeliveryStaffController_1.deliverOrder())
      }
  
    // @LINE:91
    case controllers_User_DeliveryStaffController_checkoutOrder40_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_checkoutOrder40_invoker.call(DeliveryStaffController_1.checkoutOrder())
      }
  
    // @LINE:92
    case controllers_User_DeliveryStaffController_viewCompletedDeliveries41_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_viewCompletedDeliveries41_invoker.call(DeliveryStaffController_1.viewCompletedDeliveries())
      }
  
    // @LINE:93
    case controllers_User_DeliveryStaffController_viewActiveDeliveries42_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_viewActiveDeliveries42_invoker.call(DeliveryStaffController_1.viewActiveDeliveries())
      }
  
    // @LINE:94
    case controllers_User_DeliveryStaffController_viewWaitingDeliveries43_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_viewWaitingDeliveries43_invoker.call(DeliveryStaffController_1.viewWaitingDeliveries())
      }
  
    // @LINE:103
    case controllers_User_AdminController_index44_route(params) =>
      call { 
        controllers_User_AdminController_index44_invoker.call(AdminController_11.index())
      }
  
    // @LINE:104
    case controllers_User_AdminController_manageMeals45_route(params) =>
      call { 
        controllers_User_AdminController_manageMeals45_invoker.call(AdminController_11.manageMeals())
      }
  
    // @LINE:105
    case controllers_User_AdminController_manageUsers46_route(params) =>
      call { 
        controllers_User_AdminController_manageUsers46_invoker.call(AdminController_11.manageUsers())
      }
  
    // @LINE:106
    case controllers_User_AdminController_manageDiscounts47_route(params) =>
      call { 
        controllers_User_AdminController_manageDiscounts47_invoker.call(AdminController_11.manageDiscounts())
      }
  
    // @LINE:114
    case controllers_Finance_UserFinance_addFunds48_route(params) =>
      call { 
        controllers_Finance_UserFinance_addFunds48_invoker.call(UserFinance_3.addFunds())
      }
  
    // @LINE:116
    case controllers_Finance_UserFinance_doAddFunds49_route(params) =>
      call { 
        controllers_Finance_UserFinance_doAddFunds49_invoker.call(UserFinance_3.doAddFunds())
      }
  
    // @LINE:124
    case controllers_OrderController_getMenu50_route(params) =>
      call { 
        controllers_OrderController_getMenu50_invoker.call(OrderController_12.getMenu())
      }
  
    // @LINE:126
    case controllers_OrderController_switchMenu51_route(params) =>
      call(params.fromPath[Integer]("menutype", None)) { (menutype) =>
        controllers_OrderController_switchMenu51_invoker.call(OrderController_12.switchMenu(menutype))
      }
  
    // @LINE:128
    case controllers_AccountController_getSignUp52_route(params) =>
      call { 
        controllers_AccountController_getSignUp52_invoker.call(AccountController_13.getSignUp)
      }
  
    // @LINE:130
    case controllers_OrderController_addMealToOrder53_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_OrderController_addMealToOrder53_invoker.call(OrderController_12.addMealToOrder(mealId))
      }
  
    // @LINE:132
    case controllers_OrderController_getAddMealToMenu54_route(params) =>
      call { 
        controllers_OrderController_getAddMealToMenu54_invoker.call(OrderController_12.getAddMealToMenu)
      }
  
    // @LINE:134
    case controllers_OrderController_addMeal55_route(params) =>
      call { 
        controllers_OrderController_addMeal55_invoker.call(OrderController_12.addMeal)
      }
  
    // @LINE:136
    case controllers_AccountController_doLogin56_route(params) =>
      call { 
        controllers_AccountController_doLogin56_invoker.call(AccountController_13.doLogin())
      }
  
    // @LINE:138
    case controllers_AccountController_doSignOut57_route(params) =>
      call { 
        controllers_AccountController_doSignOut57_invoker.call(AccountController_13.doSignOut())
      }
  
    // @LINE:140
    case controllers_OrderController_getCart58_route(params) =>
      call { 
        controllers_OrderController_getCart58_invoker.call(OrderController_12.getCart())
      }
  
    // @LINE:142
    case controllers_OrderController_removeMealFromOrder59_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_OrderController_removeMealFromOrder59_invoker.call(OrderController_12.removeMealFromOrder(mealId))
      }
  
    // @LINE:144
    case controllers_OrderController_submitCart60_route(params) =>
      call { 
        controllers_OrderController_submitCart60_invoker.call(OrderController_12.submitCart())
      }
  
    // @LINE:149
    case controllers_Order_ScheduleController_scheduleJSRoutes61_route(params) =>
      call { 
        controllers_Order_ScheduleController_scheduleJSRoutes61_invoker.call(ScheduleController_5.scheduleJSRoutes())
      }
  
    // @LINE:152
    case controllers_CountController_count62_route(params) =>
      call { 
        controllers_CountController_count62_invoker.call(CountController_0.count)
      }
  
    // @LINE:155
    case controllers_AsyncController_message63_route(params) =>
      call { 
        controllers_AsyncController_message63_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:158
    case controllers_Assets_versioned64_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned64_invoker.call(Assets_10.versioned(path, file))
      }
  
    // @LINE:169
    case controllers_Application_HomeController_invalidRoute65_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_HomeController_invalidRoute65_invoker.call(HomeController_7.invalidRoute(path))
      }
  }
}
