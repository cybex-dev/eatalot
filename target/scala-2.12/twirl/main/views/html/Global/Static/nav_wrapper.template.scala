
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
    """),format.raw/*15.5*/("""<li><a href=""""),_display_(/*15.19*/controllers/*15.30*/.User.routes.CustomerController.index()),format.raw/*15.69*/("""" class=""""),_display_(/*15.79*/standardNavIconCSSClass),format.raw/*15.102*/(""""><img class="nav-icon large-icon" src=""""),_display_(/*15.143*/routes/*15.149*/.Assets.versioned("images/icons/dashboard.png")),format.raw/*15.196*/(""""/></a>
    </li>
    <li>
        <a href="#" class="dropdown-toggle """),_display_(/*18.45*/standardMenuCSSClass),format.raw/*18.65*/("""" id="ddlmenuItem" data-toggle="dropdown">
            Menu
            <i class="fa fa-angle-down"></i>
        </a>
        <ul class="dropdown-menu" role="menu" aria-labelledby="ddlmenuItem">
            <li role="presentation"><a role="menuitem" tabindex="-1" href=""""),_display_(/*23.77*/controllers/*23.88*/.Order.routes.OrderController.switchMenu(0)),format.raw/*23.131*/("""">
                Breakfasts</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href=""""),_display_(/*25.77*/controllers/*25.88*/.Order.routes.OrderController.switchMenu(1)),format.raw/*25.131*/("""">
                Lunches</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href=""""),_display_(/*27.77*/controllers/*27.88*/.Order.routes.OrderController.switchMenu(2)),format.raw/*27.131*/("""">
                Dinners</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#desserts">
                Desserts</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#snacks">
                Snacks</a></li>
        </ul>
    </li>

    <li><a class=""""),_display_(/*36.20*/standardMenuCSSClass),format.raw/*36.40*/("""" href=""""),_display_(/*36.49*/CSRF(controllers.Finance.routes.UserFinanceController.addFunds())),format.raw/*36.114*/("""">
        Add Funds</a></li>
    <li><a class=""""),_display_(/*38.20*/standardMenuCSSClass),format.raw/*38.40*/("""" href=""""),_display_(/*38.49*/CSRF(controllers.Order.routes.ScheduleController.index())),format.raw/*38.106*/("""">
        Schedule</a></li>
    <li><a class=""""),_display_(/*40.20*/standardMenuCSSClass),format.raw/*40.40*/("""" href=""""),_display_(/*40.49*/CSRF(controllers.User.routes.CustomerController.orderHistory())),format.raw/*40.112*/("""">
        Orders</a></li>
    <li><a class=""""),_display_(/*42.20*/standardMenuCSSClass),format.raw/*42.40*/("""" href=""""),_display_(/*42.49*/CSRF(controllers.User.routes.CustomerController.paymentHistory())),format.raw/*42.114*/("""">
        Payments</a></li>
""")))};def /*46.2*/buildKitchenStaffNav/*46.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*46.26*/("""
    """),format.raw/*47.5*/("""<li><a href=""""),_display_(/*47.19*/controllers/*47.30*/.User.routes.KitchenStaffController.index()),format.raw/*47.73*/("""" class=""""),_display_(/*47.83*/standardNavIconCSSClass),format.raw/*47.106*/(""""><img class="nav-icon large-icon " src=""""),_display_(/*47.148*/routes/*47.154*/.Assets.versioned("images/icons/dashboard.png")),format.raw/*47.201*/(""""/>
    </a>
    </li>
    <li><a href=""""),_display_(/*50.19*/controllers/*50.30*/.User.routes.KitchenStaffController.viewActiveOrders()),format.raw/*50.84*/("""" class=""""),_display_(/*50.94*/standardMenuCSSClass),format.raw/*50.114*/("""">
        Active Orders</a>
    </li>
    <li><a href=""""),_display_(/*53.19*/controllers/*53.30*/.User.routes.KitchenStaffController.viewQueuedOrders()),format.raw/*53.84*/("""" class=""""),_display_(/*53.94*/standardMenuCSSClass),format.raw/*53.114*/("""">
        Queued Orders</a>
    </li>
    <li><a href=""""),_display_(/*56.19*/controllers/*56.30*/.User.routes.KitchenStaffController.viewCompletedOrders()),format.raw/*56.87*/("""" class=""""),_display_(/*56.97*/standardMenuCSSClass),format.raw/*56.117*/("""">
        Completed Orders</a>
    </li>
""")))};def /*61.2*/buildDeliveryNav/*61.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*61.22*/("""
    """),format.raw/*62.5*/("""<li><a href=""""),_display_(/*62.19*/controllers/*62.30*/.User.routes.DeliveryStaffController.index()),format.raw/*62.74*/("""" class=""""),_display_(/*62.84*/standardNavIconCSSClass),format.raw/*62.107*/(""""><img class="nav-icon large-icon " src=""""),_display_(/*62.149*/routes/*62.155*/.Assets.versioned("images/icons/dashboard.png")),format.raw/*62.202*/(""""/>
    </a>
    </li>
    <li><a href=""""),_display_(/*65.19*/controllers/*65.30*/.User.routes.DeliveryStaffController.viewActiveDeliveries()),format.raw/*65.89*/("""" class=""""),_display_(/*65.99*/standardMenuCSSClass),format.raw/*65.119*/("""">
        Active Deliveries</a>
    </li>
    <li><a href=""""),_display_(/*68.19*/controllers/*68.30*/.User.routes.DeliveryStaffController.viewWaitingDeliveries()),format.raw/*68.90*/("""" class=""""),_display_(/*68.100*/standardMenuCSSClass),format.raw/*68.120*/("""">
        Waiting Deliveries</a>
    </li>
    <li><a href=""""),_display_(/*71.19*/controllers/*71.30*/.User.routes.DeliveryStaffController.viewCompletedDeliveries()),format.raw/*71.92*/("""" class=""""),_display_(/*71.102*/standardMenuCSSClass),format.raw/*71.122*/("""">
        Completed Deliveries</a>
    </li>
""")))};def /*76.2*/buildAdminNav/*76.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*76.19*/("""
    """),format.raw/*77.5*/("""<li><a href=""""),_display_(/*77.19*/controllers/*77.30*/.User.routes.AdminController.index()),format.raw/*77.66*/("""" class=""""),_display_(/*77.76*/standardNavIconCSSClass),format.raw/*77.99*/(""""><img class="nav-icon large-icon " src=""""),_display_(/*77.141*/routes/*77.147*/.Assets.versioned("images/icons/dashboard.png")),format.raw/*77.194*/(""""/>
    </a>
    </li>
    <li><a href=""""),_display_(/*80.19*/controllers/*80.30*/.User.routes.AdminController.manageUsers()),format.raw/*80.72*/("""" class=""""),_display_(/*80.82*/standardMenuCSSClass),format.raw/*80.102*/("""">
        Manage Users</a>
    </li>
    <li><a href=""""),_display_(/*83.19*/controllers/*83.30*/.User.routes.AdminController.manageMeals()),format.raw/*83.72*/("""" class=""""),_display_(/*83.82*/standardMenuCSSClass),format.raw/*83.102*/("""">
        Manage Meals</a>
    </li>
    <li><a href=""""),_display_(/*86.19*/controllers/*86.30*/.User.routes.AdminController.manageDiscounts()),format.raw/*86.76*/("""" class=""""),_display_(/*86.86*/standardMenuCSSClass),format.raw/*86.106*/("""">
        Set Discounts</a>
    </li>
""")))};def /*91.2*/standardMenuCSSClass/*91.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*91.26*/("""
    """),format.raw/*92.5*/("""menu-top-active nav-text-enlarge nav-menu-top-margin small-margin text-bold
""")))};def /*95.2*/standardNavIconCSSClass/*95.25*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*95.29*/("""
    """),format.raw/*96.5*/("""menu-top-active nav-text-enlarge
""")))};def /*99.2*/buildBasicNav/*99.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*99.19*/("""
    """),format.raw/*100.5*/("""<li><a href=""""),_display_(/*100.19*/controllers/*100.30*/.Application.routes.HomeController.index()),format.raw/*100.72*/("""" class=""""),_display_(/*100.82*/standardNavIconCSSClass),format.raw/*100.105*/(""""><img class="nav-icon large-icon" src=""""),_display_(/*100.146*/routes/*100.152*/.Assets.versioned("images/icons/home.png")),format.raw/*100.194*/(""""/></a>
    </li>
    <li>
        <a href="#" class="dropdown-toggle """),_display_(/*103.45*/standardMenuCSSClass),format.raw/*103.65*/("""" id="ddlmenuItem" data-toggle="dropdown">
            Menu
            <i class="fa fa-angle-down"></i>
        </a>
        <ul class="dropdown-menu" role="menu" aria-labelledby="ddlmenuItem">
            <li role="presentation"><a role="menuitem" tabindex="-1" href=""""),_display_(/*108.77*/controllers/*108.88*/.Order.routes.OrderController.switchMenu(0)),format.raw/*108.131*/("""">
                Breakfasts</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href=""""),_display_(/*110.77*/controllers/*110.88*/.Order.routes.OrderController.switchMenu(1)),format.raw/*110.131*/("""">
                Lunches</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href=""""),_display_(/*112.77*/controllers/*112.88*/.Order.routes.OrderController.switchMenu(2)),format.raw/*112.131*/("""">
                Dinners</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#desserts">
                Desserts</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#snacks">
                Snacks</a></li>
        </ul>
    </li>
    <li><a href="#" class=""""),_display_(/*120.29*/standardMenuCSSClass),format.raw/*120.49*/("""">
        Specials</a>
    </li>
    <li><a href=""""),_display_(/*123.19*/controllers/*123.30*/.Application.routes.HomeController.contactUs()),format.raw/*123.76*/("""" class=""""),_display_(/*123.86*/standardMenuCSSClass),format.raw/*123.106*/("""">
        Contact Us</a>
    </li>
""")))};def /*164.2*/getProfileButtons/*164.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*164.23*/("""
"""),_display_(/*165.2*/if(isLoggedIn.equalsIgnoreCase("true"))/*165.41*/ {_display_(Seq[Any](format.raw/*165.43*/("""
    """),_display_(/*166.6*/getLogoutButton),format.raw/*166.21*/("""
""")))}/*167.3*/else/*167.8*/{_display_(Seq[Any](format.raw/*167.9*/("""
    """),_display_(/*168.6*/getLoginButton),format.raw/*168.20*/("""
""")))}),format.raw/*169.2*/("""
""")))};def /*172.2*/getLoginButton/*172.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*172.20*/("""
    """),format.raw/*173.5*/("""<a href=""""),_display_(/*173.15*/controllers/*173.26*/.User.routes.UserController.login()),format.raw/*173.61*/("""" class="btn btn-success button-small pull-right">
        Login
    </a>
""")))};def /*178.2*/getLogoutButton/*178.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*178.21*/("""
    """),format.raw/*179.5*/("""<a href=""""),_display_(/*179.15*/controllers/*179.26*/.User.routes.UserController.logout()),format.raw/*179.62*/("""" class="btn btn-danger button-small pull-right">
        Logout
    </a>
""")))};def /*217.2*/getUserSideButton/*217.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*217.23*/("""
    """),format.raw/*218.5*/("""<a href=""""),_display_(/*218.15*/getUserSettingsLink),format.raw/*218.34*/("""">
        <img class="small-icon margin-left-very-small" src=""""),_display_(/*219.62*/routes/*219.68*/.Assets.versioned("images/icons/settings.png")),format.raw/*219.114*/("""">
    </a>
""")))};def /*223.2*/getRightBlockUserInfo/*223.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*223.27*/("""
    """),format.raw/*224.5*/("""<div class="row"></div>
    <label class="margin-top-small media-heading navbar-user pull-left nav-text-enlarge text-bold">
        Welcome, """),_display_(/*226.19*/if(isLoggedIn.equalsIgnoreCase("true"))/*226.58*/ {_display_(Seq[Any](format.raw/*226.60*/("""
        """),format.raw/*227.9*/("""<a href=""""),_display_(/*227.19*/getUserHomeLink),format.raw/*227.34*/("""">
        """),_display_(/*228.10*/session()/*228.19*/.get(AppTags.Session.SessionTags.display_name.toString)),format.raw/*228.74*/("""
        """),format.raw/*229.9*/("""</a>
        """),_display_(/*230.10*/getUserSideButton),format.raw/*230.27*/("""
    """)))}/*231.7*/else/*231.12*/{_display_(Seq[Any](format.raw/*231.13*/("""
        """),format.raw/*232.9*/("""New User
    """)))}),format.raw/*233.6*/("""
    """),format.raw/*234.5*/("""</label>
    <div class="pull-right vertical-line-left">
        <div class="margin-left-large">
        """),_display_(/*237.10*/getProfileButtons),format.raw/*237.27*/("""
        """),format.raw/*238.9*/("""</div>
    </div>
    </div>
""")))};def /*243.2*/nav_section/*243.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*243.17*/("""
    """),format.raw/*244.5*/("""<section class="menu-section">
        <div class="small-margin">
            <a class="top app-logo" href=""""),_display_(/*246.44*/getUserHomeLink),format.raw/*246.59*/("""">
                <img src=""""),_display_(/*247.28*/routes/*247.34*/.Assets.versioned("images/logo.png")),format.raw/*247.70*/(""""/>
            </a>
        </div>
        <div class="navbar navbar-inverse set-radius-zero">
            <div class="container-nav">
                <div class="row">
                    <div class="navbar-collapse collapse margin-bottom-small">
                        <ul class="nav navbar-nav navbar-left navbar-top nav-text-enlarge">
                        """),_display_(/*255.26*/getUserNav),format.raw/*255.36*/("""
                        """),format.raw/*256.25*/("""</ul>
                        <ul class="right-container navbar-btn navbar-right padding-top">
                        """),_display_(/*258.26*/getRightBlockUserInfo),format.raw/*258.47*/("""
                        """),format.raw/*259.25*/("""</ul>
                    </div>
                </div>
            </div>
        </div>
    </section>
""")))};def /*10.2*/getUserType/*10.13*/ = {{
    session().get(user_type.toString)
}};def /*128.2*/getUserNav/*128.12*/ = {{
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
}};def /*145.2*/getUserHomeLink/*145.17*/ = {{
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
}};def /*184.2*/isLoggedIn/*184.12*/ = {{
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
}};def /*198.2*/getUserSettingsLink/*198.21*/ = {{
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

"""),format.raw/*44.2*/("""

"""),format.raw/*59.2*/("""

"""),format.raw/*74.2*/("""

"""),format.raw/*89.2*/("""

"""),format.raw/*93.2*/("""

"""),format.raw/*97.2*/("""

"""),format.raw/*126.2*/("""

"""),format.raw/*143.2*/("""

"""),format.raw/*162.2*/("""

"""),format.raw/*170.2*/("""

"""),format.raw/*176.2*/("""

"""),format.raw/*182.2*/("""

"""),format.raw/*196.2*/("""

"""),format.raw/*215.2*/("""

"""),format.raw/*221.2*/("""

"""),format.raw/*241.2*/("""

"""),format.raw/*265.2*/("""


"""),_display_(/*268.2*/nav/*268.5*/.apply("null", nav_section)))
      }
    }
  }

  def render(nav_extension:Html): play.twirl.api.HtmlFormat.Appendable = apply(nav_extension)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (nav_extension) => apply(nav_extension)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 04:28:35 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/nav_wrapper.scala.html
                  HASH: df849c9beefcc012185c25d40fc722cdf927aaa2
                  MATRIX: 665->1|696->26|742->66|809->127|875->187|965->271|1292->292|1392->375|1417->391|1498->395|1530->400|1571->414|1591->425|1651->464|1688->474|1733->497|1802->538|1818->544|1887->591|1985->662|2026->682|2324->953|2344->964|2409->1007|2551->1122|2571->1133|2636->1176|2775->1288|2795->1299|2860->1342|3205->1660|3246->1680|3282->1689|3369->1754|3445->1803|3486->1823|3522->1832|3601->1889|3676->1937|3717->1957|3753->1966|3838->2029|3911->2075|3952->2095|3988->2104|4075->2169|4128->2202|4157->2222|4238->2226|4270->2231|4311->2245|4331->2256|4395->2299|4432->2309|4477->2332|4547->2374|4563->2380|4632->2427|4700->2468|4720->2479|4795->2533|4832->2543|4874->2563|4958->2620|4978->2631|5053->2685|5090->2695|5132->2715|5216->2772|5236->2783|5314->2840|5351->2850|5393->2870|5459->2916|5484->2932|5565->2936|5597->2941|5638->2955|5658->2966|5723->3010|5760->3020|5805->3043|5875->3085|5891->3091|5960->3138|6028->3179|6048->3190|6128->3249|6165->3259|6207->3279|6295->3340|6315->3351|6396->3411|6434->3421|6476->3441|6565->3503|6585->3514|6668->3576|6706->3586|6748->3606|6818->3656|6840->3669|6921->3673|6953->3678|6994->3692|7014->3703|7071->3739|7108->3749|7152->3772|7222->3814|7238->3820|7307->3867|7375->3908|7395->3919|7458->3961|7495->3971|7537->3991|7620->4047|7640->4058|7703->4100|7740->4110|7782->4130|7865->4186|7885->4197|7952->4243|7989->4253|8031->4273|8094->4316|8123->4336|8204->4340|8236->4345|8336->4425|8368->4448|8449->4452|8481->4457|8538->4494|8560->4507|8641->4511|8674->4516|8716->4530|8737->4541|8801->4583|8839->4593|8885->4616|8955->4657|8972->4663|9037->4705|9136->4776|9178->4796|9477->5067|9498->5078|9564->5121|9707->5236|9728->5247|9794->5290|9934->5402|9955->5413|10021->5456|10375->5782|10417->5802|10497->5854|10518->5865|10586->5911|10624->5921|10667->5941|10728->7271|10755->7288|10837->7292|10866->7294|10915->7333|10956->7335|10989->7341|11026->7356|11047->7359|11060->7364|11099->7365|11132->7371|11168->7385|11201->7387|11227->7392|11251->7406|11333->7410|11366->7415|11404->7425|11425->7436|11482->7471|11581->7549|11606->7564|11688->7568|11721->7573|11759->7583|11780->7594|11838->7630|11937->8807|11964->8824|12046->8828|12079->8833|12117->8843|12158->8862|12250->8926|12266->8932|12335->8978|12372->8994|12403->9015|12485->9019|12518->9024|12688->9166|12737->9205|12778->9207|12815->9216|12853->9226|12890->9241|12930->9253|12949->9262|13026->9317|13063->9326|13105->9340|13144->9357|13169->9364|13183->9369|13223->9370|13260->9379|13305->9393|13338->9398|13472->9504|13511->9521|13548->9530|13602->9563|13623->9574|13705->9578|13738->9583|13875->9692|13912->9707|13970->9737|13986->9743|14044->9779|14438->10145|14470->10155|14524->10180|14672->10300|14715->10321|14769->10346|14898->316|14918->327|14978->5981|14998->5991|15485->6466|15510->6481|16312->7708|16332->7718|16610->7984|16639->8003|17470->313|17499->372|17528->2199|17557->2913|17586->3653|17615->4313|17644->4422|17673->4491|17703->5978|17733->6463|17763->7268|17793->7389|17823->7546|17853->7705|17883->7981|17913->8804|17943->8991|17973->9560|18003->10452|18034->10456|18046->10459
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->6|34->8|38->14|38->14|40->14|41->15|41->15|41->15|41->15|41->15|41->15|41->15|41->15|41->15|44->18|44->18|49->23|49->23|49->23|51->25|51->25|51->25|53->27|53->27|53->27|62->36|62->36|62->36|62->36|64->38|64->38|64->38|64->38|66->40|66->40|66->40|66->40|68->42|68->42|68->42|68->42|70->46|70->46|72->46|73->47|73->47|73->47|73->47|73->47|73->47|73->47|73->47|73->47|76->50|76->50|76->50|76->50|76->50|79->53|79->53|79->53|79->53|79->53|82->56|82->56|82->56|82->56|82->56|85->61|85->61|87->61|88->62|88->62|88->62|88->62|88->62|88->62|88->62|88->62|88->62|91->65|91->65|91->65|91->65|91->65|94->68|94->68|94->68|94->68|94->68|97->71|97->71|97->71|97->71|97->71|100->76|100->76|102->76|103->77|103->77|103->77|103->77|103->77|103->77|103->77|103->77|103->77|106->80|106->80|106->80|106->80|106->80|109->83|109->83|109->83|109->83|109->83|112->86|112->86|112->86|112->86|112->86|115->91|115->91|117->91|118->92|119->95|119->95|121->95|122->96|123->99|123->99|125->99|126->100|126->100|126->100|126->100|126->100|126->100|126->100|126->100|126->100|129->103|129->103|134->108|134->108|134->108|136->110|136->110|136->110|138->112|138->112|138->112|146->120|146->120|149->123|149->123|149->123|149->123|149->123|152->164|152->164|154->164|155->165|155->165|155->165|156->166|156->166|157->167|157->167|157->167|158->168|158->168|159->169|160->172|160->172|162->172|163->173|163->173|163->173|163->173|166->178|166->178|168->178|169->179|169->179|169->179|169->179|172->217|172->217|174->217|175->218|175->218|175->218|176->219|176->219|176->219|178->223|178->223|180->223|181->224|183->226|183->226|183->226|184->227|184->227|184->227|185->228|185->228|185->228|186->229|187->230|187->230|188->231|188->231|188->231|189->232|190->233|191->234|194->237|194->237|195->238|198->243|198->243|200->243|201->244|203->246|203->246|204->247|204->247|204->247|212->255|212->255|213->256|215->258|215->258|216->259|222->10|222->10|224->128|224->128|239->145|239->145|256->184|256->184|268->198|268->198|286->8|288->12|290->44|292->59|294->74|296->89|298->93|300->97|302->126|304->143|306->162|308->170|310->176|312->182|314->196|316->215|318->221|320->241|322->265|325->268|325->268
                  -- GENERATED --
              */
          