
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
/*3.2*/import models.User.Customer.UserRegisterInfo
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
        """),_display_(/*14.10*/helper/*14.16*/.inputText(userForm("loginId"), '_name -> "E-Mail", '_class -> "text-field")),format.raw/*14.92*/("""
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
                  DATE: Wed Oct 11 22:25:23 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/register.scala.html
                  HASH: a684b340db53affcc0e88dd5260371e79a1468e9
                  MATRIX: 665->1|704->34|730->54|782->100|1127->124|1239->161|1258->172|1338->176|1369->181|1441->227|1456->233|1532->300|1572->302|1609->312|1622->316|1653->326|1690->336|1705->342|1802->418|1839->428|1854->434|1958->517|1995->527|2010->533|2130->631|2166->640|2265->709|2306->158|2335->711|2364->714|2383->724|2439->759
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|42->12|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|48->18|50->6|52->19|54->21|54->21|54->21
                  -- GENERATED --
              */
          