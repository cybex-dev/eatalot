
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
/*4.2*/import controllers.Application.AppTags.AppCookie.UserType._
/*5.2*/import controllers.Application.AppTags.AppCookie.user_type

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
                  DATE: Mon Oct 16 15:38:49 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/dashboard.scala.html
                  HASH: 347c2d057c06ef5533ee5bcacb5545dc037669b2
                  MATRIX: 665->1|702->32|740->64|769->87|836->148|1223->209|1356->271|1382->289|1512->343|1548->352|1647->424|1673->429|1725->454|1772->480|1837->518|1861->533|1903->554|1932->555|2023->619|2047->634|2086->652|2115->653|2179->690|2203->705|2234->715|2287->740|2328->754|2352->769|2396->792|2456->825|2480->840|2511->850|2556->867|2623->918|2643->929|2724->933|2760->942|2824->979|2888->1027|2928->1029|2969->1043|3023->1076|3064->1086|3100->1095|3237->1205|3255->1214|3300->1238|3358->1268|3387->1269|4252->2106|4281->2107|4327->2125|4383->2153|4412->2154|4461->2175|4521->2207|4550->2208|4603->2233|4663->2265|4692->2266|4738->2284|4767->2285|4843->2333|4872->2334|4900->2335|5029->2436|5058->2437|5123->264|5156->911|5189->2463|5222->2470|5241->2480
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->9|37->9|39->9|40->10|40->10|40->10|41->11|41->11|42->12|42->12|42->12|42->12|43->13|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|45->15|46->16|46->16|46->16|47->17|50->22|50->22|52->22|53->23|54->24|54->24|54->24|55->25|55->25|56->26|57->27|60->30|60->30|60->30|61->31|61->31|77->47|77->47|79->49|79->49|79->49|80->50|80->50|80->50|81->51|82->52|82->52|83->53|83->53|84->54|84->54|85->55|87->57|87->57|90->7|92->20|94->59|96->61|96->61
                  -- GENERATED --
              */
          