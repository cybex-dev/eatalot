
package views.html.Global.Static

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import Global.Html5.nav
/*2.2*/import controllers.Application.AppTags
/*3.2*/import controllers.Application.AppTags.AppCookie.UserType._
/*4.2*/import controllers.Application.AppTags.AppCookie.user_type
/*5.2*/import controllers.Application.AppTags.Session.SessionTags.{session_status, valid}
/*6.2*/import helper.CSRF

object nav_wrapper extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(nav_extension: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*14.2*/buildCustomerNav/*14.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.22*/("""
    """),format.raw/*15.5*/("""<li><a href=""""),_display_(/*15.19*/controllers/*15.30*/.User.routes.CustomerController.index()),format.raw/*15.69*/("""" class=""""),_display_(/*15.79*/standardMenuCSSClass),format.raw/*15.99*/(""""><img src=""""),_display_(/*15.112*/routes/*15.118*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*15.169*/(""""/>
        Dashboard</a>
    </li>
    <li>
        <a href="#" class="dropdown-toggle" id="ddlmenuItem" data-toggle="dropdown">
            Menu
            <i class="fa fa-angle-down"></i>
        </a>
        <ul class="dropdown-menu" role="menu" aria-labelledby="ddlmenuItem">
            <li role="presentation"><a role="menuitem" tabindex="-1" href=""""),_display_(/*24.77*/controllers/*24.88*/.Order.routes.OrderController.switchMenu(0)),format.raw/*24.131*/("""">
                Breakfasts</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href=""""),_display_(/*26.77*/controllers/*26.88*/.Order.routes.OrderController.switchMenu(1)),format.raw/*26.131*/("""">
                Lunches</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href=""""),_display_(/*28.77*/controllers/*28.88*/.Order.routes.OrderController.switchMenu(2)),format.raw/*28.131*/("""">
                Dinners</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#desserts">
                Desserts</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#snacks">
                Snacks</a></li>
        </ul>
    </li>

    <li><a href=""""),_display_(/*37.19*/CSRF(controllers.Order.routes.ScheduleController.index())),format.raw/*37.76*/("""">View Order Schedule</a></li>
    <li><a href=""""),_display_(/*38.19*/CSRF(controllers.Finance.routes.UserFinance.addFunds())),format.raw/*38.74*/("""">Add Funds</a> </li>
    <li><a href=""""),_display_(/*39.19*/CSRF(controllers.User.routes.CustomerController.orderHistory())),format.raw/*39.82*/("""">Order History</a></li>
    <li><a href=""""),_display_(/*40.19*/CSRF(controllers.User.routes.CustomerController.paymentHistory())),format.raw/*40.84*/("""">Payment History</a></li>
""")))};def /*43.2*/buildKitchenStaffNav/*43.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*43.26*/("""
    """),format.raw/*44.5*/("""<li><a href=""""),_display_(/*44.19*/controllers/*44.30*/.User.routes.KitchenStaffController.index()),format.raw/*44.73*/("""" class=""""),_display_(/*44.83*/standardMenuCSSClass),format.raw/*44.103*/(""""><img src=""""),_display_(/*44.116*/routes/*44.122*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*44.173*/(""""/>
        Dashboard</a>
    </li>
    <li><a href=""""),_display_(/*47.19*/controllers/*47.30*/.User.routes.KitchenStaffController.viewActiveOrders()),format.raw/*47.84*/("""" class=""""),_display_(/*47.94*/standardMenuCSSClass),format.raw/*47.114*/(""""><img src=""""),_display_(/*47.127*/routes/*47.133*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*47.184*/(""""/>
        Active Orders</a>
    </li>
    <li><a href=""""),_display_(/*50.19*/controllers/*50.30*/.User.routes.KitchenStaffController.viewQueuedOrders()),format.raw/*50.84*/("""" class=""""),_display_(/*50.94*/standardMenuCSSClass),format.raw/*50.114*/(""""><img src=""""),_display_(/*50.127*/routes/*50.133*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*50.184*/(""""/>
        Queued Orders</a>
    </li>
    <li><a href=""""),_display_(/*53.19*/controllers/*53.30*/.User.routes.KitchenStaffController.viewCompletedOrders()),format.raw/*53.87*/("""" class=""""),_display_(/*53.97*/standardMenuCSSClass),format.raw/*53.117*/(""""><img src=""""),_display_(/*53.130*/routes/*53.136*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*53.187*/(""""/>
        Completed Orders</a>
    </li>
""")))};def /*58.2*/buildDeliveryNav/*58.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*58.22*/("""
    """),format.raw/*59.5*/("""<li><a href=""""),_display_(/*59.19*/controllers/*59.30*/.User.routes.DeliveryStaffController.index()),format.raw/*59.74*/("""" class=""""),_display_(/*59.84*/standardMenuCSSClass),format.raw/*59.104*/(""""><img src=""""),_display_(/*59.117*/routes/*59.123*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*59.174*/(""""/>
        Dashboard</a>
    </li>
    <li><a href=""""),_display_(/*62.19*/controllers/*62.30*/.User.routes.DeliveryStaffController.viewActiveDeliveries()),format.raw/*62.89*/("""" class=""""),_display_(/*62.99*/standardMenuCSSClass),format.raw/*62.119*/(""""><img src=""""),_display_(/*62.132*/routes/*62.138*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*62.189*/(""""/>
        Active Deliveries</a>
    </li>
    <li><a href=""""),_display_(/*65.19*/controllers/*65.30*/.User.routes.DeliveryStaffController.viewWaitingDeliveries()),format.raw/*65.90*/("""" class=""""),_display_(/*65.100*/standardMenuCSSClass),format.raw/*65.120*/(""""><img src=""""),_display_(/*65.133*/routes/*65.139*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*65.190*/(""""/>
        Waiting Deliveries</a>
    </li>
    <li><a href=""""),_display_(/*68.19*/controllers/*68.30*/.User.routes.DeliveryStaffController.viewCompletedDeliveries()),format.raw/*68.92*/("""" class=""""),_display_(/*68.102*/standardMenuCSSClass),format.raw/*68.122*/(""""><img src=""""),_display_(/*68.135*/routes/*68.141*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*68.192*/(""""/>
        Completed Deliveries</a>
    </li>
""")))};def /*73.2*/buildAdminNav/*73.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*73.19*/("""
    """),format.raw/*74.5*/("""<li><a href=""""),_display_(/*74.19*/controllers/*74.30*/.User.routes.CustomerController.index()),format.raw/*74.69*/("""" class=""""),_display_(/*74.79*/standardMenuCSSClass),format.raw/*74.99*/(""""><img src=""""),_display_(/*74.112*/routes/*74.118*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*74.169*/(""""/>
        Dashboard</a>
    </li>
    <li><a href=""""),_display_(/*77.19*/controllers/*77.30*/.User.routes.AdminController.manageUsers()),format.raw/*77.72*/("""" class=""""),_display_(/*77.82*/standardMenuCSSClass),format.raw/*77.102*/(""""><img src=""""),_display_(/*77.115*/routes/*77.121*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*77.172*/(""""/>
        Manage Users</a>
    </li>
    <li><a href=""""),_display_(/*80.19*/controllers/*80.30*/.User.routes.AdminController.manageMeals()),format.raw/*80.72*/("""" class=""""),_display_(/*80.82*/standardMenuCSSClass),format.raw/*80.102*/(""""><img src=""""),_display_(/*80.115*/routes/*80.121*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*80.172*/(""""/>
        Manage Meals</a>
    </li>
    <li><a href=""""),_display_(/*83.19*/controllers/*83.30*/.User.routes.AdminController.manageDiscounts()),format.raw/*83.76*/("""" class=""""),_display_(/*83.86*/standardMenuCSSClass),format.raw/*83.106*/(""""><img src=""""),_display_(/*83.119*/routes/*83.125*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*83.176*/(""""/>
        Set Discounts</a>
    </li>
""")))};def /*88.2*/standardMenuCSSClass/*88.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*88.26*/("""
    """),format.raw/*89.5*/(""""menu-top-active nav-text-enlarge"
""")))};def /*92.2*/buildBasicNav/*92.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*92.19*/("""
    """),format.raw/*93.5*/("""<li><a href=""""),_display_(/*93.19*/controllers/*93.30*/.Application.routes.HomeController.index()),format.raw/*93.72*/("""" class=""""),_display_(/*93.82*/standardMenuCSSClass),format.raw/*93.102*/("""">
        Home</a>
    </li>
    <li>
        <a href="#" class="dropdown-toggle """),_display_(/*97.45*/standardMenuCSSClass),format.raw/*97.65*/("""" id="ddlmenuItem" data-toggle="dropdown">
            Menu
            <i class="fa fa-angle-down"></i>
        </a>
        <ul class="dropdown-menu" role="menu" aria-labelledby="ddlmenuItem">
            <li role="presentation"><a role="menuitem" tabindex="-1" href=""""),_display_(/*102.77*/controllers/*102.88*/.Order.routes.OrderController.switchMenu(0)),format.raw/*102.131*/("""">
                Breakfasts</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href=""""),_display_(/*104.77*/controllers/*104.88*/.Order.routes.OrderController.switchMenu(1)),format.raw/*104.131*/("""">
                Lunches</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href=""""),_display_(/*106.77*/controllers/*106.88*/.Order.routes.OrderController.switchMenu(2)),format.raw/*106.131*/("""">
                Dinners</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#desserts">
                Desserts</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#snacks">
                Snacks</a></li>
        </ul>
    </li>
    <li><a href="#" class=""""),_display_(/*114.29*/standardMenuCSSClass),format.raw/*114.49*/("""">
        Specials</a>
    </li>
    <li><a href=""""),_display_(/*117.19*/controllers/*117.30*/.Application.routes.HomeController.unknown()),format.raw/*117.74*/("""" class=""""),_display_(/*117.84*/standardMenuCSSClass),format.raw/*117.104*/("""">
        Contact Us</a>
    </li>
""")))};def /*158.2*/getProfileButtons/*158.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*158.23*/("""
"""),_display_(/*159.2*/if(isLoggedIn.equalsIgnoreCase("true"))/*159.41*/ {_display_(Seq[Any](format.raw/*159.43*/("""
    """),_display_(/*160.6*/getLogoutButton),format.raw/*160.21*/("""
""")))}/*161.3*/else/*161.8*/{_display_(Seq[Any](format.raw/*161.9*/("""
    """),_display_(/*162.6*/getLoginButton),format.raw/*162.20*/("""
""")))}),format.raw/*163.2*/("""
""")))};def /*166.2*/getLoginButton/*166.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*166.20*/("""
    """),format.raw/*167.5*/("""<a href=""""),_display_(/*167.15*/controllers/*167.26*/.User.routes.UserController.login()),format.raw/*167.61*/("""" class="btn btn-success pull-center">
        Login
    </a>
""")))};def /*172.2*/getLogoutButton/*172.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*172.21*/("""
    """),format.raw/*173.5*/("""<a href=""""),_display_(/*173.15*/controllers/*173.26*/.User.routes.UserController.logout()),format.raw/*173.62*/("""" class="btn btn-danger pull-center">
        Logout
    </a>
""")))};def /*211.2*/getUserSideButton/*211.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*211.23*/("""
    """),format.raw/*212.5*/("""<a href=""""),_display_(/*212.15*/getUserSettingsLink),format.raw/*212.34*/("""">
        <img class="settings-icon" src=""""),_display_(/*213.42*/routes/*213.48*/.Assets.versioned("images/navigation/settings.png")),format.raw/*213.99*/("""">
    </a>
""")))};def /*217.2*/getRightBlockUserInfo/*217.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*217.27*/("""
    """),format.raw/*218.5*/("""<ul class="top">
        <label class="media-heading navbar-user pull-center">
            Welcome, """),_display_(/*220.23*/if(isLoggedIn.equalsIgnoreCase("true"))/*220.62*/ {_display_(Seq[Any](format.raw/*220.64*/("""
            """),format.raw/*221.13*/("""<a href=""""),_display_(/*221.23*/getUserHomeLink),format.raw/*221.38*/("""">
            """),_display_(/*222.14*/session()/*222.23*/.get(AppTags.Session.SessionTags.display_name.toString)),format.raw/*222.78*/("""
            """),format.raw/*223.13*/("""</a>
            """),_display_(/*224.14*/getUserSideButton),format.raw/*224.31*/("""
        """)))}/*225.11*/else/*225.16*/{_display_(Seq[Any](format.raw/*225.17*/("""
            """),format.raw/*226.13*/("""New User
        """)))}),format.raw/*227.10*/("""
        """),format.raw/*228.9*/("""</label>
    </ul>
    <ul class="bottom text-center">
    """),_display_(/*231.6*/getProfileButtons),format.raw/*231.23*/("""
    """),format.raw/*232.5*/("""</ul>
""")))};def /*235.2*/nav_section/*235.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*235.17*/("""
    """),format.raw/*236.5*/("""<section class="menu-section">
        <a class="top app-logo" href=""""),_display_(/*237.40*/getUserHomeLink),format.raw/*237.55*/("""">
            <img src=""""),_display_(/*238.24*/routes/*238.30*/.Assets.versioned("images/logo.png")),format.raw/*238.66*/(""""/>
        </a>
        <div class="navbar navbar-inverse set-radius-zero">
            <div class="container">
                <div class="row ">
                    <div class="col-md-pull-12">
                        <div class="navbar-collapse collapse ">
                            <ul class="nav navbar-nav navbar-left navbar-top nav-text-enlarge">
                            """),_display_(/*246.30*/getUserNav),format.raw/*246.40*/("""
                            """),format.raw/*247.29*/("""</ul>
                            <ul class="right-container navbar-btn navbar-right">
                            """),_display_(/*249.30*/getRightBlockUserInfo),format.raw/*249.51*/("""
                            """),format.raw/*250.29*/("""</ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
""")))};def /*10.2*/getUserType/*10.13*/ = {{
    session().get(user_type.toString)
}};def /*122.2*/getUserNav/*122.12*/ = {{
    if(!session().containsKey(session_status.toString)) {
        buildBasicNav
    } else {
        var userType = getUserType
        if(userType.equalsIgnoreCase(KITCHEN.toString)) {
            buildKitchenStaffNav
        } else if(userType.equalsIgnoreCase(DELIVERY.toString)) {
            buildDeliveryNav
        } else if(userType.equalsIgnoreCase(ADMIN.toString)) {
            buildAdminNav
        } else {
            buildCustomerNav
        }
    }
}};def /*139.2*/getUserHomeLink/*139.17*/ = {{
    if(!session().containsKey(session_status.toString)) {
        controllers.Application.routes.HomeController.index()
    } else {
        var userType = getUserType
        if(userType.equalsIgnoreCase(CUSTOMER.toString)) {
            controllers.User.routes.CustomerController.index()
        } else if(userType.equalsIgnoreCase(KITCHEN.toString)) {
            controllers.User.routes.KitchenStaffController.index()
        } else if(userType.equalsIgnoreCase(DELIVERY.toString)) {
            controllers.User.routes.DeliveryStaffController.index()
        } else if(userType.equalsIgnoreCase(ADMIN.toString)) {
            controllers.User.routes.AdminController.index()
        } else {
            controllers.Application.routes.HomeController.unknown()
        }
    }
}};def /*178.2*/isLoggedIn/*178.12*/ = {{
    if(session().containsKey(session_status.toString)) {
        if(session().get(session_status.toString).equalsIgnoreCase(valid.toString)) {
            "true"
        }
        else {
            "false"
        }
    }
    else {
        "false"
    }
}};def /*192.2*/getUserSettingsLink/*192.21*/ = {{
    if(!session().containsKey(session_status.toString)) {
        controllers.Application.routes.HomeController.forbiddenAccess()
    } else {
        var userType = getUserType
        if(userType.equalsIgnoreCase(CUSTOMER.toString)) {
            controllers.User.routes.CustomerController.edit()
        } else if(userType.equalsIgnoreCase(KITCHEN.toString)) {
            controllers.User.routes.KitchenStaffController.edit()
        } else if(userType.equalsIgnoreCase(DELIVERY.toString)) {
            controllers.User.routes.DeliveryStaffController.edit()
        } else if(userType.equalsIgnoreCase(ADMIN.toString)) {
            controllers.User.routes.AdminController.edit()
        } else {
            controllers.Application.routes.HomeController.forbiddenAccess()
        }
    }
}};
Seq[Any](format.raw/*8.23*/("""

"""),format.raw/*12.2*/("""

"""),format.raw/*41.2*/("""

"""),format.raw/*56.2*/("""

"""),format.raw/*71.2*/("""

"""),format.raw/*86.2*/("""

"""),format.raw/*90.2*/("""

"""),format.raw/*120.2*/("""

"""),format.raw/*137.2*/("""

"""),format.raw/*156.2*/("""

"""),format.raw/*164.2*/("""

"""),format.raw/*170.2*/("""

"""),format.raw/*176.2*/("""

"""),format.raw/*190.2*/("""

"""),format.raw/*209.2*/("""

"""),format.raw/*215.2*/("""

"""),format.raw/*233.2*/("""

"""),format.raw/*257.2*/("""


"""),_display_(/*260.2*/nav/*260.5*/.apply("null", nav_section)))
      }
    }
  }

  def render(nav_extension:Html): play.twirl.api.HtmlFormat.Appendable = apply(nav_extension)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (nav_extension) => apply(nav_extension)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 09:12:57 SAST 2017
                  SOURCE: /home/cybex/Projects/eatalot-temp/app/views/Global/Static/nav_wrapper.scala.html
                  HASH: a153c8c850258bf0a66e1ffab21740221ae39332
                  MATRIX: 665->1|696->26|742->66|809->127|875->187|965->271|1292->292|1392->375|1417->391|1498->395|1530->400|1571->414|1591->425|1651->464|1688->474|1729->494|1770->507|1786->513|1859->564|2244->922|2264->933|2329->976|2471->1091|2491->1102|2556->1145|2695->1257|2715->1268|2780->1311|3124->1628|3202->1685|3278->1734|3354->1789|3421->1829|3505->1892|3575->1935|3661->2000|3712->2031|3741->2051|3822->2055|3854->2060|3895->2074|3915->2085|3979->2128|4016->2138|4058->2158|4099->2171|4115->2177|4188->2228|4269->2282|4289->2293|4364->2347|4401->2357|4443->2377|4484->2390|4500->2396|4573->2447|4658->2505|4678->2516|4753->2570|4790->2580|4832->2600|4873->2613|4889->2619|4962->2670|5047->2728|5067->2739|5145->2796|5182->2806|5224->2826|5265->2839|5281->2845|5354->2896|5421->2943|5446->2959|5527->2963|5559->2968|5600->2982|5620->2993|5685->3037|5722->3047|5764->3067|5805->3080|5821->3086|5894->3137|5975->3191|5995->3202|6075->3261|6112->3271|6154->3291|6195->3304|6211->3310|6284->3361|6373->3423|6393->3434|6474->3494|6512->3504|6554->3524|6595->3537|6611->3543|6684->3594|6774->3657|6794->3668|6877->3730|6915->3740|6957->3760|6998->3773|7014->3779|7087->3830|7158->3881|7180->3894|7261->3898|7293->3903|7334->3917|7354->3928|7414->3967|7451->3977|7492->3997|7533->4010|7549->4016|7622->4067|7703->4121|7723->4132|7786->4174|7823->4184|7865->4204|7906->4217|7922->4223|7995->4274|8079->4331|8099->4342|8162->4384|8199->4394|8241->4414|8282->4427|8298->4433|8371->4484|8455->4541|8475->4552|8542->4598|8579->4608|8621->4628|8662->4641|8678->4647|8751->4698|8815->4742|8844->4762|8925->4766|8957->4771|9016->4810|9038->4823|9119->4827|9151->4832|9192->4846|9212->4857|9275->4899|9312->4909|9354->4929|9464->5012|9505->5032|9804->5303|9825->5314|9891->5357|10034->5472|10055->5483|10121->5526|10261->5638|10282->5649|10348->5692|10702->6018|10744->6038|10824->6090|10845->6101|10911->6145|10949->6155|10992->6175|11053->7505|11080->7522|11162->7526|11191->7528|11240->7567|11281->7569|11314->7575|11351->7590|11372->7593|11385->7598|11424->7599|11457->7605|11493->7619|11526->7621|11552->7626|11576->7640|11658->7644|11691->7649|11729->7659|11750->7670|11807->7705|11894->7771|11919->7786|12001->7790|12034->7795|12072->7805|12093->7816|12151->7852|12238->9017|12265->9034|12347->9038|12380->9043|12418->9053|12459->9072|12531->9116|12547->9122|12620->9173|12657->9189|12688->9210|12770->9214|12803->9219|12932->9320|12981->9359|13022->9361|13064->9374|13102->9384|13139->9399|13183->9415|13202->9424|13279->9479|13321->9492|13367->9510|13406->9527|13436->9538|13450->9543|13490->9544|13532->9557|13582->9575|13619->9584|13706->9644|13745->9661|13778->9666|13809->9676|13830->9687|13912->9691|13945->9696|14043->9766|14080->9781|14134->9807|14150->9813|14208->9849|14622->10235|14654->10245|14712->10274|14856->10390|14899->10411|14957->10440|15117->316|15137->327|15197->6215|15217->6225|15704->6700|15729->6715|16531->7918|16551->7928|16829->8194|16858->8213|17689->313|17718->372|17747->2028|17776->2940|17805->3878|17834->4739|17863->4807|17893->6212|17923->6697|17953->7502|17983->7623|18013->7768|18043->7915|18073->8191|18103->9014|18133->9186|18163->9673|18193->10577|18224->10581|18236->10584
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->6|34->8|38->14|38->14|40->14|41->15|41->15|41->15|41->15|41->15|41->15|41->15|41->15|41->15|50->24|50->24|50->24|52->26|52->26|52->26|54->28|54->28|54->28|63->37|63->37|64->38|64->38|65->39|65->39|66->40|66->40|67->43|67->43|69->43|70->44|70->44|70->44|70->44|70->44|70->44|70->44|70->44|70->44|73->47|73->47|73->47|73->47|73->47|73->47|73->47|73->47|76->50|76->50|76->50|76->50|76->50|76->50|76->50|76->50|79->53|79->53|79->53|79->53|79->53|79->53|79->53|79->53|82->58|82->58|84->58|85->59|85->59|85->59|85->59|85->59|85->59|85->59|85->59|85->59|88->62|88->62|88->62|88->62|88->62|88->62|88->62|88->62|91->65|91->65|91->65|91->65|91->65|91->65|91->65|91->65|94->68|94->68|94->68|94->68|94->68|94->68|94->68|94->68|97->73|97->73|99->73|100->74|100->74|100->74|100->74|100->74|100->74|100->74|100->74|100->74|103->77|103->77|103->77|103->77|103->77|103->77|103->77|103->77|106->80|106->80|106->80|106->80|106->80|106->80|106->80|106->80|109->83|109->83|109->83|109->83|109->83|109->83|109->83|109->83|112->88|112->88|114->88|115->89|116->92|116->92|118->92|119->93|119->93|119->93|119->93|119->93|119->93|123->97|123->97|128->102|128->102|128->102|130->104|130->104|130->104|132->106|132->106|132->106|140->114|140->114|143->117|143->117|143->117|143->117|143->117|146->158|146->158|148->158|149->159|149->159|149->159|150->160|150->160|151->161|151->161|151->161|152->162|152->162|153->163|154->166|154->166|156->166|157->167|157->167|157->167|157->167|160->172|160->172|162->172|163->173|163->173|163->173|163->173|166->211|166->211|168->211|169->212|169->212|169->212|170->213|170->213|170->213|172->217|172->217|174->217|175->218|177->220|177->220|177->220|178->221|178->221|178->221|179->222|179->222|179->222|180->223|181->224|181->224|182->225|182->225|182->225|183->226|184->227|185->228|188->231|188->231|189->232|190->235|190->235|192->235|193->236|194->237|194->237|195->238|195->238|195->238|203->246|203->246|204->247|206->249|206->249|207->250|214->10|214->10|216->122|216->122|231->139|231->139|248->178|248->178|260->192|260->192|278->8|280->12|282->41|284->56|286->71|288->86|290->90|292->120|294->137|296->156|298->164|300->170|302->176|304->190|306->209|308->215|310->233|312->257|315->260|315->260
                  -- GENERATED --
              */
          