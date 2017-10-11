
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

object dashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[DashboardButton],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(dashButtons: List[DashboardButton], bodyContent: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*6.2*/generateDashButton/*6.20*/(dashboardButton: DashboardButton):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.58*/("""
        """),format.raw/*7.9*/("""<a href=""""),_display_(/*7.19*/CSRF/*7.23*/.apply(dashboardButton.link)/*7.51*/(requestHeader)),format.raw/*7.66*/("""">
            <div class="col-md-3 col-sm-3 col-xs-6">
                <div class="alert """),_display_(/*9.36*/dashboardButton/*9.51*/.cssClassButtonColour),format.raw/*9.72*/(""" """),format.raw/*9.73*/("""back-widget-set text-center">
                    <i class="fa """),_display_(/*10.35*/dashboardButton/*10.50*/.cssClassMainImage),format.raw/*10.68*/(""" """),format.raw/*10.69*/("""fa-5x"></i>
                    <h3>"""),_display_(/*11.26*/dashboardButton/*11.41*/.largeText),format.raw/*11.51*/(""";
                        <i class="fa """),_display_(/*12.39*/dashboardButton/*12.54*/.cssClassSecondaryImage),format.raw/*12.77*/(""""></i></h3>
                """),_display_(/*13.18*/dashboardButton/*13.33*/.smallText),format.raw/*13.43*/("""
                """),format.raw/*14.17*/("""</div>
            </div>
        </a>
""")))};def /*20.2*/bodyContent/*20.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.17*/("""

    """),format.raw/*22.5*/("""<div class="container row">
        """),_display_(/*23.10*/for(button <- dashButtons) yield /*23.36*/{_display_(Seq[Any](format.raw/*23.37*/("""
            """),_display_(/*24.14*/generateDashButton(button)),format.raw/*24.40*/("""
        """)))}),format.raw/*25.10*/("""
    """),format.raw/*26.5*/("""</div>
""")))};
Seq[Any](format.raw/*4.57*/("""

"""),format.raw/*17.2*/("""


"""),format.raw/*27.2*/("""

"""),_display_(/*29.2*/masterpage/*29.12*/.apply(" :: Dashboard", bodyContent)))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],bodyContent:Html): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,bodyContent)

  def f:((List[DashboardButton],Html) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,bodyContent) => apply(dashButtons,bodyContent)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 11 23:05:58 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/dashboard.scala.html
                  HASH: d7fafa8ec21521d6c533384d877050875f068fb5
                  MATRIX: 665->1|702->32|1061->65|1194->123|1220->141|1334->179|1369->188|1405->198|1417->202|1453->230|1488->245|1605->336|1628->351|1669->372|1697->373|1788->437|1812->452|1851->470|1880->471|1944->508|1968->523|1999->533|2066->573|2090->588|2134->611|2190->640|2214->655|2245->665|2290->682|2353->726|2373->737|2454->741|2487->747|2551->784|2593->810|2632->811|2673->825|2720->851|2761->861|2793->866|2840->120|2869->722|2899->874|2928->877|2947->887
                  LINES: 24->1|25->2|30->4|34->6|34->6|36->6|37->7|37->7|37->7|37->7|37->7|39->9|39->9|39->9|39->9|40->10|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|47->20|47->20|49->20|51->22|52->23|52->23|52->23|53->24|53->24|54->25|55->26|57->4|59->17|62->27|64->29|64->29
                  -- GENERATED --
              */
          