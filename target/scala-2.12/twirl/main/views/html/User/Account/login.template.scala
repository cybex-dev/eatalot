
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
/*1.2*/import Global.Static.masterpage
/*2.2*/import play.data.Form
/*3.2*/import helper.CSRF
/*4.2*/import models.User.UserLogin

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserLogin],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(loginForm: Form[UserLogin]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""<h1>Login Form</h1>
    <br/>
    <br/>
    <div class="body">
    """),_display_(/*13.6*/helper/*13.12*/.form(action = controllers.User.routes.AccountController.doLogin)/*13.77*/ {_display_(Seq[Any](format.raw/*13.79*/("""
        """),_display_(/*14.10*/CSRF/*14.14*/.formField),format.raw/*14.24*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputText(loginForm("E-Mail"), '_name -> "edtEmail")),format.raw/*15.69*/("""
        """),_display_(/*16.10*/helper/*16.16*/.inputPassword(loginForm("Password"), '_name -> "edtPassword")),format.raw/*16.78*/("""
        """),format.raw/*17.9*/("""<input class="check-box" type="checkbox" value="Remember Me" name="chkRemember">
        <br/>
        <br/>
        <input class="btn btn-success" type="submit" value="Login"/>
    """)))}),format.raw/*21.6*/("""
    """),format.raw/*22.5*/("""</div>
""")))};
Seq[Any](format.raw/*6.30*/("""

"""),format.raw/*23.2*/("""

"""),_display_(/*25.2*/masterpage(" :: Login")/*25.25*/{_display_(_display_(/*25.27*/bodyContent))}),format.raw/*25.39*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[UserLogin]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[UserLogin]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Aug 05 23:28:45 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Account/login.scala.html
                  HASH: 93e31a830dbc72c50d4a2d9459986f69fc6a9bfb
                  MATRIX: 664->1|703->34|732->57|758->77|1100->108|1206->139|1225->150|1305->154|1336->159|1430->227|1445->233|1519->298|1559->300|1596->310|1609->314|1640->324|1677->334|1692->340|1766->393|1803->403|1818->409|1901->471|1937->480|2150->663|2182->668|2229->136|2258->676|2287->679|2319->702|2349->704|2384->716
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|43->13|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|51->21|52->22|54->6|56->23|58->25|58->25|58->25|58->25
                  -- GENERATED --
              */
          