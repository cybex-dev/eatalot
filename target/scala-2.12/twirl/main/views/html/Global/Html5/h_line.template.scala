
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

object h_line extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(width: Integer = 90):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*3.1*/("""<hr width="""),_display_(/*3.12*/String/*3.18*/.valueOf(width)),format.raw/*3.33*/(""""%">"""))
      }
    }
  }

  def render(width:Integer): play.twirl.api.HtmlFormat.Appendable = apply(width)

  def f:((Integer) => play.twirl.api.HtmlFormat.Appendable) = (width) => apply(width)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 04:28:34 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Html5/h_line.scala.html
                  HASH: 7fcda8c38ca1b46c8710bce92c838d54e3f71c4d
                  MATRIX: 963->1|1079->22|1107->24|1144->35|1158->41|1193->56
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3
                  -- GENERATED --
              */
          