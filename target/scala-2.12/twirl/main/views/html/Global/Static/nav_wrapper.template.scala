
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
                  DATE: Wed Oct 18 00:03:03 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/nav_wrapper.scala.html
                  HASH: 68b81abe92d8f56c757106b601d6cb514634a320
                  MATRIX: 665->1|696->26|742->66|809->127|875->187|965->271|1292->292|1392->375|1417->391|1498->395|1530->400|1571->414|1591->425|1651->464|1688->474|1729->494|1770->507|1786->513|1859->564|2812->1490|2890->1547|2966->1596|3042->1651|3109->1691|3193->1754|3263->1797|3349->1862|3400->1893|3429->1913|3510->1917|3542->1922|3583->1936|3603->1947|3667->1990|3704->2000|3746->2020|3787->2033|3803->2039|3876->2090|3957->2144|3977->2155|4052->2209|4089->2219|4131->2239|4172->2252|4188->2258|4261->2309|4346->2367|4366->2378|4441->2432|4478->2442|4520->2462|4561->2475|4577->2481|4650->2532|4735->2590|4755->2601|4833->2658|4870->2668|4912->2688|4953->2701|4969->2707|5042->2758|5109->2805|5134->2821|5215->2825|5247->2830|5288->2844|5308->2855|5373->2899|5410->2909|5452->2929|5493->2942|5509->2948|5582->2999|5663->3053|5683->3064|5763->3123|5800->3133|5842->3153|5883->3166|5899->3172|5972->3223|6061->3285|6081->3296|6162->3356|6200->3366|6242->3386|6283->3399|6299->3405|6372->3456|6462->3519|6482->3530|6565->3592|6603->3602|6645->3622|6686->3635|6702->3641|6775->3692|6846->3743|6868->3756|6949->3760|6981->3765|7022->3779|7042->3790|7102->3829|7139->3839|7180->3859|7221->3872|7237->3878|7310->3929|7391->3983|7411->3994|7474->4036|7511->4046|7553->4066|7594->4079|7610->4085|7683->4136|7767->4193|7787->4204|7850->4246|7887->4256|7929->4276|7970->4289|7986->4295|8059->4346|8143->4403|8163->4414|8230->4460|8267->4470|8309->4490|8350->4503|8366->4509|8439->4560|8503->4604|8532->4624|8613->4628|8645->4633|8704->4672|8726->4685|8807->4689|8839->4694|8880->4708|8900->4719|8963->4761|9000->4771|9042->4791|9152->4874|9193->4894|10069->5742|10111->5762|10191->5814|10212->5825|10278->5869|10316->5879|10359->5899|10420->7229|10447->7246|10529->7250|10558->7252|10607->7291|10648->7293|10681->7299|10718->7314|10739->7317|10752->7322|10791->7323|10824->7329|10860->7343|10893->7345|10919->7350|10943->7364|11025->7368|11058->7373|11096->7383|11117->7394|11174->7429|11261->7495|11286->7510|11368->7514|11401->7519|11439->7529|11460->7540|11518->7576|11605->8741|11632->8758|11714->8762|11747->8767|11785->8777|11826->8796|11898->8840|11914->8846|11987->8897|12024->8913|12055->8934|12137->8938|12170->8943|12299->9044|12348->9083|12389->9085|12431->9098|12469->9108|12506->9123|12550->9139|12569->9148|12646->9203|12688->9216|12734->9234|12773->9251|12803->9262|12817->9267|12857->9268|12899->9281|12949->9299|12986->9308|13073->9368|13112->9385|13145->9390|13176->9400|13197->9411|13279->9415|13312->9420|13410->9490|13447->9505|13501->9531|13517->9537|13575->9573|13989->9959|14021->9969|14079->9998|14223->10114|14266->10135|14324->10164|14484->316|14504->327|14564->5939|14584->5949|15071->6424|15096->6439|15898->7642|15918->7652|16196->7918|16225->7937|17056->313|17085->372|17114->1890|17143->2802|17172->3740|17201->4601|17230->4669|17260->5936|17290->6421|17320->7226|17350->7347|17380->7492|17410->7639|17440->7915|17470->8738|17500->8910|17530->9397|17560->10301|17591->10305|17603->10308
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->6|34->8|38->14|38->14|40->14|41->15|41->15|41->15|41->15|41->15|41->15|41->15|41->15|41->15|63->37|63->37|64->38|64->38|65->39|65->39|66->40|66->40|67->43|67->43|69->43|70->44|70->44|70->44|70->44|70->44|70->44|70->44|70->44|70->44|73->47|73->47|73->47|73->47|73->47|73->47|73->47|73->47|76->50|76->50|76->50|76->50|76->50|76->50|76->50|76->50|79->53|79->53|79->53|79->53|79->53|79->53|79->53|79->53|82->58|82->58|84->58|85->59|85->59|85->59|85->59|85->59|85->59|85->59|85->59|85->59|88->62|88->62|88->62|88->62|88->62|88->62|88->62|88->62|91->65|91->65|91->65|91->65|91->65|91->65|91->65|91->65|94->68|94->68|94->68|94->68|94->68|94->68|94->68|94->68|97->73|97->73|99->73|100->74|100->74|100->74|100->74|100->74|100->74|100->74|100->74|100->74|103->77|103->77|103->77|103->77|103->77|103->77|103->77|103->77|106->80|106->80|106->80|106->80|106->80|106->80|106->80|106->80|109->83|109->83|109->83|109->83|109->83|109->83|109->83|109->83|112->88|112->88|114->88|115->89|116->92|116->92|118->92|119->93|119->93|119->93|119->93|119->93|119->93|123->97|123->97|140->114|140->114|143->117|143->117|143->117|143->117|143->117|146->158|146->158|148->158|149->159|149->159|149->159|150->160|150->160|151->161|151->161|151->161|152->162|152->162|153->163|154->166|154->166|156->166|157->167|157->167|157->167|157->167|160->172|160->172|162->172|163->173|163->173|163->173|163->173|166->211|166->211|168->211|169->212|169->212|169->212|170->213|170->213|170->213|172->217|172->217|174->217|175->218|177->220|177->220|177->220|178->221|178->221|178->221|179->222|179->222|179->222|180->223|181->224|181->224|182->225|182->225|182->225|183->226|184->227|185->228|188->231|188->231|189->232|190->235|190->235|192->235|193->236|194->237|194->237|195->238|195->238|195->238|203->246|203->246|204->247|206->249|206->249|207->250|214->10|214->10|216->122|216->122|231->139|231->139|248->178|248->178|260->192|260->192|278->8|280->12|282->41|284->56|286->71|288->86|290->90|292->120|294->137|296->156|298->164|300->170|302->176|304->190|306->209|308->215|310->233|312->257|315->260|315->260
                  -- GENERATED --
              */
          