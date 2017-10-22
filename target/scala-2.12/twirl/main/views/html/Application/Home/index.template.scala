
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
                            <img src=""""),_display_(/*12.40*/routes/*12.46*/.Assets.versioned("images/food/food01.png")),format.raw/*12.89*/("""" alt="Food" />
                        </div>
                        <div class="item">
                            <img src=""""),_display_(/*15.40*/routes/*15.46*/.Assets.versioned("images/food/food02.png")),format.raw/*15.89*/("""" alt="Food" />
                        </div>
                        <div class="item">
                            <img src=""""),_display_(/*18.40*/routes/*18.46*/.Assets.versioned("images/food/food03.png")),format.raw/*18.89*/("""" alt="Food" />
                        </div>
                        <div class="item">
                            <img src=""""),_display_(/*21.40*/routes/*21.46*/.Assets.versioned("images/food/food04.png")),format.raw/*21.89*/("""" alt="Food" />
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
                  DATE: Sun Oct 22 11:23:04 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Application/Home/index.scala.html
                  HASH: b8b085bfe13049d6d4418455245e4fa94c13cdaa
                  MATRIX: 668->1|1008->46|1088->51|1104->59|1184->63|1215->68|1583->409|1598->415|1662->458|1818->587|1833->593|1897->636|2053->765|2068->771|2132->814|2288->943|2303->949|2367->992|3461->2066|3481->2077|3562->2081|3594->2086|3813->2309|3841->2311|3870->2319|3903->2354|3935->2359|4168->2565|4188->2576|4252->2618|4824->48|4853->2063|4882->3152|4912->3156|4931->3166
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|42->12|42->12|42->12|45->15|45->15|45->15|48->18|48->18|48->18|51->21|51->21|51->21|72->44|72->44|74->44|75->45|81->51|82->52|82->52|83->53|84->54|90->60|90->60|90->60|113->3|115->42|117->82|120->85|120->85
                  -- GENERATED --
              */
          