
package views.html.User.Customer

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

object customerHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.4*/("""

"""),_display_(/*5.2*/masterpage),format.raw/*5.12*/(""".("Home")"""),format.raw/*5.21*/("""{"""),format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<a href=""""),_display_(/*6.15*/controllers/*6.26*/.User.routes.CustomerController.index()),format.raw/*6.65*/("""" class="nav-tabs">Home</a>
"""),format.raw/*7.1*/("""}"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Aug 05 20:49:42 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/customerHome.scala.html
                  HASH: 2bb5bdd5f8749ba8e25599b2b6c0cf285f24d11e
                  MATRIX: 665->1|1001->35|1097->37|1125->40|1155->50|1191->59|1219->60|1250->65|1286->75|1305->86|1364->125|1418->153
                  LINES: 24->1|29->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|38->7
                  -- GENERATED --
              */
          