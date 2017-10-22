
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

object editKitchenProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserProfile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userProfile: Form[UserProfile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.6*/scriptsContent/*8.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.24*/("""

    """)))};def /*12.6*/navContent/*12.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.20*/("""

    """)))};def /*16.6*/userContent/*16.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.21*/("""
        """),format.raw/*17.9*/("""<div class="input-group">
        """),_display_(/*18.10*/helper/*18.16*/.form(action = controllers.User.routes.KitchenStaffController.doEdit())/*18.87*/ {_display_(Seq[Any](format.raw/*18.89*/("""
            """),_display_(/*19.14*/CSRF/*19.18*/.formField),format.raw/*19.28*/("""
            """),format.raw/*20.13*/("""<div class="margin-left-small">
                <h1>Your information</h1>
                <br/>
                <div class="container input-container">
                    <h4>Your Login Information</h4>
                    """),_display_(/*25.22*/helper/*25.28*/.inputText(userProfile("alias"), '_name -> "Login ID")),format.raw/*25.82*/("""
                """),format.raw/*26.17*/("""</div>
                <br/>
                <div class="container input-container">
                    <h4>Change Password</h4>
                    """),_display_(/*30.22*/helper/*30.28*/.inputText(userProfile("password"), '_name -> "Password")),format.raw/*30.85*/("""
                    """),_display_(/*31.22*/helper/*31.28*/.inputText(userProfile("confirmPassword"), '_name -> "Confirm Password")),format.raw/*31.100*/("""
                """),format.raw/*32.17*/("""</div>
                <br/>
                <br/>
                <div class="container input-container">
                    <h6>Your Personal Details</h6>
                    """),_display_(/*37.22*/helper/*37.28*/.inputPassword(userProfile("name"), '_name -> "Name")),format.raw/*37.81*/("""
                    """),_display_(/*38.22*/helper/*38.28*/.inputPassword(userProfile("surname"), '_name -> "Surname")),format.raw/*38.87*/("""
                """),format.raw/*39.17*/("""</div>
                <br/>
                <div class="container input-container">
                    <h6>Your Contact Information</h6>
                    """),_display_(/*43.22*/helper/*43.28*/.inputText(userProfile("cellNumber"), '_name -> "Cellphone Number")),format.raw/*43.95*/("""
                """),format.raw/*44.17*/("""</div>
            </div>
            <div class="row">
                <div class="pull-center">
                    <input class="btn btn-default button-padding button-small" type="button" onclick="location.href = '"""),_display_(/*48.121*/controllers/*48.132*/.User.routes.KitchenStaffController.index()),format.raw/*48.175*/("""';" value="Cancel"> <input class="btn btn-success button-padding button-small" type="submit" value="Update">
                </div>
            </div>
            <br/>
        """)))}),format.raw/*52.10*/("""
        """),format.raw/*53.9*/("""</div>
    """)))};def /*56.6*/navSide/*56.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*56.17*/("""
    """)))};def /*59.6*/bodyContent/*59.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*59.21*/("""
    """),_display_(/*60.6*/aside/*60.11*/.apply("", navSide)),format.raw/*60.30*/("""

    """),_display_(/*62.6*/article/*62.13*/.apply(userContent)),format.raw/*62.32*/("""

    """)))};
Seq[Any](format.raw/*6.34*/("""

    """),format.raw/*10.6*/("""

    """),format.raw/*14.6*/("""

    """),format.raw/*54.6*/("""

    """),format.raw/*57.6*/("""

    """),format.raw/*64.6*/("""

    """),_display_(/*66.6*/essentials/*66.16*/.apply(" :: Edit Profile", navContent, bodyContent, scriptsContent)),format.raw/*66.83*/("""
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
                  DATE: Sun Oct 22 22:44:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Staff/editKitchenProfile.scala.html
                  HASH: 248b85298e8a8a73d035dbfa9302823e67595095
                  MATRIX: 662->1|691->24|730->57|756->77|794->109|1144->132|1254->171|1276->185|1356->189|1386->203|1405->213|1486->217|1516->231|1536->242|1617->246|1653->255|1715->290|1730->296|1810->367|1850->369|1891->383|1904->387|1935->397|1976->410|2228->635|2243->641|2318->695|2363->712|2541->863|2556->869|2634->926|2683->948|2698->954|2792->1026|2837->1043|3043->1222|3058->1228|3132->1281|3181->1303|3196->1309|3276->1368|3321->1385|3508->1545|3523->1551|3611->1618|3656->1635|3902->1853|3923->1864|3988->1907|4197->2085|4233->2094|4268->2113|4284->2120|4365->2124|4394->2137|4414->2148|4495->2152|4527->2158|4541->2163|4581->2182|4614->2189|4630->2196|4670->2215|4716->164|4749->196|4782->224|4815->2106|4848->2130|4881->2222|4914->2229|4933->2239|5021->2306
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->6|37->8|37->8|39->8|41->12|41->12|43->12|45->16|45->16|47->16|48->17|49->18|49->18|49->18|49->18|50->19|50->19|50->19|51->20|56->25|56->25|56->25|57->26|61->30|61->30|61->30|62->31|62->31|62->31|63->32|68->37|68->37|68->37|69->38|69->38|69->38|70->39|74->43|74->43|74->43|75->44|79->48|79->48|79->48|83->52|84->53|85->56|85->56|87->56|88->59|88->59|90->59|91->60|91->60|91->60|93->62|93->62|93->62|96->6|98->10|100->14|102->54|104->57|106->64|108->66|108->66|108->66
                  -- GENERATED --
              */
          