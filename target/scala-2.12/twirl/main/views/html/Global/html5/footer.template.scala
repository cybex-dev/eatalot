
package views.html.Global.html5

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

object footer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<footer>
    """),_display_(/*4.6*/content),format.raw/*4.13*/("""
    """),format.raw/*5.5*/("""<br>
    <br>
    <p style="font-style: italic;font-size: 0.75em;">Created by Intelligents 2017 (NMMU)</p>
</footer>"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 24 22:44:56 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/html5/footer.scala.html
                  HASH: d90b39d8834a8aa680d6cc3a4936b7bd132fd7b7
                  MATRIX: 960->1|1070->16|1098->18|1137->32|1164->39|1195->44
                  LINES: 28->1|33->1|35->3|36->4|36->4|37->5
                  -- GENERATED --
              */
          