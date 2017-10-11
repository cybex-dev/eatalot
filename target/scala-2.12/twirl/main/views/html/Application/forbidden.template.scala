
package views.html.Application

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
/*1.2*/import Global.Static.masterpage

object forbidden extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/bodyContent/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<div style="background-color: #ff9e9e;">
        <div class="center-block align-middle">
            <img src=""""),_display_(/*8.24*/routes/*8.30*/.Assets.versioned("images/navigation/forbidden.png")),format.raw/*8.82*/("""" class="top img-fluid">
            <p class="bottom">"""),_display_(/*9.32*/message),format.raw/*9.39*/("""</p>
        </div>
    </div>
""")))};
Seq[Any](format.raw/*3.19*/("""

"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/masterpage/*14.12*/.apply(" :: Forbidden", bodyContent)))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 12 01:25:41 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Application/forbidden.scala.html
                  HASH: 9bb33370153a30f3675984f0312ce20988cbd546
                  MATRIX: 663->1|1003->35|1098->55|1117->66|1197->70|1228->75|1366->187|1380->193|1452->245|1534->301|1561->308|1632->52|1661->340|1690->343|1709->353
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|38->8|38->8|38->8|39->9|39->9|43->3|45->12|47->14|47->14
                  -- GENERATED --
              */
          