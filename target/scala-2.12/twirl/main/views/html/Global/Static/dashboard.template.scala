
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

        """),format.raw/*11.9*/("""<div class="col-md-3 col-sm-3 col-xs-6 div-button-hover" id="dashButton"""),_display_(/*11.81*/index),format.raw/*11.86*/("""">
            <a href=""""),_display_(/*12.23*/CSRF(dashboardButton.link)),format.raw/*12.49*/("""">
                <div class="alert """),_display_(/*13.36*/dashboardButton/*13.51*/.cssClassButtonColour),format.raw/*13.72*/(""" """),format.raw/*13.73*/("""back-widget-set text-center">
                    <i class="fa """),_display_(/*14.35*/dashboardButton/*14.50*/.cssClassMainImage),format.raw/*14.68*/(""" """),format.raw/*14.69*/("""fa-5x"></i>
                    <h3><span id="dashButtonText"""),_display_(/*15.50*/index),format.raw/*15.55*/("""">"""),_display_(/*15.58*/dashboardButton/*15.73*/.largeText),format.raw/*15.83*/("""</span>
                        <i class="fa """),_display_(/*16.39*/dashboardButton/*16.54*/.cssClassSecondaryImage),format.raw/*16.77*/(""""></i></h3>
                    """),_display_(/*17.22*/dashboardButton/*17.37*/.smallText),format.raw/*17.47*/("""
                """),format.raw/*18.17*/("""</div>
            </a>
        </div>

    """)))};def /*24.6*/bodyContent/*24.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*24.21*/("""
        """),format.raw/*25.9*/("""<div class="row">
            <div class="container-dashboard center-parent">
            """),_display_(/*27.14*/for((button, index) <- dashButtons.zipWithIndex) yield /*27.62*/ {_display_(Seq[Any](format.raw/*27.64*/("""
                """),_display_(/*28.18*/generateDashButton(button, index)),format.raw/*28.51*/("""
            """)))}),format.raw/*29.14*/("""
            """),format.raw/*30.13*/("""</div>
        </div>
        <script type="text/javascript">
                var intervalNum;
                $(document).ready(function () """),format.raw/*34.47*/("""{"""),format.raw/*34.48*/("""
                    """),format.raw/*35.21*/("""intervalNum = window.setInterval(updateDom, 5000)
                """),format.raw/*36.17*/("""}"""),format.raw/*36.18*/(""");


                var updateDom = function () """),format.raw/*39.45*/("""{"""),format.raw/*39.46*/("""
                    """),format.raw/*40.21*/("""var link = null,
                            s = """"),_display_(/*41.35*/session()/*41.44*/.get(user_type.toString)),format.raw/*41.68*/("""";
                    switch (s) """),format.raw/*42.32*/("""{"""),format.raw/*42.33*/("""
                        case "CUSTOMER":
                            link = CustomerJSRoutes.controllers.User.CustomerController.getCustomerDashUpdate();
                            break;
                        case "ADMIN":
                            link = AdminJSRoutes.controllers.User.AdminController.getAdminDashUpdate();
                            break;
                        case "KITCHEN":
                            link = KitchenJSRoutes.controllers.User.KitchenStaffController.getKitchenDashUpdate();
                            break;
                        case "DELIVERY":
                            link = DeliveryJSRoutes.controllers.User.DeliveryStaffController.getDeliveryDashUpdate();
                            break;
                        default:
                            alert("Unknown user_type: " + s);
                            break;
                    """),format.raw/*58.21*/("""}"""),format.raw/*58.22*/("""
                    """),format.raw/*59.21*/("""link.ajax("""),format.raw/*59.31*/("""{"""),format.raw/*59.32*/("""
                        """),format.raw/*60.25*/("""success: function (data) """),format.raw/*60.50*/("""{"""),format.raw/*60.51*/("""
                            """),format.raw/*61.29*/("""setText(document.getElementById("dashButtonText0"), data[0].dashButton0);
                            setText(document.getElementById("dashButtonText1"), data[1].dashButton1);
                            setText(document.getElementById("dashButtonText2"), data[2].dashButton2);
                            setText(document.getElementById("dashButtonText3"), data[3].dashButton3);
                        """),format.raw/*65.25*/("""}"""),format.raw/*65.26*/(""",
                        error: function (error) """),format.raw/*66.49*/("""{"""),format.raw/*66.50*/("""
                            """),format.raw/*67.29*/("""alert("Connection lost");
                            clearInterval(intervalNum);
                        """),format.raw/*69.25*/("""}"""),format.raw/*69.26*/("""
                    """),format.raw/*70.21*/("""}"""),format.raw/*70.22*/(""");

                    function setText(field, text) """),format.raw/*72.51*/("""{"""),format.raw/*72.52*/("""
                        """),format.raw/*73.25*/("""field.innerText = text;
                        field.innerHTML = text;
                    """),format.raw/*75.21*/("""}"""),format.raw/*75.22*/("""
                """),format.raw/*76.17*/("""}"""),format.raw/*76.18*/(""";

        </script>
    """)))};
Seq[Any](format.raw/*7.57*/("""

    """),format.raw/*22.6*/("""

    """),format.raw/*79.6*/("""

    """),_display_(/*81.6*/masterpage/*81.16*/.apply(" :: Dashboard", bodyContent)))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],bodyContent:Html): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,bodyContent)

  def f:((List[DashboardButton],Html) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,bodyContent) => apply(dashButtons,bodyContent)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 15:59:37 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/dashboard.scala.html
                  HASH: fb8e9b66f83801d0838d0604d62f71faacdc808e
                  MATRIX: 665->1|694->25|760->85|798->117|1156->149|1289->211|1315->229|1445->283|1482->293|1581->365|1607->370|1659->395|1706->421|1771->459|1795->474|1837->495|1866->496|1957->560|1981->575|2020->593|2049->594|2137->655|2163->660|2193->663|2217->678|2248->688|2321->734|2345->749|2389->772|2449->805|2473->820|2504->830|2549->847|2617->899|2637->910|2718->914|2754->923|2872->1014|2936->1062|2976->1064|3021->1082|3075->1115|3120->1129|3161->1142|3330->1283|3359->1284|3408->1305|3502->1371|3531->1372|3608->1421|3637->1422|3686->1443|3764->1494|3782->1503|3827->1527|3889->1561|3918->1562|4847->2463|4876->2464|4925->2485|4963->2495|4992->2496|5045->2521|5098->2546|5127->2547|5184->2576|5616->2980|5645->2981|5723->3031|5752->3032|5809->3061|5943->3167|5972->3168|6021->3189|6050->3190|6132->3244|6161->3245|6214->3270|6334->3362|6363->3363|6408->3380|6437->3381|6502->204|6535->892|6568->3407|6601->3414|6620->3424
                  LINES: 24->1|25->3|26->4|27->5|32->7|36->9|36->9|38->9|40->11|40->11|40->11|41->12|41->12|42->13|42->13|42->13|42->13|43->14|43->14|43->14|43->14|44->15|44->15|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|51->24|51->24|53->24|54->25|56->27|56->27|56->27|57->28|57->28|58->29|59->30|63->34|63->34|64->35|65->36|65->36|68->39|68->39|69->40|70->41|70->41|70->41|71->42|71->42|87->58|87->58|88->59|88->59|88->59|89->60|89->60|89->60|90->61|94->65|94->65|95->66|95->66|96->67|98->69|98->69|99->70|99->70|101->72|101->72|102->73|104->75|104->75|105->76|105->76|109->7|111->22|113->79|115->81|115->81
                  -- GENERATED --
              */
          