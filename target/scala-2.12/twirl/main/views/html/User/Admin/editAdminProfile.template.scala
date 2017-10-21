
package views.html.User.Admin

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
/*1.2*/import Global.Html5._
/*2.2*/import Global.Static.essentials
/*3.2*/import helper.CSRF
/*4.2*/import models.User.UserProfile
/*5.2*/import play.data.Form

object editAdminProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserProfile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(userProfile: Form[UserProfile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/scriptsContent/*9.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.20*/("""
    """),format.raw/*10.5*/("""<script href=""""),_display_(/*10.20*/controllers/*10.31*/.User.routes.javascript.AdminController.adminJSRoutes),format.raw/*10.84*/("""" type="text/javascript"></script>
""")))};def /*13.2*/navContent/*13.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.16*/("""

""")))};def /*17.2*/userContent/*17.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.17*/("""
    """),format.raw/*18.5*/("""<div class="input-group">
    """),_display_(/*19.6*/helper/*19.12*/.form(action = controllers.User.routes.CustomerController.update())/*19.79*/ {_display_(Seq[Any](format.raw/*19.81*/("""
        """),_display_(/*20.10*/CSRF/*20.14*/.formField),format.raw/*20.24*/("""
        """),format.raw/*21.9*/("""<div class="margin-left-small">
            <h1>Your information</h1>
            <br/>

            <div class="container input-container">
                <h4>Change Password</h4>
                """),_display_(/*27.18*/helper/*27.24*/.inputPassword(userProfile("password"), '_name -> "Password")),format.raw/*27.85*/("""
                """),_display_(/*28.18*/helper/*28.24*/.inputPassword(userProfile("confirmPassword"), '_name -> "Confirm Password")),format.raw/*28.100*/("""
            """),format.raw/*29.13*/("""</div>
            <br/>
            <br/>
        </div>
        <div class="row">
            <div class="pull-center">
                <input class="btn btn-default button-padding button-small" type="button" onclick="location.href = '"""),_display_(/*35.117*/controllers/*35.128*/.User.routes.AdminController.index()),format.raw/*35.164*/("""';" value="Cancel"> <input class="btn btn-success button-padding button-small" type="submit" value="Update">
            </div>
        </div>
        <br/>
    """)))}),format.raw/*39.6*/("""
    """),format.raw/*40.5*/("""</div>
""")))};def /*43.2*/navSide/*43.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*43.13*/("""
""")))};def /*46.2*/bodyContent/*46.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*46.17*/("""
"""),_display_(/*47.2*/aside/*47.7*/.apply("", navSide)),format.raw/*47.26*/("""

"""),_display_(/*49.2*/article/*49.9*/.apply(userContent)),format.raw/*49.28*/("""
""")))};
Seq[Any](format.raw/*7.34*/("""

"""),format.raw/*11.2*/("""

"""),format.raw/*15.2*/("""

"""),format.raw/*41.2*/("""

"""),format.raw/*44.2*/("""

"""),format.raw/*50.2*/("""

"""),_display_(/*52.2*/essentials/*52.12*/.apply(" :: Edit Profile", navContent, bodyContent, scriptsContent)),format.raw/*52.79*/("""
"""))
      }
    }
  }

  def render(userProfile:Form[UserProfile]): play.twirl.api.HtmlFormat.Appendable = apply(userProfile)

  def f:((Form[UserProfile]) => play.twirl.api.HtmlFormat.Appendable) = (userProfile) => apply(userProfile)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 11:02:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Admin/editAdminProfile.scala.html
                  HASH: 207549651ab985b58863d306b862e354067be640
                  MATRIX: 662->1|691->24|730->57|756->77|794->109|1142->133|1252->168|1274->182|1354->186|1386->191|1428->206|1448->217|1522->270|1581->309|1600->319|1681->323|1707->329|1727->340|1808->344|1840->349|1897->380|1912->386|1988->453|2028->455|2065->465|2078->469|2109->479|2145->488|2371->687|2386->693|2468->754|2513->772|2528->778|2626->854|2667->867|2933->1105|2954->1116|3012->1152|3204->1314|3236->1319|3267->1330|3282->1337|3363->1341|3388->1346|3408->1357|3489->1361|3517->1363|3530->1368|3570->1387|3599->1390|3614->1397|3654->1416|3695->165|3724->306|3753->326|3782->1327|3811->1343|3840->1418|3869->1421|3888->1431|3976->1498
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->9|37->9|39->9|40->10|40->10|40->10|40->10|41->13|41->13|43->13|45->17|45->17|47->17|48->18|49->19|49->19|49->19|49->19|50->20|50->20|50->20|51->21|57->27|57->27|57->27|58->28|58->28|58->28|59->29|65->35|65->35|65->35|69->39|70->40|71->43|71->43|73->43|74->46|74->46|76->46|77->47|77->47|77->47|79->49|79->49|79->49|81->7|83->11|85->15|87->41|89->44|91->50|93->52|93->52|93->52
                  -- GENERATED --
              */
          