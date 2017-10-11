
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

object nav_wrapper extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(nav_extension: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*29.2*/nav_section/*29.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*29.17*/("""
    """),format.raw/*30.5*/("""<section class="menu-section">
        <a class="top app-logo" href=""""),_display_(/*31.40*/getUserHome),format.raw/*31.51*/("""">
            <img src=""""),_display_(/*32.24*/routes/*32.30*/.Assets.versioned("images/logo.png")),format.raw/*32.66*/(""""/>
        </a>
        <div class="navbar navbar-inverse set-radius-zero">
            <div class="container">
                <div class="row ">
                    <div class="col-md-pull-12">
                        <div class="navbar-collapse collapse ">
                            <ul class="nav navbar-nav navbar-left navbar-top nav-text-enlarge">
                            """),_display_(/*40.30*/if(session().containsKey(AppTags.Session.SessionTags.session_status.toString))/*40.108*/ {_display_(Seq[Any](format.raw/*40.110*/("""
                                """),format.raw/*41.60*/("""
                                """),format.raw/*42.33*/("""<li><a href=""""),_display_(/*42.47*/controllers/*42.58*/.User.routes.CustomerController.index()),format.raw/*42.97*/("""" class="menu-top-active nav-text-enlarge"><img src=""""),_display_(/*42.151*/routes/*42.157*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*42.208*/(""""/>
                                    Dashboard</a>
                                </li>
                                """),format.raw/*45.55*/("""
                                """),format.raw/*46.33*/("""<li>
                                    <a href="#" class="dropdown-toggle" id="ddlmenuItem" data-toggle="dropdown">
                                        Menu
                                        <i class="fa fa-angle-down"></i>
                                    </a>
                                    <ul class="dropdown-menu" role="menu" aria-labelledby="ddlmenuItem">
                                        """),format.raw/*52.74*/("""
                                        """),format.raw/*53.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#breakfasts">
                                            Breakfasts</a></li>
                                        """),format.raw/*55.71*/("""
                                        """),format.raw/*56.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#lunches">
                                            Lunches</a></li>
                                        """),format.raw/*58.71*/("""
                                        """),format.raw/*59.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#dinners">
                                            Dinners</a></li>
                                        """),format.raw/*61.72*/("""
                                        """),format.raw/*62.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#desserts">
                                            Desserts</a></li>
                                        """),format.raw/*64.70*/("""
                                        """),format.raw/*65.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#snacks">
                                            Snacks</a></li>
                                    </ul>
                                </li>

                                <li><a href="#">Order Schedule</a></li>
                                <li><a href=""""),_display_(/*71.47*/controllers/*71.58*/.Finance.routes.UserFinance.addFunds()),format.raw/*71.96*/("""">Add Funds</a> </li>
                                <li><a href="#">TODO</a></li>
                                <li><a href="#">TODO</a></li>
                            """)))}/*74.31*/else/*74.36*/{_display_(Seq[Any](format.raw/*74.37*/("""
                                """),format.raw/*75.55*/("""
                                """),format.raw/*76.33*/("""<li>
                                    <a href="#" class="dropdown-toggle" id="ddlmenuItem" data-toggle="dropdown">
                                        Menu
                                        <i class="fa fa-angle-down"></i>
                                    </a>
                                    <ul class="dropdown-menu" role="menu" aria-labelledby="ddlmenuItem">
                                        """),format.raw/*82.74*/("""
                                        """),format.raw/*83.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#breakfasts">
                                            Breakfasts</a></li>
                                        """),format.raw/*85.71*/("""
                                        """),format.raw/*86.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#lunches">
                                            Lunches</a></li>
                                        """),format.raw/*88.71*/("""
                                        """),format.raw/*89.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#dinners">
                                            Dinners</a></li>
                                        """),format.raw/*91.72*/("""
                                        """),format.raw/*92.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#desserts">
                                            Desserts</a></li>
                                        """),format.raw/*94.70*/("""
                                        """),format.raw/*95.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#snacks">
                                            Snacks</a></li>
                                    </ul>
                                </li>
                                <li><a href="#">TODO</a></li>
                                <li><a href="#">TODO</a></li>
                            """)))}),format.raw/*101.30*/("""
                            """),format.raw/*102.29*/("""</ul>
                            <ul class="right-container navbar-btn navbar-right">
                            """),_display_(/*104.30*/if(session().containsKey(AppTags.Session.SessionTags.session_status.toString))/*104.108*/ {_display_(Seq[Any](format.raw/*104.110*/("""
                                """),format.raw/*105.33*/("""<ul class="top">
                                    <label class="media-heading navbar-user pull-center">
                                        Welcome, """),_display_(/*107.51*/session/*107.58*/.get(AppTags.Session.User.name.toString)),format.raw/*107.98*/("""
                                    """),format.raw/*108.37*/("""</label>
                                    <a href=""""),_display_(/*109.47*/controllers/*109.58*/.User.routes.CustomerController.edit()),format.raw/*109.96*/("""">
                                        <img class="settings-icon" src=""""),_display_(/*110.74*/routes/*110.80*/.Assets.versioned("images/navigation/settings.png")),format.raw/*110.131*/("""">
                                    </a>
                                </ul>
                                <ul class="bottom text-center">
                                    <a href=""""),_display_(/*114.47*/controllers/*114.58*/.User.routes.UserController.logout()),format.raw/*114.94*/("""" class="btn btn-danger pull-center">
                                        Logout</a>
                                </ul>
                            """)))}/*117.31*/else/*117.36*/{_display_(Seq[Any](format.raw/*117.37*/("""
                                """),format.raw/*118.33*/("""<ul class="top">
                                    <label class="media-heading navbar-user pull-center">
                                        Welcome, New User</label>
                                </ul>

                                <ul class="bottom text-center">
                                    <a href=""""),_display_(/*124.47*/controllers/*124.58*/.User.routes.UserController.login()),format.raw/*124.93*/("""" class="btn btn-success pull-center">
                                        Login</a>
                                </ul>
                            """)))}),format.raw/*127.30*/("""

                            """),format.raw/*129.29*/("""</ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
""")))};def /*6.2*/getUserType/*6.13*/ = {{
    session().get(AppTags.Session.SessionTags.session_status.toString)
}};def /*10.2*/getUserHome/*10.13*/ = {{
    if(!session().containsKey(AppTags.Session.SessionTags.session_status.toString)) {
        controllers.Application.routes.HomeController.index()
    } else {
        var userType = getUserType
        if(userType == CUSTOMER.toString) {
            controllers.User.routes.CustomerController.index()
        } else if(userType == KITCHEN.toString) {
            controllers.User.routes.StaffController.index()
        } else if(userType == DELIVERY.toString) {
            controllers.User.routes.StaffController.index()
        } else if(userType == ADMIN.toString) {
            controllers.User.routes.AdminController.index()
        } else {
            controllers.Application.routes.HomeController.unknown()
        }
    }
}};
Seq[Any](format.raw/*4.23*/("""

"""),format.raw/*8.2*/("""

"""),format.raw/*27.2*/("""

"""),format.raw/*136.2*/("""


"""),_display_(/*139.2*/nav/*139.5*/.apply("null", nav_section)))
      }
    }
  }

  def render(nav_extension:Html): play.twirl.api.HtmlFormat.Appendable = apply(nav_extension)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (nav_extension) => apply(nav_extension)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 12 01:28:03 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/nav_wrapper.scala.html
                  HASH: 048f368233adbb9cc6460a9e69ed85efd35b2f49
                  MATRIX: 665->1|696->26|742->66|1110->127|1210->997|1230->1008|1311->1012|1343->1017|1440->1087|1472->1098|1525->1124|1540->1130|1597->1166|2010->1552|2098->1630|2139->1632|2200->1692|2261->1725|2302->1739|2322->1750|2382->1789|2464->1843|2480->1849|2553->1900|2705->2046|2766->2079|3216->2534|3285->2575|3494->2786|3563->2827|3766->3032|3835->3073|4038->3279|4107->3320|4312->3526|4381->3567|4740->3899|4760->3910|4819->3948|5013->4124|5026->4129|5065->4130|5126->4185|5187->4218|5637->4673|5706->4714|5915->4925|5984->4966|6187->5171|6256->5212|6459->5418|6528->5459|6733->5665|6802->5706|7200->6072|7258->6101|7402->6217|7491->6295|7533->6297|7595->6330|7780->6487|7797->6494|7859->6534|7925->6571|8008->6626|8029->6637|8089->6675|8193->6751|8209->6757|8283->6808|8503->7000|8524->7011|8582->7047|8758->7204|8772->7209|8812->7210|8874->7243|9224->7565|9245->7576|9302->7611|9490->7767|9549->7797|9708->151|9727->162|9819->243|9839->254|10609->148|10637->240|10666->994|10696->7934|10727->7938|10739->7941
                  LINES: 24->1|25->2|26->3|31->4|35->29|35->29|37->29|38->30|39->31|39->31|40->32|40->32|40->32|48->40|48->40|48->40|49->41|50->42|50->42|50->42|50->42|50->42|50->42|50->42|53->45|54->46|60->52|61->53|63->55|64->56|66->58|67->59|69->61|70->62|72->64|73->65|79->71|79->71|79->71|82->74|82->74|82->74|83->75|84->76|90->82|91->83|93->85|94->86|96->88|97->89|99->91|100->92|102->94|103->95|109->101|110->102|112->104|112->104|112->104|113->105|115->107|115->107|115->107|116->108|117->109|117->109|117->109|118->110|118->110|118->110|122->114|122->114|122->114|125->117|125->117|125->117|126->118|132->124|132->124|132->124|135->127|137->129|144->6|144->6|146->10|146->10|164->4|166->8|168->27|170->136|173->139|173->139
                  -- GENERATED --
              */
          