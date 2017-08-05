
package views.html.User.Account

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


Seq[Any](format.raw/*4.4*/("""

"""),_display_(/*6.2*/masterpage("Verify Email")/*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""
    """),format.raw/*7.5*/("""<p>Check your email for a verification link sent from """),_display_(/*7.60*/AppTags/*7.67*/.General.SITENAME.toString),format.raw/*7.93*/("""</p>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 03 15:47:39 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Account/verify.scala.html
                  HASH: 16ea8a1632f28d42b3a7c106737364089e0aecff
                  MATRIX: 664->1|710->41|1040->75|1136->77|1164->80|1198->106|1237->108|1268->113|1349->168|1364->175|1410->201
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7
                  -- GENERATED --
              */
          