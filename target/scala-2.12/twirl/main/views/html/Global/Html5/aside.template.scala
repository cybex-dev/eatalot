
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

object aside extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cssClass: String,  content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*3.1*/("""<aside class="""),_display_(/*3.15*/cssClass),format.raw/*3.23*/(""">
    """),_display_(/*4.6*/content),format.raw/*4.13*/("""
"""),format.raw/*5.1*/("""</aside>"""))
      }
    }
  }

  def render(cssClass:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(cssClass,content)

  def f:((String,Html) => play.twirl.api.HtmlFormat.Appendable) = (cssClass,content) => apply(cssClass,content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 11 22:25:22 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Html5/aside.scala.html
                  HASH: ccf227184e9ef138fda1c5998f2c84660c57c5a1
                  MATRIX: 966->1|1095->35|1123->37|1163->51|1191->59|1223->66|1250->73|1277->74
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|37->5
                  -- GENERATED --
              */
          