
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
/*1.2*/import java.util.List
/*3.2*/import controllers.Application.AppTags.AppCookie.user_type
/*4.2*/import utility.DashboardButton
/*5.2*/import views.html.helper.CSRF

object dashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[DashboardButton],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(dashButtons: List[DashboardButton], bodyContent: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.6*/generateDashButton/*9.24*/(dashboardButton: DashboardButton, index: Integer):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.78*/("""
        """),format.raw/*10.9*/("""<div class="col-md-3 col-sm-3 col-xs-6 div-button-hover" id="dashButton"""),_display_(/*10.81*/index),format.raw/*10.86*/("""">
            <a href=""""),_display_(/*11.23*/CSRF(dashboardButton.link)),format.raw/*11.49*/("""">
                <div class="alert """),_display_(/*12.36*/dashboardButton/*12.51*/.cssClassButtonColour),format.raw/*12.72*/(""" """),format.raw/*12.73*/("""back-widget-set text-center">
                    <i class="fa """),_display_(/*13.35*/dashboardButton/*13.50*/.cssClassMainImage),format.raw/*13.68*/(""" """),format.raw/*13.69*/("""fa-5x"></i>
                    <h3>"""),_display_(/*14.26*/dashboardButton/*14.41*/.largeText),format.raw/*14.51*/("""
                        """),format.raw/*15.25*/("""<i class="fa """),_display_(/*15.39*/dashboardButton/*15.54*/.cssClassSecondaryImage),format.raw/*15.77*/(""""></i></h3>
                    """),_display_(/*16.22*/dashboardButton/*16.37*/.smallText),format.raw/*16.47*/("""
                """),format.raw/*17.17*/("""</div>
            </a>
        </div>
    """)))};def /*22.6*/bodyContent/*22.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.21*/("""
        """),format.raw/*23.9*/("""<div class="container row">
        """),_display_(/*24.10*/for((button, index) <- dashButtons.zipWithIndex) yield /*24.58*/ {_display_(Seq[Any](format.raw/*24.60*/("""
            """),_display_(/*25.14*/generateDashButton(button, index)),format.raw/*25.47*/("""
        """)))}),format.raw/*26.10*/("""
        """),format.raw/*27.9*/("""</div>
        <script type="text/javascript">
                var link = null, s = "";
                s = """"),_display_(/*30.23*/session()/*30.32*/.get(user_type.toString)),format.raw/*30.56*/("""";
                switch (s) """),format.raw/*31.28*/("""{"""),format.raw/*31.29*/("""
                    case "CUSTOMER":
                        link = customerJSRoutes.controllers.User.CustomerController.getCustomerDashUpdate();
                        break;
                    case "ADMIN":
                        link = adminJSRoutes.controllers.User.AdminController.getAdminDashUpdate();
                        break;
                    case "KITCHEN":
                        link = kitchenJSRoutes.controllers.User.KitchenStaffController.getKitchenDashUpdate();
                        break;
                    case "DELIVERY":
                        link = deliveryJSRoutes.controllers.User.DeliveryStaffController.getDeliveryDashUpdate();
                        break;
                    default:
                        alert("Unknown user_type: " + s);
                        break;
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/("""

                """),format.raw/*49.17*/("""var updateDom = function () """),format.raw/*49.45*/("""{"""),format.raw/*49.46*/("""
                    """),format.raw/*50.21*/("""$.get(link.url, function (data) """),format.raw/*50.53*/("""{"""),format.raw/*50.54*/("""
                        """),format.raw/*51.25*/("""alert(data)
                    """),format.raw/*52.21*/("""}"""),format.raw/*52.22*/(""")
                """),format.raw/*53.17*/("""}"""),format.raw/*53.18*/(""";
                $(document).ready(function () """),format.raw/*54.47*/("""{"""),format.raw/*54.48*/("""
"""),format.raw/*55.1*/("""//                scope.setInterval(updateDom,2000)
                    updateDom();
                """),format.raw/*57.17*/("""}"""),format.raw/*57.18*/(""");
        </script>
    """)))};
Seq[Any](format.raw/*7.57*/("""

    """),format.raw/*20.6*/("""

    """),format.raw/*59.6*/("""

    """),_display_(/*61.6*/masterpage/*61.16*/.apply(" :: Dashboard", bodyContent)))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],bodyContent:Html): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,bodyContent)

  def f:((List[DashboardButton],Html) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,bodyContent) => apply(dashButtons,bodyContent)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 09:12:56 SAST 2017
                  SOURCE: /home/cybex/Projects/eatalot-temp/app/views/Global/Static/dashboard.scala.html
                  HASH: ae54fdc99fc942c0bcf731126b6a02a19733decd
                  MATRIX: 665->1|694->25|760->85|798->117|1156->149|1289->211|1315->229|1445->283|1481->292|1580->364|1606->369|1658->394|1705->420|1770->458|1794->473|1836->494|1865->495|1956->559|1980->574|2019->592|2048->593|2112->630|2136->645|2167->655|2220->680|2261->694|2285->709|2329->732|2389->765|2413->780|2444->790|2489->807|2556->858|2576->869|2657->873|2693->882|2757->919|2821->967|2861->969|2902->983|2956->1016|2997->1026|3033->1035|3170->1145|3188->1154|3233->1178|3291->1208|3320->1209|4185->2046|4214->2047|4260->2065|4316->2093|4345->2094|4394->2115|4454->2147|4483->2148|4536->2173|4596->2205|4625->2206|4671->2224|4700->2225|4776->2273|4805->2274|4833->2275|4962->2376|4991->2377|5056->204|5089->851|5122->2403|5155->2410|5174->2420
                  LINES: 24->1|25->3|26->4|27->5|32->7|36->9|36->9|38->9|39->10|39->10|39->10|40->11|40->11|41->12|41->12|41->12|41->12|42->13|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|44->15|45->16|45->16|45->16|46->17|49->22|49->22|51->22|52->23|53->24|53->24|53->24|54->25|54->25|55->26|56->27|59->30|59->30|59->30|60->31|60->31|76->47|76->47|78->49|78->49|78->49|79->50|79->50|79->50|80->51|81->52|81->52|82->53|82->53|83->54|83->54|84->55|86->57|86->57|89->7|91->20|93->59|95->61|95->61
                  -- GENERATED --
              */
          