
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
/*6.2*/import controllers.Application.AppTags

object nav_wrapper extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Html,play.api.mvc.RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(nav_extension: Html)(implicit request: play.api.mvc.RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/nav_section/*9.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.17*/("""
    """),format.raw/*10.5*/("""<section class="menu-section">
        <a class="top app-logo" href=""""),_display_(/*11.40*/controllers/*11.51*/.User.routes.CustomerController.index()),format.raw/*11.90*/("""">
            <img src="/assets/images/logo.png"/>
        </a>
        <div class="navbar navbar-inverse set-radius-zero">
            <div class="container">
                <div class="row ">
                    <div class="col-md-pull-12">
                        <div class="navbar-collapse collapse ">
                            <ul class="nav navbar-nav navbar-left navbar-top nav-text-enlarge">
                            """),_display_(/*20.30*/if(request.session.get(AppTags.Session.User.token.toString).isDefined)/*20.100*/ {_display_(Seq[Any](format.raw/*20.102*/("""
                                """),format.raw/*21.60*/("""
                                """),format.raw/*22.33*/("""<li><a href=""""),_display_(/*22.47*/controllers/*22.58*/.User.routes.CustomerController.index()),format.raw/*22.97*/("""" class="menu-top-active nav-text-enlarge"><img src=""""),_display_(/*22.151*/routes/*22.157*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*22.208*/(""""/>
                                    Dashboard</a>
                                </li>
                                """),format.raw/*25.55*/("""
                                """),format.raw/*26.33*/("""<li>
                                    <a href="#" class="dropdown-toggle" id="ddlmenuItem" data-toggle="dropdown">
                                        Menu
                                        <i class="fa fa-angle-down"></i>
                                    </a>
                                    <ul class="dropdown-menu" role="menu" aria-labelledby="ddlmenuItem">
                                        """),format.raw/*32.74*/("""
                                        """),format.raw/*33.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#breakfasts">
                                            Breakfasts</a></li>
                                        """),format.raw/*35.71*/("""
                                        """),format.raw/*36.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#lunches">
                                            Lunches</a></li>
                                        """),format.raw/*38.71*/("""
                                        """),format.raw/*39.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#dinners">
                                            Dinners</a></li>
                                        """),format.raw/*41.72*/("""
                                        """),format.raw/*42.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#desserts">
                                            Desserts</a></li>
                                        """),format.raw/*44.70*/("""
                                        """),format.raw/*45.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#snacks">
                                            Snacks</a></li>
                                    </ul>
                                </li>

                                <li><a href="#">Order Schedule</a></li>
                                <li><a href=""""),_display_(/*51.47*/controllers/*51.58*/.Finance.routes.UserFinance.addFunds()),format.raw/*51.96*/("""">Add Funds</a> </li>
                                <li><a href="#">TODO</a></li>
                                <li><a href="#">TODO</a></li>
                            """)))}/*54.31*/else/*54.36*/{_display_(Seq[Any](format.raw/*54.37*/("""
                                """),format.raw/*55.55*/("""
                                """),format.raw/*56.33*/("""<li>
                                    <a href="#" class="dropdown-toggle" id="ddlmenuItem" data-toggle="dropdown">
                                        Menu
                                        <i class="fa fa-angle-down"></i>
                                    </a>
                                    <ul class="dropdown-menu" role="menu" aria-labelledby="ddlmenuItem">
                                        """),format.raw/*62.74*/("""
                                        """),format.raw/*63.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#breakfasts">
                                            Breakfasts</a></li>
                                        """),format.raw/*65.71*/("""
                                        """),format.raw/*66.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#lunches">
                                            Lunches</a></li>
                                        """),format.raw/*68.71*/("""
                                        """),format.raw/*69.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#dinners">
                                            Dinners</a></li>
                                        """),format.raw/*71.72*/("""
                                        """),format.raw/*72.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#desserts">
                                            Desserts</a></li>
                                        """),format.raw/*74.70*/("""
                                        """),format.raw/*75.41*/("""<li role="presentation"><a role="menuitem" tabindex="-1" href="#snacks">
                                            Snacks</a></li>
                                    </ul>
                                </li>
                                <li><a href="#">TODO</a></li>
                                <li><a href="#">TODO</a></li>
                            """)))}),format.raw/*81.30*/("""
                            """),format.raw/*82.29*/("""</ul>
                            <ul class="right-container navbar-btn navbar-right">
                            """),_display_(/*84.30*/if(request.session.get(AppTags.Session.User.token.toString).isDefined)/*84.100*/ {_display_(Seq[Any](format.raw/*84.102*/("""
                                """),format.raw/*85.33*/("""<ul class="top">
                                    <label class="media-heading navbar-user pull-center">Welcome, """),_display_(/*86.100*/session/*86.107*/.get(AppTags.Session.User.name.toString)),format.raw/*86.147*/("""
                                    """),format.raw/*87.37*/("""</label>
                                    <a href=""""),_display_(/*88.47*/controllers/*88.58*/.User.routes.CustomerController.edit()),format.raw/*88.96*/("""">
                                        <img class="settings-icon" src=""""),_display_(/*89.74*/routes/*89.80*/.Assets.versioned("images/navigation/settings.png")),format.raw/*89.131*/("""">
                                    </a>
                                </ul>
                                <ul class="bottom text-center">
                                    <a href=""""),_display_(/*93.47*/controllers/*93.58*/.User.routes.UserController.logout()),format.raw/*93.94*/("""" class="btn btn-danger pull-center">
                                        Logout</a>
                                </ul>
                            """)))}/*96.31*/else/*96.36*/{_display_(Seq[Any](format.raw/*96.37*/("""
                                """),format.raw/*97.33*/("""<ul class="top">
                                    <label class="media-heading navbar-user pull-center">
                                        Welcome, New User</label>
                                </ul>

                                <ul class="bottom text-center">
                                    <a href=""""),_display_(/*103.47*/controllers/*103.58*/.User.routes.UserController.login()),format.raw/*103.93*/("""" class="btn btn-success pull-center">
                                        Login</a>
                                </ul>
                            """)))}),format.raw/*106.30*/("""

                            """),format.raw/*108.29*/("""</ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

"""),_display_(/*116.2*/nav_extension),format.raw/*116.15*/("""
""")))};
Seq[Any](format.raw/*7.69*/("""

"""),format.raw/*117.2*/("""

"""),_display_(/*119.2*/nav/*119.5*/.apply("null", nav_section)))
      }
    }
  }

  def render(nav_extension:Html,request:play.api.mvc.RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(nav_extension)(request)

  def f:((Html) => (play.api.mvc.RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (nav_extension) => (request) => apply(nav_extension)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 24 23:41:09 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/nav_wrapper.scala.html
                  HASH: 09dd78730a2a956df3dfa2583e24fa93b05dc87e
                  MATRIX: 665->1|696->165|1070->205|1215->275|1234->286|1314->290|1346->295|1443->365|1463->376|1523->415|1984->849|2064->919|2105->921|2166->981|2227->1014|2268->1028|2288->1039|2348->1078|2430->1132|2446->1138|2519->1189|2671->1335|2732->1368|3182->1823|3251->1864|3460->2075|3529->2116|3732->2321|3801->2362|4004->2568|4073->2609|4278->2815|4347->2856|4706->3188|4726->3199|4785->3237|4979->3413|4992->3418|5031->3419|5092->3474|5153->3507|5603->3962|5672->4003|5881->4214|5950->4255|6153->4460|6222->4501|6425->4707|6494->4748|6699->4954|6768->4995|7165->5361|7222->5390|7365->5506|7445->5576|7486->5578|7547->5611|7691->5727|7708->5734|7770->5774|7835->5811|7917->5866|7937->5877|7996->5915|8099->5991|8114->5997|8187->6048|8406->6240|8426->6251|8483->6287|8658->6444|8671->6449|8710->6450|8771->6483|9121->6805|9142->6816|9199->6851|9387->7007|9446->7037|9611->7175|9646->7188|9687->272|9717->7190|9747->7193|9759->7196
                  LINES: 24->1|25->6|30->7|34->9|34->9|36->9|37->10|38->11|38->11|38->11|47->20|47->20|47->20|48->21|49->22|49->22|49->22|49->22|49->22|49->22|49->22|52->25|53->26|59->32|60->33|62->35|63->36|65->38|66->39|68->41|69->42|71->44|72->45|78->51|78->51|78->51|81->54|81->54|81->54|82->55|83->56|89->62|90->63|92->65|93->66|95->68|96->69|98->71|99->72|101->74|102->75|108->81|109->82|111->84|111->84|111->84|112->85|113->86|113->86|113->86|114->87|115->88|115->88|115->88|116->89|116->89|116->89|120->93|120->93|120->93|123->96|123->96|123->96|124->97|130->103|130->103|130->103|133->106|135->108|143->116|143->116|145->7|147->117|149->119|149->119
                  -- GENERATED --
              */
          