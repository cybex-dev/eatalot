
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

def /*8.6*/bodyContent/*8.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.21*/("""
        """),format.raw/*9.9*/("""<h1>Login Form</h1>
        <br/>
        <div class="body">
            """),_display_(/*12.14*/helper/*12.20*/.form(action = controllers.User.routes.UserController.doLogin)/*12.82*/ {_display_(Seq[Any](format.raw/*12.84*/("""
                """),_display_(/*13.18*/CSRF/*13.22*/.formField),format.raw/*13.32*/("""
                """),_display_(/*14.18*/inputText(loginForm("loginId"), '_name -> "E-Mail", '_class -> "text-field")),format.raw/*14.94*/("""
                """),_display_(/*15.18*/inputPassword(loginForm("password"), '_name -> "Password", '_class -> "text-field")),format.raw/*15.101*/("""
                """),_display_(/*16.18*/checkbox(loginForm("bRememberMe"), '_name -> "Remember Me")),format.raw/*16.77*/("""
                """),format.raw/*17.92*/("""
                """),format.raw/*18.17*/("""<br/>
                <input class="btn btn-success" type="submit" value="Login"/>
                <br/>
                <hr class="left" style="width: 10%" size="2px"/>
            """)))}),format.raw/*22.14*/("""
            """),_display_(/*23.14*/form( action = controllers.User.routes.CustomerController.register(), '_class -> "header-line")/*23.109*/ {_display_(Seq[Any](format.raw/*23.111*/("""
                """),_display_(/*24.18*/CSRF/*24.22*/.formField),format.raw/*24.32*/("""
                """),format.raw/*25.17*/("""<input class="btn btn-default" type="submit" value="Register"/>
            """)))}),format.raw/*26.14*/("""
        """),format.raw/*27.9*/("""</div>
    """)))};
Seq[Any](format.raw/*6.34*/("""

    """),format.raw/*28.6*/("""

    """),_display_(/*30.6*/masterpage/*30.16*/.apply(" :: Login", bodyContent)),format.raw/*30.48*/("""
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
                  DATE: Wed Oct 11 22:25:23 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/User/login.scala.html
                  HASH: a0269849f92bb6c4d354a3ad4aefd219f64e6658
                  MATRIX: 661->1|700->34|729->57|752->74|1102->109|1212->148|1231->159|1311->163|1346->172|1447->246|1462->252|1533->314|1573->316|1618->334|1631->338|1662->348|1707->366|1804->442|1849->460|1954->543|1999->561|2079->620|2124->712|2169->729|2383->912|2424->926|2529->1021|2570->1023|2615->1041|2628->1045|2659->1055|2704->1072|2812->1149|2848->1158|2899->141|2932->1170|2965->1177|2984->1187|3037->1219
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|42->12|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|45->15|45->15|46->16|46->16|47->17|48->18|52->22|53->23|53->23|53->23|54->24|54->24|54->24|55->25|56->26|57->27|59->6|61->28|63->30|63->30|63->30
                  -- GENERATED --
              */
          