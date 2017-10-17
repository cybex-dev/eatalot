
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
/*5.2*/import controllers.Application.AppTags.General

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserLoginInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(loginForm: Form[UserLoginInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/bodyContent/*9.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.17*/("""
    """),format.raw/*10.5*/("""<div class="body center-parent-small single-border">
        <h1>Login to """),_display_(/*11.23*/General/*11.30*/.SITENAME.toString),format.raw/*11.48*/("""</h1>
        <div class="center-child">
            <br/>
            """),_display_(/*14.14*/helper/*14.20*/.form(action = controllers.User.routes.UserController.doLogin)/*14.82*/ {_display_(Seq[Any](format.raw/*14.84*/("""
                """),_display_(/*15.18*/CSRF/*15.22*/.formField),format.raw/*15.32*/("""
                """),_display_(/*16.18*/inputText(loginForm("loginId"), '_name -> "E-Mail", '_class -> "text-field")),format.raw/*16.94*/("""
                """),_display_(/*17.18*/inputPassword(loginForm("password"), '_name -> "Password", '_class -> "text-field")),format.raw/*17.101*/("""
                """),_display_(/*18.18*/checkbox(loginForm("rememberMe"), '_name -> "Remember Me")),format.raw/*18.76*/("""
                """),format.raw/*19.17*/("""<br/>
                <input class="btn btn-success" type="submit" value="Login"/>
                <br/>
            """)))}),format.raw/*22.14*/("""
            """),format.raw/*23.13*/("""<hr style="background-color: black;" size="3px"/>
            """),_display_(/*24.14*/form(action = controllers.User.routes.CustomerController.register(), '_class -> "header-line")/*24.108*/ {_display_(Seq[Any](format.raw/*24.110*/("""
                """),_display_(/*25.18*/CSRF/*25.22*/.formField),format.raw/*25.32*/("""
                """),format.raw/*26.17*/("""<input class="btn btn-default" type="submit" value="Register"/>
            """)))}),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""</div>
        <br/>
    </div>
    <br/>
""")))};
Seq[Any](format.raw/*7.34*/("""

"""),format.raw/*32.2*/("""

"""),_display_(/*34.2*/masterpage/*34.12*/.apply(" :: Login", bodyContent)),format.raw/*34.44*/("""
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
                  DATE: Mon Oct 16 21:38:29 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/User/login.scala.html
                  HASH: 569ec8adb418877b5841bf674f0844af40f9717e
                  MATRIX: 661->1|700->34|729->57|752->74|792->108|1156->157|1266->192|1285->203|1365->207|1397->212|1499->287|1515->294|1554->312|1653->384|1668->390|1739->452|1779->454|1824->472|1837->476|1868->486|1913->504|2010->580|2055->598|2160->681|2205->699|2284->757|2329->774|2478->892|2519->905|2609->968|2713->1062|2754->1064|2799->1082|2812->1086|2843->1096|2888->1113|2996->1190|3032->1199|3114->189|3143->1242|3172->1245|3191->1255|3244->1287
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->9|37->9|39->9|40->10|41->11|41->11|41->11|44->14|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|47->17|47->17|48->18|48->18|49->19|52->22|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|57->27|58->28|63->7|65->32|67->34|67->34|67->34
                  -- GENERATED --
              */
          