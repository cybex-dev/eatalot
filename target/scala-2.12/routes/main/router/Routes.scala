
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/conf/routes
// @DATE:Sat Oct 14 09:33:00 SAST 2017

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
  UserController_3: controllers.User.UserController,
  // @LINE:25
  StaffController_9: controllers.User.StaffController,
  // @LINE:36
  CustomerController_8: controllers.User.CustomerController,
  // @LINE:51
  MenuController_0: controllers.Order.MenuController,
  // @LINE:59
  KitchenController_10: controllers.Order.KitchenController,
  // @LINE:67
  DeliveryController_7: controllers.Delivery.DeliveryController,
  // @LINE:75
  UserFinance_1: controllers.Finance.UserFinance,
  // @LINE:83
  AsyncController_2: controllers.AsyncController,
  // @LINE:86
  Assets_11: controllers.Assets,
  // @LINE:89
  OrderController_4: controllers.Order.OrderController,
  // @LINE:93
  AccountController_6: controllers.Order.AccountController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_5: controllers.Application.HomeController,
    // @LINE:15
    UserController_3: controllers.User.UserController,
    // @LINE:25
    StaffController_9: controllers.User.StaffController,
    // @LINE:36
    CustomerController_8: controllers.User.CustomerController,
    // @LINE:51
    MenuController_0: controllers.Order.MenuController,
    // @LINE:59
    KitchenController_10: controllers.Order.KitchenController,
    // @LINE:67
    DeliveryController_7: controllers.Delivery.DeliveryController,
    // @LINE:75
    UserFinance_1: controllers.Finance.UserFinance,
    // @LINE:83
    AsyncController_2: controllers.AsyncController,
    // @LINE:86
    Assets_11: controllers.Assets,
    // @LINE:89
    OrderController_4: controllers.Order.OrderController,
    // @LINE:93
    AccountController_6: controllers.Order.AccountController
  ) = this(errorHandler, HomeController_5, UserController_3, StaffController_9, CustomerController_8, MenuController_0, KitchenController_10, DeliveryController_7, UserFinance_1, AsyncController_2, Assets_11, OrderController_4, AccountController_6, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_5, UserController_3, StaffController_9, CustomerController_8, MenuController_0, KitchenController_10, DeliveryController_7, UserFinance_1, AsyncController_2, Assets_11, OrderController_4, AccountController_6, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
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
      """Customer Controller""",
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

  // @LINE:41
  private[this] lazy val controllers_User_CustomerController_create12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Register")))
  )
  private[this] lazy val controllers_User_CustomerController_create12_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_User_CustomerController_reverify13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/Registration/Reverify")))
  )
  private[this] lazy val controllers_User_CustomerController_reverify13_invoker = createInvoker(
    CustomerController_8.reverify(),
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
    CustomerController_8.completeRegistration(),
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

  // @LINE:51
  private[this] lazy val controllers_Order_MenuController_index16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Menu")))
  )
  private[this] lazy val controllers_Order_MenuController_index16_invoker = createInvoker(
    MenuController_0.index(),
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

  // @LINE:67
  private[this] lazy val controllers_Delivery_DeliveryController_index18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Delivery/User")))
  )
  private[this] lazy val controllers_Delivery_DeliveryController_index18_invoker = createInvoker(
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

  // @LINE:75
  private[this] lazy val controllers_Finance_UserFinance_addFunds19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("User/AddFunds")))
  )
  private[this] lazy val controllers_Finance_UserFinance_addFunds19_invoker = createInvoker(
    UserFinance_1.addFunds(),
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
    UserFinance_1.doAddFunds(),
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
  private[this] lazy val controllers_AsyncController_message21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message21_invoker = createInvoker(
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

  // @LINE:86
  private[this] lazy val controllers_Assets_versioned22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned22_invoker = createInvoker(
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

  // @LINE:89
  private[this] lazy val controllers_Order_OrderController_getMenu23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu")))
  )
  private[this] lazy val controllers_Order_OrderController_getMenu23_invoker = createInvoker(
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

  // @LINE:91
  private[this] lazy val controllers_Order_OrderController_switchMenu24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/"), DynamicPart("menutype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Order_OrderController_switchMenu24_invoker = createInvoker(
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

  // @LINE:93
  private[this] lazy val controllers_Order_AccountController_getSignUp25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Order_AccountController_getSignUp25_invoker = createInvoker(
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

  // @LINE:95
  private[this] lazy val controllers_Order_OrderController_addMealToOrder26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmealtoorder")))
  )
  private[this] lazy val controllers_Order_OrderController_addMealToOrder26_invoker = createInvoker(
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

  // @LINE:97
  private[this] lazy val controllers_Order_OrderController_getAddMealToMenu27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmeal")))
  )
  private[this] lazy val controllers_Order_OrderController_getAddMealToMenu27_invoker = createInvoker(
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

  // @LINE:99
  private[this] lazy val controllers_Order_OrderController_addMeal28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postmeal")))
  )
  private[this] lazy val controllers_Order_OrderController_addMeal28_invoker = createInvoker(
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

  // @LINE:101
  private[this] lazy val controllers_Order_AccountController_doLogin29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dologin")))
  )
  private[this] lazy val controllers_Order_AccountController_doLogin29_invoker = createInvoker(
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

  // @LINE:103
  private[this] lazy val controllers_Order_AccountController_doSignOut30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dosignout")))
  )
  private[this] lazy val controllers_Order_AccountController_doSignOut30_invoker = createInvoker(
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

  // @LINE:105
  private[this] lazy val controllers_Order_OrderController_getCart31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_Order_OrderController_getCart31_invoker = createInvoker(
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

  // @LINE:107
  private[this] lazy val controllers_Order_OrderController_removeMealFromOrder32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/removemeal")))
  )
  private[this] lazy val controllers_Order_OrderController_removeMealFromOrder32_invoker = createInvoker(
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

  // @LINE:109
  private[this] lazy val controllers_Order_OrderController_getSubmitPage33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/submit")))
  )
  private[this] lazy val controllers_Order_OrderController_getSubmitPage33_invoker = createInvoker(
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

  // @LINE:111
  private[this] lazy val controllers_Order_OrderController_submitCart34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/submitcart")))
  )
  private[this] lazy val controllers_Order_OrderController_submitCart34_invoker = createInvoker(
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

  // @LINE:113
  private[this] lazy val controllers_Order_OrderController_getHistoryPage35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history")))
  )
  private[this] lazy val controllers_Order_OrderController_getHistoryPage35_invoker = createInvoker(
    OrderController_4.getHistoryPage(),
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

  // @LINE:115
  private[this] lazy val controllers_Order_OrderController_getViewOrder36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history/order")))
  )
  private[this] lazy val controllers_Order_OrderController_getViewOrder36_invoker = createInvoker(
    OrderController_4.getViewOrder(fakeValue[String]),
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

  // @LINE:119
  private[this] lazy val controllers_Order_KitchenController_home37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen")))
  )
  private[this] lazy val controllers_Order_KitchenController_home37_invoker = createInvoker(
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

  // @LINE:123
  private[this] lazy val controllers_Order_KitchenController_getIngredientPage38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredients")))
  )
  private[this] lazy val controllers_Order_KitchenController_getIngredientPage38_invoker = createInvoker(
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

  // @LINE:125
  private[this] lazy val controllers_Order_KitchenController_getIngredientOrderPage39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredients/order")))
  )
  private[this] lazy val controllers_Order_KitchenController_getIngredientOrderPage39_invoker = createInvoker(
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

  // @LINE:127
  private[this] lazy val controllers_Order_KitchenController_editIngredient40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredient/order/op")))
  )
  private[this] lazy val controllers_Order_KitchenController_editIngredient40_invoker = createInvoker(
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

  // @LINE:129
  private[this] lazy val controllers_Order_KitchenController_getNewIngredientPage41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredient/ordernew")))
  )
  private[this] lazy val controllers_Order_KitchenController_getNewIngredientPage41_invoker = createInvoker(
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

  // @LINE:131
  private[this] lazy val controllers_Order_KitchenController_addIngredient42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/ingredient/add")))
  )
  private[this] lazy val controllers_Order_KitchenController_addIngredient42_invoker = createInvoker(
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

  // @LINE:135
  private[this] lazy val controllers_Order_KitchenController_getOrderPage43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders")))
  )
  private[this] lazy val controllers_Order_KitchenController_getOrderPage43_invoker = createInvoker(
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

  // @LINE:137
  private[this] lazy val controllers_Order_KitchenController_getPendingOrderPage44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/pendingorders")))
  )
  private[this] lazy val controllers_Order_KitchenController_getPendingOrderPage44_invoker = createInvoker(
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

  // @LINE:139
  private[this] lazy val controllers_Order_KitchenController_getProcessingOrderPage45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/processingorders")))
  )
  private[this] lazy val controllers_Order_KitchenController_getProcessingOrderPage45_invoker = createInvoker(
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

  // @LINE:141
  private[this] lazy val controllers_Order_KitchenController_getMealOrderPage46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders/mealorder")))
  )
  private[this] lazy val controllers_Order_KitchenController_getMealOrderPage46_invoker = createInvoker(
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

  // @LINE:143
  private[this] lazy val controllers_Order_KitchenController_updateOrderStatus47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kitchen/customerorders/mealorder/update")))
  )
  private[this] lazy val controllers_Order_KitchenController_updateOrderStatus47_invoker = createInvoker(
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

  // @LINE:146
  private[this] lazy val controllers_Application_HomeController_invalidRoute48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("path", """.+""",false)))
  )
  private[this] lazy val controllers_Application_HomeController_invalidRoute48_invoker = createInvoker(
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_HomeController_index0_route(params) =>
      call { 
        controllers_Application_HomeController_index0_invoker.call(HomeController_5.index())
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
  
    // @LINE:41
    case controllers_User_CustomerController_create12_route(params) =>
      call { 
        controllers_User_CustomerController_create12_invoker.call(CustomerController_8.create())
      }
  
    // @LINE:42
    case controllers_User_CustomerController_reverify13_route(params) =>
      call { 
        controllers_User_CustomerController_reverify13_invoker.call(CustomerController_8.reverify())
      }
  
    // @LINE:43
    case controllers_User_CustomerController_completeRegistration14_route(params) =>
      call { 
        controllers_User_CustomerController_completeRegistration14_invoker.call(CustomerController_8.completeRegistration())
      }
  
    // @LINE:44
    case controllers_User_CustomerController_update15_route(params) =>
      call { 
        controllers_User_CustomerController_update15_invoker.call(CustomerController_8.update())
      }
  
    // @LINE:51
    case controllers_Order_MenuController_index16_route(params) =>
      call { 
        controllers_Order_MenuController_index16_invoker.call(MenuController_0.index())
      }
  
    // @LINE:59
    case controllers_Order_KitchenController_index17_route(params) =>
      call { 
        controllers_Order_KitchenController_index17_invoker.call(KitchenController_10.index())
      }
  
    // @LINE:67
    case controllers_Delivery_DeliveryController_index18_route(params) =>
      call { 
        controllers_Delivery_DeliveryController_index18_invoker.call(DeliveryController_7.index())
      }
  
    // @LINE:75
    case controllers_Finance_UserFinance_addFunds19_route(params) =>
      call { 
        controllers_Finance_UserFinance_addFunds19_invoker.call(UserFinance_1.addFunds())
      }
  
    // @LINE:76
    case controllers_Finance_UserFinance_doAddFunds20_route(params) =>
      call { 
        controllers_Finance_UserFinance_doAddFunds20_invoker.call(UserFinance_1.doAddFunds())
      }
  
    // @LINE:83
    case controllers_AsyncController_message21_route(params) =>
      call { 
        controllers_AsyncController_message21_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:86
    case controllers_Assets_versioned22_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned22_invoker.call(Assets_11.versioned(path, file))
      }
  
    // @LINE:89
    case controllers_Order_OrderController_getMenu23_route(params) =>
      call { 
        controllers_Order_OrderController_getMenu23_invoker.call(OrderController_4.getMenu())
      }
  
    // @LINE:91
    case controllers_Order_OrderController_switchMenu24_route(params) =>
      call(params.fromPath[Integer]("menutype", None)) { (menutype) =>
        controllers_Order_OrderController_switchMenu24_invoker.call(OrderController_4.switchMenu(menutype))
      }
  
    // @LINE:93
    case controllers_Order_AccountController_getSignUp25_route(params) =>
      call { 
        controllers_Order_AccountController_getSignUp25_invoker.call(AccountController_6.getSignUp)
      }
  
    // @LINE:95
    case controllers_Order_OrderController_addMealToOrder26_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_Order_OrderController_addMealToOrder26_invoker.call(OrderController_4.addMealToOrder(mealId))
      }
  
    // @LINE:97
    case controllers_Order_OrderController_getAddMealToMenu27_route(params) =>
      call { 
        controllers_Order_OrderController_getAddMealToMenu27_invoker.call(OrderController_4.getAddMealToMenu)
      }
  
    // @LINE:99
    case controllers_Order_OrderController_addMeal28_route(params) =>
      call { 
        controllers_Order_OrderController_addMeal28_invoker.call(OrderController_4.addMeal)
      }
  
    // @LINE:101
    case controllers_Order_AccountController_doLogin29_route(params) =>
      call { 
        controllers_Order_AccountController_doLogin29_invoker.call(AccountController_6.doLogin())
      }
  
    // @LINE:103
    case controllers_Order_AccountController_doSignOut30_route(params) =>
      call { 
        controllers_Order_AccountController_doSignOut30_invoker.call(AccountController_6.doSignOut())
      }
  
    // @LINE:105
    case controllers_Order_OrderController_getCart31_route(params) =>
      call { 
        controllers_Order_OrderController_getCart31_invoker.call(OrderController_4.getCart())
      }
  
    // @LINE:107
    case controllers_Order_OrderController_removeMealFromOrder32_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_Order_OrderController_removeMealFromOrder32_invoker.call(OrderController_4.removeMealFromOrder(mealId))
      }
  
    // @LINE:109
    case controllers_Order_OrderController_getSubmitPage33_route(params) =>
      call { 
        controllers_Order_OrderController_getSubmitPage33_invoker.call(OrderController_4.getSubmitPage())
      }
  
    // @LINE:111
    case controllers_Order_OrderController_submitCart34_route(params) =>
      call { 
        controllers_Order_OrderController_submitCart34_invoker.call(OrderController_4.submitCart())
      }
  
    // @LINE:113
    case controllers_Order_OrderController_getHistoryPage35_route(params) =>
      call { 
        controllers_Order_OrderController_getHistoryPage35_invoker.call(OrderController_4.getHistoryPage())
      }
  
    // @LINE:115
    case controllers_Order_OrderController_getViewOrder36_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_OrderController_getViewOrder36_invoker.call(OrderController_4.getViewOrder(orderId))
      }
  
    // @LINE:119
    case controllers_Order_KitchenController_home37_route(params) =>
      call { 
        controllers_Order_KitchenController_home37_invoker.call(KitchenController_10.home())
      }
  
    // @LINE:123
    case controllers_Order_KitchenController_getIngredientPage38_route(params) =>
      call { 
        controllers_Order_KitchenController_getIngredientPage38_invoker.call(KitchenController_10.getIngredientPage())
      }
  
    // @LINE:125
    case controllers_Order_KitchenController_getIngredientOrderPage39_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_Order_KitchenController_getIngredientOrderPage39_invoker.call(KitchenController_10.getIngredientOrderPage(id))
      }
  
    // @LINE:127
    case controllers_Order_KitchenController_editIngredient40_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_Order_KitchenController_editIngredient40_invoker.call(KitchenController_10.editIngredient(id))
      }
  
    // @LINE:129
    case controllers_Order_KitchenController_getNewIngredientPage41_route(params) =>
      call { 
        controllers_Order_KitchenController_getNewIngredientPage41_invoker.call(KitchenController_10.getNewIngredientPage())
      }
  
    // @LINE:131
    case controllers_Order_KitchenController_addIngredient42_route(params) =>
      call { 
        controllers_Order_KitchenController_addIngredient42_invoker.call(KitchenController_10.addIngredient())
      }
  
    // @LINE:135
    case controllers_Order_KitchenController_getOrderPage43_route(params) =>
      call { 
        controllers_Order_KitchenController_getOrderPage43_invoker.call(KitchenController_10.getOrderPage())
      }
  
    // @LINE:137
    case controllers_Order_KitchenController_getPendingOrderPage44_route(params) =>
      call { 
        controllers_Order_KitchenController_getPendingOrderPage44_invoker.call(KitchenController_10.getPendingOrderPage())
      }
  
    // @LINE:139
    case controllers_Order_KitchenController_getProcessingOrderPage45_route(params) =>
      call { 
        controllers_Order_KitchenController_getProcessingOrderPage45_invoker.call(KitchenController_10.getProcessingOrderPage())
      }
  
    // @LINE:141
    case controllers_Order_KitchenController_getMealOrderPage46_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_KitchenController_getMealOrderPage46_invoker.call(KitchenController_10.getMealOrderPage(orderId))
      }
  
    // @LINE:143
    case controllers_Order_KitchenController_updateOrderStatus47_route(params) =>
      call(params.fromQuery[String]("orderId", None)) { (orderId) =>
        controllers_Order_KitchenController_updateOrderStatus47_invoker.call(KitchenController_10.updateOrderStatus(orderId))
      }
  
    // @LINE:146
    case controllers_Application_HomeController_invalidRoute48_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_HomeController_invalidRoute48_invoker.call(HomeController_5.invalidRoute(path))
      }
  }
}
