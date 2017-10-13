
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

object nav_wrapper extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(nav_extension: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*12.6*/buildCustomerNav/*12.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.26*/("""
        """),format.raw/*13.9*/("""<li><a href=""""),_display_(/*13.23*/controllers/*13.34*/.User.routes.CustomerController.index()),format.raw/*13.73*/("""" class=""""),_display_(/*13.83*/standardMenuCSSClass),format.raw/*13.103*/(""""><img src=""""),_display_(/*13.116*/routes/*13.122*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*13.173*/(""""/>
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

        <li><a href=""""),_display_(/*35.23*/controllers/*35.34*/.Order.routes.ScheduleController.index()),format.raw/*35.74*/("""">View Order Schedule</a></li>
        <li><a href=""""),_display_(/*36.23*/controllers/*36.34*/.Finance.routes.UserFinance.addFunds()),format.raw/*36.72*/("""">Add Funds</a> </li>
        <li><a href=""""),_display_(/*37.23*/controllers/*37.34*/.User.routes.CustomerController.orderHistory()),format.raw/*37.80*/("""">TODO</a>Order History</li>
        <li><a href=""""),_display_(/*38.23*/controllers/*38.34*/.User.routes.CustomerController.paymentHistory()),format.raw/*38.82*/("""">TODO</a>Payment History</li>
    """)))};def /*41.6*/buildKitchenStaffNav/*41.26*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*41.30*/("""
        """),format.raw/*42.9*/("""<li><a href=""""),_display_(/*42.23*/controllers/*42.34*/.User.routes.KitchenStaffController.index()),format.raw/*42.77*/("""" class=""""),_display_(/*42.87*/standardMenuCSSClass),format.raw/*42.107*/(""""><img src=""""),_display_(/*42.120*/routes/*42.126*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*42.177*/(""""/>
            Dashboard</a>
        </li>
        <li><a href=""""),_display_(/*45.23*/controllers/*45.34*/.User.routes.KitchenStaffController.viewActiveOrders()),format.raw/*45.88*/("""" class=""""),_display_(/*45.98*/standardMenuCSSClass),format.raw/*45.118*/(""""><img src=""""),_display_(/*45.131*/routes/*45.137*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*45.188*/(""""/>
            Active Orders</a>
        </li>
        <li><a href=""""),_display_(/*48.23*/controllers/*48.34*/.User.routes.KitchenStaffController.viewQueuedOrders()),format.raw/*48.88*/("""" class=""""),_display_(/*48.98*/standardMenuCSSClass),format.raw/*48.118*/(""""><img src=""""),_display_(/*48.131*/routes/*48.137*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*48.188*/(""""/>
            Queued Orders</a>
        </li>
        <li><a href=""""),_display_(/*51.23*/controllers/*51.34*/.User.routes.KitchenStaffController.viewCompletedOrders()),format.raw/*51.91*/("""" class=""""),_display_(/*51.101*/standardMenuCSSClass),format.raw/*51.121*/(""""><img src=""""),_display_(/*51.134*/routes/*51.140*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*51.191*/(""""/>
            Completed Orders</a>
        </li>
    """)))};def /*56.6*/buildDeliveryNav/*56.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*56.26*/("""
        """),format.raw/*57.9*/("""<li><a href=""""),_display_(/*57.23*/controllers/*57.34*/.User.routes.DeliveryStaffController.index()),format.raw/*57.78*/("""" class=""""),_display_(/*57.88*/standardMenuCSSClass),format.raw/*57.108*/(""""><img src=""""),_display_(/*57.121*/routes/*57.127*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*57.178*/(""""/>
            Dashboard</a>
        </li>
        <li><a href=""""),_display_(/*60.23*/controllers/*60.34*/.User.routes.DeliveryStaffController.viewActiveDeliveries()),format.raw/*60.93*/("""" class=""""),_display_(/*60.103*/standardMenuCSSClass),format.raw/*60.123*/(""""><img src=""""),_display_(/*60.136*/routes/*60.142*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*60.193*/(""""/>
            Active Deliveries</a>
        </li>
        <li><a href=""""),_display_(/*63.23*/controllers/*63.34*/.User.routes.DeliveryStaffController.viewWaitingDeliveries()),format.raw/*63.94*/("""" class=""""),_display_(/*63.104*/standardMenuCSSClass),format.raw/*63.124*/(""""><img src=""""),_display_(/*63.137*/routes/*63.143*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*63.194*/(""""/>
            Waiting Deliveries</a>
        </li>
        <li><a href=""""),_display_(/*66.23*/controllers/*66.34*/.User.routes.DeliveryStaffController.viewCompletedDeliveries()),format.raw/*66.96*/("""" class=""""),_display_(/*66.106*/standardMenuCSSClass),format.raw/*66.126*/(""""><img src=""""),_display_(/*66.139*/routes/*66.145*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*66.196*/(""""/>
            Completed Deliveries</a>
        </li>
    """)))};def /*71.6*/buildAdminNav/*71.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*71.23*/("""
        """),format.raw/*72.9*/("""<li><a href=""""),_display_(/*72.23*/controllers/*72.34*/.User.routes.CustomerController.index()),format.raw/*72.73*/("""" class=""""),_display_(/*72.83*/standardMenuCSSClass),format.raw/*72.103*/(""""><img src=""""),_display_(/*72.116*/routes/*72.122*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*72.173*/(""""/>
            Dashboard</a>
        </li>
        <li><a href=""""),_display_(/*75.23*/controllers/*75.34*/.User.routes.AdminController.manageUsers()),format.raw/*75.76*/("""" class=""""),_display_(/*75.86*/standardMenuCSSClass),format.raw/*75.106*/(""""><img src=""""),_display_(/*75.119*/routes/*75.125*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*75.176*/(""""/>
            Manage Users</a>
        </li>
        <li><a href=""""),_display_(/*78.23*/controllers/*78.34*/.User.routes.AdminController.manageMeals()),format.raw/*78.76*/("""" class=""""),_display_(/*78.86*/standardMenuCSSClass),format.raw/*78.106*/(""""><img src=""""),_display_(/*78.119*/routes/*78.125*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*78.176*/(""""/>
            Manage Meals</a>
        </li>
        <li><a href=""""),_display_(/*81.23*/controllers/*81.34*/.User.routes.AdminController.manageDiscounts()),format.raw/*81.80*/("""" class=""""),_display_(/*81.90*/standardMenuCSSClass),format.raw/*81.110*/(""""><img src=""""),_display_(/*81.123*/routes/*81.129*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*81.180*/(""""/>
            Set Discounts</a>
        </li>
    """)))};def /*86.6*/standardMenuCSSClass/*86.26*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*86.30*/("""
        """),format.raw/*87.9*/(""""menu-top-active nav-text-enlarge"
    """)))};def /*90.6*/buildBasicNav/*90.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*90.23*/("""
        """),format.raw/*91.9*/("""<li><a href=""""),_display_(/*91.23*/controllers/*91.34*/.Application.routes.HomeController.index()),format.raw/*91.76*/("""" class=""""),_display_(/*91.86*/standardMenuCSSClass),format.raw/*91.106*/("""">
            Home</a>
        </li>
        <li>
            <a href="#" class="dropdown-toggle """),_display_(/*95.49*/standardMenuCSSClass),format.raw/*95.69*/("""" id="ddlmenuItem" data-toggle="dropdown">
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
    """)))};def /*152.6*/getProfileButtons/*152.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*152.27*/("""
    """),_display_(/*153.6*/if(isLoggedIn == "true")/*153.30*/ {_display_(Seq[Any](format.raw/*153.32*/("""
        """),_display_(/*154.10*/getLogoutButton),format.raw/*154.25*/("""
    """)))}/*155.7*/else/*155.12*/{_display_(Seq[Any](format.raw/*155.13*/("""
        """),_display_(/*156.10*/getLoginButton),format.raw/*156.24*/("""
    """)))}),format.raw/*157.6*/("""
    """)))};def /*160.6*/getLoginButton/*160.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*160.24*/("""
        """),format.raw/*161.9*/("""<a href=""""),_display_(/*161.19*/controllers/*161.30*/.User.routes.UserController.login()),format.raw/*161.65*/("""" class="btn btn-success pull-center">
            Login
        </a>
    """)))};def /*166.6*/getLogoutButton/*166.21*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*166.25*/("""
        """),format.raw/*167.9*/("""<a href=""""),_display_(/*167.19*/controllers/*167.30*/.User.routes.UserController.logout()),format.raw/*167.66*/("""" class="btn btn-danger pull-center">
            Logout
        </a>
    """)))};def /*186.6*/getUserSideButton/*186.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*186.27*/("""
        """),format.raw/*187.9*/("""<a href=""""),_display_(/*187.19*/controllers/*187.30*/.User.routes.CustomerController.edit()),format.raw/*187.68*/("""">
            <img class="settings-icon" src=""""),_display_(/*188.46*/routes/*188.52*/.Assets.versioned("images/navigation/settings.png")),format.raw/*188.103*/("""">
        </a>
    """)))};def /*192.6*/getRightBlockUserInfo/*192.27*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*192.31*/("""
        """),format.raw/*193.9*/("""<ul class="top">
            <label class="media-heading navbar-user pull-center">
                Welcome, """),_display_(/*195.27*/if(isLoggedIn == "true")/*195.51*/ {_display_(Seq[Any](format.raw/*195.53*/("""

                """),format.raw/*197.17*/("""<a href=""""),_display_(/*197.27*/getUserHomeLink),format.raw/*197.42*/("""">
                """),_display_(/*198.18*/session()/*198.27*/.get(AppTags.Session.SessionTags.display_name.toString)),format.raw/*198.82*/("""
                """),format.raw/*199.17*/("""</a>
                """),_display_(/*200.18*/getUserSideButton),format.raw/*200.35*/("""
            """)))}/*201.15*/else/*201.20*/{_display_(Seq[Any](format.raw/*201.21*/("""
                """),format.raw/*202.17*/("""New User
            """)))}),format.raw/*203.14*/("""
            """),format.raw/*204.13*/("""</label>
        </ul>
        <ul class="bottom text-center">
        """),_display_(/*207.10*/getProfileButtons),format.raw/*207.27*/("""
        """),format.raw/*208.9*/("""</ul>
    """)))};def /*211.6*/nav_section/*211.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*211.21*/("""
        """),format.raw/*212.9*/("""<section class="menu-section">
            <a class="top app-logo" href=""""),_display_(/*213.44*/getUserHomeLink),format.raw/*213.59*/("""">
                <img src=""""),_display_(/*214.28*/routes/*214.34*/.Assets.versioned("images/logo.png")),format.raw/*214.70*/(""""/>
            </a>
            <div class="navbar navbar-inverse set-radius-zero">
                <div class="container">
                    <div class="row ">
                        <div class="col-md-pull-12">
                            <div class="navbar-collapse collapse ">
                                <ul class="nav navbar-nav navbar-left navbar-top nav-text-enlarge">
                                """),_display_(/*222.34*/getUserNav),format.raw/*222.44*/("""
                                """),format.raw/*223.33*/("""</ul>
                                <ul class="right-container navbar-btn navbar-right">
                                """),_display_(/*225.34*/getRightBlockUserInfo),format.raw/*225.55*/("""
                                """),format.raw/*226.33*/("""</ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    """)))};def /*8.6*/getUserType/*8.17*/ = {{
        session().get(session_status.toString)
    }};def /*114.6*/getUserNav/*114.16*/ = {{
        if(!session().containsKey(session_status.toString)) {
            buildBasicNav
        } else {
            var userType = getUserType
            if(userType == CUSTOMER.toString) {
                buildCustomerNav
            } else if(userType == KITCHEN.toString) {
                buildKitchenStaffNav
            } else if(userType == DELIVERY.toString) {
                buildDeliveryNav
            } else if(userType == ADMIN.toString) {
                buildAdminNav
            } else {
                buildBasicNav
            }
        }
    }};def /*133.6*/getUserHomeLink/*133.21*/ = {{
        if(!session().containsKey(session_status.toString)) {
            controllers.Application.routes.HomeController.index()
        } else {
            var userType = getUserType
            if(userType == CUSTOMER.toString) {
                controllers.User.routes.CustomerController.index()
            } else if(userType == KITCHEN.toString) {
                controllers.User.routes.KitchenStaffController.index()
            } else if(userType == DELIVERY.toString) {
                controllers.User.routes.DeliveryStaffController.index()
            } else if(userType == ADMIN.toString) {
                controllers.User.routes.AdminController.index()
            } else {
                controllers.Application.routes.HomeController.unknown()
            }
        }
    }};def /*172.6*/isLoggedIn/*172.16*/ = {{
        if(session().containsKey(session_status.toString)) {
            if(session().get(session_status.toString).equals(valid.toString)) {
                "true"
            }
            else {
                "false"
            }
        }
        else {
            "false"
        }
    }};
