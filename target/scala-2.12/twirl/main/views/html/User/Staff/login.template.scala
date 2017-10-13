
package views.html.User.Staff

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
/*4.2*/import models.User.UserLoginInfo

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserLoginInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(loginForm: Form[UserLoginInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""<h1>Staff Login</h1>
    <br/>
    <div class="body">
    """),_display_(/*12.6*/helper/*12.12*/.form(action = controllers.User.routes.UserController.doLogin)/*12.74*/ {_display_(Seq[Any](format.raw/*12.76*/("""
        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(loginForm("edtEmail"), '_name -> "E-Mail", '_class -> "text-field")),format.raw/*14.94*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputPassword(loginForm("edtPassword"), '_name -> "Password", '_class -> "text-field")),format.raw/*15.103*/("""
        """),format.raw/*16.9*/("""<label class="checkbox-inline" ><input class="check-box" type="checkbox" name="chkRemember">Remember Me</label>
        <br/>
        <br/>
        <input class="btn btn-success" type="submit" value="Login to System"/>
    """)))}),format.raw/*20.6*/("""
    """),format.raw/*21.5*/("""</div>
""")))};
Seq[Any](format.raw/*6.34*/("""

"""),format.raw/*22.2*/("""

"""),_display_(/*24.2*/masterpage/*24.12*/.apply(" :: Staff Login", bodyContent)),format.raw/*24.50*/("""
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
                  DATE: Thu Oct 12 15:36:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Staff/login.scala.html
                  HASH: a6b68368cbc30b39bb4aca97e91d23a21d656f60
                  MATRIX: 662->1|701->34|730->57|756->77|1106->112|1216->147|1235->158|1315->162|1346->167|1431->226|1446->232|1517->294|1557->296|1594->306|1607->310|1638->320|1675->330|1690->336|1789->414|1826->424|1841->430|1950->517|1986->526|2240->750|2272->755|2319->144|2348->763|2377->766|2396->776|2455->814
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|42->12|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|50->20|51->21|53->6|55->22|57->24|57->24|57->24
                  -- GENERATED --
              */
          