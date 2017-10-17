
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
/*1.2*/import Global.Static.essentials
/*2.2*/import play.data.Form
/*3.2*/import Global.Html5._
/*4.2*/import helper.CSRF
/*5.2*/import models.User.UserProfile
/*7.2*/import controllers.Application.AppTags.AppCookie

object editKitchenProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserProfile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(userProfile: Form[UserProfile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/scriptsContent/*10.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.20*/("""
""")))};def /*13.2*/navContent/*13.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.16*/("""

""")))};def /*17.2*/userContent/*17.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.17*/("""
    """),format.raw/*18.5*/("""<div class="input-group">
        """),_display_(/*19.10*/helper/*19.16*/.form( action = controllers.User.routes.KitchenStaffController.doEdit())/*19.88*/{_display_(Seq[Any](format.raw/*19.89*/("""
            """),_display_(/*20.14*/CSRF/*20.18*/.formField),format.raw/*20.28*/("""
            """),format.raw/*21.13*/("""<h2>Your information</h2>
            <br/>
            <div class="container input-container">
                <h4>Your Login Information</h4>
                """),_display_(/*25.18*/helper/*25.24*/.inputText(userProfile("alias"), '_name -> "Login ID")),format.raw/*25.78*/("""
            """),format.raw/*26.13*/("""</div>
            <br/>
            <div class="container input-container">
                <h4>Change Password</h4>
                """),_display_(/*30.18*/helper/*30.24*/.inputText(userProfile("password"), '_name -> "Password")),format.raw/*30.81*/("""
                """),_display_(/*31.18*/helper/*31.24*/.inputText(userProfile("confirmPassword"), '_name -> "Confirm Password")),format.raw/*31.96*/("""
            """),format.raw/*32.13*/("""</div>
            <br/>
            <br/>
            <div class="container input-container">
                <h6>Your Personal Details</h6>
                """),_display_(/*37.18*/helper/*37.24*/.inputPassword(userProfile("name"), '_name -> "Name")),format.raw/*37.77*/("""
                """),_display_(/*38.18*/helper/*38.24*/.inputPassword(userProfile("surname"), '_name -> "Surname")),format.raw/*38.83*/("""
            """),format.raw/*39.13*/("""</div>
            <br/>
            <div class="container input-container">
                <h6>Your Contact Information</h6>
                """),_display_(/*43.18*/helper/*43.24*/.inputText(userProfile("cellNumber"), '_name -> "Cellphone Number")),format.raw/*43.91*/("""
            """),format.raw/*44.13*/("""</div>
            <br/>
            <div class="container input-container">
                <input class="btn btn-default button-padding" type="button" onclick="location.href='"""),_display_(/*47.102*/controllers/*47.113*/.User.routes.KitchenStaffController.index()),format.raw/*47.156*/("""';" value="Cancel"> <input class="btn btn-success button-padding" type="submit" value="Update">
            </div>
            <br/>
        """)))}),format.raw/*50.10*/("""
    """),format.raw/*51.5*/("""</div>
""")))};def /*54.2*/navSide/*54.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*54.13*/("""
    """),format.raw/*55.5*/("""<a href="#" onclick="">Basic Information</a>
    <a href="#">Edit Address</a>
    <a href="#">Change Password</a>
""")))};def /*60.2*/bodyContent/*60.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*60.17*/("""
"""),_display_(/*61.2*/aside/*61.7*/.apply("", navSide)),format.raw/*61.26*/("""

"""),_display_(/*63.2*/article/*63.9*/.apply(userContent)),format.raw/*63.28*/("""
    """),format.raw/*64.5*/("""<script href=""""),_display_(/*64.20*/controllers/*64.31*/.User.routes.javascript.KitchenStaffController.kitchenJSRoutes),format.raw/*64.93*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*8.34*/("""

"""),format.raw/*11.2*/("""

"""),format.raw/*15.2*/("""

"""),format.raw/*52.2*/("""

"""),format.raw/*58.2*/("""

"""),format.raw/*65.2*/("""

"""),_display_(/*67.2*/essentials/*67.12*/.apply(" :: Edit Profile", navContent, bodyContent, scriptsContent)),format.raw/*67.79*/("""
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
                  DATE: Sun Oct 15 23:36:45 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Staff/editKitchenProfile.scala.html
                  HASH: 3c9e493516460711d5524da24943488623604f1e
                  MATRIX: 662->1|701->34|730->57|759->80|785->100|823->133|1200->183|1311->218|1334->232|1415->236|1440->241|1459->251|1540->255|1566->261|1586->272|1667->276|1699->281|1761->316|1776->322|1857->394|1896->395|1937->409|1950->413|1981->423|2022->436|2210->597|2225->603|2300->657|2341->670|2503->805|2518->811|2596->868|2641->886|2656->892|2749->964|2790->977|2976->1136|2991->1142|3065->1195|3110->1213|3125->1219|3205->1278|3246->1291|3417->1435|3432->1441|3520->1508|3561->1521|3767->1699|3788->1710|3853->1753|4026->1895|4058->1900|4089->1911|4104->1918|4185->1922|4217->1927|4355->2045|4375->2056|4456->2060|4484->2062|4497->2067|4537->2086|4566->2089|4581->2096|4621->2115|4653->2120|4695->2135|4715->2146|4798->2208|4873->215|4902->238|4931->258|4960->1908|4989->2042|5018->2244|5047->2247|5066->2257|5154->2324
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->7|34->8|38->10|38->10|40->10|41->13|41->13|43->13|45->17|45->17|47->17|48->18|49->19|49->19|49->19|49->19|50->20|50->20|50->20|51->21|55->25|55->25|55->25|56->26|60->30|60->30|60->30|61->31|61->31|61->31|62->32|67->37|67->37|67->37|68->38|68->38|68->38|69->39|73->43|73->43|73->43|74->44|77->47|77->47|77->47|80->50|81->51|82->54|82->54|84->54|85->55|88->60|88->60|90->60|91->61|91->61|91->61|93->63|93->63|93->63|94->64|94->64|94->64|94->64|96->8|98->11|100->15|102->52|104->58|106->65|108->67|108->67|108->67
                  -- GENERATED --
              */
          