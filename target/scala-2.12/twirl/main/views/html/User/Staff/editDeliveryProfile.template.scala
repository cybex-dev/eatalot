
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
""")))};def /*11.2*/navContent/*11.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.16*/("""

""")))};def /*15.2*/userContent/*15.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.17*/("""
    """),format.raw/*16.5*/("""<div class="input-group">
        """),_display_(/*17.10*/helper/*17.16*/.form( action = controllers.User.routes.DeliveryStaffController.doEdit())/*17.89*/{_display_(Seq[Any](format.raw/*17.90*/("""
            """),_display_(/*18.14*/CSRF/*18.18*/.formField),format.raw/*18.28*/("""
            """),format.raw/*19.13*/("""<h2>Your information</h2>
            <br/>
            <div class="container input-container">
                <h4>Your Login Information</h4>
                """),_display_(/*23.18*/helper/*23.24*/.inputText(userProfile("alias"), '_name -> "Login ID")),format.raw/*23.78*/("""
            """),format.raw/*24.13*/("""</div>
            <br/>
            <div class="container input-container">
                <h4>Change Password</h4>
                """),_display_(/*28.18*/helper/*28.24*/.inputPassword(userProfile("password"), '_name -> "Password")),format.raw/*28.85*/("""
                """),_display_(/*29.18*/helper/*29.24*/.inputPassword(userProfile("confirmPassword"), '_name -> "Confirm Password")),format.raw/*29.100*/("""
            """),format.raw/*30.13*/("""</div>
            <br/>
            <br/>
            <div class="container input-container">
                <h4>Your Personal Details</h4>
                """),_display_(/*35.18*/helper/*35.24*/.inputText(userProfile("name"), '_name -> "Name")),format.raw/*35.73*/("""
                """),_display_(/*36.18*/helper/*36.24*/.inputText(userProfile("surname"), '_name -> "Surname")),format.raw/*36.79*/("""
            """),format.raw/*37.13*/("""</div>
            <br/>
            <div class="container input-container">
                <h4>Your Contact Information</h4>
                """),_display_(/*41.18*/helper/*41.24*/.inputText(userProfile("cellNumber"), '_name -> "Cellphone Number")),format.raw/*41.91*/("""
            """),format.raw/*42.13*/("""</div>
            <br/>
            <div class="container input-container">
                <input class="btn btn-default button-padding" type="button" onclick="location.href='"""),_display_(/*45.102*/controllers/*45.113*/.User.routes.DeliveryStaffController.index()),format.raw/*45.157*/("""';" value="Cancel"> <input class="btn btn-success button-padding" type="submit" value="Update">
            </div>
            <br/>
        """)))}),format.raw/*48.10*/("""
    """),format.raw/*49.5*/("""</div>
""")))};def /*52.2*/navSide/*52.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*52.13*/("""
    """),format.raw/*53.5*/("""<a href="#" onclick="">Basic Information</a>
    <a href="#">Edit Address</a>
    <a href="#">Change Password</a>
""")))};def /*58.2*/bodyContent/*58.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*58.17*/("""
"""),_display_(/*59.2*/aside/*59.7*/.apply("", navSide)),format.raw/*59.26*/("""

"""),_display_(/*61.2*/article/*61.9*/.apply(userContent)),format.raw/*61.28*/("""

    """),format.raw/*63.5*/("""<script href=""""),_display_(/*63.20*/controllers/*63.31*/.User.routes.javascript.DeliveryStaffController.deliveryJSRoutes),format.raw/*63.95*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*6.34*/("""

"""),format.raw/*9.2*/("""

"""),format.raw/*13.2*/("""

"""),format.raw/*50.2*/("""

"""),format.raw/*56.2*/("""

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
                  DATE: Sat Oct 21 09:12:58 SAST 2017
                  SOURCE: /home/cybex/Projects/eatalot-temp/app/views/User/Staff/editDeliveryProfile.scala.html
                  HASH: 4d4c84a67545627ee9654981f5f292f706c54466
                  MATRIX: 662->1|691->24|730->57|756->77|794->109|1145->132|1255->167|1277->181|1357->185|1382->190|1401->200|1482->204|1508->210|1528->221|1609->225|1641->230|1703->265|1718->271|1800->344|1839->345|1880->359|1893->363|1924->373|1965->386|2153->547|2168->553|2243->607|2284->620|2446->755|2461->761|2543->822|2588->840|2603->846|2701->922|2742->935|2928->1094|2943->1100|3013->1149|3058->1167|3073->1173|3149->1228|3190->1241|3361->1385|3376->1391|3464->1458|3505->1471|3711->1649|3732->1660|3798->1704|3971->1846|4003->1851|4034->1862|4049->1869|4130->1873|4162->1878|4300->1996|4320->2007|4401->2011|4429->2013|4442->2018|4482->2037|4511->2040|4526->2047|4566->2066|4599->2072|4641->2087|4661->2098|4746->2162|4821->164|4849->187|4878->207|4907->1859|4936->1993|4965->2198|4994->2201|5013->2211|5101->2278
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->6|37->8|37->8|39->8|40->11|40->11|42->11|44->15|44->15|46->15|47->16|48->17|48->17|48->17|48->17|49->18|49->18|49->18|50->19|54->23|54->23|54->23|55->24|59->28|59->28|59->28|60->29|60->29|60->29|61->30|66->35|66->35|66->35|67->36|67->36|67->36|68->37|72->41|72->41|72->41|73->42|76->45|76->45|76->45|79->48|80->49|81->52|81->52|83->52|84->53|87->58|87->58|89->58|90->59|90->59|90->59|92->61|92->61|92->61|94->63|94->63|94->63|94->63|96->6|98->9|100->13|102->50|104->56|106->64|108->66|108->66|108->66
                  -- GENERATED --
              */
          