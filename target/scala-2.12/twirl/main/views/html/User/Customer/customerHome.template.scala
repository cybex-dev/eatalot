
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
                Place Order
            </div>
        </div>
        <div class="col-md-3 col-sm-3 col-xs-6">
            <div class="alert alert-warning back-widget-set text-center">
                <i class="fa fa-recycle fa-5x"></i>
                <h3>X</h3>
                Orders in Queue
            </div>
        </div>
        <div class="col-md-3 col-sm-3 col-xs-6">
            <div class="alert alert-danger back-widget-set text-center">
                <i class="fa fa-briefcase fa-5x"></i>
                <h3>Order </h3>
                I Schedule
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
    """),format.raw/*79.35*/("""
""")))};
Seq[Any](format.raw/*5.22*/("""

"""),format.raw/*80.2*/("""

"""),_display_(/*82.2*/masterpage/*82.12*/.apply(" :: Welcome", bodyContent)))
      }
    }
  }

  def render(userInfo:UserInfo): play.twirl.api.HtmlFormat.Appendable = apply(userInfo)

  def f:((UserInfo) => play.twirl.api.HtmlFormat.Appendable) = (userInfo) => apply(userInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 03 21:44:28 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/customerHome.scala.html
                  HASH: 29b3c77731866c1b07eeb9b8731f4faf7ca4acd9
                  MATRIX: 665->1|715->45|750->74|1109->122|1207->145|1226->156|1306->160|1338->197|1371->203|1610->415|1625->421|1668->443|1697->445|1714->453|1746->464|4438->3158|4479->142|4508->3160|4537->3163|4556->3173
                  LINES: 24->1|25->2|26->3|31->5|35->7|35->7|37->7|38->8|40->10|45->15|45->15|45->15|45->15|45->15|45->15|109->79|111->5|113->80|115->82|115->82
                  -- GENERATED --
              */
          