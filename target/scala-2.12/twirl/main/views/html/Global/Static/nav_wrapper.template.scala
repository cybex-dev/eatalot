
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
/*4.2*/import controllers.Application.AppTags.Session.SessionTags.session_status
/*5.2*/import controllers.Application.AppTags.Session.SessionTags.valid
/*6.2*/import controllers.Application.AppTags.AppCookie.user_type

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
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#breakfasts">
                Breakfasts</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#lunches">
                Lunches</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#dinners">
                Dinners</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#desserts">
                Desserts</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#snacks">
                Snacks</a></li>
        </ul>
    </li>

    <li><a href=""""),_display_(/*37.19*/controllers/*37.30*/.Order.routes.ScheduleController.index()),format.raw/*37.70*/("""">View Order Schedule</a></li>
    <li><a href=""""),_display_(/*38.19*/controllers/*38.30*/.Finance.routes.UserFinance.addFunds()),format.raw/*38.68*/("""">Add Funds</a> </li>
    <li><a href=""""),_display_(/*39.19*/controllers/*39.30*/.User.routes.CustomerController.orderHistory()),format.raw/*39.76*/("""">Order History</a></li>
    <li><a href=""""),_display_(/*40.19*/controllers/*40.30*/.User.routes.CustomerController.paymentHistory()),format.raw/*40.78*/("""">Payment History</a></li>
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
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#breakfasts">
                Breakfasts</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#lunches">
                Lunches</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#dinners">
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
                  DATE: Sat Oct 14 17:42:48 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/nav_wrapper.scala.html
                  HASH: 1bb8176ab880f158fff549f5cf365af0395b1534
                  MATRIX: 665->1|696->26|742->66|809->127|890->202|962->268|1329->329|1429->412|1454->428|1535->432|1567->437|1608->451|1628->462|1688->501|1725->511|1766->531|1807->544|1823->550|1896->601|2849->1527|2869->1538|2930->1578|3006->1627|3026->1638|3085->1676|3152->1716|3172->1727|3239->1773|3309->1816|3329->1827|3398->1875|3449->1906|3478->1926|3559->1930|3591->1935|3632->1949|3652->1960|3716->2003|3753->2013|3795->2033|3836->2046|3852->2052|3925->2103|4006->2157|4026->2168|4101->2222|4138->2232|4180->2252|4221->2265|4237->2271|4310->2322|4395->2380|4415->2391|4490->2445|4527->2455|4569->2475|4610->2488|4626->2494|4699->2545|4784->2603|4804->2614|4882->2671|4919->2681|4961->2701|5002->2714|5018->2720|5091->2771|5158->2818|5183->2834|5264->2838|5296->2843|5337->2857|5357->2868|5422->2912|5459->2922|5501->2942|5542->2955|5558->2961|5631->3012|5712->3066|5732->3077|5812->3136|5849->3146|5891->3166|5932->3179|5948->3185|6021->3236|6110->3298|6130->3309|6211->3369|6249->3379|6291->3399|6332->3412|6348->3418|6421->3469|6511->3532|6531->3543|6614->3605|6652->3615|6694->3635|6735->3648|6751->3654|6824->3705|6895->3756|6917->3769|6998->3773|7030->3778|7071->3792|7091->3803|7151->3842|7188->3852|7229->3872|7270->3885|7286->3891|7359->3942|7440->3996|7460->4007|7523->4049|7560->4059|7602->4079|7643->4092|7659->4098|7732->4149|7816->4206|7836->4217|7899->4259|7936->4269|7978->4289|8019->4302|8035->4308|8108->4359|8192->4416|8212->4427|8279->4473|8316->4483|8358->4503|8399->4516|8415->4522|8488->4573|8552->4617|8581->4637|8662->4641|8694->4646|8753->4685|8775->4698|8856->4702|8888->4707|8929->4721|8949->4732|9012->4774|9049->4784|9091->4804|9201->4887|9242->4907|10118->5755|10160->5775|10240->5827|10261->5838|10327->5882|10365->5892|10408->5912|10469->7242|10496->7259|10578->7263|10607->7265|10656->7304|10697->7306|10730->7312|10767->7327|10788->7330|10801->7335|10840->7336|10873->7342|10909->7356|10942->7358|10968->7363|10992->7377|11074->7381|11107->7386|11145->7396|11166->7407|11223->7442|11310->7508|11335->7523|11417->7527|11450->7532|11488->7542|11509->7553|11567->7589|11654->8754|11681->8771|11763->8775|11796->8780|11834->8790|11875->8809|11947->8853|11963->8859|12036->8910|12073->8926|12104->8947|12186->8951|12219->8956|12348->9057|12397->9096|12438->9098|12480->9111|12518->9121|12555->9136|12599->9152|12618->9161|12695->9216|12737->9229|12783->9247|12822->9264|12852->9275|12866->9280|12906->9281|12948->9294|12998->9312|13035->9321|13122->9381|13161->9398|13194->9403|13225->9413|13246->9424|13328->9428|13361->9433|13459->9503|13496->9518|13550->9544|13566->9550|13624->9586|14038->9972|14070->9982|14128->10011|14272->10127|14315->10148|14373->10177|14533->353|14553->364|14613->5952|14633->5962|15120->6437|15145->6452|15947->7655|15967->7665|16245->7931|16274->7950|17105->350|17134->409|17163->1903|17192->2815|17221->3753|17250->4614|17279->4682|17309->5949|17339->6434|17369->7239|17399->7360|17429->7505|17459->7652|17489->7928|17519->8751|17549->8923|17579->9410|17609->10314|17640->10318|17652->10321
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->6|34->8|38->14|38->14|40->14|41->15|41->15|41->15|41->15|41->15|41->15|41->15|41->15|41->15|63->37|63->37|63->37|64->38|64->38|64->38|65->39|65->39|65->39|66->40|66->40|66->40|67->43|67->43|69->43|70->44|70->44|70->44|70->44|70->44|70->44|70->44|70->44|70->44|73->47|73->47|73->47|73->47|73->47|73->47|73->47|73->47|76->50|76->50|76->50|76->50|76->50|76->50|76->50|76->50|79->53|79->53|79->53|79->53|79->53|79->53|79->53|79->53|82->58|82->58|84->58|85->59|85->59|85->59|85->59|85->59|85->59|85->59|85->59|85->59|88->62|88->62|88->62|88->62|88->62|88->62|88->62|88->62|91->65|91->65|91->65|91->65|91->65|91->65|91->65|91->65|94->68|94->68|94->68|94->68|94->68|94->68|94->68|94->68|97->73|97->73|99->73|100->74|100->74|100->74|100->74|100->74|100->74|100->74|100->74|100->74|103->77|103->77|103->77|103->77|103->77|103->77|103->77|103->77|106->80|106->80|106->80|106->80|106->80|106->80|106->80|106->80|109->83|109->83|109->83|109->83|109->83|109->83|109->83|109->83|112->88|112->88|114->88|115->89|116->92|116->92|118->92|119->93|119->93|119->93|119->93|119->93|119->93|123->97|123->97|140->114|140->114|143->117|143->117|143->117|143->117|143->117|146->158|146->158|148->158|149->159|149->159|149->159|150->160|150->160|151->161|151->161|151->161|152->162|152->162|153->163|154->166|154->166|156->166|157->167|157->167|157->167|157->167|160->172|160->172|162->172|163->173|163->173|163->173|163->173|166->211|166->211|168->211|169->212|169->212|169->212|170->213|170->213|170->213|172->217|172->217|174->217|175->218|177->220|177->220|177->220|178->221|178->221|178->221|179->222|179->222|179->222|180->223|181->224|181->224|182->225|182->225|182->225|183->226|184->227|185->228|188->231|188->231|189->232|190->235|190->235|192->235|193->236|194->237|194->237|195->238|195->238|195->238|203->246|203->246|204->247|206->249|206->249|207->250|214->10|214->10|216->122|216->122|231->139|231->139|248->178|248->178|260->192|260->192|278->8|280->12|282->41|284->56|286->71|288->86|290->90|292->120|294->137|296->156|298->164|300->170|302->176|304->190|306->209|308->215|310->233|312->257|315->260|315->260
                  -- GENERATED --
              */
          