Seq[Any](format.raw/*6.23*/("""

    """),format.raw/*10.6*/("""

    """),format.raw/*39.6*/("""

    """),format.raw/*54.6*/("""

    """),format.raw/*69.6*/("""

    """),format.raw/*84.6*/("""

    """),format.raw/*88.6*/("""

    """),format.raw/*112.6*/("""

    """),format.raw/*131.6*/("""

    """),format.raw/*150.6*/("""

    """),format.raw/*158.6*/("""

    """),format.raw/*164.6*/("""

    """),format.raw/*170.6*/("""

    """),format.raw/*184.6*/("""

    """),format.raw/*190.6*/("""

    """),format.raw/*209.6*/("""

    """),format.raw/*233.6*/("""


    """),_display_(/*236.6*/nav/*236.9*/.apply("null", nav_section)))
      }
    }
  }

  def render(nav_extension:Html): play.twirl.api.HtmlFormat.Appendable = apply(nav_extension)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (nav_extension) => apply(nav_extension)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Oct 13 12:03:50 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/nav_wrapper.scala.html
                  HASH: 39ae3070dc673c0661c9d042279388a7d172a2a4
                  MATRIX: 665->1|696->26|742->66|809->127|890->202|1263->268|1363->372|1388->388|1469->392|1505->401|1546->415|1566->426|1626->465|1663->475|1705->495|1746->508|1762->514|1835->565|2872->1575|2892->1586|2953->1626|3033->1679|3053->1690|3112->1728|3183->1772|3203->1783|3270->1829|3348->1880|3368->1891|3437->1939|3496->1982|3525->2002|3606->2006|3642->2015|3683->2029|3703->2040|3767->2083|3804->2093|3846->2113|3887->2126|3903->2132|3976->2183|4069->2249|4089->2260|4164->2314|4201->2324|4243->2344|4284->2357|4300->2363|4373->2414|4470->2484|4490->2495|4565->2549|4602->2559|4644->2579|4685->2592|4701->2598|4774->2649|4871->2719|4891->2730|4969->2787|5007->2797|5049->2817|5090->2830|5106->2836|5179->2887|5258->2950|5283->2966|5364->2970|5400->2979|5441->2993|5461->3004|5526->3048|5563->3058|5605->3078|5646->3091|5662->3097|5735->3148|5828->3214|5848->3225|5928->3284|5966->3294|6008->3314|6049->3327|6065->3333|6138->3384|6239->3458|6259->3469|6340->3529|6378->3539|6420->3559|6461->3572|6477->3578|6550->3629|6652->3704|6672->3715|6755->3777|6793->3787|6835->3807|6876->3820|6892->3826|6965->3877|7048->3944|7070->3957|7151->3961|7187->3970|7228->3984|7248->3995|7308->4034|7345->4044|7387->4064|7428->4077|7444->4083|7517->4134|7610->4200|7630->4211|7693->4253|7730->4263|7772->4283|7813->4296|7829->4302|7902->4353|7998->4422|8018->4433|8081->4475|8118->4485|8160->4505|8201->4518|8217->4524|8290->4575|8386->4644|8406->4655|8473->4701|8510->4711|8552->4731|8593->4744|8609->4750|8682->4801|8758->4861|8787->4881|8868->4885|8904->4894|8967->4941|8989->4954|9070->4958|9106->4967|9147->4981|9167->4992|9230->5034|9267->5044|9309->5064|9435->5163|9476->5183|10389->7485|10416->7502|10498->7506|10531->7512|10565->7536|10606->7538|10644->7548|10681->7563|10706->7570|10720->7575|10760->7576|10798->7586|10834->7600|10871->7606|10901->7619|10925->7633|11007->7637|11044->7646|11082->7656|11103->7667|11160->7702|11259->7784|11284->7799|11366->7803|11403->7812|11441->7822|11462->7833|11520->7869|11619->8269|11646->8286|11728->8290|11765->8299|11803->8309|11824->8320|11884->8358|11960->8406|11976->8412|12050->8463|12095->8491|12126->8512|12208->8516|12245->8525|12382->8634|12416->8658|12457->8660|12504->8678|12542->8688|12579->8703|12627->8723|12646->8732|12723->8787|12769->8804|12819->8826|12858->8843|12892->8858|12906->8863|12946->8864|12992->8881|13046->8903|13088->8916|13188->8988|13227->9005|13264->9014|13299->9032|13320->9043|13402->9047|13439->9056|13541->9130|13578->9145|13636->9175|13652->9181|13710->9217|14156->9635|14188->9645|14250->9678|14402->9802|14445->9823|14507->9856|14694->296|14713->307|14786->6079|14806->6089|15393->6668|15418->6683|16228->7951|16248->7961|16579->289|16612->365|16645->1975|16678->2943|16711->3937|16744->4854|16777->4934|16811->6072|16845->6661|16879->7478|16913->7612|16947->7777|16981->7944|17015->8262|17049->8484|17083->9025|17117->10021|17152->10029|17164->10032
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->6|37->12|37->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|62->35|62->35|62->35|63->36|63->36|63->36|64->37|64->37|64->37|65->38|65->38|65->38|66->41|66->41|68->41|69->42|69->42|69->42|69->42|69->42|69->42|69->42|69->42|69->42|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|78->51|78->51|78->51|78->51|78->51|78->51|78->51|78->51|81->56|81->56|83->56|84->57|84->57|84->57|84->57|84->57|84->57|84->57|84->57|84->57|87->60|87->60|87->60|87->60|87->60|87->60|87->60|87->60|90->63|90->63|90->63|90->63|90->63|90->63|90->63|90->63|93->66|93->66|93->66|93->66|93->66|93->66|93->66|93->66|96->71|96->71|98->71|99->72|99->72|99->72|99->72|99->72|99->72|99->72|99->72|99->72|102->75|102->75|102->75|102->75|102->75|102->75|102->75|102->75|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|108->81|108->81|108->81|108->81|108->81|108->81|108->81|108->81|111->86|111->86|113->86|114->87|115->90|115->90|117->90|118->91|118->91|118->91|118->91|118->91|118->91|122->95|122->95|139->152|139->152|141->152|142->153|142->153|142->153|143->154|143->154|144->155|144->155|144->155|145->156|145->156|146->157|147->160|147->160|149->160|150->161|150->161|150->161|150->161|153->166|153->166|155->166|156->167|156->167|156->167|156->167|159->186|159->186|161->186|162->187|162->187|162->187|162->187|163->188|163->188|163->188|165->192|165->192|167->192|168->193|170->195|170->195|170->195|172->197|172->197|172->197|173->198|173->198|173->198|174->199|175->200|175->200|176->201|176->201|176->201|177->202|178->203|179->204|182->207|182->207|183->208|184->211|184->211|186->211|187->212|188->213|188->213|189->214|189->214|189->214|197->222|197->222|198->223|200->225|200->225|201->226|208->8|208->8|210->114|210->114|227->133|227->133|244->172|244->172|257->6|259->10|261->39|263->54|265->69|267->84|269->88|271->112|273->131|275->150|277->158|279->164|281->170|283->184|285->190|287->209|289->233|292->236|292->236
                  -- GENERATED --
              */
          