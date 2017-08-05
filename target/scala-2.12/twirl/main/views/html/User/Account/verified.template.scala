
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

object verified extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/Global/*3.8*/.Static.masterpage("Verified")/*3.38*/{_display_(Seq[Any](format.raw/*3.39*/("""
    """),format.raw/*4.5*/("""<p>Email has been verified</p>
    <br/>
    <br/>
    <form method="get" action=""""),_display_(/*7.33*/controllers/*7.44*/.User.routes.AccountController.login()),format.raw/*7.82*/("""">
        <button type="submit">Login</button>
    </form>
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
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Account/verified.scala.html
                  HASH: 075accd5187e9c501a48277afbcd6d2a70a45512
                  MATRIX: 957->1|1053->3|1081->6|1094->12|1132->42|1170->43|1201->48|1310->131|1329->142|1387->180
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|36->4|39->7|39->7|39->7
                  -- GENERATED --
              */
          