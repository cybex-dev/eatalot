
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

object time extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(time: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*3.1*/("""<time>"""),_display_(/*3.8*/time),format.raw/*3.12*/("""</time>"""))
      }
    }
  }

  def render(time:String): play.twirl.api.HtmlFormat.Appendable = apply(time)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (time) => apply(time)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 11 22:25:22 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Html5/time.scala.html
                  HASH: 4d95af531c961abdbadbd63135be840b27eee2d6
                  MATRIX: 960->1|1069->15|1097->17|1129->24|1153->28
                  LINES: 28->1|33->1|35->3|35->3|35->3
                  -- GENERATED --
              */
          