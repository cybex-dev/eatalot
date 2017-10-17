
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Wed Oct 18 00:03:01 SAST 2017

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
  UserController_4: controllers.User.UserController,
  // @LINE:27
  DeliveryStaffController_0: controllers.User.DeliveryStaffController,
  // @LINE:34
  CustomerController_9: controllers.User.CustomerController,
  // @LINE:55
  ScheduleController_3: controllers.Order.ScheduleController,
  // @LINE:72
  MenuController_1: controllers.Order.MenuController,
  // @LINE:80
  KitchenStaffController_8: controllers.User.KitchenStaffController,
  // @LINE:117
  AdminController_12: controllers.User.AdminController,
  // @LINE:133
  UserFinance_2: controllers.Finance.UserFinance,
  // @LINE:144
  Assets_11: controllers.Assets,
  // @LINE:146
  OrderController_5: controllers.Order.OrderController,
  // @LINE:150
  AccountController_7: controllers.Order.AccountController,
  // @LINE:176
  KitchenController_10: controllers.Order.KitchenController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_6: controllers.Application.HomeController,
    // @LINE:17
    UserController_4: controllers.User.UserController,
    // @LINE:27
    DeliveryStaffController_0: controllers.User.DeliveryStaffController,
    // @LINE:34
    CustomerController_9: controllers.User.CustomerController,
    // @LINE:55
    ScheduleController_3: controllers.Order.ScheduleController,
    // @LINE:72
    MenuController_1: controllers.Order.MenuController,
    // @LINE:80
    KitchenStaffController_8: controllers.User.KitchenStaffController,
    // @LINE:117
    AdminController_12: controllers.User.AdminController,
    // @LINE:133
    UserFinance_2: controllers.Finance.UserFinance,
    // @LINE:144
    Assets_11: controllers.Assets,
    // @LINE:146
    OrderController_5: controllers.Order.OrderController,
    // @LINE:150
    AccountController_7: controllers.Order.AccountController,
    // @LINE:176
    KitchenController_10: controllers.Order.KitchenController
  ) = this(errorHandler, HomeController_6, UserController_4, DeliveryStaffController_0, CustomerController_9, ScheduleController_3, MenuController_1, KitchenStaffController_8, AdminController_12, UserFinance_2, Assets_11, OrderController_5, AccountController_7, KitchenController_10, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_6, UserController_4, DeliveryStaffController_0, CustomerController_9, ScheduleController_3, MenuController_1, KitchenStaffController_8, AdminController_12, UserFinance_2, Assets_11, OrderController_5, AccountController_7, KitchenController_10, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forbidden""", """controllers.Application.HomeController.forbiddenAccess()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """unknown""", """controllers.Application.HomeController.unknown()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Login""", """controllers.User.UserController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Logout""", """controllers.User.UserController.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Login""", """controllers.User.UserController.doLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Staff""", """controllers.User.DeliveryStaffController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User""", """controllers.User.CustomerController.redirectHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Dashboard""", """controllers.User.CustomerController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Dashboard/Update""", """controllers.User.CustomerController.getCustomerDashUpdate()"""),
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/ChangeState""", """controllers.Order.ScheduleController.setScheduleState()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/Edit""", """controllers.Order.ScheduleController.updateScheduleName()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/New""", """controllers.Order.ScheduleController.doCreateSchedule()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/AddOrder""", """controllers.Order.ScheduleController.doAddOrder()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/Schedule/Clear""", """controllers.Order.ScheduleController.clearSchedule()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Menu""", """controllers.Order.MenuController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/Dashboard""", """controllers.User.KitchenStaffController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/Dashboard/Update""", """controllers.User.KitchenStaffController.getKitchenDashUpdate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/Order""", """controllers.User.KitchenStaffController.viewOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/Orders/Active""", """controllers.User.KitchenStaffController.viewActiveOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/Orders/Completed""", """controllers.User.KitchenStaffController.viewCompletedOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/Orders/Queued""", """controllers.User.KitchenStaffController.viewQueuedOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/User/Edit""", """controllers.User.KitchenStaffController.edit()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Kitchen/User/Edit""", """controllers.User.KitchenStaffController.doEdit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Dashboard""", """controllers.User.DeliveryStaffController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Dashboard/Update""", """controllers.User.DeliveryStaffController.getDeliveryDashUpdate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Order""", """controllers.User.DeliveryStaffController.viewOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Order/Deliver""", """controllers.User.DeliveryStaffController.deliverOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Order/Checkout""", """controllers.User.DeliveryStaffController.checkoutOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Orders/Completed""", """controllers.User.DeliveryStaffController.viewCompletedDeliveries()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Orders/Active""", """controllers.User.DeliveryStaffController.viewActiveDeliveries()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/Orders/Waiting""", """controllers.User.DeliveryStaffController.viewWaitingDeliveries()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/User/Edit""", """controllers.User.DeliveryStaffController.edit()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Delivery/User/Edit""", """controllers.User.DeliveryStaffController.doEdit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Dashboard""", """controllers.User.AdminController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Dashboard/Update""", """controllers.User.AdminController.getAdminDashUpdate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Meals""", """controllers.User.AdminController.manageMeals()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Users""", """controllers.User.AdminController.manageUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Discounts""", """controllers.User.AdminController.manageDiscounts()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Edit""", """controllers.User.AdminController.edit()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Edit""", """controllers.User.AdminController.doEdit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/AddFunds""", """controllers.Finance.UserFinance.addFunds()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/AddFunds""", """controllers.Finance.UserFinance.doAddFunds()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu""", """controllers.Order.OrderController.getMenu()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/""" + "$" + """menutype<[^/]+>""", """controllers.Order.OrderController.switchMenu(menutype:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Order.AccountController.getSignUp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addmealtoorder""", """controllers.Order.OrderController.addMealToOrder(mealId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addmeal""", """controllers.Order.OrderController.getAddMealToMenu"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postmeal""", """controllers.Order.OrderController.addMeal"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dologin""", """controllers.Order.AccountController.doLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dosignout""", """controllers.Order.AccountController.doSignOut()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.Order.OrderController.getCart()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/removemeal""", """controllers.Order.OrderController.removeMealFromOrder(mealId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/submit""", """controllers.Order.OrderController.getSubmitPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/submitcart""", """controllers.Order.OrderController.submitCart()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """history""", """controllers.Order.OrderController.getHistoryPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """history/order""", """controllers.Order.OrderController.getViewOrder(orderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen""", """controllers.Order.KitchenController.home()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen/ingredients""", """controllers.Order.KitchenController.getIngredientPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen/ingredients/order""", """controllers.Order.KitchenController.getIngredientOrderPage(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen/ingredient/order/op""", """controllers.Order.KitchenController.editIngredient(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen/ingredient/ordernew""", """controllers.Order.KitchenController.getNewIngredientPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen/ingredient/add""", """controllers.Order.KitchenController.addIngredient()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen/customerorders""", """controllers.Order.KitchenController.getOrderPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen/pendingorders""", """controllers.Order.KitchenController.getPendingOrderPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen/processingorders""", """controllers.Order.KitchenController.getProcessingOrderPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen/customerorders/mealorder""", """controllers.Order.KitchenController.getMealOrderPage(orderId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen/customerorders/mealorder/update""", """controllers.Order.KitchenController.updateOrderStatus(orderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """path<.+>""", """controllers.Application.HomeController.invalidRoute(path:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/scheduleJSRoutes""", """controllers.Order.ScheduleController.scheduleJSRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/customerJSRoutes""", """controllers.User.CustomerController.customerJSRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/adminJSRoutes""", """controllers.User.AdminController.adminJSRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/deliveryJSRoutes""", """controllers.User.DeliveryStaffController.deliveryJSRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/kitchenJSRoutes""", """controllers.User.KitchenStaffController.kitchenJSRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/AddFunds""", """controllers.Finance.UserFinance.addFunds()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/AddFunds""", """controllers.Finance.UserFinance.doAddFunds()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/User/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/User/Registration/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/Delivery/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/Kitchen/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/Staff/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/History/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forbidden")))
  )
  private[this] lazy val controllers_Application_HomeController_forbiddenAccess1_invoker = createInvoker(
    HomeController_6.forbiddenAccess(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application.HomeController",
      "forbiddenAccess",
      Nil,
      "GET",
      this.prefix + """forbidden""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_HomeController_unknown2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("unknown")))
  )
  private[this] lazy val controllers_Application_HomeController_unknown2_invoker = createInvoker(
    HomeController_6.unknown(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application.HomeController",
      "unknown",
      Nil,
      "GET",
      this.prefix + """unknown""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_User_UserController_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Login")))
  )
  private[this] lazy val controllers_User_UserController_login3_invoker = createInvoker(
    UserController_4.login(),
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

  // @LINE:20
  private[this] lazy val controllers_User_UserController_doLogin5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Login")))
  )
  private[this] lazy val controllers_User_UserController_doLogin5_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_User_DeliveryStaffController_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Staff")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_index6_invoker = createInvoker(
    DeliveryStaffController_0.index(),
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
  private[this] lazy val controllers_User_CustomerController_redirectHome7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User")))
  )
  private[this] lazy val controllers_User_CustomerController_redirectHome7_invoker = createInvoker(
    CustomerController_9.redirectHome(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "redirectHome",
      Nil,
      "GET",
      this.prefix + """User""",
      """ Customer Controller""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_User_CustomerController_index8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Dashboard")))
  )
  private[this] lazy val controllers_User_CustomerController_index8_invoker = createInvoker(
    CustomerController_9.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "index",
      Nil,
      "GET",
      this.prefix + """User/Dashboard""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_User_CustomerController_getCustomerDashUpdate9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Dashboard/Update")))
  )
  private[this] lazy val controllers_User_CustomerController_getCustomerDashUpdate9_invoker = createInvoker(
    CustomerController_9.getCustomerDashUpdate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "getCustomerDashUpdate",
      Nil,
      "GET",
      this.prefix + """User/Dashboard/Update""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:38
  private[this] lazy val controllers_User_CustomerController_register10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_CustomerController_register10_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_User_CustomerController_completeRegistration11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register/Completing")))
  )
  private[this] lazy val controllers_User_CustomerController_completeRegistration11_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_User_CustomerController_verifyCustomer12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Verify/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_CustomerController_verifyCustomer12_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_User_CustomerController_edit13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Profile")))
  )
  private[this] lazy val controllers_User_CustomerController_edit13_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_User_CustomerController_orderHistory14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Orders")))
  )
  private[this] lazy val controllers_User_CustomerController_orderHistory14_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_User_CustomerController_paymentHistory15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Purchases")))
  )
  private[this] lazy val controllers_User_CustomerController_paymentHistory15_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_User_CustomerController_viewOrder16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Order/"), DynamicPart("orderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_CustomerController_viewOrder16_invoker = createInvoker(
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

  // @LINE:45
  private[this] lazy val controllers_User_CustomerController_viewPayment17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Payment/"), DynamicPart("paymentId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_CustomerController_viewPayment17_invoker = createInvoker(
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

  // @LINE:47
  private[this] lazy val controllers_User_CustomerController_create18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_CustomerController_create18_invoker = createInvoker(
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

  // @LINE:48
  private[this] lazy val controllers_User_CustomerController_reverify19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register/Reverify")))
  )
  private[this] lazy val controllers_User_CustomerController_reverify19_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_User_CustomerController_doCompleteRegistration20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register/Completing")))
  )
  private[this] lazy val controllers_User_CustomerController_doCompleteRegistration20_invoker = createInvoker(
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

  // @LINE:50
  private[this] lazy val controllers_User_CustomerController_update21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Profile")))
  )
  private[this] lazy val controllers_User_CustomerController_update21_invoker = createInvoker(
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

  // @LINE:51
  private[this] lazy val controllers_User_CustomerController_activeOrders22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/ActiveOrders")))
  )
  private[this] lazy val controllers_User_CustomerController_activeOrders22_invoker = createInvoker(
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

  // @LINE:55
  private[this] lazy val controllers_Order_ScheduleController_index23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule")))
  )
  private[this] lazy val controllers_Order_ScheduleController_index23_invoker = createInvoker(
    ScheduleController_3.index(),
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

  // @LINE:56
  private[this] lazy val controllers_Order_ScheduleController_createSchedule24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/New")))
  )
  private[this] lazy val controllers_Order_ScheduleController_createSchedule24_invoker = createInvoker(
    ScheduleController_3.createSchedule(),
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

  // @LINE:57
  private[this] lazy val controllers_Order_ScheduleController_addOrder25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/AddOrder")))
  )
  private[this] lazy val controllers_Order_ScheduleController_addOrder25_invoker = createInvoker(
    ScheduleController_3.addOrder(),
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

  // @LINE:58
  private[this] lazy val controllers_Order_ScheduleController_editScheduleName26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Edit")))
  )
  private[this] lazy val controllers_Order_ScheduleController_editScheduleName26_invoker = createInvoker(
    ScheduleController_3.editScheduleName(),
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

  // @LINE:60
  private[this] lazy val controllers_Order_ScheduleController_removeOrder27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Delete/"), DynamicPart("orderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Order_ScheduleController_removeOrder27_invoker = createInvoker(
    ScheduleController_3.removeOrder(fakeValue[String]),
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

  // @LINE:62
  private[this] lazy val controllers_Order_ScheduleController_setScheduleState28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/ChangeState")))
  )
  private[this] lazy val controllers_Order_ScheduleController_setScheduleState28_invoker = createInvoker(
    ScheduleController_3.setScheduleState(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "setScheduleState",
      Nil,
      "POST",
      this.prefix + """User/Schedule/ChangeState""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Order_ScheduleController_updateScheduleName29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Edit")))
  )
  private[this] lazy val controllers_Order_ScheduleController_updateScheduleName29_invoker = createInvoker(
    ScheduleController_3.updateScheduleName(),
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

  // @LINE:64
  private[this] lazy val controllers_Order_ScheduleController_doCreateSchedule30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/New")))
  )
  private[this] lazy val controllers_Order_ScheduleController_doCreateSchedule30_invoker = createInvoker(
    ScheduleController_3.doCreateSchedule(),
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

  // @LINE:65
  private[this] lazy val controllers_Order_ScheduleController_doAddOrder31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/AddOrder")))
  )
  private[this] lazy val controllers_Order_ScheduleController_doAddOrder31_invoker = createInvoker(
    ScheduleController_3.doAddOrder(),
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

  // @LINE:66
  private[this] lazy val controllers_Order_ScheduleController_clearSchedule32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Clear")))
  )
  private[this] lazy val controllers_Order_ScheduleController_clearSchedule32_invoker = createInvoker(
    ScheduleController_3.clearSchedule(),
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

  // @LINE:72
  private[this] lazy val controllers_Order_MenuController_index33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Menu")))
  )
  private[this] lazy val controllers_Order_MenuController_index33_invoker = createInvoker(
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

  // @LINE:80
  private[this] lazy val controllers_User_KitchenStaffController_index34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Dashboard")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_index34_invoker = createInvoker(
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

  // @LINE:82
  private[this] lazy val controllers_User_KitchenStaffController_getKitchenDashUpdate35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Dashboard/Update")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_getKitchenDashUpdate35_invoker = createInvoker(
    KitchenStaffController_8.getKitchenDashUpdate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.KitchenStaffController",
      "getKitchenDashUpdate",
      Nil,
      "GET",
      this.prefix + """Kitchen/Dashboard/Update""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:83
  private[this] lazy val controllers_User_KitchenStaffController_viewOrder36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Order")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_viewOrder36_invoker = createInvoker(
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

  // @LINE:84
  private[this] lazy val controllers_User_KitchenStaffController_viewActiveOrders37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Orders/Active")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_viewActiveOrders37_invoker = createInvoker(
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

  // @LINE:85
  private[this] lazy val controllers_User_KitchenStaffController_viewCompletedOrders38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Orders/Completed")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_viewCompletedOrders38_invoker = createInvoker(
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

  // @LINE:86
  private[this] lazy val controllers_User_KitchenStaffController_viewQueuedOrders39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Orders/Queued")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_viewQueuedOrders39_invoker = createInvoker(
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

  // @LINE:87
  private[this] lazy val controllers_User_KitchenStaffController_edit40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/User/Edit")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_edit40_invoker = createInvoker(
    KitchenStaffController_8.edit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.KitchenStaffController",
      "edit",
      Nil,
      "GET",
      this.prefix + """Kitchen/User/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_User_KitchenStaffController_doEdit41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/User/Edit")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_doEdit41_invoker = createInvoker(
    KitchenStaffController_8.doEdit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.KitchenStaffController",
      "doEdit",
      Nil,
      "POST",
      this.prefix + """Kitchen/User/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val controllers_User_DeliveryStaffController_index42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Dashboard")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_index42_invoker = createInvoker(
    DeliveryStaffController_0.index(),
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

  // @LINE:99
  private[this] lazy val controllers_User_DeliveryStaffController_getDeliveryDashUpdate43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Dashboard/Update")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_getDeliveryDashUpdate43_invoker = createInvoker(
    DeliveryStaffController_0.getDeliveryDashUpdate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
      "getDeliveryDashUpdate",
      Nil,
      "GET",
      this.prefix + """Delivery/Dashboard/Update""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:100
  private[this] lazy val controllers_User_DeliveryStaffController_viewOrder44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Order")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_viewOrder44_invoker = createInvoker(
    DeliveryStaffController_0.viewOrder(),
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

  // @LINE:101
  private[this] lazy val controllers_User_DeliveryStaffController_deliverOrder45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Order/Deliver")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_deliverOrder45_invoker = createInvoker(
    DeliveryStaffController_0.deliverOrder(),
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

  // @LINE:102
  private[this] lazy val controllers_User_DeliveryStaffController_checkoutOrder46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Order/Checkout")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_checkoutOrder46_invoker = createInvoker(
    DeliveryStaffController_0.checkoutOrder(),
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

  // @LINE:103
  private[this] lazy val controllers_User_DeliveryStaffController_viewCompletedDeliveries47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Orders/Completed")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_viewCompletedDeliveries47_invoker = createInvoker(
    DeliveryStaffController_0.viewCompletedDeliveries(),
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

  // @LINE:104
  private[this] lazy val controllers_User_DeliveryStaffController_viewActiveDeliveries48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Orders/Active")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_viewActiveDeliveries48_invoker = createInvoker(
    DeliveryStaffController_0.viewActiveDeliveries(),
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

  // @LINE:105
  private[this] lazy val controllers_User_DeliveryStaffController_viewWaitingDeliveries49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Orders/Waiting")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_viewWaitingDeliveries49_invoker = createInvoker(
    DeliveryStaffController_0.viewWaitingDeliveries(),
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

  // @LINE:106
  private[this] lazy val controllers_User_DeliveryStaffController_edit50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/User/Edit")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_edit50_invoker = createInvoker(
    DeliveryStaffController_0.edit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
      "edit",
      Nil,
      "GET",
      this.prefix + """Delivery/User/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:108
  private[this] lazy val controllers_User_DeliveryStaffController_doEdit51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/User/Edit")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_doEdit51_invoker = createInvoker(
    DeliveryStaffController_0.doEdit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
      "doEdit",
      Nil,
      "POST",
      this.prefix + """Delivery/User/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:117
  private[this] lazy val controllers_User_AdminController_index52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Dashboard")))
  )
  private[this] lazy val controllers_User_AdminController_index52_invoker = createInvoker(
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

  // @LINE:119
  private[this] lazy val controllers_User_AdminController_getAdminDashUpdate53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Dashboard/Update")))
  )
  private[this] lazy val controllers_User_AdminController_getAdminDashUpdate53_invoker = createInvoker(
    AdminController_12.getAdminDashUpdate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "getAdminDashUpdate",
      Nil,
      "GET",
      this.prefix + """Admin/Dashboard/Update""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:120
  private[this] lazy val controllers_User_AdminController_manageMeals54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Meals")))
  )
  private[this] lazy val controllers_User_AdminController_manageMeals54_invoker = createInvoker(
    AdminController_12.manageMeals(),
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

  // @LINE:121
  private[this] lazy val controllers_User_AdminController_manageUsers55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Users")))
  )
  private[this] lazy val controllers_User_AdminController_manageUsers55_invoker = createInvoker(
    AdminController_12.manageUsers(),
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

  // @LINE:122
  private[this] lazy val controllers_User_AdminController_manageDiscounts56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Discounts")))
  )
  private[this] lazy val controllers_User_AdminController_manageDiscounts56_invoker = createInvoker(
    AdminController_12.manageDiscounts(),
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

  // @LINE:123
  private[this] lazy val controllers_User_AdminController_edit57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Edit")))
  )
  private[this] lazy val controllers_User_AdminController_edit57_invoker = createInvoker(
    AdminController_12.edit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "edit",
      Nil,
      "GET",
      this.prefix + """Admin/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:125
  private[this] lazy val controllers_User_AdminController_doEdit58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Edit")))
  )
  private[this] lazy val controllers_User_AdminController_doEdit58_invoker = createInvoker(
    AdminController_12.doEdit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "doEdit",
      Nil,
      "POST",
      this.prefix + """Admin/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:133
  private[this] lazy val controllers_Finance_UserFinance_addFunds59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_addFunds59_invoker = createInvoker(
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

  // @LINE:135
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds60_invoker = createInvoker(
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

  // @LINE:144
  private[this] lazy val controllers_Assets_versioned61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned61_invoker = createInvoker(
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

  // @LINE:146
  private[this] lazy val controllers_Order_OrderController_getMenu62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu")))
  )
  private[this] lazy val controllers_Order_OrderController_getMenu62_invoker = createInvoker(
    OrderController_5.getMenu(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "getMenu",
      Nil,
      "GET",
      this.prefix + """menu""",
      """""",
      Seq()
    )
  )

  // @LINE:148
  private[this] lazy val controllers_Order_OrderController_switchMenu63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/"), DynamicPart("menutype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Order_OrderController_switchMenu63_invoker = createInvoker(
    OrderController_5.switchMenu(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "switchMenu",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """menu/""" + "$" + """menutype<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:150
  private[this] lazy val controllers_Order_AccountController_getSignUp64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Order_AccountController_getSignUp64_invoker = createInvoker(
    AccountController_7.getSignUp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.AccountController",
      "getSignUp",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:152
  private[this] lazy val controllers_Order_OrderController_addMealToOrder65_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmealtoorder")))
  )
  private[this] lazy val controllers_Order_OrderController_addMealToOrder65_invoker = createInvoker(
    OrderController_5.addMealToOrder(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "addMealToOrder",
      Seq(classOf[String]),
      "POST",
      this.prefix + """addmealtoorder""",
      """""",
      Seq()
    )
  )

  // @LINE:154
  private[this] lazy val controllers_Order_OrderController_getAddMealToMenu66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmeal")))
  )
  private[this] lazy val controllers_Order_OrderController_getAddMealToMenu66_invoker = createInvoker(
    OrderController_5.getAddMealToMenu,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "getAddMealToMenu",
      Nil,
      "GET",
      this.prefix + """addmeal""",
      """""",
      Seq()
    )
  )

  // @LINE:156
  private[this] lazy val controllers_Order_OrderController_addMeal67_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postmeal")))
  )
  private[this] lazy val controllers_Order_OrderController_addMeal67_invoker = createInvoker(
    OrderController_5.addMeal,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "addMeal",
      Nil,
      "POST",
      this.prefix + """postmeal""",
      """""",
      Seq()
    )
  )

  // @LINE:158
  private[this] lazy val controllers_Order_AccountController_doLogin68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dologin")))
  )
  private[this] lazy val controllers_Order_AccountController_doLogin68_invoker = createInvoker(
    AccountController_7.doLogin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.AccountController",
      "doLogin",
      Nil,
      "GET",
      this.prefix + """dologin""",
      """""",
      Seq()
    )
  )

  // @LINE:160
  private[this] lazy val controllers_Order_AccountController_doSignOut69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dosignout")))
  )
  private[this] lazy val controllers_Order_AccountController_doSignOut69_invoker = createInvoker(
    AccountController_7.doSignOut(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.AccountController",
      "doSignOut",
      Nil,
      "GET",
      this.prefix + """dosignout""",
      """""",
      Seq()
    )
  )

  // @LINE:162
  private[this] lazy val controllers_Order_OrderController_getCart70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_Order_OrderController_getCart70_invoker = createInvoker(
    OrderController_5.getCart(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "getCart",
      Nil,
      "GET",
      this.prefix + """cart""",
      """""",
      Seq()
    )
  )

  // @LINE:164
  private[this] lazy val controllers_Order_OrderController_removeMealFromOrder71_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/removemeal")))
  )
  private[this] lazy val controllers_Order_OrderController_removeMealFromOrder71_invoker = createInvoker(
    OrderController_5.removeMealFromOrder(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "removeMealFromOrder",
      Seq(classOf[String]),
      "POST",
      this.prefix + """cart/removemeal""",
      """""",
      Seq()
    )
  )

  // @LINE:166
  private[this] lazy val controllers_Order_OrderController_getSubmitPage72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/submit")))
  )
  private[this] lazy val controllers_Order_OrderController_getSubmitPage72_invoker = createInvoker(
    OrderController_5.getSubmitPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "getSubmitPage",
      Nil,
      "GET",
      this.prefix + """cart/submit""",
      """""",
      Seq()
    )
  )

  // @LINE:168
  private[this] lazy val controllers_Order_OrderController_submitCart73_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/submitcart")))
  )
  private[this] lazy val controllers_Order_OrderController_submitCart73_invoker = createInvoker(
    OrderController_5.submitCart(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "submitCart",
      Nil,
      "POST",
      this.prefix + """cart/submitcart""",
      """""",
      Seq()
    )
  )

  // @LINE:170
  private[this] lazy val controllers_Order_OrderController_getHistoryPage74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history")))
  )
  private[this] lazy val controllers_Order_OrderController_getHistoryPage74_invoker = createInvoker(
    OrderController_5.getHistoryPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "getHistoryPage",
      Nil,
      "GET",
      this.prefix + """history""",
      """""",
      Seq()
    )
  )

  // @LINE:172
  private[this] lazy val controllers_Order_OrderController_getViewOrder75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history/order")))
  )
  private[this] lazy val controllers_Order_OrderController_getViewOrder75_invoker = createInvoker(
    OrderController_5.getViewOrder(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "getViewOrder",
      Seq(classOf[String]),
      "POST",
      this.prefix + """history/order""",
      """""",
      Seq()
    )
  )

  // @LINE:176
  private[this] lazy val controllers_Order_KitchenController_home76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen")))
  )
  private[this] lazy val controllers_Order_KitchenController_home76_invoker = createInvoker(
    KitchenController_10.home(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "home",
      Nil,
      "GET",
      this.prefix + """kitchen""",
      """""",
      Seq()
    )
  )

  // @LINE:180
  private[this] lazy val controllers_Order_KitchenController_getIngredientPage77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredients")))
  )
  private[this] lazy val controllers_Order_KitchenController_getIngredientPage77_invoker = createInvoker(
    KitchenController_10.getIngredientPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "getIngredientPage",
      Nil,
      "GET",
      this.prefix + """kitchen/ingredients""",
      """""",
      Seq()
    )
  )

  // @LINE:182
  private[this] lazy val controllers_Order_KitchenController_getIngredientOrderPage78_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredients/order")))
  )
  private[this] lazy val controllers_Order_KitchenController_getIngredientOrderPage78_invoker = createInvoker(
    KitchenController_10.getIngredientOrderPage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "getIngredientOrderPage",
      Seq(classOf[String]),
      "POST",
      this.prefix + """kitchen/ingredients/order""",
      """""",
      Seq()
    )
  )

  // @LINE:184
  private[this] lazy val controllers_Order_KitchenController_editIngredient79_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredient/order/op")))
  )
  private[this] lazy val controllers_Order_KitchenController_editIngredient79_invoker = createInvoker(
    KitchenController_10.editIngredient(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "editIngredient",
      Seq(classOf[String]),
      "POST",
      this.prefix + """kitchen/ingredient/order/op""",
      """""",
      Seq()
    )
  )

  // @LINE:186
  private[this] lazy val controllers_Order_KitchenController_getNewIngredientPage80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredient/ordernew")))
  )
  private[this] lazy val controllers_Order_KitchenController_getNewIngredientPage80_invoker = createInvoker(
    KitchenController_10.getNewIngredientPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "getNewIngredientPage",
      Nil,
      "GET",
      this.prefix + """kitchen/ingredient/ordernew""",
      """""",
      Seq()
    )
  )

  // @LINE:188
  private[this] lazy val controllers_Order_KitchenController_addIngredient81_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredient/add")))
  )
  private[this] lazy val controllers_Order_KitchenController_addIngredient81_invoker = createInvoker(
    KitchenController_10.addIngredient(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "addIngredient",
      Nil,
      "POST",
      this.prefix + """kitchen/ingredient/add""",
      """""",
      Seq()
    )
  )

  // @LINE:192
  private[this] lazy val controllers_Order_KitchenController_getOrderPage82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders")))
  )
  private[this] lazy val controllers_Order_KitchenController_getOrderPage82_invoker = createInvoker(
    KitchenController_10.getOrderPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "getOrderPage",
      Nil,
      "GET",
      this.prefix + """kitchen/customerorders""",
      """""",
      Seq()
    )
  )

  // @LINE:194
  private[this] lazy val controllers_Order_KitchenController_getPendingOrderPage83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/pendingorders")))
  )
  private[this] lazy val controllers_Order_KitchenController_getPendingOrderPage83_invoker = createInvoker(
    KitchenController_10.getPendingOrderPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "getPendingOrderPage",
      Nil,
      "GET",
      this.prefix + """kitchen/pendingorders""",
      """""",
      Seq()
    )
  )

  // @LINE:196
  private[this] lazy val controllers_Order_KitchenController_getProcessingOrderPage84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/processingorders")))
  )
  private[this] lazy val controllers_Order_KitchenController_getProcessingOrderPage84_invoker = createInvoker(
    KitchenController_10.getProcessingOrderPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "getProcessingOrderPage",
      Nil,
      "GET",
      this.prefix + """kitchen/processingorders""",
      """""",
      Seq()
    )
  )

  // @LINE:198
  private[this] lazy val controllers_Order_KitchenController_getMealOrderPage85_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders/mealorder")))
  )
  private[this] lazy val controllers_Order_KitchenController_getMealOrderPage85_invoker = createInvoker(
    KitchenController_10.getMealOrderPage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "getMealOrderPage",
      Seq(classOf[String]),
      "POST",
      this.prefix + """kitchen/customerorders/mealorder""",
      """""",
      Seq()
    )
  )

  // @LINE:200
  private[this] lazy val controllers_Order_KitchenController_updateOrderStatus86_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders/mealorder/update")))
  )
  private[this] lazy val controllers_Order_KitchenController_updateOrderStatus86_invoker = createInvoker(
    KitchenController_10.updateOrderStatus(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "updateOrderStatus",
      Seq(classOf[String]),
      "POST",
      this.prefix + """kitchen/customerorders/mealorder/update""",
      """""",
      Seq()
    )
  )

  // @LINE:202
  private[this] lazy val controllers_Application_HomeController_invalidRoute87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("path", """.+""",false)))
  )
  private[this] lazy val controllers_Application_HomeController_invalidRoute87_invoker = createInvoker(
    HomeController_6.invalidRoute(fakeValue[String]),
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

  // @LINE:207
  private[this] lazy val controllers_Order_ScheduleController_scheduleJSRoutes88_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/scheduleJSRoutes")))
  )
  private[this] lazy val controllers_Order_ScheduleController_scheduleJSRoutes88_invoker = createInvoker(
    ScheduleController_3.scheduleJSRoutes(),
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
      Seq("""nocsrf""")
    )
  )

  // @LINE:208
  private[this] lazy val controllers_User_CustomerController_customerJSRoutes89_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/customerJSRoutes")))
  )
  private[this] lazy val controllers_User_CustomerController_customerJSRoutes89_invoker = createInvoker(
    CustomerController_9.customerJSRoutes(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "customerJSRoutes",
      Nil,
      "GET",
      this.prefix + """assets/javascripts/customerJSRoutes""",
      """""",
      Seq()
    )
  )

  // @LINE:209
  private[this] lazy val controllers_User_AdminController_adminJSRoutes90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/adminJSRoutes")))
  )
  private[this] lazy val controllers_User_AdminController_adminJSRoutes90_invoker = createInvoker(
    AdminController_12.adminJSRoutes(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "adminJSRoutes",
      Nil,
      "GET",
      this.prefix + """assets/javascripts/adminJSRoutes""",
      """""",
      Seq()
    )
  )

  // @LINE:210
  private[this] lazy val controllers_User_DeliveryStaffController_deliveryJSRoutes91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/deliveryJSRoutes")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_deliveryJSRoutes91_invoker = createInvoker(
    DeliveryStaffController_0.deliveryJSRoutes(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
      "deliveryJSRoutes",
      Nil,
      "GET",
      this.prefix + """assets/javascripts/deliveryJSRoutes""",
      """""",
      Seq()
    )
  )

  // @LINE:211
  private[this] lazy val controllers_User_KitchenStaffController_kitchenJSRoutes92_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/kitchenJSRoutes")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_kitchenJSRoutes92_invoker = createInvoker(
    KitchenStaffController_8.kitchenJSRoutes(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.KitchenStaffController",
      "kitchenJSRoutes",
      Nil,
      "GET",
      this.prefix + """assets/javascripts/kitchenJSRoutes""",
      """""",
      Seq()
    )
  )

  // @LINE:215
  private[this] lazy val controllers_Finance_UserFinance_addFunds93_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_addFunds93_invoker = createInvoker(
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

  // @LINE:216
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds94_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_doAddFunds94_invoker = createInvoker(
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

  // @LINE:224
  private[this] lazy val controllers_Assets_versioned95_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned95_invoker = createInvoker(
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

  // @LINE:225
  private[this] lazy val controllers_Assets_versioned96_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/User/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned96_invoker = createInvoker(
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

  // @LINE:226
  private[this] lazy val controllers_Assets_versioned97_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/User/Registration/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned97_invoker = createInvoker(
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

  // @LINE:227
  private[this] lazy val controllers_Assets_versioned98_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/Delivery/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned98_invoker = createInvoker(
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

  // @LINE:228
  private[this] lazy val controllers_Assets_versioned99_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/Kitchen/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned99_invoker = createInvoker(
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

  // @LINE:229
  private[this] lazy val controllers_Assets_versioned100_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/Staff/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned100_invoker = createInvoker(
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

  // @LINE:230
  private[this] lazy val controllers_Assets_versioned101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/History/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned101_invoker = createInvoker(
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
        controllers_User_UserController_login3_invoker.call(UserController_4.login())
      }
  
    // @LINE:18
    case controllers_User_UserController_logout4_route(params) =>
      call { 
        controllers_User_UserController_logout4_invoker.call(UserController_4.logout())
      }
  
    // @LINE:20
    case controllers_User_UserController_doLogin5_route(params) =>
      call { 
        controllers_User_UserController_doLogin5_invoker.call(UserController_4.doLogin())
      }
  
    // @LINE:27
    case controllers_User_DeliveryStaffController_index6_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_index6_invoker.call(DeliveryStaffController_0.index())
      }
  
    // @LINE:34
    case controllers_User_CustomerController_redirectHome7_route(params) =>
      call { 
        controllers_User_CustomerController_redirectHome7_invoker.call(CustomerController_9.redirectHome())
      }
  
    // @LINE:35
    case controllers_User_CustomerController_index8_route(params) =>
      call { 
        controllers_User_CustomerController_index8_invoker.call(CustomerController_9.index())
      }
  
    // @LINE:37
    case controllers_User_CustomerController_getCustomerDashUpdate9_route(params) =>
      call { 
        controllers_User_CustomerController_getCustomerDashUpdate9_invoker.call(CustomerController_9.getCustomerDashUpdate())
      }
  
    // @LINE:38
    case controllers_User_CustomerController_register10_route(params) =>
      call { 
        controllers_User_CustomerController_register10_invoker.call(CustomerController_9.register())
      }
  
    // @LINE:39
    case controllers_User_CustomerController_completeRegistration11_route(params) =>
      call { 
        controllers_User_CustomerController_completeRegistration11_invoker.call(CustomerController_9.completeRegistration())
      }
  
    // @LINE:40
    case controllers_User_CustomerController_verifyCustomer12_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_User_CustomerController_verifyCustomer12_invoker.call(CustomerController_9.verifyCustomer(token))
      }
  
    // @LINE:41
    case controllers_User_CustomerController_edit13_route(params) =>
      call { 
        controllers_User_CustomerController_edit13_invoker.call(CustomerController_9.edit())
      }
  
    // @LINE:42
    case controllers_User_CustomerController_orderHistory14_route(params) =>
      call { 
        controllers_User_CustomerController_orderHistory14_invoker.call(CustomerController_9.orderHistory())
      }
  
    // @LINE:43
    case controllers_User_CustomerController_paymentHistory15_route(params) =>
      call { 
        controllers_User_CustomerController_paymentHistory15_invoker.call(CustomerController_9.paymentHistory())
      }
  
    // @LINE:44
    case controllers_User_CustomerController_viewOrder16_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_User_CustomerController_viewOrder16_invoker.call(CustomerController_9.viewOrder(orderId))
      }
  
    // @LINE:45
    case controllers_User_CustomerController_viewPayment17_route(params) =>
      call(params.fromPath[String]("paymentId", None)) { (paymentId) =>
        controllers_User_CustomerController_viewPayment17_invoker.call(CustomerController_9.viewPayment(paymentId))
      }
  
    // @LINE:47
    case controllers_User_CustomerController_create18_route(params) =>
      call { 
        controllers_User_CustomerController_create18_invoker.call(CustomerController_9.create())
      }
  
    // @LINE:48
    case controllers_User_CustomerController_reverify19_route(params) =>
      call { 
        controllers_User_CustomerController_reverify19_invoker.call(CustomerController_9.reverify())
      }
  
    // @LINE:49
    case controllers_User_CustomerController_doCompleteRegistration20_route(params) =>
      call { 
        controllers_User_CustomerController_doCompleteRegistration20_invoker.call(CustomerController_9.doCompleteRegistration())
      }
  
    // @LINE:50
    case controllers_User_CustomerController_update21_route(params) =>
      call { 
        controllers_User_CustomerController_update21_invoker.call(CustomerController_9.update())
      }
  
    // @LINE:51
    case controllers_User_CustomerController_activeOrders22_route(params) =>
      call { 
        controllers_User_CustomerController_activeOrders22_invoker.call(CustomerController_9.activeOrders())
      }
  
    // @LINE:55
    case controllers_Order_ScheduleController_index23_route(params) =>
      call { 
        controllers_Order_ScheduleController_index23_invoker.call(ScheduleController_3.index())
      }
  
    // @LINE:56
    case controllers_Order_ScheduleController_createSchedule24_route(params) =>
      call { 
        controllers_Order_ScheduleController_createSchedule24_invoker.call(ScheduleController_3.createSchedule())
      }
  
    // @LINE:57
    case controllers_Order_ScheduleController_addOrder25_route(params) =>
      call { 
        controllers_Order_ScheduleController_addOrder25_invoker.call(ScheduleController_3.addOrder())
      }
  
    // @LINE:58
    case controllers_Order_ScheduleController_editScheduleName26_route(params) =>
      call { 
        controllers_Order_ScheduleController_editScheduleName26_invoker.call(ScheduleController_3.editScheduleName())
      }
  
    // @LINE:60
    case controllers_Order_ScheduleController_removeOrder27_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_Order_ScheduleController_removeOrder27_invoker.call(ScheduleController_3.removeOrder(orderId))
      }
  
    // @LINE:62
    case controllers_Order_ScheduleController_setScheduleState28_route(params) =>
      call { 
        controllers_Order_ScheduleController_setScheduleState28_invoker.call(ScheduleController_3.setScheduleState())
      }
  
    // @LINE:63
    case controllers_Order_ScheduleController_updateScheduleName29_route(params) =>
      call { 
        controllers_Order_ScheduleController_updateScheduleName29_invoker.call(ScheduleController_3.updateScheduleName())
      }
  
    // @LINE:64
    case controllers_Order_ScheduleController_doCreateSchedule30_route(params) =>
      call { 
        controllers_Order_ScheduleController_doCreateSchedule30_invoker.call(ScheduleController_3.doCreateSchedule())
      }
  
    // @LINE:65
    case controllers_Order_ScheduleController_doAddOrder31_route(params) =>
      call { 
        controllers_Order_ScheduleController_doAddOrder31_invoker.call(ScheduleController_3.doAddOrder())
      }
  
    // @LINE:66
    case controllers_Order_ScheduleController_clearSchedule32_route(params) =>
      call { 
        controllers_Order_ScheduleController_clearSchedule32_invoker.call(ScheduleController_3.clearSchedule())
      }
  
    // @LINE:72
    case controllers_Order_MenuController_index33_route(params) =>
      call { 
        controllers_Order_MenuController_index33_invoker.call(MenuController_1.index())
      }
  
    // @LINE:80
    case controllers_User_KitchenStaffController_index34_route(params) =>
      call { 
        controllers_User_KitchenStaffController_index34_invoker.call(KitchenStaffController_8.index())
      }
  
    // @LINE:82
    case controllers_User_KitchenStaffController_getKitchenDashUpdate35_route(params) =>
      call { 
        controllers_User_KitchenStaffController_getKitchenDashUpdate35_invoker.call(KitchenStaffController_8.getKitchenDashUpdate())
      }
  
    // @LINE:83
    case controllers_User_KitchenStaffController_viewOrder36_route(params) =>
      call { 
        controllers_User_KitchenStaffController_viewOrder36_invoker.call(KitchenStaffController_8.viewOrder())
      }
  
    // @LINE:84
    case controllers_User_KitchenStaffController_viewActiveOrders37_route(params) =>
      call { 
        controllers_User_KitchenStaffController_viewActiveOrders37_invoker.call(KitchenStaffController_8.viewActiveOrders())
      }
  
    // @LINE:85
    case controllers_User_KitchenStaffController_viewCompletedOrders38_route(params) =>
      call { 
        controllers_User_KitchenStaffController_viewCompletedOrders38_invoker.call(KitchenStaffController_8.viewCompletedOrders())
      }
  
    // @LINE:86
    case controllers_User_KitchenStaffController_viewQueuedOrders39_route(params) =>
      call { 
        controllers_User_KitchenStaffController_viewQueuedOrders39_invoker.call(KitchenStaffController_8.viewQueuedOrders())
      }
  
    // @LINE:87
    case controllers_User_KitchenStaffController_edit40_route(params) =>
      call { 
        controllers_User_KitchenStaffController_edit40_invoker.call(KitchenStaffController_8.edit())
      }
  
    // @LINE:89
    case controllers_User_KitchenStaffController_doEdit41_route(params) =>
      call { 
        controllers_User_KitchenStaffController_doEdit41_invoker.call(KitchenStaffController_8.doEdit())
      }
  
    // @LINE:97
    case controllers_User_DeliveryStaffController_index42_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_index42_invoker.call(DeliveryStaffController_0.index())
      }
  
    // @LINE:99
    case controllers_User_DeliveryStaffController_getDeliveryDashUpdate43_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_getDeliveryDashUpdate43_invoker.call(DeliveryStaffController_0.getDeliveryDashUpdate())
      }
  
    // @LINE:100
    case controllers_User_DeliveryStaffController_viewOrder44_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_viewOrder44_invoker.call(DeliveryStaffController_0.viewOrder())
      }
  
    // @LINE:101
    case controllers_User_DeliveryStaffController_deliverOrder45_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_deliverOrder45_invoker.call(DeliveryStaffController_0.deliverOrder())
      }
  
    // @LINE:102
    case controllers_User_DeliveryStaffController_checkoutOrder46_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_checkoutOrder46_invoker.call(DeliveryStaffController_0.checkoutOrder())
      }
  
    // @LINE:103
    case controllers_User_DeliveryStaffController_viewCompletedDeliveries47_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_viewCompletedDeliveries47_invoker.call(DeliveryStaffController_0.viewCompletedDeliveries())
      }
  
    // @LINE:104
    case controllers_User_DeliveryStaffController_viewActiveDeliveries48_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_viewActiveDeliveries48_invoker.call(DeliveryStaffController_0.viewActiveDeliveries())
      }
  
    // @LINE:105
    case controllers_User_DeliveryStaffController_viewWaitingDeliveries49_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_viewWaitingDeliveries49_invoker.call(DeliveryStaffController_0.viewWaitingDeliveries())
      }
  
    // @LINE:106
    case controllers_User_DeliveryStaffController_edit50_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_edit50_invoker.call(DeliveryStaffController_0.edit())
      }
  
    // @LINE:108
    case controllers_User_DeliveryStaffController_doEdit51_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_doEdit51_invoker.call(DeliveryStaffController_0.doEdit())
      }
  
    // @LINE:117
    case controllers_User_AdminController_index52_route(params) =>
      call { 
        controllers_User_AdminController_index52_invoker.call(AdminController_12.index())
      }
  
    // @LINE:119
    case controllers_User_AdminController_getAdminDashUpdate53_route(params) =>
      call { 
        controllers_User_AdminController_getAdminDashUpdate53_invoker.call(AdminController_12.getAdminDashUpdate())
      }
  
    // @LINE:120
    case controllers_User_AdminController_manageMeals54_route(params) =>
      call { 
        controllers_User_AdminController_manageMeals54_invoker.call(AdminController_12.manageMeals())
      }
  
    // @LINE:121
    case controllers_User_AdminController_manageUsers55_route(params) =>
      call { 
        controllers_User_AdminController_manageUsers55_invoker.call(AdminController_12.manageUsers())
      }
  
    // @LINE:122
    case controllers_User_AdminController_manageDiscounts56_route(params) =>
      call { 
        controllers_User_AdminController_manageDiscounts56_invoker.call(AdminController_12.manageDiscounts())
      }
  
    // @LINE:123
    case controllers_User_AdminController_edit57_route(params) =>
      call { 
        controllers_User_AdminController_edit57_invoker.call(AdminController_12.edit())
      }
  
    // @LINE:125
    case controllers_User_AdminController_doEdit58_route(params) =>
      call { 
        controllers_User_AdminController_doEdit58_invoker.call(AdminController_12.doEdit())
      }
  
    // @LINE:133
    case controllers_Finance_UserFinance_addFunds59_route(params) =>
      call { 
        controllers_Finance_UserFinance_addFunds59_invoker.call(UserFinance_2.addFunds())
      }
  
    // @LINE:135
    case controllers_Finance_UserFinance_doAddFunds60_route(params) =>
      call { 
        controllers_Finance_UserFinance_doAddFunds60_invoker.call(UserFinance_2.doAddFunds())
      }
  
    // @LINE:144
    case controllers_Assets_versioned61_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned61_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:146
    case controllers_Order_OrderController_getMenu62_route(params) =>
      call { 
        controllers_Order_OrderController_getMenu62_invoker.call(OrderController_5.getMenu())
      }
  
    // @LINE:148
    case controllers_Order_OrderController_switchMenu63_route(params) =>
      call(params.fromPath[Integer]("menutype", None)) { (menutype) =>
        controllers_Order_OrderController_switchMenu63_invoker.call(OrderController_5.switchMenu(menutype))
      }
  
    // @LINE:150
    case controllers_Order_AccountController_getSignUp64_route(params) =>
      call { 
        controllers_Order_AccountController_getSignUp64_invoker.call(AccountController_7.getSignUp)
      }
  
    // @LINE:152
    case controllers_Order_OrderController_addMealToOrder65_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_Order_OrderController_addMealToOrder65_invoker.call(OrderController_5.addMealToOrder(mealId))
      }
  
    // @LINE:154
    case controllers_Order_OrderController_getAddMealToMenu66_route(params) =>
      call { 
        controllers_Order_OrderController_getAddMealToMenu66_invoker.call(OrderController_5.getAddMealToMenu)
      }
  
    // @LINE:156
    case controllers_Order_OrderController_addMeal67_route(params) =>
      call { 
        controllers_Order_OrderController_addMeal67_invoker.call(OrderController_5.addMeal)
      }
  
    // @LINE:158
    case controllers_Order_AccountController_doLogin68_route(params) =>
      call { 
        controllers_Order_AccountController_doLogin68_invoker.call(AccountController_7.doLogin())
      }
  
    // @LINE:160
    case controllers_Order_AccountController_doSignOut69_route(params) =>
      call { 
        controllers_Order_AccountController_doSignOut69_invoker.call(AccountController_7.doSignOut())
      }
  
    // @LINE:162
    case controllers_Order_OrderController_getCart70_route(params) =>
      call { 
        controllers_Order_OrderController_getCart70_invoker.call(OrderController_5.getCart())
      }
  
    // @LINE:164
    case controllers_Order_OrderController_removeMealFromOrder71_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_Order_OrderController_removeMealFromOrder71_invoker.call(OrderController_5.removeMealFromOrder(mealId))
      }
  
    // @LINE:166
    case controllers_Order_OrderController_getSubmitPage72_route(params) =>
      call { 
        controllers_Order_OrderController_getSubmitPage72_invoker.call(OrderController_5.getSubmitPage())
      }
  
    // @LINE:168
    case controllers_Order_OrderController_submitCart73_route(params) =>
      call { 
        controllers_Order_OrderController_submitCart73_invoker.call(OrderController_5.submitCart())
      }
  
    // @LINE:170
    case controllers_Order_OrderController_getHistoryPage74_route(params) =>
      call { 
        controllers_Order_OrderController_getHistoryPage74_invoker.call(OrderController_5.getHistoryPage())
      }
  
    // @LINE:172
    case controllers_Order_OrderController_getViewOrder75_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_OrderController_getViewOrder75_invoker.call(OrderController_5.getViewOrder(orderId))
      }
  
    // @LINE:176
    case controllers_Order_KitchenController_home76_route(params) =>
      call { 
        controllers_Order_KitchenController_home76_invoker.call(KitchenController_10.home())
      }
  
    // @LINE:180
    case controllers_Order_KitchenController_getIngredientPage77_route(params) =>
      call { 
        controllers_Order_KitchenController_getIngredientPage77_invoker.call(KitchenController_10.getIngredientPage())
      }
  
    // @LINE:182
    case controllers_Order_KitchenController_getIngredientOrderPage78_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_Order_KitchenController_getIngredientOrderPage78_invoker.call(KitchenController_10.getIngredientOrderPage(id))
      }
  
    // @LINE:184
    case controllers_Order_KitchenController_editIngredient79_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_Order_KitchenController_editIngredient79_invoker.call(KitchenController_10.editIngredient(id))
      }
  
    // @LINE:186
    case controllers_Order_KitchenController_getNewIngredientPage80_route(params) =>
      call { 
        controllers_Order_KitchenController_getNewIngredientPage80_invoker.call(KitchenController_10.getNewIngredientPage())
      }
  
    // @LINE:188
    case controllers_Order_KitchenController_addIngredient81_route(params) =>
      call { 
        controllers_Order_KitchenController_addIngredient81_invoker.call(KitchenController_10.addIngredient())
      }
  
    // @LINE:192
    case controllers_Order_KitchenController_getOrderPage82_route(params) =>
      call { 
        controllers_Order_KitchenController_getOrderPage82_invoker.call(KitchenController_10.getOrderPage())
      }
  
    // @LINE:194
    case controllers_Order_KitchenController_getPendingOrderPage83_route(params) =>
      call { 
        controllers_Order_KitchenController_getPendingOrderPage83_invoker.call(KitchenController_10.getPendingOrderPage())
      }
  
    // @LINE:196
    case controllers_Order_KitchenController_getProcessingOrderPage84_route(params) =>
      call { 
        controllers_Order_KitchenController_getProcessingOrderPage84_invoker.call(KitchenController_10.getProcessingOrderPage())
      }
  
    // @LINE:198
    case controllers_Order_KitchenController_getMealOrderPage85_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_KitchenController_getMealOrderPage85_invoker.call(KitchenController_10.getMealOrderPage(orderId))
      }
  
    // @LINE:200
    case controllers_Order_KitchenController_updateOrderStatus86_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_KitchenController_updateOrderStatus86_invoker.call(KitchenController_10.updateOrderStatus(orderId))
      }
  
    // @LINE:202
    case controllers_Application_HomeController_invalidRoute87_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_HomeController_invalidRoute87_invoker.call(HomeController_6.invalidRoute(path))
      }
  
    // @LINE:207
    case controllers_Order_ScheduleController_scheduleJSRoutes88_route(params) =>
      call { 
        controllers_Order_ScheduleController_scheduleJSRoutes88_invoker.call(ScheduleController_3.scheduleJSRoutes())
      }
  
    // @LINE:208
    case controllers_User_CustomerController_customerJSRoutes89_route(params) =>
      call { 
        controllers_User_CustomerController_customerJSRoutes89_invoker.call(CustomerController_9.customerJSRoutes())
      }
  
    // @LINE:209
    case controllers_User_AdminController_adminJSRoutes90_route(params) =>
      call { 
        controllers_User_AdminController_adminJSRoutes90_invoker.call(AdminController_12.adminJSRoutes())
      }
  
    // @LINE:210
    case controllers_User_DeliveryStaffController_deliveryJSRoutes91_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_deliveryJSRoutes91_invoker.call(DeliveryStaffController_0.deliveryJSRoutes())
      }
  
    // @LINE:211
    case controllers_User_KitchenStaffController_kitchenJSRoutes92_route(params) =>
      call { 
        controllers_User_KitchenStaffController_kitchenJSRoutes92_invoker.call(KitchenStaffController_8.kitchenJSRoutes())
      }
  
    // @LINE:215
    case controllers_Finance_UserFinance_addFunds93_route(params) =>
      call { 
        controllers_Finance_UserFinance_addFunds93_invoker.call(UserFinance_2.addFunds())
      }
  
    // @LINE:216
    case controllers_Finance_UserFinance_doAddFunds94_route(params) =>
      call { 
        controllers_Finance_UserFinance_doAddFunds94_invoker.call(UserFinance_2.doAddFunds())
      }
  
    // @LINE:224
    case controllers_Assets_versioned95_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned95_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:225
    case controllers_Assets_versioned96_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned96_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:226
    case controllers_Assets_versioned97_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned97_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:227
    case controllers_Assets_versioned98_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned98_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:228
    case controllers_Assets_versioned99_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned99_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:229
    case controllers_Assets_versioned100_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned100_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:230
    case controllers_Assets_versioned101_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned101_invoker.call(Assets_11.versioned(path, file))
      }
  }
}
