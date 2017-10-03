
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
/*2.2*/import helper.CSRF
/*3.2*/import models.User.UserRegisterInfo
/*4.2*/import play.data.Form

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserRegisterInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userForm: Form[UserRegisterInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""<h1>Register User</h1>
    <br>
    <br>
    """),_display_(/*12.6*/helper/*12.12*/.form(action = controllers.User.routes.CustomerController.create())/*12.79*/ {_display_(Seq[Any](format.raw/*12.81*/("""
        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(userForm("email"), '_name -> "E-Mail", '_class -> "text-field")),format.raw/*14.90*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputPassword(userForm("password"), '_name -> "Password", '_class -> "text-field")),format.raw/*15.99*/("""
        """),_display_(/*16.10*/helper/*16.16*/.inputPassword(userForm("confirmPassword"), '_name -> "Confirm Password", '_class -> "text-field")),format.raw/*16.114*/("""
        """),format.raw/*17.9*/("""<input class="btn btn-success" type="submit" value="Register"/>
    """)))}),format.raw/*18.6*/("""
""")))};
Seq[Any](format.raw/*6.36*/("""

"""),format.raw/*19.2*/("""

"""),_display_(/*21.2*/masterpage/*21.12*/.apply(" :: Register", bodyContent)),format.raw/*21.47*/("""
"""))
      }
    }
  }

  def render(userForm:Form[UserRegisterInfo]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[UserRegisterInfo]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 03 05:56:09 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/register.scala.html
                  HASH: 257689cb2b61e3fb5f134bd89a1fbe551b505432
                  MATRIX: 665->1|704->34|730->54|773->91|1118->115|1230->152|1249->163|1329->167|1360->172|1432->218|1447->224|1523->291|1563->293|1600->303|1613->307|1644->317|1681->327|1696->333|1791->407|1828->417|1843->423|1947->506|1984->516|1999->522|2119->620|2155->629|2254->698|2295->149|2324->700|2353->703|2372->713|2428->748
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|42->12|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|48->18|50->6|52->19|54->21|54->21|54->21
                  -- GENERATED --
              */
          