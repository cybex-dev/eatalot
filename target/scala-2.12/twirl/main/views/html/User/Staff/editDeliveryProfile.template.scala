
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
/*1.2*/import Global.Html5._
/*2.2*/import Global.Static.essentials
/*3.2*/import helper.CSRF
/*4.2*/import models.User.UserProfile
/*5.2*/import play.data.Form

object editDeliveryProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserProfile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userProfile: Form[UserProfile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/scriptsContent/*8.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.20*/("""

""")))};def /*12.2*/navContent/*12.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.16*/("""

""")))};def /*16.2*/userContent/*16.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.17*/("""
    """),format.raw/*17.5*/("""<div class="input-group">
    """),_display_(/*18.6*/helper/*18.12*/.form(action = controllers.User.routes.DeliveryStaffController.doEdit())/*18.84*/ {_display_(Seq[Any](format.raw/*18.86*/("""
        """),_display_(/*19.10*/CSRF/*19.14*/.formField),format.raw/*19.24*/("""
        """),format.raw/*20.9*/("""<div class="margin-left-small">
            <h1>Your information</h1>
            <br/>
            <div class="container input-container">
                <h4>Your Login Information</h4>
                """),_display_(/*25.18*/helper/*25.24*/.inputText(userProfile("alias"), '_name -> "Login ID")),format.raw/*25.78*/("""
            """),format.raw/*26.13*/("""</div>
            <br/>
            <div class="container input-container">
                <h4>Change Password</h4>
                """),_display_(/*30.18*/helper/*30.24*/.inputPassword(userProfile("password"), '_name -> "Password")),format.raw/*30.85*/("""
                """),_display_(/*31.18*/helper/*31.24*/.inputPassword(userProfile("confirmPassword"), '_name -> "Confirm Password")),format.raw/*31.100*/("""
            """),format.raw/*32.13*/("""</div>
            <br/>
            <br/>
            <div class="container input-container">
                <h4>Your Personal Details</h4>
                """),_display_(/*37.18*/helper/*37.24*/.inputText(userProfile("name"), '_name -> "Name")),format.raw/*37.73*/("""
                """),_display_(/*38.18*/helper/*38.24*/.inputText(userProfile("surname"), '_name -> "Surname")),format.raw/*38.79*/("""
            """),format.raw/*39.13*/("""</div>
            <br/>
            <div class="container input-container">
                <h4>Your Contact Information</h4>
                """),_display_(/*43.18*/helper/*43.24*/.inputText(userProfile("cellNumber"), '_name -> "Cellphone Number")),format.raw/*43.91*/("""
            """),format.raw/*44.13*/("""</div>
        </div>
        <div class="row">
            <div class="pull-center">
                <input class="btn btn-default button-padding button-small" type="button" onclick="location.href = '"""),_display_(/*48.117*/controllers/*48.128*/.User.routes.DeliveryStaffController.index()),format.raw/*48.172*/("""';" value="Cancel"> <input class="btn btn-success button-padding button-small" type="submit" value="Update">
            </div>
        </div>
        <br/>
    """)))}),format.raw/*52.6*/("""
    """),format.raw/*53.5*/("""</div>
""")))};def /*56.2*/navSide/*56.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*56.13*/("""
""")))};def /*59.2*/bodyContent/*59.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*59.17*/("""
"""),_display_(/*60.2*/aside/*60.7*/.apply("", navSide)),format.raw/*60.26*/("""

"""),_display_(/*62.2*/article/*62.9*/.apply(userContent)),format.raw/*62.28*/("""

""")))};
Seq[Any](format.raw/*6.34*/("""

"""),format.raw/*10.2*/("""

"""),format.raw/*14.2*/("""

"""),format.raw/*54.2*/("""

"""),format.raw/*57.2*/("""

"""),format.raw/*64.2*/("""

"""),_display_(/*66.2*/essentials/*66.12*/.apply(" :: Edit Profile", navContent, bodyContent, scriptsContent)),format.raw/*66.79*/("""
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
                  DATE: Sun Oct 22 04:28:37 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Staff/editDeliveryProfile.scala.html
                  HASH: 5df014d81579d246d51fe9c18ea43f8d9d5e7547
                  MATRIX: 662->1|691->24|730->57|756->77|794->109|1145->132|1255->167|1277->181|1357->185|1383->191|1402->201|1483->205|1509->211|1529->222|1610->226|1642->231|1699->262|1714->268|1795->340|1835->342|1872->352|1885->356|1916->366|1952->375|2184->580|2199->586|2274->640|2315->653|2477->788|2492->794|2574->855|2619->873|2634->879|2732->955|2773->968|2959->1127|2974->1133|3044->1182|3089->1200|3104->1206|3180->1261|3221->1274|3392->1418|3407->1424|3495->1491|3536->1504|3766->1706|3787->1717|3853->1761|4045->1923|4077->1928|4108->1939|4123->1946|4204->1950|4229->1955|4249->1966|4330->1970|4358->1972|4371->1977|4411->1996|4440->1999|4455->2006|4495->2025|4537->164|4566->188|4595->208|4624->1936|4653->1952|4682->2028|4711->2031|4730->2041|4818->2108
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->6|37->8|37->8|39->8|41->12|41->12|43->12|45->16|45->16|47->16|48->17|49->18|49->18|49->18|49->18|50->19|50->19|50->19|51->20|56->25|56->25|56->25|57->26|61->30|61->30|61->30|62->31|62->31|62->31|63->32|68->37|68->37|68->37|69->38|69->38|69->38|70->39|74->43|74->43|74->43|75->44|79->48|79->48|79->48|83->52|84->53|85->56|85->56|87->56|88->59|88->59|90->59|91->60|91->60|91->60|93->62|93->62|93->62|96->6|98->10|100->14|102->54|104->57|106->64|108->66|108->66|108->66
                  -- GENERATED --
              */
          