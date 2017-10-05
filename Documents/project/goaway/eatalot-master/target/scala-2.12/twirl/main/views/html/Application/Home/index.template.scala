
package views.html.Application.Home

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/carousel/*5.10*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.14*/("""
    """),format.raw/*6.5*/("""<div class="container">
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
        </div>
    </div>
""")))};def /*44.2*/bodyContent/*44.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*44.17*/("""
    """),format.raw/*45.5*/("""<h1 class="html-editor-indent">Welcome to EatAloT</h1>
    <br/>
    <br/>
    <h2 class="html-editor-indent">If you are hungry, you have come to the right place</h2>
    <br/>
    <br/>
    """),format.raw/*51.37*/("""
"""),_display_(/*52.2*/carousel),format.raw/*52.10*/("""
    """),format.raw/*53.35*/("""
    """),format.raw/*54.5*/("""<br/>
    <h2>You can order a meal in 3 simple steps</h2>
    <ul>
        <li>
            <Span class="text-large-bold">Step 1</Span>
            <ul>
                <li>Create an account <form action=""""),_display_(/*60.54*/controllers/*60.65*/.User.routes.CustomerController.register()),format.raw/*60.107*/("""" method="get">
                    <button id="btnHomeRegisterRedirect" class="btn btn-default">Register</button>
                </form></li>
            </ul>
        </li>
        <li>
            <Span class="text-large-bold">Step 2</Span>
            <ul>
                <li>Order a meal</li>
            </ul>
        </li>
        <li>
            <Span class="text-large-bold">Step 3</Span>
            <ul>
                <li><h4>Enjoy your meal!</h4></li>
            </ul>
        </li>
    </ul>

    <br/>
    <br/>

""")))};
Seq[Any](format.raw/*3.4*/("""

"""),format.raw/*42.2*/("""

"""),format.raw/*82.2*/("""


"""),_display_(/*85.2*/masterpage/*85.12*/.apply(" :: Welcome", bodyContent)))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Sep 29 17:56:52 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master/app/views/Application/Home/index.scala.html
                  HASH: 04590b30a5c8feeafb279f47f11eab2abc36d339
                  MATRIX: 668->1|1008->46|1088->51|1104->59|1184->63|1215->68|3133->1966|3153->1977|3234->1981|3266->1986|3485->2209|3513->2211|3542->2219|3575->2254|3607->2259|3840->2465|3860->2476|3924->2518|4496->48|4525->1963|4554->3052|4584->3056|4603->3066
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|72->44|72->44|74->44|75->45|81->51|82->52|82->52|83->53|84->54|90->60|90->60|90->60|113->3|115->42|117->82|120->85|120->85
                  -- GENERATED --
              */
          