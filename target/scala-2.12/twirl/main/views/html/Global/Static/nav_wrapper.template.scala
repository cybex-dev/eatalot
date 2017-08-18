
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
                                """),format.raw/*20.60*/("""
                                """),format.raw/*21.33*/("""<li><a href=""""),_display_(/*21.47*/controllers/*21.58*/.User.routes.CustomerController.index()),format.raw/*21.97*/("""" class="menu-top-active nav-text-enlarge"><img src=""""),_display_(/*21.151*/routes/*21.157*/.Assets.versioned("images/navigation/nav_dash.png")),format.raw/*21.208*/(""""/>
                                    Dashboard</a></li>

                                """),format.raw/*24.55*/("""
                                """),format.raw/*25.41*/("""
                                    """),format.raw/*26.163*/("""
                                        """),format.raw/*27.49*/("""
                                        """),format.raw/*28.77*/("""
                                    """),format.raw/*29.45*/("""
                                    """),format.raw/*30.109*/("""
                                        """),format.raw/*31.121*/("""
                                            """),format.raw/*32.68*/("""
                                        """),format.raw/*33.118*/("""
                                            """),format.raw/*34.65*/("""
                                        """),format.raw/*35.118*/("""
                                            """),format.raw/*36.65*/("""
                                        """),format.raw/*37.119*/("""
                                            """),format.raw/*38.66*/("""
                                        """),format.raw/*39.117*/("""
                                            """),format.raw/*40.64*/("""
                                    """),format.raw/*41.46*/("""
                                """),format.raw/*42.42*/("""
                                """),format.raw/*43.33*/("""<li><a href="#">TODO</a> </li>
                                <li><a href="#">TODO</a></li>
                                <li><a href="#">TODO</a></li>
                            </ul>
                            <ul class="right-container navbar-btn navbar-right">
                            """),_display_(/*48.30*/if(request.session.get(AppTags.Session.User.token.toString).isDefined)/*48.100*/ {_display_(Seq[Any](format.raw/*48.102*/("""
                                """),format.raw/*49.33*/("""<ul class="top">
                                    <label class="media-heading navbar-user pull-center">Welcome, """),_display_(/*50.100*/session/*50.107*/.get(AppTags.Session.User.name.toString)),format.raw/*50.147*/("""
                                    """),format.raw/*51.37*/("""</label>
                                    <a href=""""),_display_(/*52.47*/controllers/*52.58*/.User.routes.CustomerController.edit()),format.raw/*52.96*/("""">
                                        <img class="settings-icon" src=""""),_display_(/*53.74*/routes/*53.80*/.Assets.versioned("images/navigation/settings.png")),format.raw/*53.131*/("""">
                                    </a>
                                </ul>
                                <ul class="bottom text-center">
                                    <a href=""""),_display_(/*57.47*/controllers/*57.58*/.User.routes.UserController.logout()),format.raw/*57.94*/("""" class="btn btn-danger pull-center">
                                        Logout</a>
                                </ul>
                            """)))}/*60.31*/else/*60.36*/{_display_(Seq[Any](format.raw/*60.37*/("""
                                """),format.raw/*61.33*/("""<ul class="top">
                                    <label class="media-heading navbar-user pull-center">
                                        Welcome, New User</label>
                                </ul>

                                <ul class="bottom text-center">
                                    <a href=""""),_display_(/*67.47*/controllers/*67.58*/.User.routes.UserController.login()),format.raw/*67.93*/("""" class="btn btn-success pull-center">
                                        Login</a>
                                </ul>
                            """)))}),format.raw/*70.30*/("""

                            """),format.raw/*72.29*/("""</ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

"""),_display_(/*80.2*/nav_extension),format.raw/*80.15*/("""
""")))};
Seq[Any](format.raw/*7.69*/("""

"""),format.raw/*81.2*/("""

"""),_display_(/*83.2*/nav/*83.5*/.apply("null", nav_section)))
      }
    }
  }

  def render(nav_extension:Html,request:play.api.mvc.RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(nav_extension)(request)

  def f:((Html) => (play.api.mvc.RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (nav_extension) => (request) => apply(nav_extension)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Aug 18 19:03:53 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/nav_wrapper.scala.html
                  HASH: b430545540f83175ffe6f7e958bd53f3485bbf8d
                  MATRIX: 665->1|696->165|1070->205|1215->275|1234->286|1314->290|1346->295|1443->365|1463->376|1523->415|1988->879|2049->912|2090->926|2110->937|2170->976|2252->1030|2268->1036|2341->1087|2461->1201|2522->1242|2588->1405|2657->1454|2726->1531|2791->1576|2857->1685|2927->1806|3000->1874|3070->1992|3143->2057|3213->2175|3286->2240|3356->2359|3429->2425|3499->2542|3572->2606|3637->2652|3698->2694|3759->2727|4085->3026|4165->3096|4206->3098|4267->3131|4411->3247|4428->3254|4490->3294|4555->3331|4637->3386|4657->3397|4716->3435|4819->3511|4834->3517|4907->3568|5126->3760|5146->3771|5203->3807|5378->3964|5391->3969|5430->3970|5491->4003|5840->4325|5860->4336|5916->4371|6103->4527|6161->4557|6325->4695|6359->4708|6400->272|6429->4710|6458->4713|6469->4716
                  LINES: 24->1|25->6|30->7|34->9|34->9|36->9|37->10|38->11|38->11|38->11|47->20|48->21|48->21|48->21|48->21|48->21|48->21|48->21|51->24|52->25|53->26|54->27|55->28|56->29|57->30|58->31|59->32|60->33|61->34|62->35|63->36|64->37|65->38|66->39|67->40|68->41|69->42|70->43|75->48|75->48|75->48|76->49|77->50|77->50|77->50|78->51|79->52|79->52|79->52|80->53|80->53|80->53|84->57|84->57|84->57|87->60|87->60|87->60|88->61|94->67|94->67|94->67|97->70|99->72|107->80|107->80|109->7|111->81|113->83|113->83
                  -- GENERATED --
              */
          