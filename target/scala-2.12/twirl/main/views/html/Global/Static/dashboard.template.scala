
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
/*1.2*/import views.html.helper.CSRF
/*2.2*/import utility.DashboardButton
/*3.2*/import java.util.List

object dashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[DashboardButton],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(dashButtons: List[DashboardButton], bodyContent: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.2*/generateDashButton/*7.20*/(dashboardButton: DashboardButton, index: Integer):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.74*/("""
        """),format.raw/*8.9*/("""<a href=""""),_display_(/*8.19*/dashboardButton/*8.34*/.link),format.raw/*8.39*/("""">
            <div class="col-md-3 col-sm-3 col-xs-6" id="dashButton"""),_display_(/*9.68*/index),format.raw/*9.73*/("""">
                <div class="alert """),_display_(/*10.36*/dashboardButton/*10.51*/.cssClassButtonColour),format.raw/*10.72*/(""" """),format.raw/*10.73*/("""back-widget-set text-center">
                    <i class="fa """),_display_(/*11.35*/dashboardButton/*11.50*/.cssClassMainImage),format.raw/*11.68*/(""" """),format.raw/*11.69*/("""fa-5x"></i>
                    <h3>"""),_display_(/*12.26*/dashboardButton/*12.41*/.largeText),format.raw/*12.51*/("""
                        """),format.raw/*13.25*/("""<i class="fa """),_display_(/*13.39*/dashboardButton/*13.54*/.cssClassSecondaryImage),format.raw/*13.77*/(""""></i></h3>
                """),_display_(/*14.18*/dashboardButton/*14.33*/.smallText),format.raw/*14.43*/("""
                """),format.raw/*15.17*/("""</div>
            </div>
        </a>
""")))};def /*20.2*/bodyContent/*20.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.17*/("""
    """),format.raw/*21.5*/("""<div class="container row">
        """),_display_(/*22.10*/for((button, index) <- dashButtons.zipWithIndex) yield /*22.58*/{_display_(Seq[Any](format.raw/*22.59*/("""
            """),_display_(/*23.14*/generateDashButton(button, index)),format.raw/*23.47*/("""
        """)))}),format.raw/*24.10*/("""
    """),format.raw/*25.5*/("""</div>
""")))};
Seq[Any](format.raw/*5.57*/("""

"""),format.raw/*18.2*/("""

"""),format.raw/*26.2*/("""

"""),_display_(/*28.2*/masterpage/*28.12*/.apply(" :: Dashboard", bodyContent)))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],bodyContent:Html): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,bodyContent)

  def f:((List[DashboardButton],Html) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,bodyContent) => apply(dashButtons,bodyContent)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Oct 13 07:57:44 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/dashboard.scala.html
                  HASH: e99bb1582901c0bcd1a84b18082900020b64bee5
                  MATRIX: 665->1|702->32|740->64|1090->88|1223->146|1249->164|1379->218|1414->227|1450->237|1473->252|1498->257|1594->327|1619->332|1684->370|1708->385|1750->406|1779->407|1870->471|1894->486|1933->504|1962->505|2026->542|2050->557|2081->567|2134->592|2175->606|2199->621|2243->644|2299->673|2323->688|2354->698|2399->715|2462->758|2482->769|2563->773|2595->778|2659->815|2723->863|2762->864|2803->878|2857->911|2898->921|2930->926|2977->143|3006->755|3035->934|3064->937|3083->947
                  LINES: 24->1|25->2|26->3|31->5|35->7|35->7|37->7|38->8|38->8|38->8|38->8|39->9|39->9|40->10|40->10|40->10|40->10|41->11|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|43->13|44->14|44->14|44->14|45->15|48->20|48->20|50->20|51->21|52->22|52->22|52->22|53->23|53->23|54->24|55->25|57->5|59->18|61->26|63->28|63->28
                  -- GENERATED --
              */
          