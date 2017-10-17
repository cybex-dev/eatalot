
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
<<<<<<< HEAD
/*1.2*/import views.html.Global.Static.masterpage
/*2.2*/import models.User.UserInfo
/*3.2*/import controllers.Application.AppTags.Locale

object customerHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[UserInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(userInfo: UserInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.2*/bodyContent/*7.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.17*/("""
    """),format.raw/*8.37*/("""

    """),format.raw/*10.5*/("""<div class="row">

        <div class="col-md-3 col-sm-3 col-xs-6">
            <div class="alert alert-info back-widget-set text-center">
                <i class="fa fa-history fa-5x"></i>
                <h3>"""),_display_(/*15.22*/Locale/*15.28*/.Currency.ZAR.toString),format.raw/*15.50*/(""" """),_display_(/*15.52*/userInfo/*15.60*/.getBalance),format.raw/*15.71*/("""&nbsp; <i class="fa fa-dollar"></i></h3>
                Cash
            </div>
        </div>
        <div class="col-md-3 col-sm-3 col-xs-6">
            <div class="alert alert-success back-widget-set text-center">
                <i class="fa fa-bars fa-5x"></i>
                <h3>New</h3>
                Order
            </div>
        </div>
        <div class="col-md-3 col-sm-3 col-xs-6">
            <div class="alert alert-warning back-widget-set text-center">
                <i class="fa fa-recycle fa-5x"></i>
                <h3>X</h3>
                Orders Pending
            </div>
        </div>
        <div class="col-md-3 col-sm-3 col-xs-6">
            <div class="alert alert-danger back-widget-set text-center">
                <i class="fa fa-briefcase fa-5x"></i>
                <h3>Order </h3>
                Schedule
            </div>
        </div>

    </div>

    <div class="row">
        <div class="col-md-8 col-sm-8 col-xs-12">
            <div id="carousel-example" class="carousel slide slide-bdr" data-ride="carousel" >
                <div class="carousel-inner">
                    <div class="item active">
                        <img src="assets/images/food/food04.png" alt="" />
                    </div>
                    <div class="item">
                        <img src="assets/images/food/food04.png" alt="" />
                    </div>
                    <div class="item">
                        <img src="assets/images/food/food04.png" alt="" />
                    </div>
                    <div class="item">
                        <img src="assets/images/food/food04.png" alt="" />
=======
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
>>>>>>> Customer-Management-Dev
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
<<<<<<< HEAD
        <br/>
        <br/>
    </div>
    """),format.raw/*79.35*/("""
""")))};
Seq[Any](format.raw/*5.22*/("""

"""),format.raw/*80.2*/("""

"""),_display_(/*82.2*/masterpage/*82.12*/.apply(" :: Welcome", bodyContent)))
=======

        <script href=""""),_display_(/*47.24*/controllers/*47.35*/.Order.routes.javascript.ScheduleController.scheduleJSRoutes),format.raw/*47.95*/("""" type="text/javascript"></script>
        <script href=""""),_display_(/*48.24*/controllers/*48.35*/.User.routes.javascript.CustomerController.customerJSRoutes),format.raw/*48.94*/("""" type="text/javascript"></script>

    """)))};
Seq[Any](format.raw/*6.66*/("""

    """),format.raw/*50.6*/("""

    """),_display_(/*52.6*/dashboard/*52.15*/.apply(dashButtons, bodyContent)))
>>>>>>> Customer-Management-Dev
      }
    }
  }

<<<<<<< HEAD
  def render(userInfo:UserInfo): play.twirl.api.HtmlFormat.Appendable = apply(userInfo)

  def f:((UserInfo) => play.twirl.api.HtmlFormat.Appendable) = (userInfo) => apply(userInfo)
=======
  def render(dashButtons:List[DashboardButton],customerInfo:CustomerInfo): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,customerInfo)

  def f:((List[DashboardButton],CustomerInfo) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,customerInfo) => apply(dashButtons,customerInfo)
>>>>>>> Customer-Management-Dev

  def ref: this.type = this

}


              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Mon Sep 11 16:55:18 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/customerHome.scala.html
                  HASH: 9bcfa26c840f5e9beda7cd05097c16358dfd12f9
                  MATRIX: 665->1|715->45|750->74|1109->122|1207->145|1226->156|1306->160|1338->197|1371->203|1610->415|1625->421|1668->443|1697->445|1714->453|1746->464|4429->3149|4470->142|4499->3151|4528->3154|4547->3164
                  LINES: 24->1|25->2|26->3|31->5|35->7|35->7|37->7|38->8|40->10|45->15|45->15|45->15|45->15|45->15|45->15|109->79|111->5|113->80|115->82|115->82
=======
                  DATE: Sun Oct 15 23:36:45 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/customerHome.scala.html
                  HASH: 6abdc65127b32d53a2d6dca8dbc7e11a7713d2f0
                  MATRIX: 665->1|703->33|732->56|781->99|1161->142|1303->213|1322->224|1402->228|1438->269|1474->278|3412->2189|3432->2200|3513->2260|3598->2318|3618->2329|3698->2388|3778->206|3811->2429|3844->2436|3862->2445
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|40->10|77->47|77->47|77->47|78->48|78->48|78->48|81->6|83->50|85->52|85->52
>>>>>>> Customer-Management-Dev
                  -- GENERATED --
              */
          