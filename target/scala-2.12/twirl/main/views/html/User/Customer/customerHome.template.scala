
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


    """),format.raw/*12.5*/("""<div class="row">
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
    """),format.raw/*48.35*/("""
""")))};
Seq[Any](format.raw/*6.66*/("""

"""),format.raw/*49.2*/("""

"""),_display_(/*51.2*/dashboard/*51.11*/.apply(dashButtons, bodyContent)))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],customerInfo:CustomerInfo): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,customerInfo)

  def f:((List[DashboardButton],CustomerInfo) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,customerInfo) => apply(dashButtons,customerInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 11 22:25:23 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/customerHome.scala.html
                  HASH: 2aae103bf196e7b81a9112a6ac9fc00ccd324b02
                  MATRIX: 665->1|703->33|732->56|781->99|1161->142|1303->209|1322->220|1402->224|1434->261|1468->268|3247->2049|3288->206|3317->2051|3346->2054|3364->2063
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|42->12|78->48|80->6|82->49|84->51|84->51
                  -- GENERATED --
              */
          