
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
/*1.2*/import Global.Static.essentials
/*2.2*/import play.data.Form
/*3.2*/import Global.Html5._
/*4.2*/import helper.CSRF
/*5.2*/import models.User.UserProfile

object editAdminProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserProfile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(userProfile: Form[UserProfile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/scriptsContent/*9.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.20*/("""
""")))};def /*12.2*/navContent/*12.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.16*/("""

""")))};def /*16.2*/userContent/*16.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.17*/("""
    """),format.raw/*17.5*/("""<div class="input-group">
        """),_display_(/*18.10*/helper/*18.16*/.form(action = controllers.User.routes.CustomerController.update())/*18.83*/{_display_(Seq[Any](format.raw/*18.84*/("""
            """),_display_(/*19.14*/CSRF/*19.18*/.formField),format.raw/*19.28*/("""
            """),format.raw/*20.13*/("""<h2>Your information</h2>
            <br/>
            <div class="container input-container">
                <h4>Change Password</h4>
                """),_display_(/*24.18*/helper/*24.24*/.inputPassword(userProfile("password"), '_name -> "Password")),format.raw/*24.85*/("""
                """),_display_(/*25.18*/helper/*25.24*/.inputPassword(userProfile("confirmPassword"), '_name -> "Confirm Password")),format.raw/*25.100*/("""
            """),format.raw/*26.13*/("""</div>
            <br/>
            <br/>
            <div class="container input-container">
                <input class="btn btn-default button-padding" type="button" onclick="location.href='"""),_display_(/*30.102*/controllers/*30.113*/.User.routes.AdminController.index()),format.raw/*30.149*/("""';" value="Cancel"> <input class="btn btn-success button-padding" type="submit" value="Update">
            </div>
            <br/>
        """)))}),format.raw/*33.10*/("""
    """),format.raw/*34.5*/("""</div>
""")))};def /*37.2*/navSide/*37.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*37.13*/("""
    """),format.raw/*38.5*/("""<a href="#" onclick="">Basic Information</a>
    <a href="#">Edit Address</a>
    <a href="#">Change Password</a>
""")))};def /*43.2*/bodyContent/*43.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*43.17*/("""
"""),_display_(/*44.2*/aside/*44.7*/.apply("", navSide)),format.raw/*44.26*/("""

"""),_display_(/*46.2*/article/*46.9*/.apply(userContent)),format.raw/*46.28*/("""
""")))};
Seq[Any](format.raw/*7.34*/("""

"""),format.raw/*10.2*/("""

"""),format.raw/*14.2*/("""

"""),format.raw/*35.2*/("""

"""),format.raw/*41.2*/("""

"""),format.raw/*47.2*/("""

"""),_display_(/*49.2*/essentials/*49.12*/.apply(" :: Edit Profile", navContent, bodyContent, scriptsContent)),format.raw/*49.79*/("""
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
                  DATE: Sun Oct 15 15:05:45 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Admin/editAdminProfile.scala.html
                  HASH: 22af5b17c9f7664f14f44eb35284722e4c49bda4
                  MATRIX: 662->1|701->34|730->57|759->80|785->100|1142->133|1252->168|1274->182|1354->186|1379->191|1398->201|1479->205|1505->211|1525->222|1606->226|1638->231|1700->266|1715->272|1791->339|1830->340|1871->354|1884->358|1915->368|1956->381|2137->535|2152->541|2234->602|2279->620|2294->626|2392->702|2433->715|2657->911|2678->922|2736->958|2909->1100|2941->1105|2972->1116|2987->1123|3068->1127|3100->1132|3238->1250|3258->1261|3339->1265|3367->1267|3380->1272|3420->1291|3449->1294|3464->1301|3504->1320|3545->165|3574->188|3603->208|3632->1113|3661->1247|3690->1322|3719->1325|3738->1335|3826->1402
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->9|37->9|39->9|40->12|40->12|42->12|44->16|44->16|46->16|47->17|48->18|48->18|48->18|48->18|49->19|49->19|49->19|50->20|54->24|54->24|54->24|55->25|55->25|55->25|56->26|60->30|60->30|60->30|63->33|64->34|65->37|65->37|67->37|68->38|71->43|71->43|73->43|74->44|74->44|74->44|76->46|76->46|76->46|78->7|80->10|82->14|84->35|86->41|88->47|90->49|90->49|90->49
                  -- GENERATED --
              */
          