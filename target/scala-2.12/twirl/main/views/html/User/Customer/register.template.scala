
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
/*2.2*/import controllers.Application.AppTags.General
/*3.2*/import helper.CSRF
/*4.2*/import models.User.Customer.UserRegisterInfo
/*5.2*/import play.data.Form

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserRegisterInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(userForm: Form[UserRegisterInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.6*/bodyContent/*9.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.21*/("""
        """),format.raw/*10.9*/("""<div class="body center-parent-small single-border">
            <h1>Register for """),_display_(/*11.31*/General/*11.38*/.SITENAME.toString),format.raw/*11.56*/("""</h1>
            <div class="center-child">
                <br>
                """),_display_(/*14.18*/helper/*14.24*/.form(action = controllers.User.routes.CustomerController.create())/*14.91*/ {_display_(Seq[Any](format.raw/*14.93*/("""
                    """),_display_(/*15.22*/CSRF/*15.26*/.formField),format.raw/*15.36*/("""
                    """),_display_(/*16.22*/helper/*16.28*/.inputText(userForm("loginId"), '_name -> "E-Mail", '_class -> "text-field")),format.raw/*16.104*/("""
                    """),format.raw/*17.21*/("""<br/>
                    """),_display_(/*18.22*/helper/*18.28*/.inputPassword(userForm("password"), '_name -> "Password", '_class -> "text-field")),format.raw/*18.111*/("""
                    """),_display_(/*19.22*/helper/*19.28*/.inputPassword(userForm("confirmPassword"), '_name -> "Confirm Password", '_class -> "text-field")),format.raw/*19.126*/("""
                    """),format.raw/*20.21*/("""<br/>
                    <input class="btn btn-success" type="submit" value="Register"/>
                """)))}),format.raw/*22.18*/("""
                """),format.raw/*23.17*/("""<hr/>
                """),_display_(/*24.18*/helper/*24.24*/.form(action = controllers.User.routes.UserController.login())/*24.86*/ {_display_(Seq[Any](format.raw/*24.88*/("""
                    """),_display_(/*25.22*/CSRF/*25.26*/.formField),format.raw/*25.36*/("""
                    """),format.raw/*26.21*/("""<input class="btn btn-default" type="submit" value="Login"/>
                """)))}),format.raw/*27.18*/("""
            """),format.raw/*28.13*/("""</div>
            <br/>
        </div>
        <br/>
    """)))};
Seq[Any](format.raw/*7.36*/("""

    """),format.raw/*32.6*/("""

    """),_display_(/*34.6*/masterpage/*34.16*/.apply(" :: Register", bodyContent)),format.raw/*34.51*/("""
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
                  DATE: Sat Oct 21 11:02:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/register.scala.html
                  HASH: df4ff3a44486b26479466a06f8a760a8727cfd75
                  MATRIX: 665->1|704->34|758->82|784->102|836->148|1181->172|1293->213|1312->224|1392->228|1428->237|1538->320|1554->327|1593->345|1703->428|1718->434|1794->501|1834->503|1883->525|1896->529|1927->539|1976->561|1991->567|2089->643|2138->664|2192->691|2207->697|2312->780|2361->802|2376->808|2496->906|2545->927|2683->1034|2728->1051|2778->1074|2793->1080|2864->1142|2904->1144|2953->1166|2966->1170|2997->1180|3046->1201|3155->1279|3196->1292|3294->206|3327->1351|3360->1358|3379->1368|3435->1403
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->9|37->9|39->9|40->10|41->11|41->11|41->11|44->14|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|52->22|53->23|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|57->27|58->28|63->7|65->32|67->34|67->34|67->34
                  -- GENERATED --
              */
          