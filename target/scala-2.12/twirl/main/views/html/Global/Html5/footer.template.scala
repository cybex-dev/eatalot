
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

object footer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clazz: String, content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<footer class="""),_display_(/*3.16*/clazz),format.raw/*3.21*/(""">
    """),_display_(/*4.6*/content),format.raw/*4.13*/("""
"""),format.raw/*5.1*/("""</footer>"""))
      }
    }
  }

  def render(clazz:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(clazz,content)

  def f:((String,Html) => play.twirl.api.HtmlFormat.Appendable) = (clazz,content) => apply(clazz,content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 03 05:56:08 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Html5/footer.scala.html
                  HASH: 22a950eeb5d2e608d9b85760bd01568189ef5924
                  MATRIX: 967->1|1092->31|1120->33|1161->48|1186->53|1218->60|1245->67|1272->68
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|37->5
                  -- GENERATED --
              */
          