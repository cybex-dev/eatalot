
package views.html.User.Customer

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
/*1.2*/import utility.DashboardButton
/*2.2*/import java.util.List
/*3.2*/import views.html.Global.Static.dashboard
/*4.2*/import models.User.Customer.CustomerInfo

object customerHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[DashboardButton],CustomerInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(dashButtons: List[DashboardButton], customerInfo: CustomerInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.37*/("""
    """),format.raw/*10.5*/("""<div class="row">
        <div class="col-md-8 col-sm-8 col-xs-12">
            <div id="carousel-example" class="carousel slide slide-bdr" data-ride="carousel" >
                <div class="carousel-inner">
                    <div class="item active">
                        <img src="assets/images/food/food01.png" alt="" />
                    </div>
                    <div class="item">
                        <img src="assets/images/food/food02.png" alt="" />
                    </div>
                    <div class="item">
                        <img src="assets/images/food/food03.png" alt="" />
                    </div>
                    <div class="item">
                        <img src="assets/images/food/food04.png" alt="" />
                    </div>
                </div>
                    <!--INDICATORS-->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example" data-slide-to="1"></li>
                    <li data-target="#carousel-example" data-slide-to="2"></li>
                    <li data-target="#carousel-example" data-slide-to="3"></li>
                </ol>
                    <!--PREVIUS-NEXT BUTTONS-->
                <a class="left carousel-control" href="#carousel-example" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span>
                </a>
                <a class="right carousel-control" href="#carousel-example" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span>
                </a>
            </div>
        </div>
        <br/>
        <br/>
    </div>
    """),format.raw/*46.35*/("""
    """),format.raw/*47.5*/("""<script type="text/javascript" charset="UTF-8">
            var setScheduleStatus = function () """),format.raw/*48.49*/("""{"""),format.raw/*48.50*/("""
                """),format.raw/*49.17*/("""scheduleJSRoutes.controllers.Order.ScheduleController.changeScheduleStatus("""),_display_(/*49.93*/customerInfo/*49.105*/.getUserId),format.raw/*49.115*/(""").ajax("""),format.raw/*49.122*/("""{"""),format.raw/*49.123*/("""
                    """),format.raw/*50.21*/("""success: function (data) """),format.raw/*50.46*/("""{"""),format.raw/*50.47*/("""
                    """),format.raw/*51.21*/("""}"""),format.raw/*51.22*/(""",
                    error: function () """),format.raw/*52.40*/("""{"""),format.raw/*52.41*/("""
                        """),format.raw/*53.25*/("""alert("An error occured!")
                    """),format.raw/*54.21*/("""}"""),format.raw/*54.22*/("""
                """),format.raw/*55.17*/("""}"""),format.raw/*55.18*/(""")
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""
            """),format.raw/*57.13*/("""$('#').click(plus);
    </script>
""")))};
Seq[Any](format.raw/*6.66*/("""

"""),format.raw/*59.2*/("""

"""),_display_(/*61.2*/dashboard/*61.11*/.apply(dashButtons, bodyContent)))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],customerInfo:CustomerInfo): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,customerInfo)

  def f:((List[DashboardButton],CustomerInfo) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,customerInfo) => apply(dashButtons,customerInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 14 13:03:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/customerHome.scala.html
                  HASH: f06a882aee5b546308a065d88627f3ef651b4112
                  MATRIX: 665->1|703->33|732->56|781->99|1161->142|1303->209|1322->220|1402->224|1434->261|1466->266|3245->2047|3277->2052|3401->2148|3430->2149|3475->2166|3578->2242|3600->2254|3632->2264|3668->2271|3698->2272|3747->2293|3800->2318|3829->2319|3878->2340|3907->2341|3976->2382|4005->2383|4058->2408|4133->2455|4162->2456|4207->2473|4236->2474|4278->2488|4307->2489|4348->2502|4422->206|4451->2537|4480->2540|4498->2549
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|40->10|76->46|77->47|78->48|78->48|79->49|79->49|79->49|79->49|79->49|79->49|80->50|80->50|80->50|81->51|81->51|82->52|82->52|83->53|84->54|84->54|85->55|85->55|86->56|86->56|87->57|90->6|92->59|94->61|94->61
                  -- GENERATED --
              */
          