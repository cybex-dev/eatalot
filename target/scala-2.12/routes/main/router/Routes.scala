
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Mon Oct 23 01:02:05 SAST 2017
=======
// @SOURCE:/home/dylan/Desktop/eatalot/eatalot/conf/routes
// @DATE:Sun Oct 22 14:40:06 SAST 2017
>>>>>>> master

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
  // @LINE:18
  UserController_3: controllers.User.UserController,
  // @LINE:28
  DeliveryStaffController_0: controllers.User.DeliveryStaffController,
  // @LINE:35
  CustomerController_7: controllers.User.CustomerController,
  // @LINE:56
  ScheduleController_2: controllers.Order.ScheduleController,
  // @LINE:74
  MenuController_1: controllers.Order.MenuController,
  // @LINE:82
  KitchenStaffController_6: controllers.User.KitchenStaffController,
  // @LINE:119
  AdminController_11: controllers.User.AdminController,
  // @LINE:131
<<<<<<< HEAD
  UserFinanceController_9: controllers.Finance.UserFinanceController,
  // @LINE:168
  OrderController_4: controllers.Order.OrderController,
  // @LINE:172
  AccountController_6: controllers.Order.AccountController,
  // @LINE:198
  KitchenController_10: controllers.Order.KitchenController,
  // @LINE:249
  Assets_11: controllers.Assets,
=======
  UserFinanceController_8: controllers.Finance.UserFinanceController,
  // @LINE:166
  OrderController_4: controllers.Order.OrderController,
  // @LINE:192
  KitchenController_9: controllers.Order.KitchenController,
  // @LINE:247
  Assets_10: controllers.Assets,
>>>>>>> master
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_5: controllers.Application.HomeController,
    // @LINE:18
    UserController_3: controllers.User.UserController,
    // @LINE:28
    DeliveryStaffController_0: controllers.User.DeliveryStaffController,
    // @LINE:35
    CustomerController_7: controllers.User.CustomerController,
    // @LINE:56
    ScheduleController_2: controllers.Order.ScheduleController,
    // @LINE:74
    MenuController_1: controllers.Order.MenuController,
    // @LINE:82
    KitchenStaffController_6: controllers.User.KitchenStaffController,
    // @LINE:119
    AdminController_11: controllers.User.AdminController,
    // @LINE:131
<<<<<<< HEAD
    UserFinanceController_9: controllers.Finance.UserFinanceController,
    // @LINE:168
    OrderController_4: controllers.Order.OrderController,
    // @LINE:172
    AccountController_6: controllers.Order.AccountController,
    // @LINE:198
    KitchenController_10: controllers.Order.KitchenController,
    // @LINE:249
    Assets_11: controllers.Assets
  ) = this(errorHandler, HomeController_5, UserController_3, DeliveryStaffController_0, CustomerController_8, ScheduleController_2, MenuController_1, KitchenStaffController_7, AdminController_12, UserFinanceController_9, OrderController_4, AccountController_6, KitchenController_10, Assets_11, "/")
=======
    UserFinanceController_8: controllers.Finance.UserFinanceController,
    // @LINE:166
    OrderController_4: controllers.Order.OrderController,
    // @LINE:192
    KitchenController_9: controllers.Order.KitchenController,
    // @LINE:247
    Assets_10: controllers.Assets
  ) = this(errorHandler, HomeController_5, UserController_3, DeliveryStaffController_0, CustomerController_7, ScheduleController_2, MenuController_1, KitchenStaffController_6, AdminController_11, UserFinanceController_8, OrderController_4, KitchenController_9, Assets_10, "/")
