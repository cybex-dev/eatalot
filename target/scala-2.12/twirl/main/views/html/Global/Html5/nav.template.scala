
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

object nav extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clazz: String, content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<nav class="""),_display_(/*3.13*/clazz),format.raw/*3.18*/(""">
    """),_display_(/*4.6*/content),format.raw/*4.13*/("""
"""),format.raw/*5.1*/("""</nav>"""))
      }
    }
  }

  def render(clazz:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(clazz,content)

  def f:((String,Html) => play.twirl.api.HtmlFormat.Appendable) = (clazz,content) => apply(clazz,content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 11:02:13 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Html5/nav.scala.html
                  HASH: fe2fc94f74be698e499577718ce409916dde7628
                  MATRIX: 964->1|1089->31|1117->33|1155->45|1180->50|1212->57|1239->64|1266->65
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|37->5
                  -- GENERATED --
              */
          