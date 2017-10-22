
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
/*1.2*/import java.util.List
/*3.2*/import models.User.Customer.CustomerInfo
/*4.2*/import utility.DashboardButton
/*5.2*/import views.html.Global.Static.customerDashboard

object customerHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[DashboardButton],CustomerInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(dashButtons: List[DashboardButton], customerInfo: CustomerInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.6*/bodyContent/*9.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.21*/("""
        """),format.raw/*10.41*/("""
        """),format.raw/*11.9*/("""<div class="row">
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

    """)))};
Seq[Any](format.raw/*7.66*/("""

    """),format.raw/*48.6*/("""


    """),_display_(/*51.6*/customerDashboard/*51.23*/.apply(dashButtons, bodyContent)),format.raw/*51.55*/("""
"""))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],customerInfo:CustomerInfo): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,customerInfo)

  def f:((List[DashboardButton],CustomerInfo) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,customerInfo) => apply(dashButtons,customerInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 20:16:58 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/User/Customer/customerHome.scala.html
                  HASH: 9f116fae0c881b51f548e1fba13993e3a261f73a
                  MATRIX: 665->1|694->25|742->67|780->99|1169->151|1311->222|1330->233|1410->237|1447->278|1483->287|3415->215|3448->2180|3482->2188|3508->2205|3561->2237
                  LINES: 24->1|25->3|26->4|27->5|32->7|36->9|36->9|38->9|39->10|40->11|78->7|80->48|83->51|83->51|83->51
                  -- GENERATED --
              */
          