>>>>>>> master

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_5, UserController_3, DeliveryStaffController_0, CustomerController_7, ScheduleController_2, MenuController_1, KitchenStaffController_6, AdminController_11, UserFinanceController_8, OrderController_4, KitchenController_9, Assets_10, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ContactUs""", """controllers.Application.HomeController.contactUs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Forbidden""", """controllers.Application.HomeController.forbiddenAccess()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Unknown""", """controllers.Application.HomeController.unknown()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Meals/Add""", """controllers.User.AdminController.addMeal()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Meals/Edit/""" + "$" + """mealId<[^/]+>""", """controllers.User.AdminController.editMeal(mealId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Users""", """controllers.User.AdminController.manageUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Users/Customer/New""", """controllers.User.AdminController.addCustomer()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Users/Staff/New""", """controllers.User.AdminController.addStaff()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Users/Customer/Edit""" + "$" + """userId<[^/]+>""", """controllers.User.AdminController.editCustomer(userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Users/Staff/Edit""" + "$" + """userId<[^/]+>""", """controllers.User.AdminController.editStaff(userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Discounts""", """controllers.User.AdminController.manageDiscounts()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Discounts/Add/""", """controllers.Finance.UserFinanceController.addDiscount()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Discounts/Edit/""" + "$" + """discountId<[^/]+>""", """controllers.Finance.UserFinanceController.editDiscount(discountId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Edit""", """controllers.User.AdminController.edit()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Edit""", """controllers.User.AdminController.doEdit()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Discounts/Edit""", """controllers.Finance.UserFinanceController.updateDiscount()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Meals/Edit""", """controllers.User.AdminController.updateMeal()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Users/Customer/Edit""", """controllers.User.AdminController.updateCustomer()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Users/Staff/Edit""", """controllers.User.AdminController.updateStaff()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Discounts/Edit""", """controllers.Finance.UserFinanceController.updateDiscount()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Meals/Remove""", """controllers.User.AdminController.removeMeal()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Users/Customer/Remove""", """controllers.User.AdminController.removeCustomer()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Users/Staff/Remove""", """controllers.User.AdminController.removeStaff()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/Manage/Discounts/Remove/""" + "$" + """discountId<[^/]+>""", """controllers.Finance.UserFinanceController.removeDiscount(discountId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/AddFunds""", """controllers.Finance.UserFinanceController.addFunds()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """User/AddFunds""", """controllers.Finance.UserFinanceController.doAddFunds()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu""", """controllers.Order.OrderController.getMenu()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/""" + "$" + """menutype<[^/]+>""", """controllers.Order.OrderController.switchMenu(menutype:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addmealtoorder""", """controllers.Order.OrderController.addMealToOrder(mealId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addmeal""", """controllers.Order.OrderController.getAddMealToMenu"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postmeal""", """controllers.Order.OrderController.addMeal"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.Order.OrderController.getCart()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/removemeal""", """controllers.Order.OrderController.removeMealFromOrder(mealId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/submit""", """controllers.Order.OrderController.getSubmitPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/submitcart""", """controllers.Order.OrderController.submitCart()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """activeorders/""" + "$" + """orderId<[^/]+>""", """controllers.Order.OrderController.getViewOrder(orderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """activeorders""", """controllers.Order.OrderController.getActiveOrders()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderaction""", """controllers.Order.OrderController.activeOrderAction(orderId:String)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen/customerorders/mealorder/cancel""", """controllers.Order.KitchenController.getCancelOrderPage(orderId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kitchen/customerorders/mealorder/docancel""", """controllers.Order.KitchenController.doOrderCancellation(orderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/scheduleJSRoutes""", """controllers.Order.ScheduleController.scheduleJSRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/customerJSRoutes""", """controllers.User.CustomerController.customerJSRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/adminJSRoutes""", """controllers.User.AdminController.adminJSRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/deliveryJSRoutes""", """controllers.User.DeliveryStaffController.deliveryJSRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/kitchenJSRoutes""", """controllers.User.KitchenStaffController.kitchenJSRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascripts/financeJSRoutes""", """controllers.Finance.UserFinanceController.financeJSRoutes()"""),
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
    HomeController_5.index(),
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
  private[this] lazy val controllers_Application_HomeController_contactUs1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ContactUs")))
  )
  private[this] lazy val controllers_Application_HomeController_contactUs1_invoker = createInvoker(
    HomeController_5.contactUs(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application.HomeController",
      "contactUs",
      Nil,
      "GET",
      this.prefix + """ContactUs""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_HomeController_forbiddenAccess2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Forbidden")))
  )
  private[this] lazy val controllers_Application_HomeController_forbiddenAccess2_invoker = createInvoker(
    HomeController_5.forbiddenAccess(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application.HomeController",
      "forbiddenAccess",
      Nil,
      "GET",
      this.prefix + """Forbidden""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_HomeController_unknown3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Unknown")))
  )
  private[this] lazy val controllers_Application_HomeController_unknown3_invoker = createInvoker(
    HomeController_5.unknown(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application.HomeController",
      "unknown",
      Nil,
      "GET",
      this.prefix + """Unknown""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_User_UserController_login4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Login")))
  )
  private[this] lazy val controllers_User_UserController_login4_invoker = createInvoker(
    UserController_3.login(),
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

  // @LINE:19
  private[this] lazy val controllers_User_UserController_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Logout")))
  )
  private[this] lazy val controllers_User_UserController_logout5_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_User_UserController_doLogin6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Login")))
  )
  private[this] lazy val controllers_User_UserController_doLogin6_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_User_DeliveryStaffController_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Staff")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_index7_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_User_CustomerController_redirectHome8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User")))
  )
  private[this] lazy val controllers_User_CustomerController_redirectHome8_invoker = createInvoker(
    CustomerController_7.redirectHome(),
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

  // @LINE:36
  private[this] lazy val controllers_User_CustomerController_index9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Dashboard")))
  )
  private[this] lazy val controllers_User_CustomerController_index9_invoker = createInvoker(
    CustomerController_7.index(),
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

  // @LINE:38
  private[this] lazy val controllers_User_CustomerController_getCustomerDashUpdate10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Dashboard/Update")))
  )
  private[this] lazy val controllers_User_CustomerController_getCustomerDashUpdate10_invoker = createInvoker(
    CustomerController_7.getCustomerDashUpdate(),
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

  // @LINE:39
  private[this] lazy val controllers_User_CustomerController_register11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_CustomerController_register11_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_User_CustomerController_completeRegistration12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register/Completing")))
  )
  private[this] lazy val controllers_User_CustomerController_completeRegistration12_invoker = createInvoker(
    CustomerController_7.completeRegistration(),
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

  // @LINE:41
  private[this] lazy val controllers_User_CustomerController_verifyCustomer13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Verify/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_CustomerController_verifyCustomer13_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_User_CustomerController_edit14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Profile")))
  )
  private[this] lazy val controllers_User_CustomerController_edit14_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_User_CustomerController_orderHistory15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Orders")))
  )
  private[this] lazy val controllers_User_CustomerController_orderHistory15_invoker = createInvoker(
    CustomerController_7.orderHistory(),
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

  // @LINE:44
  private[this] lazy val controllers_User_CustomerController_paymentHistory16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Purchases")))
  )
  private[this] lazy val controllers_User_CustomerController_paymentHistory16_invoker = createInvoker(
    CustomerController_7.paymentHistory(),
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

  // @LINE:45
  private[this] lazy val controllers_User_CustomerController_viewOrder17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Order/"), DynamicPart("orderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_CustomerController_viewOrder17_invoker = createInvoker(
    CustomerController_7.viewOrder(fakeValue[String]),
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

  // @LINE:46
  private[this] lazy val controllers_User_CustomerController_viewPayment18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/History/Payment/"), DynamicPart("paymentId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_CustomerController_viewPayment18_invoker = createInvoker(
    CustomerController_7.viewPayment(fakeValue[String]),
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

  // @LINE:48
  private[this] lazy val controllers_User_CustomerController_create19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_CustomerController_create19_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_User_CustomerController_reverify20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register/Reverify")))
  )
  private[this] lazy val controllers_User_CustomerController_reverify20_invoker = createInvoker(
    CustomerController_7.reverify(),
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

  // @LINE:50
  private[this] lazy val controllers_User_CustomerController_doCompleteRegistration21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register/Completing")))
  )
  private[this] lazy val controllers_User_CustomerController_doCompleteRegistration21_invoker = createInvoker(
    CustomerController_7.doCompleteRegistration(),
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

  // @LINE:51
  private[this] lazy val controllers_User_CustomerController_update22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Profile")))
  )
  private[this] lazy val controllers_User_CustomerController_update22_invoker = createInvoker(
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

  // @LINE:52
  private[this] lazy val controllers_User_CustomerController_activeOrders23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/ActiveOrders")))
  )
  private[this] lazy val controllers_User_CustomerController_activeOrders23_invoker = createInvoker(
    CustomerController_7.activeOrders(),
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

  // @LINE:56
  private[this] lazy val controllers_Order_ScheduleController_index24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule")))
  )
  private[this] lazy val controllers_Order_ScheduleController_index24_invoker = createInvoker(
    ScheduleController_2.index(),
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

  // @LINE:57
  private[this] lazy val controllers_Order_ScheduleController_createSchedule25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/New")))
  )
  private[this] lazy val controllers_Order_ScheduleController_createSchedule25_invoker = createInvoker(
    ScheduleController_2.createSchedule(),
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

  // @LINE:58
  private[this] lazy val controllers_Order_ScheduleController_addOrder26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/AddOrder")))
  )
  private[this] lazy val controllers_Order_ScheduleController_addOrder26_invoker = createInvoker(
    ScheduleController_2.addOrder(),
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

  // @LINE:59
  private[this] lazy val controllers_Order_ScheduleController_editScheduleName27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Edit")))
  )
  private[this] lazy val controllers_Order_ScheduleController_editScheduleName27_invoker = createInvoker(
    ScheduleController_2.editScheduleName(),
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

  // @LINE:62
  private[this] lazy val controllers_Order_ScheduleController_removeOrder28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Delete/"), DynamicPart("orderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Order_ScheduleController_removeOrder28_invoker = createInvoker(
    ScheduleController_2.removeOrder(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "removeOrder",
      Seq(classOf[String]),
      "POST",
      this.prefix + """User/Schedule/Delete/""" + "$" + """orderId<[^/]+>""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Order_ScheduleController_setScheduleState29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/ChangeState")))
  )
  private[this] lazy val controllers_Order_ScheduleController_setScheduleState29_invoker = createInvoker(
    ScheduleController_2.setScheduleState(),
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

  // @LINE:65
  private[this] lazy val controllers_Order_ScheduleController_updateScheduleName30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Edit")))
  )
  private[this] lazy val controllers_Order_ScheduleController_updateScheduleName30_invoker = createInvoker(
    ScheduleController_2.updateScheduleName(),
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

  // @LINE:66
  private[this] lazy val controllers_Order_ScheduleController_doCreateSchedule31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/New")))
  )
  private[this] lazy val controllers_Order_ScheduleController_doCreateSchedule31_invoker = createInvoker(
    ScheduleController_2.doCreateSchedule(),
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

  // @LINE:67
  private[this] lazy val controllers_Order_ScheduleController_doAddOrder32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/AddOrder")))
  )
  private[this] lazy val controllers_Order_ScheduleController_doAddOrder32_invoker = createInvoker(
    ScheduleController_2.doAddOrder(),
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

  // @LINE:68
  private[this] lazy val controllers_Order_ScheduleController_clearSchedule33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Schedule/Clear")))
  )
  private[this] lazy val controllers_Order_ScheduleController_clearSchedule33_invoker = createInvoker(
    ScheduleController_2.clearSchedule(),
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

  // @LINE:74
  private[this] lazy val controllers_Order_MenuController_index34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Menu")))
  )
  private[this] lazy val controllers_Order_MenuController_index34_invoker = createInvoker(
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

  // @LINE:82
  private[this] lazy val controllers_User_KitchenStaffController_index35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Dashboard")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_index35_invoker = createInvoker(
    KitchenStaffController_6.index(),
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

  // @LINE:84
  private[this] lazy val controllers_User_KitchenStaffController_getKitchenDashUpdate36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Dashboard/Update")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_getKitchenDashUpdate36_invoker = createInvoker(
    KitchenStaffController_6.getKitchenDashUpdate(),
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

  // @LINE:85
  private[this] lazy val controllers_User_KitchenStaffController_viewOrder37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Order")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_viewOrder37_invoker = createInvoker(
    KitchenStaffController_6.viewOrder(),
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

  // @LINE:86
  private[this] lazy val controllers_User_KitchenStaffController_viewActiveOrders38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Orders/Active")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_viewActiveOrders38_invoker = createInvoker(
    KitchenStaffController_6.viewActiveOrders(),
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

  // @LINE:87
  private[this] lazy val controllers_User_KitchenStaffController_viewCompletedOrders39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Orders/Completed")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_viewCompletedOrders39_invoker = createInvoker(
    KitchenStaffController_6.viewCompletedOrders(),
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

  // @LINE:88
  private[this] lazy val controllers_User_KitchenStaffController_viewQueuedOrders40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/Orders/Queued")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_viewQueuedOrders40_invoker = createInvoker(
    KitchenStaffController_6.viewQueuedOrders(),
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

  // @LINE:89
  private[this] lazy val controllers_User_KitchenStaffController_edit41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/User/Edit")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_edit41_invoker = createInvoker(
    KitchenStaffController_6.edit(),
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

  // @LINE:91
  private[this] lazy val controllers_User_KitchenStaffController_doEdit42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Kitchen/User/Edit")))
  )
  private[this] lazy val controllers_User_KitchenStaffController_doEdit42_invoker = createInvoker(
    KitchenStaffController_6.doEdit(),
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

  // @LINE:99
  private[this] lazy val controllers_User_DeliveryStaffController_index43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Dashboard")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_index43_invoker = createInvoker(
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

  // @LINE:101
  private[this] lazy val controllers_User_DeliveryStaffController_getDeliveryDashUpdate44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Dashboard/Update")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_getDeliveryDashUpdate44_invoker = createInvoker(
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

  // @LINE:102
  private[this] lazy val controllers_User_DeliveryStaffController_viewOrder45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Order")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_viewOrder45_invoker = createInvoker(
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

  // @LINE:103
  private[this] lazy val controllers_User_DeliveryStaffController_deliverOrder46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Order/Deliver")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_deliverOrder46_invoker = createInvoker(
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

  // @LINE:104
  private[this] lazy val controllers_User_DeliveryStaffController_checkoutOrder47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Order/Checkout")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_checkoutOrder47_invoker = createInvoker(
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

  // @LINE:105
  private[this] lazy val controllers_User_DeliveryStaffController_viewCompletedDeliveries48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Orders/Completed")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_viewCompletedDeliveries48_invoker = createInvoker(
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

  // @LINE:106
  private[this] lazy val controllers_User_DeliveryStaffController_viewActiveDeliveries49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Orders/Active")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_viewActiveDeliveries49_invoker = createInvoker(
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

  // @LINE:107
  private[this] lazy val controllers_User_DeliveryStaffController_viewWaitingDeliveries50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/Orders/Waiting")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_viewWaitingDeliveries50_invoker = createInvoker(
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

  // @LINE:108
  private[this] lazy val controllers_User_DeliveryStaffController_edit51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/User/Edit")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_edit51_invoker = createInvoker(
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

  // @LINE:110
  private[this] lazy val controllers_User_DeliveryStaffController_doEdit52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/User/Edit")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_doEdit52_invoker = createInvoker(
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

  // @LINE:119
  private[this] lazy val controllers_User_AdminController_index53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Dashboard")))
  )
  private[this] lazy val controllers_User_AdminController_index53_invoker = createInvoker(
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

  // @LINE:121
  private[this] lazy val controllers_User_AdminController_getAdminDashUpdate54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Dashboard/Update")))
  )
  private[this] lazy val controllers_User_AdminController_getAdminDashUpdate54_invoker = createInvoker(
    AdminController_11.getAdminDashUpdate(),
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

  // @LINE:122
  private[this] lazy val controllers_User_AdminController_manageMeals55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Meals")))
  )
  private[this] lazy val controllers_User_AdminController_manageMeals55_invoker = createInvoker(
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

  // @LINE:123
  private[this] lazy val controllers_User_AdminController_addMeal56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Meals/Add")))
  )
  private[this] lazy val controllers_User_AdminController_addMeal56_invoker = createInvoker(
    AdminController_11.addMeal(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "addMeal",
      Nil,
      "GET",
      this.prefix + """Admin/Manage/Meals/Add""",
      """""",
      Seq()
    )
  )

  // @LINE:124
  private[this] lazy val controllers_User_AdminController_editMeal57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Meals/Edit/"), DynamicPart("mealId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_AdminController_editMeal57_invoker = createInvoker(
    AdminController_11.editMeal(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "editMeal",
      Seq(classOf[String]),
      "GET",
      this.prefix + """Admin/Manage/Meals/Edit/""" + "$" + """mealId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:125
  private[this] lazy val controllers_User_AdminController_manageUsers58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Users")))
  )
  private[this] lazy val controllers_User_AdminController_manageUsers58_invoker = createInvoker(
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

  // @LINE:126
  private[this] lazy val controllers_User_AdminController_addCustomer59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Users/Customer/New")))
  )
  private[this] lazy val controllers_User_AdminController_addCustomer59_invoker = createInvoker(
    AdminController_11.addCustomer(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "addCustomer",
      Nil,
      "GET",
      this.prefix + """Admin/Manage/Users/Customer/New""",
      """""",
      Seq()
    )
  )

  // @LINE:127
  private[this] lazy val controllers_User_AdminController_addStaff60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Users/Staff/New")))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_User_AdminController_addStaff60_invoker = createInvoker(
    AdminController_12.addStaff(),
=======
  private[this] lazy val controllers_User_AdminController_addCustomer60_invoker = createInvoker(
    AdminController_11.addCustomer(),
>>>>>>> master
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "addStaff",
      Nil,
      "GET",
      this.prefix + """Admin/Manage/Users/Staff/New""",
      """""",
      Seq()
    )
  )

  // @LINE:128
  private[this] lazy val controllers_User_AdminController_editCustomer61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Users/Customer/Edit"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_AdminController_editCustomer61_invoker = createInvoker(
    AdminController_11.editCustomer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "editCustomer",
      Seq(classOf[String]),
      "GET",
      this.prefix + """Admin/Manage/Users/Customer/Edit""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:129
  private[this] lazy val controllers_User_AdminController_editStaff62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Users/Staff/Edit"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_AdminController_editStaff62_invoker = createInvoker(
    AdminController_11.editStaff(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "editStaff",
      Seq(classOf[String]),
      "GET",
      this.prefix + """Admin/Manage/Users/Staff/Edit""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:130
  private[this] lazy val controllers_User_AdminController_manageDiscounts63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Discounts")))
  )
  private[this] lazy val controllers_User_AdminController_manageDiscounts63_invoker = createInvoker(
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

  // @LINE:131
  private[this] lazy val controllers_Finance_UserFinanceController_addDiscount64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Discounts/Add/")))
  )
  private[this] lazy val controllers_Finance_UserFinanceController_addDiscount64_invoker = createInvoker(
    UserFinanceController_8.addDiscount(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Finance.UserFinanceController",
      "addDiscount",
      Nil,
      "GET",
      this.prefix + """Admin/Manage/Discounts/Add/""",
      """""",
      Seq()
    )
  )

  // @LINE:132
  private[this] lazy val controllers_Finance_UserFinanceController_editDiscount65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Discounts/Edit/"), DynamicPart("discountId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Finance_UserFinanceController_editDiscount65_invoker = createInvoker(
    UserFinanceController_8.editDiscount(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Finance.UserFinanceController",
      "editDiscount",
      Seq(classOf[String]),
      "GET",
      this.prefix + """Admin/Manage/Discounts/Edit/""" + "$" + """discountId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:133
  private[this] lazy val controllers_User_AdminController_edit66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Edit")))
  )
  private[this] lazy val controllers_User_AdminController_edit66_invoker = createInvoker(
    AdminController_11.edit(),
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

  // @LINE:135
  private[this] lazy val controllers_User_AdminController_doEdit67_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Edit")))
  )
  private[this] lazy val controllers_User_AdminController_doEdit67_invoker = createInvoker(
    AdminController_11.doEdit(),
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

  // @LINE:136
  private[this] lazy val controllers_Finance_UserFinanceController_updateDiscount68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Discounts/Edit")))
  )
  private[this] lazy val controllers_Finance_UserFinanceController_updateDiscount68_invoker = createInvoker(
    UserFinanceController_8.updateDiscount(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Finance.UserFinanceController",
      "updateDiscount",
      Nil,
      "POST",
      this.prefix + """Admin/Manage/Discounts/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:137
  private[this] lazy val controllers_User_AdminController_updateMeal69_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Meals/Edit")))
  )
  private[this] lazy val controllers_User_AdminController_updateMeal69_invoker = createInvoker(
    AdminController_11.updateMeal(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "updateMeal",
      Nil,
      "POST",
      this.prefix + """Admin/Manage/Meals/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:138
  private[this] lazy val controllers_User_AdminController_updateCustomer70_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Users/Customer/Edit")))
  )
  private[this] lazy val controllers_User_AdminController_updateCustomer70_invoker = createInvoker(
    AdminController_11.updateCustomer(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "updateCustomer",
      Nil,
      "POST",
      this.prefix + """Admin/Manage/Users/Customer/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:139
  private[this] lazy val controllers_User_AdminController_updateStaff71_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Users/Staff/Edit")))
  )
  private[this] lazy val controllers_User_AdminController_updateStaff71_invoker = createInvoker(
    AdminController_11.updateStaff(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "updateStaff",
      Nil,
      "POST",
      this.prefix + """Admin/Manage/Users/Staff/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:140
  private[this] lazy val controllers_Finance_UserFinanceController_updateDiscount72_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Discounts/Edit")))
  )
  private[this] lazy val controllers_Finance_UserFinanceController_updateDiscount72_invoker = createInvoker(
    UserFinanceController_8.updateDiscount(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Finance.UserFinanceController",
      "updateDiscount",
      Nil,
      "POST",
      this.prefix + """Admin/Manage/Discounts/Edit""",
      """""",
      Seq()
    )
  )

  // @LINE:142
  private[this] lazy val controllers_User_AdminController_removeMeal73_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Meals/Remove")))
  )
  private[this] lazy val controllers_User_AdminController_removeMeal73_invoker = createInvoker(
<<<<<<< HEAD
    AdminController_12.removeMeal(),
=======
    AdminController_11.removeMeal(fakeValue[String]),
>>>>>>> master
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "removeMeal",
      Nil,
      "POST",
      this.prefix + """Admin/Manage/Meals/Remove""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:144
  private[this] lazy val controllers_User_AdminController_removeCustomer74_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Users/Customer/Remove")))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_User_AdminController_removeCustomer74_invoker = createInvoker(
    AdminController_12.removeCustomer(),
=======
  private[this] lazy val controllers_User_AdminController_removeUser74_invoker = createInvoker(
    AdminController_11.removeUser(fakeValue[String], fakeValue[String]),
>>>>>>> master
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "removeCustomer",
      Nil,
      "POST",
      this.prefix + """Admin/Manage/Users/Customer/Remove""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:146
  private[this] lazy val controllers_User_AdminController_removeStaff75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Users/Staff/Remove")))
  )
  private[this] lazy val controllers_User_AdminController_removeStaff75_invoker = createInvoker(
    AdminController_12.removeStaff(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "removeStaff",
      Nil,
      "POST",
      this.prefix + """Admin/Manage/Users/Staff/Remove""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:148
  private[this] lazy val controllers_Finance_UserFinanceController_removeDiscount76_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/Manage/Discounts/Remove/"), DynamicPart("discountId", """[^/]+""",true)))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_Finance_UserFinanceController_removeDiscount76_invoker = createInvoker(
    UserFinanceController_9.removeDiscount(fakeValue[String]),
=======
  private[this] lazy val controllers_Finance_UserFinanceController_removeDiscount75_invoker = createInvoker(
    UserFinanceController_8.removeDiscount(fakeValue[String]),
>>>>>>> master
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Finance.UserFinanceController",
      "removeDiscount",
      Seq(classOf[String]),
      "POST",
      this.prefix + """Admin/Manage/Discounts/Remove/""" + "$" + """discountId<[^/]+>""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:156
  private[this] lazy val controllers_Finance_UserFinanceController_addFunds77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_Finance_UserFinanceController_addFunds77_invoker = createInvoker(
    UserFinanceController_9.addFunds(),
=======
  private[this] lazy val controllers_Finance_UserFinanceController_addFunds76_invoker = createInvoker(
    UserFinanceController_8.addFunds(),
>>>>>>> master
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Finance.UserFinanceController",
      "addFunds",
      Nil,
      "GET",
      this.prefix + """User/AddFunds""",
      """""",
      Seq()
    )
  )

  // @LINE:158
  private[this] lazy val controllers_Finance_UserFinanceController_doAddFunds78_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_Finance_UserFinanceController_doAddFunds78_invoker = createInvoker(
    UserFinanceController_9.doAddFunds(),
=======
  private[this] lazy val controllers_Finance_UserFinanceController_doAddFunds77_invoker = createInvoker(
    UserFinanceController_8.doAddFunds(),
>>>>>>> master
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Finance.UserFinanceController",
      "doAddFunds",
      Nil,
      "POST",
      this.prefix + """User/AddFunds""",
      """""",
      Seq()
    )
  )

  // @LINE:168
  private[this] lazy val controllers_Order_OrderController_getMenu79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu")))
  )
  private[this] lazy val controllers_Order_OrderController_getMenu79_invoker = createInvoker(
    OrderController_4.getMenu(),
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

  // @LINE:170
  private[this] lazy val controllers_Order_OrderController_switchMenu80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/"), DynamicPart("menutype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Order_OrderController_switchMenu80_invoker = createInvoker(
    OrderController_4.switchMenu(fakeValue[Integer]),
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

<<<<<<< HEAD
  // @LINE:172
  private[this] lazy val controllers_Order_AccountController_getSignUp81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Order_AccountController_getSignUp81_invoker = createInvoker(
    AccountController_6.getSignUp,
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

  // @LINE:174
  private[this] lazy val controllers_Order_OrderController_addMealToOrder82_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmealtoorder")))
  )
  private[this] lazy val controllers_Order_OrderController_addMealToOrder82_invoker = createInvoker(
=======
  // @LINE:170
  private[this] lazy val controllers_Order_OrderController_addMealToOrder80_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmealtoorder")))
  )
  private[this] lazy val controllers_Order_OrderController_addMealToOrder80_invoker = createInvoker(
>>>>>>> master
    OrderController_4.addMealToOrder(fakeValue[String]),
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

<<<<<<< HEAD
  // @LINE:176
  private[this] lazy val controllers_Order_OrderController_getAddMealToMenu83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmeal")))
  )
  private[this] lazy val controllers_Order_OrderController_getAddMealToMenu83_invoker = createInvoker(
=======
  // @LINE:172
  private[this] lazy val controllers_Order_OrderController_getAddMealToMenu81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmeal")))
  )
  private[this] lazy val controllers_Order_OrderController_getAddMealToMenu81_invoker = createInvoker(
>>>>>>> master
    OrderController_4.getAddMealToMenu,
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

<<<<<<< HEAD
  // @LINE:178
  private[this] lazy val controllers_Order_OrderController_addMeal84_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postmeal")))
  )
  private[this] lazy val controllers_Order_OrderController_addMeal84_invoker = createInvoker(
=======
  // @LINE:174
  private[this] lazy val controllers_Order_OrderController_addMeal82_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postmeal")))
  )
  private[this] lazy val controllers_Order_OrderController_addMeal82_invoker = createInvoker(
>>>>>>> master
    OrderController_4.addMeal,
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

<<<<<<< HEAD
  // @LINE:180
  private[this] lazy val controllers_Order_AccountController_doLogin85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dologin")))
  )
  private[this] lazy val controllers_Order_AccountController_doLogin85_invoker = createInvoker(
    AccountController_6.doLogin(),
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

  // @LINE:182
  private[this] lazy val controllers_Order_AccountController_doSignOut86_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dosignout")))
  )
  private[this] lazy val controllers_Order_AccountController_doSignOut86_invoker = createInvoker(
    AccountController_6.doSignOut(),
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

  // @LINE:184
  private[this] lazy val controllers_Order_OrderController_getCart87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_Order_OrderController_getCart87_invoker = createInvoker(
=======
  // @LINE:176
  private[this] lazy val controllers_Order_OrderController_getCart83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_Order_OrderController_getCart83_invoker = createInvoker(
>>>>>>> master
    OrderController_4.getCart(),
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

<<<<<<< HEAD
  // @LINE:186
  private[this] lazy val controllers_Order_OrderController_removeMealFromOrder88_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/removemeal")))
  )
  private[this] lazy val controllers_Order_OrderController_removeMealFromOrder88_invoker = createInvoker(
=======
  // @LINE:178
  private[this] lazy val controllers_Order_OrderController_removeMealFromOrder84_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/removemeal")))
  )
  private[this] lazy val controllers_Order_OrderController_removeMealFromOrder84_invoker = createInvoker(
>>>>>>> master
    OrderController_4.removeMealFromOrder(fakeValue[String]),
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

<<<<<<< HEAD
  // @LINE:188
  private[this] lazy val controllers_Order_OrderController_getSubmitPage89_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/submit")))
  )
  private[this] lazy val controllers_Order_OrderController_getSubmitPage89_invoker = createInvoker(
=======
  // @LINE:180
  private[this] lazy val controllers_Order_OrderController_getSubmitPage85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/submit")))
  )
  private[this] lazy val controllers_Order_OrderController_getSubmitPage85_invoker = createInvoker(
>>>>>>> master
    OrderController_4.getSubmitPage(),
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

<<<<<<< HEAD
  // @LINE:190
  private[this] lazy val controllers_Order_OrderController_submitCart90_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/submitcart")))
  )
  private[this] lazy val controllers_Order_OrderController_submitCart90_invoker = createInvoker(
=======
  // @LINE:182
  private[this] lazy val controllers_Order_OrderController_submitCart86_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/submitcart")))
  )
  private[this] lazy val controllers_Order_OrderController_submitCart86_invoker = createInvoker(
>>>>>>> master
    OrderController_4.submitCart(),
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

<<<<<<< HEAD
  // @LINE:192
  private[this] lazy val controllers_Order_OrderController_getHistoryPage91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history")))
  )
  private[this] lazy val controllers_Order_OrderController_getHistoryPage91_invoker = createInvoker(
    OrderController_4.getHistoryPage(),
=======
  // @LINE:184
  private[this] lazy val controllers_Order_OrderController_getViewOrder87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("activeorders/"), DynamicPart("orderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Order_OrderController_getViewOrder87_invoker = createInvoker(
    OrderController_4.getViewOrder(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "getViewOrder",
      Seq(classOf[String]),
      "GET",
      this.prefix + """activeorders/""" + "$" + """orderId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:186
  private[this] lazy val controllers_Order_OrderController_getActiveOrders88_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("activeorders")))
  )
  private[this] lazy val controllers_Order_OrderController_getActiveOrders88_invoker = createInvoker(
    OrderController_4.getActiveOrders(),
>>>>>>> master
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "getActiveOrders",
      Nil,
      "GET",
      this.prefix + """activeorders""",
      """""",
      Seq()
    )
  )

<<<<<<< HEAD
  // @LINE:194
  private[this] lazy val controllers_Order_OrderController_getViewOrder92_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history/order")))
  )
  private[this] lazy val controllers_Order_OrderController_getViewOrder92_invoker = createInvoker(
    OrderController_4.getViewOrder(fakeValue[String]),
=======
  // @LINE:188
  private[this] lazy val controllers_Order_OrderController_activeOrderAction89_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderaction")))
  )
  private[this] lazy val controllers_Order_OrderController_activeOrderAction89_invoker = createInvoker(
    OrderController_4.activeOrderAction(fakeValue[String]),
>>>>>>> master
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.OrderController",
      "activeOrderAction",
      Seq(classOf[String]),
      "POST",
      this.prefix + """orderaction""",
      """""",
      Seq()
    )
  )

<<<<<<< HEAD
  // @LINE:198
  private[this] lazy val controllers_Order_KitchenController_home93_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen")))
  )
  private[this] lazy val controllers_Order_KitchenController_home93_invoker = createInvoker(
    KitchenController_10.home(),
=======
  // @LINE:192
  private[this] lazy val controllers_Order_KitchenController_home90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen")))
  )
  private[this] lazy val controllers_Order_KitchenController_home90_invoker = createInvoker(
    KitchenController_9.home(),
>>>>>>> master
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

<<<<<<< HEAD
  // @LINE:202
  private[this] lazy val controllers_Order_KitchenController_getIngredientPage94_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredients")))
  )
  private[this] lazy val controllers_Order_KitchenController_getIngredientPage94_invoker = createInvoker(
    KitchenController_10.getIngredientPage(),
=======
  // @LINE:196
  private[this] lazy val controllers_Order_KitchenController_getIngredientPage91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredients")))
  )
  private[this] lazy val controllers_Order_KitchenController_getIngredientPage91_invoker = createInvoker(
    KitchenController_9.getIngredientPage(),
>>>>>>> master
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

<<<<<<< HEAD
  // @LINE:204
  private[this] lazy val controllers_Order_KitchenController_getIngredientOrderPage95_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredients/order")))
  )
  private[this] lazy val controllers_Order_KitchenController_getIngredientOrderPage95_invoker = createInvoker(
    KitchenController_10.getIngredientOrderPage(fakeValue[String]),
=======
  // @LINE:198
  private[this] lazy val controllers_Order_KitchenController_getIngredientOrderPage92_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredients/order")))
  )
  private[this] lazy val controllers_Order_KitchenController_getIngredientOrderPage92_invoker = createInvoker(
    KitchenController_9.getIngredientOrderPage(fakeValue[String]),
>>>>>>> master
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

<<<<<<< HEAD
  // @LINE:206
  private[this] lazy val controllers_Order_KitchenController_editIngredient96_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredient/order/op")))
  )
  private[this] lazy val controllers_Order_KitchenController_editIngredient96_invoker = createInvoker(
    KitchenController_10.editIngredient(fakeValue[String]),
=======
  // @LINE:200
  private[this] lazy val controllers_Order_KitchenController_editIngredient93_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredient/order/op")))
  )
  private[this] lazy val controllers_Order_KitchenController_editIngredient93_invoker = createInvoker(
    KitchenController_9.editIngredient(fakeValue[String]),
>>>>>>> master
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

<<<<<<< HEAD
  // @LINE:208
  private[this] lazy val controllers_Order_KitchenController_getNewIngredientPage97_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredient/ordernew")))
  )
  private[this] lazy val controllers_Order_KitchenController_getNewIngredientPage97_invoker = createInvoker(
    KitchenController_10.getNewIngredientPage(),
=======
  // @LINE:202
  private[this] lazy val controllers_Order_KitchenController_getNewIngredientPage94_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredient/ordernew")))
  )
  private[this] lazy val controllers_Order_KitchenController_getNewIngredientPage94_invoker = createInvoker(
    KitchenController_9.getNewIngredientPage(),
>>>>>>> master
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

<<<<<<< HEAD
  // @LINE:210
  private[this] lazy val controllers_Order_KitchenController_addIngredient98_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredient/add")))
  )
  private[this] lazy val controllers_Order_KitchenController_addIngredient98_invoker = createInvoker(
    KitchenController_10.addIngredient(),
=======
  // @LINE:204
  private[this] lazy val controllers_Order_KitchenController_addIngredient95_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredient/add")))
  )
  private[this] lazy val controllers_Order_KitchenController_addIngredient95_invoker = createInvoker(
    KitchenController_9.addIngredient(),
>>>>>>> master
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

<<<<<<< HEAD
  // @LINE:214
  private[this] lazy val controllers_Order_KitchenController_getOrderPage99_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders")))
  )
  private[this] lazy val controllers_Order_KitchenController_getOrderPage99_invoker = createInvoker(
    KitchenController_10.getOrderPage(),
=======
  // @LINE:208
  private[this] lazy val controllers_Order_KitchenController_getOrderPage96_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders")))
  )
  private[this] lazy val controllers_Order_KitchenController_getOrderPage96_invoker = createInvoker(
    KitchenController_9.getOrderPage(),
>>>>>>> master
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

<<<<<<< HEAD
  // @LINE:216
  private[this] lazy val controllers_Order_KitchenController_getPendingOrderPage100_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/pendingorders")))
  )
  private[this] lazy val controllers_Order_KitchenController_getPendingOrderPage100_invoker = createInvoker(
    KitchenController_10.getPendingOrderPage(),
=======
  // @LINE:210
  private[this] lazy val controllers_Order_KitchenController_getPendingOrderPage97_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/pendingorders")))
  )
  private[this] lazy val controllers_Order_KitchenController_getPendingOrderPage97_invoker = createInvoker(
    KitchenController_9.getPendingOrderPage(),
>>>>>>> master
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

<<<<<<< HEAD
  // @LINE:218
  private[this] lazy val controllers_Order_KitchenController_getProcessingOrderPage101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/processingorders")))
  )
  private[this] lazy val controllers_Order_KitchenController_getProcessingOrderPage101_invoker = createInvoker(
    KitchenController_10.getProcessingOrderPage(),
=======
  // @LINE:212
  private[this] lazy val controllers_Order_KitchenController_getProcessingOrderPage98_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/processingorders")))
  )
  private[this] lazy val controllers_Order_KitchenController_getProcessingOrderPage98_invoker = createInvoker(
    KitchenController_9.getProcessingOrderPage(),
>>>>>>> master
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

<<<<<<< HEAD
  // @LINE:220
  private[this] lazy val controllers_Order_KitchenController_getMealOrderPage102_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders/mealorder")))
  )
  private[this] lazy val controllers_Order_KitchenController_getMealOrderPage102_invoker = createInvoker(
    KitchenController_10.getMealOrderPage(fakeValue[String]),
=======
  // @LINE:214
  private[this] lazy val controllers_Order_KitchenController_getMealOrderPage99_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders/mealorder")))
  )
  private[this] lazy val controllers_Order_KitchenController_getMealOrderPage99_invoker = createInvoker(
    KitchenController_9.getMealOrderPage(fakeValue[String]),
>>>>>>> master
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

<<<<<<< HEAD
  // @LINE:222
  private[this] lazy val controllers_Order_KitchenController_updateOrderStatus103_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders/mealorder/update")))
  )
  private[this] lazy val controllers_Order_KitchenController_updateOrderStatus103_invoker = createInvoker(
    KitchenController_10.updateOrderStatus(fakeValue[String]),
=======
  // @LINE:216
  private[this] lazy val controllers_Order_KitchenController_updateOrderStatus100_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders/mealorder/update")))
  )
  private[this] lazy val controllers_Order_KitchenController_updateOrderStatus100_invoker = createInvoker(
    KitchenController_9.updateOrderStatus(fakeValue[String]),
>>>>>>> master
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

<<<<<<< HEAD
  // @LINE:230
  private[this] lazy val controllers_Order_ScheduleController_scheduleJSRoutes104_route = Route("GET",
=======
  // @LINE:218
  private[this] lazy val controllers_Order_KitchenController_getCancelOrderPage101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders/mealorder/cancel")))
  )
  private[this] lazy val controllers_Order_KitchenController_getCancelOrderPage101_invoker = createInvoker(
    KitchenController_9.getCancelOrderPage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "getCancelOrderPage",
      Seq(classOf[String]),
      "GET",
      this.prefix + """kitchen/customerorders/mealorder/cancel""",
      """""",
      Seq()
    )
  )

  // @LINE:220
  private[this] lazy val controllers_Order_KitchenController_doOrderCancellation102_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders/mealorder/docancel")))
  )
  private[this] lazy val controllers_Order_KitchenController_doOrderCancellation102_invoker = createInvoker(
    KitchenController_9.doOrderCancellation(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.KitchenController",
      "doOrderCancellation",
      Seq(classOf[String]),
      "POST",
      this.prefix + """kitchen/customerorders/mealorder/docancel""",
      """""",
      Seq()
    )
  )

  // @LINE:228
  private[this] lazy val controllers_Order_ScheduleController_scheduleJSRoutes103_route = Route("GET",
>>>>>>> master
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/scheduleJSRoutes")))
  )
  private[this] lazy val controllers_Order_ScheduleController_scheduleJSRoutes104_invoker = createInvoker(
    ScheduleController_2.scheduleJSRoutes(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Order.ScheduleController",
      "scheduleJSRoutes",
      Nil,
      "GET",
      this.prefix + """assets/javascripts/scheduleJSRoutes""",
      """GET        /assets/javascripts/routes               controllers.Order.ScheduleController.javascriptRoutes()""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:232
  private[this] lazy val controllers_User_CustomerController_customerJSRoutes105_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/customerJSRoutes")))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_User_CustomerController_customerJSRoutes105_invoker = createInvoker(
    CustomerController_8.customerJSRoutes(),
=======
  private[this] lazy val controllers_User_CustomerController_customerJSRoutes104_invoker = createInvoker(
    CustomerController_7.customerJSRoutes(),
>>>>>>> master
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.CustomerController",
      "customerJSRoutes",
      Nil,
      "GET",
      this.prefix + """assets/javascripts/customerJSRoutes""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:234
  private[this] lazy val controllers_User_AdminController_adminJSRoutes106_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/adminJSRoutes")))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_User_AdminController_adminJSRoutes106_invoker = createInvoker(
    AdminController_12.adminJSRoutes(),
=======
  private[this] lazy val controllers_User_AdminController_adminJSRoutes105_invoker = createInvoker(
    AdminController_11.adminJSRoutes(),
>>>>>>> master
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.AdminController",
      "adminJSRoutes",
      Nil,
      "GET",
      this.prefix + """assets/javascripts/adminJSRoutes""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:236
  private[this] lazy val controllers_User_DeliveryStaffController_deliveryJSRoutes107_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/deliveryJSRoutes")))
  )
  private[this] lazy val controllers_User_DeliveryStaffController_deliveryJSRoutes107_invoker = createInvoker(
    DeliveryStaffController_0.deliveryJSRoutes(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.DeliveryStaffController",
      "deliveryJSRoutes",
      Nil,
      "GET",
      this.prefix + """assets/javascripts/deliveryJSRoutes""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:238
  private[this] lazy val controllers_User_KitchenStaffController_kitchenJSRoutes108_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/kitchenJSRoutes")))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_User_KitchenStaffController_kitchenJSRoutes108_invoker = createInvoker(
    KitchenStaffController_7.kitchenJSRoutes(),
=======
  private[this] lazy val controllers_User_KitchenStaffController_kitchenJSRoutes107_invoker = createInvoker(
    KitchenStaffController_6.kitchenJSRoutes(),
>>>>>>> master
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User.KitchenStaffController",
      "kitchenJSRoutes",
      Nil,
      "GET",
      this.prefix + """assets/javascripts/kitchenJSRoutes""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:240
  private[this] lazy val controllers_Finance_UserFinanceController_financeJSRoutes109_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascripts/financeJSRoutes")))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_Finance_UserFinanceController_financeJSRoutes109_invoker = createInvoker(
    UserFinanceController_9.financeJSRoutes(),
=======
  private[this] lazy val controllers_Finance_UserFinanceController_financeJSRoutes108_invoker = createInvoker(
    UserFinanceController_8.financeJSRoutes(),
>>>>>>> master
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Finance.UserFinanceController",
      "financeJSRoutes",
      Nil,
      "GET",
      this.prefix + """assets/javascripts/financeJSRoutes""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:249
  private[this] lazy val controllers_Assets_versioned110_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_Assets_versioned110_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
=======
  private[this] lazy val controllers_Assets_versioned109_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
>>>>>>> master
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

  // @LINE:250
  private[this] lazy val controllers_Assets_versioned111_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/User/"), DynamicPart("file", """.+""",false)))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_Assets_versioned111_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
=======
  private[this] lazy val controllers_Assets_versioned110_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
>>>>>>> master
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

  // @LINE:251
  private[this] lazy val controllers_Assets_versioned112_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/User/Registration/"), DynamicPart("file", """.+""",false)))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_Assets_versioned112_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
=======
  private[this] lazy val controllers_Assets_versioned111_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
>>>>>>> master
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

  // @LINE:252
  private[this] lazy val controllers_Assets_versioned113_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/Delivery/"), DynamicPart("file", """.+""",false)))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_Assets_versioned113_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
=======
  private[this] lazy val controllers_Assets_versioned112_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
>>>>>>> master
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

  // @LINE:253
  private[this] lazy val controllers_Assets_versioned114_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/Kitchen/"), DynamicPart("file", """.+""",false)))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_Assets_versioned114_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
=======
  private[this] lazy val controllers_Assets_versioned113_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
>>>>>>> master
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

  // @LINE:254
  private[this] lazy val controllers_Assets_versioned115_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/Staff/"), DynamicPart("file", """.+""",false)))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_Assets_versioned115_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
=======
  private[this] lazy val controllers_Assets_versioned114_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
>>>>>>> master
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

  // @LINE:255
  private[this] lazy val controllers_Assets_versioned116_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/History/"), DynamicPart("file", """.+""",false)))
  )
<<<<<<< HEAD
  private[this] lazy val controllers_Assets_versioned116_invoker = createInvoker(
    Assets_11.versioned(fakeValue[String], fakeValue[Asset]),
=======
  private[this] lazy val controllers_Assets_versioned115_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
>>>>>>> master
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

  // @LINE:264
  private[this] lazy val controllers_Application_HomeController_invalidRoute117_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("path", """.+""",false)))
  )
  private[this] lazy val controllers_Application_HomeController_invalidRoute117_invoker = createInvoker(
    HomeController_5.invalidRoute(fakeValue[String]),
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
        controllers_Application_HomeController_index0_invoker.call(HomeController_5.index())
      }
  
    // @LINE:7
    case controllers_Application_HomeController_contactUs1_route(params) =>
      call { 
        controllers_Application_HomeController_contactUs1_invoker.call(HomeController_5.contactUs())
      }
  
    // @LINE:8
    case controllers_Application_HomeController_forbiddenAccess2_route(params) =>
      call { 
        controllers_Application_HomeController_forbiddenAccess2_invoker.call(HomeController_5.forbiddenAccess())
      }
  
    // @LINE:9
    case controllers_Application_HomeController_unknown3_route(params) =>
      call { 
        controllers_Application_HomeController_unknown3_invoker.call(HomeController_5.unknown())
      }
  
    // @LINE:18
    case controllers_User_UserController_login4_route(params) =>
      call { 
        controllers_User_UserController_login4_invoker.call(UserController_3.login())
      }
  
    // @LINE:19
    case controllers_User_UserController_logout5_route(params) =>
      call { 
        controllers_User_UserController_logout5_invoker.call(UserController_3.logout())
      }
  
    // @LINE:21
    case controllers_User_UserController_doLogin6_route(params) =>
      call { 
        controllers_User_UserController_doLogin6_invoker.call(UserController_3.doLogin())
      }
  
    // @LINE:28
    case controllers_User_DeliveryStaffController_index7_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_index7_invoker.call(DeliveryStaffController_0.index())
      }
  
    // @LINE:35
    case controllers_User_CustomerController_redirectHome8_route(params) =>
      call { 
        controllers_User_CustomerController_redirectHome8_invoker.call(CustomerController_7.redirectHome())
      }
  
    // @LINE:36
    case controllers_User_CustomerController_index9_route(params) =>
      call { 
        controllers_User_CustomerController_index9_invoker.call(CustomerController_7.index())
      }
  
    // @LINE:38
    case controllers_User_CustomerController_getCustomerDashUpdate10_route(params) =>
      call { 
        controllers_User_CustomerController_getCustomerDashUpdate10_invoker.call(CustomerController_7.getCustomerDashUpdate())
      }
  
    // @LINE:39
    case controllers_User_CustomerController_register11_route(params) =>
      call { 
        controllers_User_CustomerController_register11_invoker.call(CustomerController_7.register())
      }
  
    // @LINE:40
    case controllers_User_CustomerController_completeRegistration12_route(params) =>
      call { 
        controllers_User_CustomerController_completeRegistration12_invoker.call(CustomerController_7.completeRegistration())
      }
  
    // @LINE:41
    case controllers_User_CustomerController_verifyCustomer13_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_User_CustomerController_verifyCustomer13_invoker.call(CustomerController_7.verifyCustomer(token))
      }
  
    // @LINE:42
    case controllers_User_CustomerController_edit14_route(params) =>
      call { 
        controllers_User_CustomerController_edit14_invoker.call(CustomerController_7.edit())
      }
  
    // @LINE:43
    case controllers_User_CustomerController_orderHistory15_route(params) =>
      call { 
        controllers_User_CustomerController_orderHistory15_invoker.call(CustomerController_7.orderHistory())
      }
  
    // @LINE:44
    case controllers_User_CustomerController_paymentHistory16_route(params) =>
      call { 
        controllers_User_CustomerController_paymentHistory16_invoker.call(CustomerController_7.paymentHistory())
      }
  
    // @LINE:45
    case controllers_User_CustomerController_viewOrder17_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_User_CustomerController_viewOrder17_invoker.call(CustomerController_7.viewOrder(orderId))
      }
  
    // @LINE:46
    case controllers_User_CustomerController_viewPayment18_route(params) =>
      call(params.fromPath[String]("paymentId", None)) { (paymentId) =>
        controllers_User_CustomerController_viewPayment18_invoker.call(CustomerController_7.viewPayment(paymentId))
      }
  
    // @LINE:48
    case controllers_User_CustomerController_create19_route(params) =>
      call { 
        controllers_User_CustomerController_create19_invoker.call(CustomerController_7.create())
      }
  
    // @LINE:49
    case controllers_User_CustomerController_reverify20_route(params) =>
      call { 
        controllers_User_CustomerController_reverify20_invoker.call(CustomerController_7.reverify())
      }
  
    // @LINE:50
    case controllers_User_CustomerController_doCompleteRegistration21_route(params) =>
      call { 
        controllers_User_CustomerController_doCompleteRegistration21_invoker.call(CustomerController_7.doCompleteRegistration())
      }
  
    // @LINE:51
    case controllers_User_CustomerController_update22_route(params) =>
      call { 
        controllers_User_CustomerController_update22_invoker.call(CustomerController_7.update())
      }
  
    // @LINE:52
    case controllers_User_CustomerController_activeOrders23_route(params) =>
      call { 
        controllers_User_CustomerController_activeOrders23_invoker.call(CustomerController_7.activeOrders())
      }
  
    // @LINE:56
    case controllers_Order_ScheduleController_index24_route(params) =>
      call { 
        controllers_Order_ScheduleController_index24_invoker.call(ScheduleController_2.index())
      }
  
    // @LINE:57
    case controllers_Order_ScheduleController_createSchedule25_route(params) =>
      call { 
        controllers_Order_ScheduleController_createSchedule25_invoker.call(ScheduleController_2.createSchedule())
      }
  
    // @LINE:58
    case controllers_Order_ScheduleController_addOrder26_route(params) =>
      call { 
        controllers_Order_ScheduleController_addOrder26_invoker.call(ScheduleController_2.addOrder())
      }
  
    // @LINE:59
    case controllers_Order_ScheduleController_editScheduleName27_route(params) =>
      call { 
        controllers_Order_ScheduleController_editScheduleName27_invoker.call(ScheduleController_2.editScheduleName())
      }
  
    // @LINE:62
    case controllers_Order_ScheduleController_removeOrder28_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_Order_ScheduleController_removeOrder28_invoker.call(ScheduleController_2.removeOrder(orderId))
      }
  
    // @LINE:64
    case controllers_Order_ScheduleController_setScheduleState29_route(params) =>
      call { 
        controllers_Order_ScheduleController_setScheduleState29_invoker.call(ScheduleController_2.setScheduleState())
      }
  
    // @LINE:65
    case controllers_Order_ScheduleController_updateScheduleName30_route(params) =>
      call { 
        controllers_Order_ScheduleController_updateScheduleName30_invoker.call(ScheduleController_2.updateScheduleName())
      }
  
    // @LINE:66
    case controllers_Order_ScheduleController_doCreateSchedule31_route(params) =>
      call { 
        controllers_Order_ScheduleController_doCreateSchedule31_invoker.call(ScheduleController_2.doCreateSchedule())
      }
  
    // @LINE:67
    case controllers_Order_ScheduleController_doAddOrder32_route(params) =>
      call { 
        controllers_Order_ScheduleController_doAddOrder32_invoker.call(ScheduleController_2.doAddOrder())
      }
  
    // @LINE:68
    case controllers_Order_ScheduleController_clearSchedule33_route(params) =>
      call { 
        controllers_Order_ScheduleController_clearSchedule33_invoker.call(ScheduleController_2.clearSchedule())
      }
  
    // @LINE:74
    case controllers_Order_MenuController_index34_route(params) =>
      call { 
        controllers_Order_MenuController_index34_invoker.call(MenuController_1.index())
      }
  
    // @LINE:82
    case controllers_User_KitchenStaffController_index35_route(params) =>
      call { 
        controllers_User_KitchenStaffController_index35_invoker.call(KitchenStaffController_6.index())
      }
  
    // @LINE:84
    case controllers_User_KitchenStaffController_getKitchenDashUpdate36_route(params) =>
      call { 
        controllers_User_KitchenStaffController_getKitchenDashUpdate36_invoker.call(KitchenStaffController_6.getKitchenDashUpdate())
      }
  
    // @LINE:85
    case controllers_User_KitchenStaffController_viewOrder37_route(params) =>
      call { 
        controllers_User_KitchenStaffController_viewOrder37_invoker.call(KitchenStaffController_6.viewOrder())
      }
  
    // @LINE:86
    case controllers_User_KitchenStaffController_viewActiveOrders38_route(params) =>
      call { 
        controllers_User_KitchenStaffController_viewActiveOrders38_invoker.call(KitchenStaffController_6.viewActiveOrders())
      }
  
    // @LINE:87
    case controllers_User_KitchenStaffController_viewCompletedOrders39_route(params) =>
      call { 
        controllers_User_KitchenStaffController_viewCompletedOrders39_invoker.call(KitchenStaffController_6.viewCompletedOrders())
      }
  
    // @LINE:88
    case controllers_User_KitchenStaffController_viewQueuedOrders40_route(params) =>
      call { 
        controllers_User_KitchenStaffController_viewQueuedOrders40_invoker.call(KitchenStaffController_6.viewQueuedOrders())
      }
  
    // @LINE:89
    case controllers_User_KitchenStaffController_edit41_route(params) =>
      call { 
        controllers_User_KitchenStaffController_edit41_invoker.call(KitchenStaffController_6.edit())
      }
  
    // @LINE:91
    case controllers_User_KitchenStaffController_doEdit42_route(params) =>
      call { 
        controllers_User_KitchenStaffController_doEdit42_invoker.call(KitchenStaffController_6.doEdit())
      }
  
    // @LINE:99
    case controllers_User_DeliveryStaffController_index43_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_index43_invoker.call(DeliveryStaffController_0.index())
      }
  
    // @LINE:101
    case controllers_User_DeliveryStaffController_getDeliveryDashUpdate44_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_getDeliveryDashUpdate44_invoker.call(DeliveryStaffController_0.getDeliveryDashUpdate())
      }
  
    // @LINE:102
    case controllers_User_DeliveryStaffController_viewOrder45_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_viewOrder45_invoker.call(DeliveryStaffController_0.viewOrder())
      }
  
    // @LINE:103
    case controllers_User_DeliveryStaffController_deliverOrder46_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_deliverOrder46_invoker.call(DeliveryStaffController_0.deliverOrder())
      }
  
    // @LINE:104
    case controllers_User_DeliveryStaffController_checkoutOrder47_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_checkoutOrder47_invoker.call(DeliveryStaffController_0.checkoutOrder())
      }
  
    // @LINE:105
    case controllers_User_DeliveryStaffController_viewCompletedDeliveries48_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_viewCompletedDeliveries48_invoker.call(DeliveryStaffController_0.viewCompletedDeliveries())
      }
  
    // @LINE:106
    case controllers_User_DeliveryStaffController_viewActiveDeliveries49_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_viewActiveDeliveries49_invoker.call(DeliveryStaffController_0.viewActiveDeliveries())
      }
  
    // @LINE:107
    case controllers_User_DeliveryStaffController_viewWaitingDeliveries50_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_viewWaitingDeliveries50_invoker.call(DeliveryStaffController_0.viewWaitingDeliveries())
      }
  
    // @LINE:108
    case controllers_User_DeliveryStaffController_edit51_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_edit51_invoker.call(DeliveryStaffController_0.edit())
      }
  
    // @LINE:110
    case controllers_User_DeliveryStaffController_doEdit52_route(params) =>
      call { 
        controllers_User_DeliveryStaffController_doEdit52_invoker.call(DeliveryStaffController_0.doEdit())
      }
  
    // @LINE:119
    case controllers_User_AdminController_index53_route(params) =>
      call { 
        controllers_User_AdminController_index53_invoker.call(AdminController_11.index())
      }
  
    // @LINE:121
    case controllers_User_AdminController_getAdminDashUpdate54_route(params) =>
      call { 
        controllers_User_AdminController_getAdminDashUpdate54_invoker.call(AdminController_11.getAdminDashUpdate())
      }
  
    // @LINE:122
    case controllers_User_AdminController_manageMeals55_route(params) =>
      call { 
        controllers_User_AdminController_manageMeals55_invoker.call(AdminController_11.manageMeals())
      }
  
    // @LINE:123
    case controllers_User_AdminController_addMeal56_route(params) =>
      call { 
        controllers_User_AdminController_addMeal56_invoker.call(AdminController_11.addMeal())
      }
  
    // @LINE:124
    case controllers_User_AdminController_editMeal57_route(params) =>
      call(params.fromPath[String]("mealId", None)) { (mealId) =>
        controllers_User_AdminController_editMeal57_invoker.call(AdminController_11.editMeal(mealId))
      }
  
    // @LINE:125
    case controllers_User_AdminController_manageUsers58_route(params) =>
      call { 
        controllers_User_AdminController_manageUsers58_invoker.call(AdminController_11.manageUsers())
      }
  
    // @LINE:126
    case controllers_User_AdminController_addCustomer59_route(params) =>
      call { 
        controllers_User_AdminController_addCustomer59_invoker.call(AdminController_11.addCustomer())
      }
  
    // @LINE:127
    case controllers_User_AdminController_addStaff60_route(params) =>
      call { 
<<<<<<< HEAD
        controllers_User_AdminController_addStaff60_invoker.call(AdminController_12.addStaff())
=======
        controllers_User_AdminController_addCustomer60_invoker.call(AdminController_11.addCustomer())
>>>>>>> master
      }
  
    // @LINE:128
    case controllers_User_AdminController_editCustomer61_route(params) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        controllers_User_AdminController_editCustomer61_invoker.call(AdminController_11.editCustomer(userId))
      }
  
    // @LINE:129
    case controllers_User_AdminController_editStaff62_route(params) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        controllers_User_AdminController_editStaff62_invoker.call(AdminController_11.editStaff(userId))
      }
  
    // @LINE:130
    case controllers_User_AdminController_manageDiscounts63_route(params) =>
      call { 
        controllers_User_AdminController_manageDiscounts63_invoker.call(AdminController_11.manageDiscounts())
      }
  
    // @LINE:131
    case controllers_Finance_UserFinanceController_addDiscount64_route(params) =>
      call { 
        controllers_Finance_UserFinanceController_addDiscount64_invoker.call(UserFinanceController_8.addDiscount())
      }
  
    // @LINE:132
    case controllers_Finance_UserFinanceController_editDiscount65_route(params) =>
      call(params.fromPath[String]("discountId", None)) { (discountId) =>
        controllers_Finance_UserFinanceController_editDiscount65_invoker.call(UserFinanceController_8.editDiscount(discountId))
      }
  
    // @LINE:133
    case controllers_User_AdminController_edit66_route(params) =>
      call { 
        controllers_User_AdminController_edit66_invoker.call(AdminController_11.edit())
      }
  
    // @LINE:135
    case controllers_User_AdminController_doEdit67_route(params) =>
      call { 
        controllers_User_AdminController_doEdit67_invoker.call(AdminController_11.doEdit())
      }
  
    // @LINE:136
    case controllers_Finance_UserFinanceController_updateDiscount68_route(params) =>
      call { 
        controllers_Finance_UserFinanceController_updateDiscount68_invoker.call(UserFinanceController_8.updateDiscount())
      }
  
    // @LINE:137
    case controllers_User_AdminController_updateMeal69_route(params) =>
      call { 
        controllers_User_AdminController_updateMeal69_invoker.call(AdminController_11.updateMeal())
      }
  
    // @LINE:138
    case controllers_User_AdminController_updateCustomer70_route(params) =>
      call { 
        controllers_User_AdminController_updateCustomer70_invoker.call(AdminController_11.updateCustomer())
      }
  
    // @LINE:139
    case controllers_User_AdminController_updateStaff71_route(params) =>
      call { 
        controllers_User_AdminController_updateStaff71_invoker.call(AdminController_11.updateStaff())
      }
  
    // @LINE:140
    case controllers_Finance_UserFinanceController_updateDiscount72_route(params) =>
      call { 
        controllers_Finance_UserFinanceController_updateDiscount72_invoker.call(UserFinanceController_8.updateDiscount())
      }
  
    // @LINE:142
    case controllers_User_AdminController_removeMeal73_route(params) =>
<<<<<<< HEAD
      call { 
        controllers_User_AdminController_removeMeal73_invoker.call(AdminController_12.removeMeal())
      }
  
    // @LINE:144
    case controllers_User_AdminController_removeCustomer74_route(params) =>
      call { 
        controllers_User_AdminController_removeCustomer74_invoker.call(AdminController_12.removeCustomer())
      }
  
    // @LINE:146
    case controllers_User_AdminController_removeStaff75_route(params) =>
      call { 
        controllers_User_AdminController_removeStaff75_invoker.call(AdminController_12.removeStaff())
      }
  
    // @LINE:148
    case controllers_Finance_UserFinanceController_removeDiscount76_route(params) =>
      call(params.fromPath[String]("discountId", None)) { (discountId) =>
        controllers_Finance_UserFinanceController_removeDiscount76_invoker.call(UserFinanceController_9.removeDiscount(discountId))
=======
      call(params.fromPath[String]("mealId", None)) { (mealId) =>
        controllers_User_AdminController_removeMeal73_invoker.call(AdminController_11.removeMeal(mealId))
      }
  
    // @LINE:144
    case controllers_User_AdminController_removeUser74_route(params) =>
      call(params.fromPath[String]("userId", None), params.fromPath[String]("userType", None)) { (userId, userType) =>
        controllers_User_AdminController_removeUser74_invoker.call(AdminController_11.removeUser(userId, userType))
      }
  
    // @LINE:146
    case controllers_Finance_UserFinanceController_removeDiscount75_route(params) =>
      call(params.fromPath[String]("discountId", None)) { (discountId) =>
        controllers_Finance_UserFinanceController_removeDiscount75_invoker.call(UserFinanceController_8.removeDiscount(discountId))
      }
  
    // @LINE:154
    case controllers_Finance_UserFinanceController_addFunds76_route(params) =>
      call { 
        controllers_Finance_UserFinanceController_addFunds76_invoker.call(UserFinanceController_8.addFunds())
>>>>>>> master
      }
  
    // @LINE:156
    case controllers_Finance_UserFinanceController_addFunds77_route(params) =>
      call { 
<<<<<<< HEAD
        controllers_Finance_UserFinanceController_addFunds77_invoker.call(UserFinanceController_9.addFunds())
=======
        controllers_Finance_UserFinanceController_doAddFunds77_invoker.call(UserFinanceController_8.doAddFunds())
>>>>>>> master
      }
  
    // @LINE:158
    case controllers_Finance_UserFinanceController_doAddFunds78_route(params) =>
      call { 
        controllers_Finance_UserFinanceController_doAddFunds78_invoker.call(UserFinanceController_9.doAddFunds())
      }
  
    // @LINE:168
    case controllers_Order_OrderController_getMenu79_route(params) =>
      call { 
        controllers_Order_OrderController_getMenu79_invoker.call(OrderController_4.getMenu())
      }
  
    // @LINE:170
<<<<<<< HEAD
    case controllers_Order_OrderController_switchMenu80_route(params) =>
      call(params.fromPath[Integer]("menutype", None)) { (menutype) =>
        controllers_Order_OrderController_switchMenu80_invoker.call(OrderController_4.switchMenu(menutype))
      }
  
    // @LINE:172
    case controllers_Order_AccountController_getSignUp81_route(params) =>
      call { 
        controllers_Order_AccountController_getSignUp81_invoker.call(AccountController_6.getSignUp)
      }
  
    // @LINE:174
    case controllers_Order_OrderController_addMealToOrder82_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_Order_OrderController_addMealToOrder82_invoker.call(OrderController_4.addMealToOrder(mealId))
      }
  
    // @LINE:176
    case controllers_Order_OrderController_getAddMealToMenu83_route(params) =>
      call { 
        controllers_Order_OrderController_getAddMealToMenu83_invoker.call(OrderController_4.getAddMealToMenu)
      }
  
    // @LINE:178
    case controllers_Order_OrderController_addMeal84_route(params) =>
      call { 
        controllers_Order_OrderController_addMeal84_invoker.call(OrderController_4.addMeal)
      }
  
    // @LINE:180
    case controllers_Order_AccountController_doLogin85_route(params) =>
      call { 
        controllers_Order_AccountController_doLogin85_invoker.call(AccountController_6.doLogin())
      }
  
    // @LINE:182
    case controllers_Order_AccountController_doSignOut86_route(params) =>
      call { 
        controllers_Order_AccountController_doSignOut86_invoker.call(AccountController_6.doSignOut())
      }
  
    // @LINE:184
    case controllers_Order_OrderController_getCart87_route(params) =>
      call { 
        controllers_Order_OrderController_getCart87_invoker.call(OrderController_4.getCart())
      }
  
    // @LINE:186
    case controllers_Order_OrderController_removeMealFromOrder88_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_Order_OrderController_removeMealFromOrder88_invoker.call(OrderController_4.removeMealFromOrder(mealId))
      }
  
    // @LINE:188
    case controllers_Order_OrderController_getSubmitPage89_route(params) =>
      call { 
        controllers_Order_OrderController_getSubmitPage89_invoker.call(OrderController_4.getSubmitPage())
      }
  
    // @LINE:190
    case controllers_Order_OrderController_submitCart90_route(params) =>
      call { 
        controllers_Order_OrderController_submitCart90_invoker.call(OrderController_4.submitCart())
      }
  
    // @LINE:192
    case controllers_Order_OrderController_getHistoryPage91_route(params) =>
      call { 
        controllers_Order_OrderController_getHistoryPage91_invoker.call(OrderController_4.getHistoryPage())
      }
  
    // @LINE:194
    case controllers_Order_OrderController_getViewOrder92_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_OrderController_getViewOrder92_invoker.call(OrderController_4.getViewOrder(orderId))
      }
  
    // @LINE:198
    case controllers_Order_KitchenController_home93_route(params) =>
      call { 
        controllers_Order_KitchenController_home93_invoker.call(KitchenController_10.home())
      }
  
    // @LINE:202
    case controllers_Order_KitchenController_getIngredientPage94_route(params) =>
      call { 
        controllers_Order_KitchenController_getIngredientPage94_invoker.call(KitchenController_10.getIngredientPage())
      }
  
    // @LINE:204
    case controllers_Order_KitchenController_getIngredientOrderPage95_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_Order_KitchenController_getIngredientOrderPage95_invoker.call(KitchenController_10.getIngredientOrderPage(id))
      }
  
    // @LINE:206
    case controllers_Order_KitchenController_editIngredient96_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_Order_KitchenController_editIngredient96_invoker.call(KitchenController_10.editIngredient(id))
      }
  
    // @LINE:208
    case controllers_Order_KitchenController_getNewIngredientPage97_route(params) =>
      call { 
        controllers_Order_KitchenController_getNewIngredientPage97_invoker.call(KitchenController_10.getNewIngredientPage())
      }
  
    // @LINE:210
    case controllers_Order_KitchenController_addIngredient98_route(params) =>
      call { 
        controllers_Order_KitchenController_addIngredient98_invoker.call(KitchenController_10.addIngredient())
      }
  
    // @LINE:214
    case controllers_Order_KitchenController_getOrderPage99_route(params) =>
      call { 
        controllers_Order_KitchenController_getOrderPage99_invoker.call(KitchenController_10.getOrderPage())
      }
  
    // @LINE:216
    case controllers_Order_KitchenController_getPendingOrderPage100_route(params) =>
      call { 
        controllers_Order_KitchenController_getPendingOrderPage100_invoker.call(KitchenController_10.getPendingOrderPage())
      }
  
    // @LINE:218
    case controllers_Order_KitchenController_getProcessingOrderPage101_route(params) =>
      call { 
        controllers_Order_KitchenController_getProcessingOrderPage101_invoker.call(KitchenController_10.getProcessingOrderPage())
      }
  
    // @LINE:220
    case controllers_Order_KitchenController_getMealOrderPage102_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_KitchenController_getMealOrderPage102_invoker.call(KitchenController_10.getMealOrderPage(orderId))
=======
    case controllers_Order_OrderController_addMealToOrder80_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_Order_OrderController_addMealToOrder80_invoker.call(OrderController_4.addMealToOrder(mealId))
      }
  
    // @LINE:172
    case controllers_Order_OrderController_getAddMealToMenu81_route(params) =>
      call { 
        controllers_Order_OrderController_getAddMealToMenu81_invoker.call(OrderController_4.getAddMealToMenu)
      }
  
    // @LINE:174
    case controllers_Order_OrderController_addMeal82_route(params) =>
      call { 
        controllers_Order_OrderController_addMeal82_invoker.call(OrderController_4.addMeal)
      }
  
    // @LINE:176
    case controllers_Order_OrderController_getCart83_route(params) =>
      call { 
        controllers_Order_OrderController_getCart83_invoker.call(OrderController_4.getCart())
      }
  
    // @LINE:178
    case controllers_Order_OrderController_removeMealFromOrder84_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_Order_OrderController_removeMealFromOrder84_invoker.call(OrderController_4.removeMealFromOrder(mealId))
      }
  
    // @LINE:180
    case controllers_Order_OrderController_getSubmitPage85_route(params) =>
      call { 
        controllers_Order_OrderController_getSubmitPage85_invoker.call(OrderController_4.getSubmitPage())
      }
  
    // @LINE:182
    case controllers_Order_OrderController_submitCart86_route(params) =>
      call { 
        controllers_Order_OrderController_submitCart86_invoker.call(OrderController_4.submitCart())
      }
  
    // @LINE:184
    case controllers_Order_OrderController_getViewOrder87_route(params) =>
      call(params.fromPath[String]("orderId", None)) { (orderId) =>
        controllers_Order_OrderController_getViewOrder87_invoker.call(OrderController_4.getViewOrder(orderId))
      }
  
    // @LINE:186
    case controllers_Order_OrderController_getActiveOrders88_route(params) =>
      call { 
        controllers_Order_OrderController_getActiveOrders88_invoker.call(OrderController_4.getActiveOrders())
      }
  
    // @LINE:188
    case controllers_Order_OrderController_activeOrderAction89_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_OrderController_activeOrderAction89_invoker.call(OrderController_4.activeOrderAction(orderId))
      }
  
    // @LINE:192
    case controllers_Order_KitchenController_home90_route(params) =>
      call { 
        controllers_Order_KitchenController_home90_invoker.call(KitchenController_9.home())
      }
  
    // @LINE:196
    case controllers_Order_KitchenController_getIngredientPage91_route(params) =>
      call { 
        controllers_Order_KitchenController_getIngredientPage91_invoker.call(KitchenController_9.getIngredientPage())
      }
  
    // @LINE:198
    case controllers_Order_KitchenController_getIngredientOrderPage92_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_Order_KitchenController_getIngredientOrderPage92_invoker.call(KitchenController_9.getIngredientOrderPage(id))
      }
  
    // @LINE:200
    case controllers_Order_KitchenController_editIngredient93_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_Order_KitchenController_editIngredient93_invoker.call(KitchenController_9.editIngredient(id))
      }
  
    // @LINE:202
    case controllers_Order_KitchenController_getNewIngredientPage94_route(params) =>
      call { 
        controllers_Order_KitchenController_getNewIngredientPage94_invoker.call(KitchenController_9.getNewIngredientPage())
      }
  
    // @LINE:204
    case controllers_Order_KitchenController_addIngredient95_route(params) =>
      call { 
        controllers_Order_KitchenController_addIngredient95_invoker.call(KitchenController_9.addIngredient())
      }
  
    // @LINE:208
    case controllers_Order_KitchenController_getOrderPage96_route(params) =>
      call { 
        controllers_Order_KitchenController_getOrderPage96_invoker.call(KitchenController_9.getOrderPage())
      }
  
    // @LINE:210
    case controllers_Order_KitchenController_getPendingOrderPage97_route(params) =>
      call { 
        controllers_Order_KitchenController_getPendingOrderPage97_invoker.call(KitchenController_9.getPendingOrderPage())
      }
  
    // @LINE:212
    case controllers_Order_KitchenController_getProcessingOrderPage98_route(params) =>
      call { 
        controllers_Order_KitchenController_getProcessingOrderPage98_invoker.call(KitchenController_9.getProcessingOrderPage())
      }
  
    // @LINE:214
    case controllers_Order_KitchenController_getMealOrderPage99_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_KitchenController_getMealOrderPage99_invoker.call(KitchenController_9.getMealOrderPage(orderId))
      }
  
    // @LINE:216
    case controllers_Order_KitchenController_updateOrderStatus100_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_KitchenController_updateOrderStatus100_invoker.call(KitchenController_9.updateOrderStatus(orderId))
      }
  
    // @LINE:218
    case controllers_Order_KitchenController_getCancelOrderPage101_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_KitchenController_getCancelOrderPage101_invoker.call(KitchenController_9.getCancelOrderPage(orderId))
      }
  
    // @LINE:220
    case controllers_Order_KitchenController_doOrderCancellation102_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_KitchenController_doOrderCancellation102_invoker.call(KitchenController_9.doOrderCancellation(orderId))
>>>>>>> master
      }
  
    // @LINE:222
    case controllers_Order_KitchenController_updateOrderStatus103_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_KitchenController_updateOrderStatus103_invoker.call(KitchenController_10.updateOrderStatus(orderId))
      }
  
    // @LINE:230
    case controllers_Order_ScheduleController_scheduleJSRoutes104_route(params) =>
      call { 
<<<<<<< HEAD
        controllers_Order_ScheduleController_scheduleJSRoutes104_invoker.call(ScheduleController_2.scheduleJSRoutes())
=======
        controllers_User_CustomerController_customerJSRoutes104_invoker.call(CustomerController_7.customerJSRoutes())
>>>>>>> master
      }
  
    // @LINE:232
    case controllers_User_CustomerController_customerJSRoutes105_route(params) =>
      call { 
<<<<<<< HEAD
        controllers_User_CustomerController_customerJSRoutes105_invoker.call(CustomerController_8.customerJSRoutes())
=======
        controllers_User_AdminController_adminJSRoutes105_invoker.call(AdminController_11.adminJSRoutes())
>>>>>>> master
      }
  
    // @LINE:234
    case controllers_User_AdminController_adminJSRoutes106_route(params) =>
      call { 
        controllers_User_AdminController_adminJSRoutes106_invoker.call(AdminController_12.adminJSRoutes())
      }
  
    // @LINE:236
    case controllers_User_DeliveryStaffController_deliveryJSRoutes107_route(params) =>
      call { 
<<<<<<< HEAD
        controllers_User_DeliveryStaffController_deliveryJSRoutes107_invoker.call(DeliveryStaffController_0.deliveryJSRoutes())
=======
        controllers_User_KitchenStaffController_kitchenJSRoutes107_invoker.call(KitchenStaffController_6.kitchenJSRoutes())
>>>>>>> master
      }
  
    // @LINE:238
    case controllers_User_KitchenStaffController_kitchenJSRoutes108_route(params) =>
      call { 
<<<<<<< HEAD
        controllers_User_KitchenStaffController_kitchenJSRoutes108_invoker.call(KitchenStaffController_7.kitchenJSRoutes())
      }
  
    // @LINE:240
    case controllers_Finance_UserFinanceController_financeJSRoutes109_route(params) =>
      call { 
        controllers_Finance_UserFinanceController_financeJSRoutes109_invoker.call(UserFinanceController_9.financeJSRoutes())
=======
        controllers_Finance_UserFinanceController_financeJSRoutes108_invoker.call(UserFinanceController_8.financeJSRoutes())
      }
  
    // @LINE:247
    case controllers_Assets_versioned109_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned109_invoker.call(Assets_10.versioned(path, file))
>>>>>>> master
      }
  
    // @LINE:249
    case controllers_Assets_versioned110_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned110_invoker.call(Assets_10.versioned(path, file))
      }
  
    // @LINE:250
    case controllers_Assets_versioned111_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned111_invoker.call(Assets_10.versioned(path, file))
      }
  
    // @LINE:251
    case controllers_Assets_versioned112_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned112_invoker.call(Assets_10.versioned(path, file))
      }
  
    // @LINE:252
    case controllers_Assets_versioned113_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned113_invoker.call(Assets_10.versioned(path, file))
      }
  
    // @LINE:253
    case controllers_Assets_versioned114_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned114_invoker.call(Assets_10.versioned(path, file))
      }
  
    // @LINE:254
    case controllers_Assets_versioned115_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned115_invoker.call(Assets_10.versioned(path, file))
      }
  
    // @LINE:255
    case controllers_Assets_versioned116_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned116_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:264
    case controllers_Application_HomeController_invalidRoute117_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_HomeController_invalidRoute117_invoker.call(HomeController_5.invalidRoute(path))
      }
  }
}
