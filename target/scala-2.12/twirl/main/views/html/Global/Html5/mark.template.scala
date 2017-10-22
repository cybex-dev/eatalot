
package views.html.Global.Html5

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

object mark extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<mark>
    """),_display_(/*4.6*/content),format.raw/*4.13*/("""
"""),format.raw/*5.1*/("""</mark>"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 22:44:13 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Html5/mark.scala.html
                  HASH: fdbaf6f3104301741ed604a7ca9c5847011eca17
                  MATRIX: 958->1|1068->16|1096->18|1133->30|1160->37|1187->38
                  LINES: 28->1|33->1|35->3|36->4|36->4|37->5
                  -- GENERATED --
              */
          