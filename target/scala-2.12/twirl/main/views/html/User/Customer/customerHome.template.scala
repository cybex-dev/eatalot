
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
/*1.2*/import views.html.Global.Static.masterpage
/*2.2*/import controllers.Application.AppTags.Locale
/*3.2*/import helper._
/*4.2*/import models.User.CustomerInfo

object customerHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[CustomerInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(customerInfo: CustomerInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.37*/("""
    """),format.raw/*10.5*/("""<div class="container row">

        <a href=""""),_display_(/*12.19*/CSRF(controllers.User.routes.CustomerController.paymentHistory())),format.raw/*12.84*/("""">
            <div class="col-md-3 col-sm-3 col-xs-6">
                <div class="alert alert-info back-widget-set text-center">
                    <i class="fa fa-history fa-5x"></i>
                    <h3>"""),_display_(/*16.26*/Locale/*16.32*/.Currency.ZAR.toString),format.raw/*16.54*/(""" """),_display_(/*16.56*/customerInfo/*16.68*/.getBalance),format.raw/*16.79*/(""" """),format.raw/*16.80*/("""&nbsp;
                        <i class="fa fa-dollar"></i></h3>
                    Cash
                </div>
            </div>
        </a>
        <a href="#">
            <div class="col-md-3 col-sm-3 col-xs-6">
                <div class="alert alert-success back-widget-set text-center">
                    <i class="fa fa-bars fa-5x"></i>
                    <h3>New</h3>
                    Place Order
                </div>
            </div>
        </a>
        <a href=""""),_display_(/*31.19*/CSRF(controllers.User.routes.CustomerController.activeOrders())),format.raw/*31.82*/("""">
            <div class="col-md-3 col-sm-3 col-xs-6">
                <div class="alert alert-warning back-widget-set text-center">
                    <i class="fa fa-recycle fa-5x"></i>
                    <h3>"""),_display_(/*35.26*/String/*35.32*/.valueOf(customerInfo.getActiveOrderCount())),format.raw/*35.76*/("""</h3>
                    Orders in Queue
                </div>
            </div>
        </a>
        <a href=""""),_display_(/*40.19*/CSRF(controllers.Order.routes.ScheduleController.index())),format.raw/*40.76*/("""">
            <div class="col-md-3 col-sm-3 col-xs-6">
                <div class="alert """),_display_(/*42.36*/if(customerInfo.isScheduleActive)/*42.69*/{_display_(Seq[Any](format.raw/*42.70*/("""alert-success""")))}/*42.84*/else/*42.88*/{_display_(Seq[Any](format.raw/*42.89*/("""alert-danger""")))}),format.raw/*42.102*/(""" """),format.raw/*42.103*/("""back-widget-set text-center">
                    <i class="fa fa-briefcase fa-5x"></i>
                    <h3>"""),_display_(/*44.26*/if(customerInfo.isScheduleActive)/*44.59*/{_display_(Seq[Any](format.raw/*44.60*/(""""Active"""")))}/*44.69*/else/*44.73*/{_display_(Seq[Any](format.raw/*44.74*/(""""Inactive"""")))}),format.raw/*44.85*/("""</h3>
                    Order Schedule
                </div>
            </div>
        </a>

    </div>

    <div class="row">
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
    """),format.raw/*88.35*/("""
""")))};
Seq[Any](format.raw/*6.30*/("""

"""),format.raw/*89.2*/("""

"""),_display_(/*91.2*/masterpage/*91.12*/.apply(" :: Welcome", bodyContent)))
      }
    }
  }

  def render(customerInfo:CustomerInfo): play.twirl.api.HtmlFormat.Appendable = apply(customerInfo)

  def f:((CustomerInfo) => play.twirl.api.HtmlFormat.Appendable) = (customerInfo) => apply(customerInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Oct 09 20:26:27 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/customerHome.scala.html
                  HASH: 8205eec0e918a20c9c4d1e075f100cdee5e846a3
                  MATRIX: 665->1|715->45|768->92|791->109|1140->143|1246->174|1265->185|1345->189|1377->226|1409->231|1483->278|1569->343|1808->555|1823->561|1866->583|1895->585|1916->597|1948->608|1977->609|2492->1097|2576->1160|2818->1375|2833->1381|2898->1425|3040->1540|3118->1597|3236->1688|3278->1721|3317->1722|3350->1736|3363->1740|3402->1741|3447->1754|3477->1755|3617->1868|3659->1901|3698->1902|3726->1911|3739->1915|3778->1916|3820->1927|5712->3821|5753->171|5782->3823|5811->3826|5830->3836
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|40->10|42->12|42->12|46->16|46->16|46->16|46->16|46->16|46->16|46->16|61->31|61->31|65->35|65->35|65->35|70->40|70->40|72->42|72->42|72->42|72->42|72->42|72->42|72->42|72->42|74->44|74->44|74->44|74->44|74->44|74->44|74->44|118->88|120->6|122->89|124->91|124->91
                  -- GENERATED --
              */
          