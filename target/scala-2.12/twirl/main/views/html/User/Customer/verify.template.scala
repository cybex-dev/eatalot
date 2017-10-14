
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
/*1.2*/import controllers.Application.AppTags
/*2.2*/import Global.Static.masterpage

object verify extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*6.2*/bodyContent/*6.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.17*/("""
    """),format.raw/*7.5*/("""<p>Check your email for a verification link sent from """),_display_(/*7.60*/AppTags/*7.67*/.General.SITENAME.toString),format.raw/*7.93*/("""</p>
""")))};
Seq[Any](format.raw/*4.4*/("""

"""),format.raw/*8.2*/("""

"""),_display_(/*10.2*/masterpage/*10.12*/.apply(" :: Verify", bodyContent)),format.raw/*10.45*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 14 13:03:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/verify.scala.html
                  HASH: 8c11d91561b64ac8df0e1a6aadb51c4e7ccf8650
                  MATRIX: 665->1|711->41|1041->75|1121->80|1140->91|1220->95|1251->100|1332->155|1347->162|1393->188|1437->77|1465->194|1494->197|1513->207|1567->240
                  LINES: 24->1|25->2|30->4|34->6|34->6|36->6|37->7|37->7|37->7|37->7|39->4|41->8|43->10|43->10|43->10
                  -- GENERATED --
              */
          