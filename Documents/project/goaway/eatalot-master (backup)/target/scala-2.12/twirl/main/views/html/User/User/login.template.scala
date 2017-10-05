
package views.html.User.User

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
/*3.2*/import helper._
/*4.2*/import models.User.UserLoginInfo

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserLoginInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(loginForm: Form[UserLoginInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""<h1>Login Form</h1>
    <br/>
    <div class="body">
    """),_display_(/*12.6*/helper/*12.12*/.form(action = controllers.User.routes.UserController.doLogin)/*12.74*/ {_display_(Seq[Any](format.raw/*12.76*/("""
        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""
        """),_display_(/*14.10*/inputText(loginForm("email"), '_name -> "E-Mail", '_class -> "text-field")),format.raw/*14.84*/("""
        """),_display_(/*15.10*/inputPassword(loginForm("password"), '_name -> "Password", '_class -> "text-field")),format.raw/*15.93*/("""
        """),_display_(/*16.10*/checkbox(loginForm("bRememberMe"), '_name -> "Remember Me")),format.raw/*16.69*/("""
        """),format.raw/*17.84*/("""
        """),format.raw/*18.9*/("""<br/>
        <br/>
        <input class="btn btn-success" type="submit" value="Login"/>
    """)))}),format.raw/*21.6*/("""
    """),format.raw/*22.5*/("""</div>
""")))};
Seq[Any](format.raw/*6.34*/("""

"""),format.raw/*23.2*/("""

"""),_display_(/*25.2*/masterpage/*25.12*/.apply(" :: Login", bodyContent)),format.raw/*25.44*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[UserLoginInfo]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[UserLoginInfo]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Sep 29 17:56:52 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master/app/views/User/User/login.scala.html
                  HASH: 4dca42cd87b814194a9efc419be7c813fbec3ce5
                  MATRIX: 661->1|700->34|729->57|752->74|1102->109|1212->144|1231->155|1311->159|1342->164|1426->222|1441->228|1512->290|1552->292|1589->302|1602->306|1633->316|1670->326|1765->400|1802->410|1906->493|1943->503|2023->562|2060->646|2096->655|2220->749|2252->754|2299->141|2328->762|2357->765|2376->775|2429->807
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|42->12|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|45->15|45->15|46->16|46->16|47->17|48->18|51->21|52->22|54->6|56->23|58->25|58->25|58->25
                  -- GENERATED --
              */
          