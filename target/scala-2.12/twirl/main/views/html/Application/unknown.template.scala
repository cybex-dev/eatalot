
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

object unknown extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/bodyContent/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<div style="background-color: #eaeaea;">
        <div class="center-block align-middle">
            <img src=""""),_display_(/*8.24*/routes/*8.30*/.Assets.versioned("images/navigation/question_mark.png")),format.raw/*8.86*/("""" class="top img-fluid">
            <p class="bottom">"""),_display_(/*9.32*/message),format.raw/*9.39*/("""</p>
        </div>
    </div>
""")))};
Seq[Any](format.raw/*3.19*/("""

"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/masterpage/*14.12*/.apply(" :: Page not found", bodyContent)))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 09:12:56 SAST 2017
                  SOURCE: /home/cybex/Projects/eatalot-temp/app/views/Application/unknown.scala.html
                  HASH: 3602843ca69e099c529901e14d34f1837d6c243b
                  MATRIX: 663->1|1001->35|1096->55|1115->66|1195->70|1226->75|1364->187|1378->193|1454->249|1536->305|1563->312|1634->52|1663->344|1692->347|1711->357
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|38->8|38->8|38->8|39->9|39->9|43->3|45->12|47->14|47->14
                  -- GENERATED --
              */
          