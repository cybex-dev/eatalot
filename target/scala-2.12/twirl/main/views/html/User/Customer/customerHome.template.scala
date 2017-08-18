
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

object customerHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/bodyContent/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.37*/("""

    """),format.raw/*8.5*/("""<div class="row">

        <div class="col-md-3 col-sm-3 col-xs-6">
            <div class="alert alert-info back-widget-set text-center">
                <i class="fa fa-history fa-5x"></i>
                <h3>500+&nbsp; <i class="fa fa-dollar"></i></h3>
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
    """),format.raw/*77.35*/("""
""")))};
Seq[Any](format.raw/*3.4*/("""

"""),format.raw/*78.2*/("""

"""),_display_(/*80.2*/masterpage/*80.12*/.apply(" :: Welcome", bodyContent)))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Aug 18 08:43:46 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/customerHome.scala.html
                  HASH: e9d4fb397b9f524569ece3036723d0eddab09012
                  MATRIX: 665->1|1012->46|1092->51|1111->62|1191->66|1223->103|1255->109|4153->3009|4193->48|4222->3011|4251->3014|4270->3024
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|38->8|107->77|109->3|111->78|113->80|113->80
                  -- GENERATED --
              */
          