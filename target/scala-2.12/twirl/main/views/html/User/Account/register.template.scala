
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
/*2.2*/import helper.CSRF
/*3.2*/import models.User.User
/*4.2*/import play.data.Form

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.24*/("""


"""),_display_(/*9.2*/masterpage(" : Registration")/*9.31*/ {_display_(Seq[Any](format.raw/*9.33*/("""
    """),format.raw/*10.5*/("""<h1>Register User</h1>
    <br>
    <br>
    """),_display_(/*13.6*/helper/*13.12*/.form(action = controllers.User.routes.AccountController.save())/*13.76*/ {_display_(Seq[Any](format.raw/*13.78*/("""
        """),_display_(/*14.10*/CSRF/*14.14*/.formField),format.raw/*14.24*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputText(userForm("E-Mail"))),format.raw/*15.46*/("""
        """),_display_(/*16.10*/helper/*16.16*/.inputPassword(userForm("Password"))),format.raw/*16.52*/("""
        """),_display_(/*17.10*/helper/*17.16*/.inputPassword(userForm("Confirm Password"))),format.raw/*17.60*/("""
        """),format.raw/*18.9*/("""<input class="button-bar" type="submit" value="Register"/>
    """)))}),format.raw/*19.6*/("""
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 03 15:47:39 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Account/register.scala.html
                  HASH: a32ffa54b861ad4c6bd896c8cc37a441090ede65
                  MATRIX: 664->1|703->34|729->54|760->79|1093->103|1210->125|1239->129|1276->158|1315->160|1347->165|1419->211|1434->217|1507->281|1547->283|1584->293|1597->297|1628->307|1665->317|1680->323|1731->353|1768->363|1783->369|1840->405|1877->415|1892->421|1957->465|1993->474|2087->538|2119->540
                  LINES: 24->1|25->2|26->3|27->4|32->6|37->6|40->9|40->9|40->9|41->10|44->13|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|51->20
                  -- GENERATED --
              */
          