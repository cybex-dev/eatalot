
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cybex/Projects/project-eatalot/conf/routes
// @DATE:Sun Sep 24 22:44:55 SAST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  Assets_1: controllers.Assets,
  // @LINE:11
  OrderController_3: controllers.OrderController,
  // @LINE:15
  AccountController_2: controllers.AccountController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:11
    OrderController_3: controllers.OrderController,
    // @LINE:15
    AccountController_2: controllers.AccountController
  ) = this(errorHandler, HomeController_0, Assets_1, OrderController_3, AccountController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, OrderController_3, AccountController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
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
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:11
  private[this] lazy val controllers_OrderController_getMenu2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu")))
  )
  private[this] lazy val controllers_OrderController_getMenu2_invoker = createInvoker(
    OrderController_3.getMenu(),
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

  // @LINE:13
  private[this] lazy val controllers_OrderController_switchMenu3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/"), DynamicPart("menutype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_switchMenu3_invoker = createInvoker(
    OrderController_3.switchMenu(fakeValue[Integer]),
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

  // @LINE:15
  private[this] lazy val controllers_AccountController_getSignUp4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_AccountController_getSignUp4_invoker = createInvoker(
    AccountController_2.getSignUp,
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

  // @LINE:17
  private[this] lazy val controllers_OrderController_addMealToOrder5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmealtoorder")))
  )
  private[this] lazy val controllers_OrderController_addMealToOrder5_invoker = createInvoker(
    OrderController_3.addMealToOrder(fakeValue[String]),
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

  // @LINE:19
  private[this] lazy val controllers_OrderController_getAddMealToMenu6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmeal")))
  )
  private[this] lazy val controllers_OrderController_getAddMealToMenu6_invoker = createInvoker(
    OrderController_3.getAddMealToMenu,
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

  // @LINE:21
  private[this] lazy val controllers_OrderController_addMeal7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postmeal")))
  )
  private[this] lazy val controllers_OrderController_addMeal7_invoker = createInvoker(
    OrderController_3.addMeal,
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

  // @LINE:23
  private[this] lazy val controllers_AccountController_doLogin8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dologin")))
  )
  private[this] lazy val controllers_AccountController_doLogin8_invoker = createInvoker(
    AccountController_2.doLogin(),
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

  // @LINE:25
  private[this] lazy val controllers_AccountController_doSignOut9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dosignout")))
  )
  private[this] lazy val controllers_AccountController_doSignOut9_invoker = createInvoker(
    AccountController_2.doSignOut(),
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

  // @LINE:27
  private[this] lazy val controllers_OrderController_getCart10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_OrderController_getCart10_invoker = createInvoker(
    OrderController_3.getCart(),
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

  // @LINE:29
  private[this] lazy val controllers_OrderController_removeMealFromOrder11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/removemeal")))
  )
  private[this] lazy val controllers_OrderController_removeMealFromOrder11_invoker = createInvoker(
    OrderController_3.removeMealFromOrder(fakeValue[String]),
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

  // @LINE:31
  private[this] lazy val controllers_OrderController_submitCart12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit")))
  )
  private[this] lazy val controllers_OrderController_submitCart12_invoker = createInvoker(
    OrderController_3.submitCart(),
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
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_OrderController_getMenu2_route(params) =>
      call { 
        controllers_OrderController_getMenu2_invoker.call(OrderController_3.getMenu())
      }
  
    // @LINE:13
    case controllers_OrderController_switchMenu3_route(params) =>
      call(params.fromPath[Integer]("menutype", None)) { (menutype) =>
        controllers_OrderController_switchMenu3_invoker.call(OrderController_3.switchMenu(menutype))
      }
  
    // @LINE:15
    case controllers_AccountController_getSignUp4_route(params) =>
      call { 
        controllers_AccountController_getSignUp4_invoker.call(AccountController_2.getSignUp)
      }
  
    // @LINE:17
    case controllers_OrderController_addMealToOrder5_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_OrderController_addMealToOrder5_invoker.call(OrderController_3.addMealToOrder(mealId))
      }
  
    // @LINE:19
    case controllers_OrderController_getAddMealToMenu6_route(params) =>
      call { 
        controllers_OrderController_getAddMealToMenu6_invoker.call(OrderController_3.getAddMealToMenu)
      }
  
    // @LINE:21
    case controllers_OrderController_addMeal7_route(params) =>
      call { 
        controllers_OrderController_addMeal7_invoker.call(OrderController_3.addMeal)
      }
  
    // @LINE:23
    case controllers_AccountController_doLogin8_route(params) =>
      call { 
        controllers_AccountController_doLogin8_invoker.call(AccountController_2.doLogin())
      }
  
    // @LINE:25
    case controllers_AccountController_doSignOut9_route(params) =>
      call { 
        controllers_AccountController_doSignOut9_invoker.call(AccountController_2.doSignOut())
      }
  
    // @LINE:27
    case controllers_OrderController_getCart10_route(params) =>
      call { 
        controllers_OrderController_getCart10_invoker.call(OrderController_3.getCart())
      }
  
    // @LINE:29
    case controllers_OrderController_removeMealFromOrder11_route(params) =>
      call(params.fromQuery[String]("mealId", None)) { (mealId) =>
        controllers_OrderController_removeMealFromOrder11_invoker.call(OrderController_3.removeMealFromOrder(mealId))
      }
  
    // @LINE:31
    case controllers_OrderController_submitCart12_route(params) =>
      call { 
        controllers_OrderController_submitCart12_invoker.call(OrderController_3.submitCart())
      }
  }
}
