
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
/*1.2*/import Global.Static.masterpage
/*2.2*/import views.html.helper.CSRF
/*3.2*/import utility.DashboardButton

object dashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[DashboardButton],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(dashButtons: List[DashboardButton], bodyContent: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.2*/generateDashButton/*7.20*/(dashboardButton: DashboardButton):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.58*/("""
        """),format.raw/*8.9*/("""<a href=""""),_display_(/*8.19*/CSRF/*8.23*/.apply(dashboardButton.link)/*8.51*/(requestHeader)),format.raw/*8.66*/("""">
            <div class="col-md-3 col-sm-3 col-xs-6">
                <div class="alert """),_display_(/*10.36*/dashboardButton/*10.51*/.cssClassButtonColour),format.raw/*10.72*/(""" """),format.raw/*10.73*/("""back-widget-set text-center">
                    <i class="fa """),_display_(/*11.35*/dashboardButton/*11.50*/.cssClassMainImage),format.raw/*11.68*/(""" """),format.raw/*11.69*/("""fa-5x"></i>
                    <h3>"""),_display_(/*12.26*/dashboardButton/*12.41*/.largeText),format.raw/*12.51*/(""";
                        <i class="fa """),_display_(/*13.39*/dashboardButton/*13.54*/.cssClassSecondaryImage),format.raw/*13.77*/(""""></i></h3>
                """),_display_(/*14.18*/dashboardButton/*14.33*/.smallText),format.raw/*14.43*/("""
                """),format.raw/*15.17*/("""</div>
            </div>
        </a>
""")))};def /*21.2*/bodyContent/*21.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.17*/("""

    """),format.raw/*23.5*/("""<div class="container row">
        """),_display_(/*24.10*/for(button <- dashButtons) yield /*24.36*/{_display_(Seq[Any](format.raw/*24.37*/("""
            """),_display_(/*25.14*/generateDashButton(button)),format.raw/*25.40*/("""
        """)))}),format.raw/*26.10*/("""
    """),format.raw/*27.5*/("""</div>
""")))};
Seq[Any](format.raw/*5.57*/("""

"""),format.raw/*18.2*/("""


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
                  DATE: Tue Oct 10 18:21:19 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/dashboard.scala.html
                  HASH: 75f63b1c2483fce369f1cefb193459a10f2885c9
                  MATRIX: 665->1|704->34|741->65|1100->98|1233->156|1259->174|1373->212|1408->221|1444->231|1456->235|1492->263|1527->278|1645->369|1669->384|1711->405|1740->406|1831->470|1855->485|1894->503|1923->504|1987->541|2011->556|2042->566|2109->606|2133->621|2177->644|2233->673|2257->688|2288->698|2333->715|2396->759|2416->770|2497->774|2530->780|2594->817|2636->843|2675->844|2716->858|2763->884|2804->894|2836->899|2883->153|2912->755|2942->907|2971->910|2990->920
                  LINES: 24->1|25->2|26->3|31->5|35->7|35->7|37->7|38->8|38->8|38->8|38->8|38->8|40->10|40->10|40->10|40->10|41->11|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|48->21|48->21|50->21|52->23|53->24|53->24|53->24|54->25|54->25|55->26|56->27|58->5|60->18|63->28|65->30|65->30
                  -- GENERATED --
              */
          