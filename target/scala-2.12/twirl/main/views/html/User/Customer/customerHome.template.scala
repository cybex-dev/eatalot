
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

def /*8.6*/bodyContent/*8.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.21*/("""
        """),format.raw/*9.41*/("""
        """),format.raw/*10.9*/("""<div class="row">
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

        <script href=""""),_display_(/*47.24*/controllers/*47.35*/.Order.routes.javascript.ScheduleController.scheduleJSRoutes),format.raw/*47.95*/("""" type="text/javascript"></script>
        <script href=""""),_display_(/*48.24*/controllers/*48.35*/.User.routes.javascript.CustomerController.customerJSRoutes),format.raw/*48.94*/("""" type="text/javascript"></script>

    """)))};
Seq[Any](format.raw/*6.66*/("""

    """),format.raw/*50.6*/("""

    """),_display_(/*52.6*/dashboard/*52.15*/.apply(dashButtons, bodyContent)))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],customerInfo:CustomerInfo): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,customerInfo)

  def f:((List[DashboardButton],CustomerInfo) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,customerInfo) => apply(dashButtons,customerInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 15 23:36:45 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/customerHome.scala.html
                  HASH: 6abdc65127b32d53a2d6dca8dbc7e11a7713d2f0
                  MATRIX: 665->1|703->33|732->56|781->99|1161->142|1303->213|1322->224|1402->228|1438->269|1474->278|3412->2189|3432->2200|3513->2260|3598->2318|3618->2329|3698->2388|3778->206|3811->2429|3844->2436|3862->2445
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|40->10|77->47|77->47|77->47|78->48|78->48|78->48|81->6|83->50|85->52|85->52
                  -- GENERATED --
              */
          