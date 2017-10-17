
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
/*7.2*/import helper.CSRF

object nav_wrapper extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(nav_extension: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*15.2*/buildCustomerNav/*15.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.22*/("""
    """),format.raw/*16.5*/("""<li><a href=""""),_display_(/*16.19*/controllers/*16.30*/.User.routes.CustomerController.index()),format.raw/*16.69*/("""" class=""""),_display_(/*16.79*/standardMenuCSSClass),format.raw/*16.99*/(""""><img src=""""),_display_(/*16.112*/routes/*16.118*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*16.169*/(""""/>
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

    <li><a href=""""),_display_(/*38.19*/CSRF(controllers.Order.routes.ScheduleController.index())),format.raw/*38.76*/("""">View Order Schedule</a></li>
    <li><a href=""""),_display_(/*39.19*/CSRF(controllers.Finance.routes.UserFinance.addFunds())),format.raw/*39.74*/("""">Add Funds</a> </li>
    <li><a href=""""),_display_(/*40.19*/CSRF(controllers.User.routes.CustomerController.orderHistory())),format.raw/*40.82*/("""">Order History</a></li>
    <li><a href=""""),_display_(/*41.19*/CSRF(controllers.User.routes.CustomerController.paymentHistory())),format.raw/*41.84*/("""">Payment History</a></li>
""")))};def /*44.2*/buildKitchenStaffNav/*44.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*44.26*/("""
    """),format.raw/*45.5*/("""<li><a href=""""),_display_(/*45.19*/controllers/*45.30*/.User.routes.KitchenStaffController.index()),format.raw/*45.73*/("""" class=""""),_display_(/*45.83*/standardMenuCSSClass),format.raw/*45.103*/(""""><img src=""""),_display_(/*45.116*/routes/*45.122*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*45.173*/(""""/>
        Dashboard</a>
    </li>
    <li><a href=""""),_display_(/*48.19*/controllers/*48.30*/.User.routes.KitchenStaffController.viewActiveOrders()),format.raw/*48.84*/("""" class=""""),_display_(/*48.94*/standardMenuCSSClass),format.raw/*48.114*/(""""><img src=""""),_display_(/*48.127*/routes/*48.133*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*48.184*/(""""/>
        Active Orders</a>
    </li>
    <li><a href=""""),_display_(/*51.19*/controllers/*51.30*/.User.routes.KitchenStaffController.viewQueuedOrders()),format.raw/*51.84*/("""" class=""""),_display_(/*51.94*/standardMenuCSSClass),format.raw/*51.114*/(""""><img src=""""),_display_(/*51.127*/routes/*51.133*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*51.184*/(""""/>
        Queued Orders</a>
    </li>
    <li><a href=""""),_display_(/*54.19*/controllers/*54.30*/.User.routes.KitchenStaffController.viewCompletedOrders()),format.raw/*54.87*/("""" class=""""),_display_(/*54.97*/standardMenuCSSClass),format.raw/*54.117*/(""""><img src=""""),_display_(/*54.130*/routes/*54.136*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*54.187*/(""""/>
        Completed Orders</a>
    </li>
""")))};def /*59.2*/buildDeliveryNav/*59.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*59.22*/("""
    """),format.raw/*60.5*/("""<li><a href=""""),_display_(/*60.19*/controllers/*60.30*/.User.routes.DeliveryStaffController.index()),format.raw/*60.74*/("""" class=""""),_display_(/*60.84*/standardMenuCSSClass),format.raw/*60.104*/(""""><img src=""""),_display_(/*60.117*/routes/*60.123*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*60.174*/(""""/>
        Dashboard</a>
    </li>
    <li><a href=""""),_display_(/*63.19*/controllers/*63.30*/.User.routes.DeliveryStaffController.viewActiveDeliveries()),format.raw/*63.89*/("""" class=""""),_display_(/*63.99*/standardMenuCSSClass),format.raw/*63.119*/(""""><img src=""""),_display_(/*63.132*/routes/*63.138*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*63.189*/(""""/>
        Active Deliveries</a>
    </li>
    <li><a href=""""),_display_(/*66.19*/controllers/*66.30*/.User.routes.DeliveryStaffController.viewWaitingDeliveries()),format.raw/*66.90*/("""" class=""""),_display_(/*66.100*/standardMenuCSSClass),format.raw/*66.120*/(""""><img src=""""),_display_(/*66.133*/routes/*66.139*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*66.190*/(""""/>
        Waiting Deliveries</a>
    </li>
    <li><a href=""""),_display_(/*69.19*/controllers/*69.30*/.User.routes.DeliveryStaffController.viewCompletedDeliveries()),format.raw/*69.92*/("""" class=""""),_display_(/*69.102*/standardMenuCSSClass),format.raw/*69.122*/(""""><img src=""""),_display_(/*69.135*/routes/*69.141*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*69.192*/(""""/>
        Completed Deliveries</a>
    </li>
""")))};def /*74.2*/buildAdminNav/*74.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*74.19*/("""
    """),format.raw/*75.5*/("""<li><a href=""""),_display_(/*75.19*/controllers/*75.30*/.User.routes.CustomerController.index()),format.raw/*75.69*/("""" class=""""),_display_(/*75.79*/standardMenuCSSClass),format.raw/*75.99*/(""""><img src=""""),_display_(/*75.112*/routes/*75.118*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*75.169*/(""""/>
        Dashboard</a>
    </li>
    <li><a href=""""),_display_(/*78.19*/controllers/*78.30*/.User.routes.AdminController.manageUsers()),format.raw/*78.72*/("""" class=""""),_display_(/*78.82*/standardMenuCSSClass),format.raw/*78.102*/(""""><img src=""""),_display_(/*78.115*/routes/*78.121*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*78.172*/(""""/>
        Manage Users</a>
    </li>
    <li><a href=""""),_display_(/*81.19*/controllers/*81.30*/.User.routes.AdminController.manageMeals()),format.raw/*81.72*/("""" class=""""),_display_(/*81.82*/standardMenuCSSClass),format.raw/*81.102*/(""""><img src=""""),_display_(/*81.115*/routes/*81.121*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*81.172*/(""""/>
        Manage Meals</a>
    </li>
    <li><a href=""""),_display_(/*84.19*/controllers/*84.30*/.User.routes.AdminController.manageDiscounts()),format.raw/*84.76*/("""" class=""""),_display_(/*84.86*/standardMenuCSSClass),format.raw/*84.106*/(""""><img src=""""),_display_(/*84.119*/routes/*84.125*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*84.176*/(""""/>
        Set Discounts</a>
    </li>
""")))};def /*89.2*/standardMenuCSSClass/*89.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*89.26*/("""
    """),format.raw/*90.5*/(""""menu-top-active nav-text-enlarge"
""")))};def /*93.2*/buildBasicNav/*93.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*93.19*/("""
    """),format.raw/*94.5*/("""<li><a href=""""),_display_(/*94.19*/controllers/*94.30*/.Application.routes.HomeController.index()),format.raw/*94.72*/("""" class=""""),_display_(/*94.82*/standardMenuCSSClass),format.raw/*94.102*/("""">
        Home</a>
    </li>
    <li>
        <a href="#" class="dropdown-toggle """),_display_(/*98.45*/standardMenuCSSClass),format.raw/*98.65*/("""" id="ddlmenuItem" data-toggle="dropdown">
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
    <li><a href="#" class=""""),_display_(/*115.29*/standardMenuCSSClass),format.raw/*115.49*/("""">
        Specials</a>
    </li>
    <li><a href=""""),_display_(/*118.19*/controllers/*118.30*/.Application.routes.HomeController.unknown()),format.raw/*118.74*/("""" class=""""),_display_(/*118.84*/standardMenuCSSClass),format.raw/*118.104*/("""">
        Contact Us</a>
    </li>
""")))};def /*159.2*/getProfileButtons/*159.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*159.23*/("""
"""),_display_(/*160.2*/if(isLoggedIn.equalsIgnoreCase("true"))/*160.41*/ {_display_(Seq[Any](format.raw/*160.43*/("""
    """),_display_(/*161.6*/getLogoutButton),format.raw/*161.21*/("""
""")))}/*162.3*/else/*162.8*/{_display_(Seq[Any](format.raw/*162.9*/("""
    """),_display_(/*163.6*/getLoginButton),format.raw/*163.20*/("""
""")))}),format.raw/*164.2*/("""
""")))};def /*167.2*/getLoginButton/*167.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*167.20*/("""
    """),format.raw/*168.5*/("""<a href=""""),_display_(/*168.15*/controllers/*168.26*/.User.routes.UserController.login()),format.raw/*168.61*/("""" class="btn btn-success pull-center">
        Login
    </a>
""")))};def /*173.2*/getLogoutButton/*173.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*173.21*/("""
    """),format.raw/*174.5*/("""<a href=""""),_display_(/*174.15*/controllers/*174.26*/.User.routes.UserController.logout()),format.raw/*174.62*/("""" class="btn btn-danger pull-center">
        Logout
    </a>
""")))};def /*212.2*/getUserSideButton/*212.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*212.23*/("""
    """),format.raw/*213.5*/("""<a href=""""),_display_(/*213.15*/getUserSettingsLink),format.raw/*213.34*/("""">
        <img class="settings-icon" src=""""),_display_(/*214.42*/routes/*214.48*/.Assets.versioned("images/navigation/settings.png")),format.raw/*214.99*/("""">
    </a>
""")))};def /*218.2*/getRightBlockUserInfo/*218.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*218.27*/("""
    """),format.raw/*219.5*/("""<ul class="top">
        <label class="media-heading navbar-user pull-center">
            Welcome, """),_display_(/*221.23*/if(isLoggedIn.equalsIgnoreCase("true"))/*221.62*/ {_display_(Seq[Any](format.raw/*221.64*/("""
            """),format.raw/*222.13*/("""<a href=""""),_display_(/*222.23*/getUserHomeLink),format.raw/*222.38*/("""">
            """),_display_(/*223.14*/session()/*223.23*/.get(AppTags.Session.SessionTags.display_name.toString)),format.raw/*223.78*/("""
            """),format.raw/*224.13*/("""</a>
            """),_display_(/*225.14*/getUserSideButton),format.raw/*225.31*/("""
        """)))}/*226.11*/else/*226.16*/{_display_(Seq[Any](format.raw/*226.17*/("""
            """),format.raw/*227.13*/("""New User
        """)))}),format.raw/*228.10*/("""
        """),format.raw/*229.9*/("""</label>
    </ul>
    <ul class="bottom text-center">
    """),_display_(/*232.6*/getProfileButtons),format.raw/*232.23*/("""
    """),format.raw/*233.5*/("""</ul>
""")))};def /*236.2*/nav_section/*236.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*236.17*/("""
    """),format.raw/*237.5*/("""<section class="menu-section">
        <a class="top app-logo" href=""""),_display_(/*238.40*/getUserHomeLink),format.raw/*238.55*/("""">
            <img src=""""),_display_(/*239.24*/routes/*239.30*/.Assets.versioned("images/logo.png")),format.raw/*239.66*/(""""/>
        </a>
        <div class="navbar navbar-inverse set-radius-zero">
            <div class="container">
                <div class="row ">
                    <div class="col-md-pull-12">
                        <div class="navbar-collapse collapse ">
                            <ul class="nav navbar-nav navbar-left navbar-top nav-text-enlarge">
                            """),_display_(/*247.30*/getUserNav),format.raw/*247.40*/("""
                            """),format.raw/*248.29*/("""</ul>
                            <ul class="right-container navbar-btn navbar-right">
                            """),_display_(/*250.30*/getRightBlockUserInfo),format.raw/*250.51*/("""
                            """),format.raw/*251.29*/("""</ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
""")))};def /*11.2*/getUserType/*11.13*/ = {{
    session().get(user_type.toString)
}};def /*123.2*/getUserNav/*123.12*/ = {{
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
}};def /*140.2*/getUserHomeLink/*140.17*/ = {{
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
}};def /*179.2*/isLoggedIn/*179.12*/ = {{
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
}};def /*193.2*/getUserSettingsLink/*193.21*/ = {{
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
Seq[Any](format.raw/*9.23*/("""

"""),format.raw/*13.2*/("""

"""),format.raw/*42.2*/("""

"""),format.raw/*57.2*/("""

"""),format.raw/*72.2*/("""

"""),format.raw/*87.2*/("""

"""),format.raw/*91.2*/("""

"""),format.raw/*121.2*/("""

"""),format.raw/*138.2*/("""

"""),format.raw/*157.2*/("""

"""),format.raw/*165.2*/("""

"""),format.raw/*171.2*/("""

"""),format.raw/*177.2*/("""

"""),format.raw/*191.2*/("""

"""),format.raw/*210.2*/("""

"""),format.raw/*216.2*/("""

"""),format.raw/*234.2*/("""

"""),format.raw/*258.2*/("""


"""),_display_(/*261.2*/nav/*261.5*/.apply("null", nav_section)))
      }
    }
  }

  def render(nav_extension:Html): play.twirl.api.HtmlFormat.Appendable = apply(nav_extension)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (nav_extension) => apply(nav_extension)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 15 01:25:53 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/nav_wrapper.scala.html
                  HASH: 957a791812032da3c4c5701da57900c5a7bfda10
                  MATRIX: 665->1|696->26|742->66|809->127|890->202|962->268|1028->328|1355->349|1455->432|1480->448|1561->452|1593->457|1634->471|1654->482|1714->521|1751->531|1792->551|1833->564|1849->570|1922->621|2875->1547|2953->1604|3029->1653|3105->1708|3172->1748|3256->1811|3326->1854|3412->1919|3463->1950|3492->1970|3573->1974|3605->1979|3646->1993|3666->2004|3730->2047|3767->2057|3809->2077|3850->2090|3866->2096|3939->2147|4020->2201|4040->2212|4115->2266|4152->2276|4194->2296|4235->2309|4251->2315|4324->2366|4409->2424|4429->2435|4504->2489|4541->2499|4583->2519|4624->2532|4640->2538|4713->2589|4798->2647|4818->2658|4896->2715|4933->2725|4975->2745|5016->2758|5032->2764|5105->2815|5172->2862|5197->2878|5278->2882|5310->2887|5351->2901|5371->2912|5436->2956|5473->2966|5515->2986|5556->2999|5572->3005|5645->3056|5726->3110|5746->3121|5826->3180|5863->3190|5905->3210|5946->3223|5962->3229|6035->3280|6124->3342|6144->3353|6225->3413|6263->3423|6305->3443|6346->3456|6362->3462|6435->3513|6525->3576|6545->3587|6628->3649|6666->3659|6708->3679|6749->3692|6765->3698|6838->3749|6909->3800|6931->3813|7012->3817|7044->3822|7085->3836|7105->3847|7165->3886|7202->3896|7243->3916|7284->3929|7300->3935|7373->3986|7454->4040|7474->4051|7537->4093|7574->4103|7616->4123|7657->4136|7673->4142|7746->4193|7830->4250|7850->4261|7913->4303|7950->4313|7992->4333|8033->4346|8049->4352|8122->4403|8206->4460|8226->4471|8293->4517|8330->4527|8372->4547|8413->4560|8429->4566|8502->4617|8566->4661|8595->4681|8676->4685|8708->4690|8767->4729|8789->4742|8870->4746|8902->4751|8943->4765|8963->4776|9026->4818|9063->4828|9105->4848|9215->4931|9256->4951|10132->5799|10174->5819|10254->5871|10275->5882|10341->5926|10379->5936|10422->5956|10483->7286|10510->7303|10592->7307|10621->7309|10670->7348|10711->7350|10744->7356|10781->7371|10802->7374|10815->7379|10854->7380|10887->7386|10923->7400|10956->7402|10982->7407|11006->7421|11088->7425|11121->7430|11159->7440|11180->7451|11237->7486|11324->7552|11349->7567|11431->7571|11464->7576|11502->7586|11523->7597|11581->7633|11668->8798|11695->8815|11777->8819|11810->8824|11848->8834|11889->8853|11961->8897|11977->8903|12050->8954|12087->8970|12118->8991|12200->8995|12233->9000|12362->9101|12411->9140|12452->9142|12494->9155|12532->9165|12569->9180|12613->9196|12632->9205|12709->9260|12751->9273|12797->9291|12836->9308|12866->9319|12880->9324|12920->9325|12962->9338|13012->9356|13049->9365|13136->9425|13175->9442|13208->9447|13239->9457|13260->9468|13342->9472|13375->9477|13473->9547|13510->9562|13564->9588|13580->9594|13638->9630|14052->10016|14084->10026|14142->10055|14286->10171|14329->10192|14387->10221|14547->373|14567->384|14627->5996|14647->6006|15134->6481|15159->6496|15961->7699|15981->7709|16259->7975|16288->7994|17119->370|17148->429|17177->1947|17206->2859|17235->3797|17264->4658|17293->4726|17323->5993|17353->6478|17383->7283|17413->7404|17443->7549|17473->7696|17503->7972|17533->8795|17563->8967|17593->9454|17623->10358|17654->10362|17666->10365
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->6|30->7|35->9|39->15|39->15|41->15|42->16|42->16|42->16|42->16|42->16|42->16|42->16|42->16|42->16|64->38|64->38|65->39|65->39|66->40|66->40|67->41|67->41|68->44|68->44|70->44|71->45|71->45|71->45|71->45|71->45|71->45|71->45|71->45|71->45|74->48|74->48|74->48|74->48|74->48|74->48|74->48|74->48|77->51|77->51|77->51|77->51|77->51|77->51|77->51|77->51|80->54|80->54|80->54|80->54|80->54|80->54|80->54|80->54|83->59|83->59|85->59|86->60|86->60|86->60|86->60|86->60|86->60|86->60|86->60|86->60|89->63|89->63|89->63|89->63|89->63|89->63|89->63|89->63|92->66|92->66|92->66|92->66|92->66|92->66|92->66|92->66|95->69|95->69|95->69|95->69|95->69|95->69|95->69|95->69|98->74|98->74|100->74|101->75|101->75|101->75|101->75|101->75|101->75|101->75|101->75|101->75|104->78|104->78|104->78|104->78|104->78|104->78|104->78|104->78|107->81|107->81|107->81|107->81|107->81|107->81|107->81|107->81|110->84|110->84|110->84|110->84|110->84|110->84|110->84|110->84|113->89|113->89|115->89|116->90|117->93|117->93|119->93|120->94|120->94|120->94|120->94|120->94|120->94|124->98|124->98|141->115|141->115|144->118|144->118|144->118|144->118|144->118|147->159|147->159|149->159|150->160|150->160|150->160|151->161|151->161|152->162|152->162|152->162|153->163|153->163|154->164|155->167|155->167|157->167|158->168|158->168|158->168|158->168|161->173|161->173|163->173|164->174|164->174|164->174|164->174|167->212|167->212|169->212|170->213|170->213|170->213|171->214|171->214|171->214|173->218|173->218|175->218|176->219|178->221|178->221|178->221|179->222|179->222|179->222|180->223|180->223|180->223|181->224|182->225|182->225|183->226|183->226|183->226|184->227|185->228|186->229|189->232|189->232|190->233|191->236|191->236|193->236|194->237|195->238|195->238|196->239|196->239|196->239|204->247|204->247|205->248|207->250|207->250|208->251|215->11|215->11|217->123|217->123|232->140|232->140|249->179|249->179|261->193|261->193|279->9|281->13|283->42|285->57|287->72|289->87|291->91|293->121|295->138|297->157|299->165|301->171|303->177|305->191|307->210|309->216|311->234|313->258|316->261|316->261
                  -- GENERATED --
              */
          