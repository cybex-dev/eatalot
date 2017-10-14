
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
    """),_display_(/*8.6*/helper/*8.12*/.form(dashboardButton.link)/*8.39*/ {_display_(Seq[Any](format.raw/*8.41*/("""
        """),_display_(/*9.10*/CSRF/*9.14*/.formField),format.raw/*9.24*/("""
        """),format.raw/*10.9*/("""<a><div class="col-md-3 col-sm-3 col-xs-6" id="dashButton"""),_display_(/*10.67*/index),format.raw/*10.72*/("""">
                <div class="alert """),_display_(/*11.36*/dashboardButton/*11.51*/.cssClassButtonColour),format.raw/*11.72*/(""" """),format.raw/*11.73*/("""back-widget-set text-center">
                    <i class="fa """),_display_(/*12.35*/dashboardButton/*12.50*/.cssClassMainImage),format.raw/*12.68*/(""" """),format.raw/*12.69*/("""fa-5x"></i>
                    <h3>"""),_display_(/*13.26*/dashboardButton/*13.41*/.largeText),format.raw/*13.51*/("""
                        """),format.raw/*14.25*/("""<i class="fa """),_display_(/*14.39*/dashboardButton/*14.54*/.cssClassSecondaryImage),format.raw/*14.77*/(""""></i></h3>
                    """),_display_(/*15.22*/dashboardButton/*15.37*/.smallText),format.raw/*15.47*/("""
                """),format.raw/*16.17*/("""</div>
            </div>
        </a>
    """)))}),format.raw/*19.6*/("""
""")))};def /*22.2*/bodyContent/*22.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.17*/("""
    """),format.raw/*23.5*/("""<div class="container row">
        """),_display_(/*24.10*/for((button, index) <- dashButtons.zipWithIndex) yield /*24.58*/{_display_(Seq[Any](format.raw/*24.59*/("""
            """),_display_(/*25.14*/generateDashButton(button, index)),format.raw/*25.47*/("""
        """)))}),format.raw/*26.10*/("""
    """),format.raw/*27.5*/("""</div>
""")))};
Seq[Any](format.raw/*5.57*/("""

"""),format.raw/*20.2*/("""

"""),format.raw/*28.2*/("""

"""),_display_(/*30.2*/masterpage/*30.12*/.apply(" :: Dashboard", bodyContent)))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],bodyContent:Html): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,bodyContent)

  def f:((List[DashboardButton],Html) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,bodyContent) => apply(dashButtons,bodyContent)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 14 16:56:30 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/dashboard.scala.html
                  HASH: b54435bd76a9086f6352308244becb457d2590a5
                  MATRIX: 665->1|702->32|740->64|1090->88|1223->146|1249->164|1379->218|1410->224|1424->230|1459->257|1498->259|1534->269|1546->273|1576->283|1612->292|1697->350|1723->355|1788->393|1812->408|1854->429|1883->430|1974->494|1998->509|2037->527|2066->528|2130->565|2154->580|2185->590|2238->615|2279->629|2303->644|2347->667|2407->700|2431->715|2462->725|2507->742|2581->786|2606->791|2626->802|2707->806|2739->811|2803->848|2867->896|2906->897|2947->911|3001->944|3042->954|3074->959|3121->143|3150->788|3179->967|3208->970|3227->980
                  LINES: 24->1|25->2|26->3|31->5|35->7|35->7|37->7|38->8|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|41->11|42->12|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|44->14|45->15|45->15|45->15|46->16|49->19|50->22|50->22|52->22|53->23|54->24|54->24|54->24|55->25|55->25|56->26|57->27|59->5|61->20|63->28|65->30|65->30
                  -- GENERATED --
              */
          