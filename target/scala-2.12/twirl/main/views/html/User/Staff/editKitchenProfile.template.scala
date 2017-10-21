
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

def /*8.2*/scriptsContent/*8.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.20*/("""
""")))};def /*11.2*/navContent/*11.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.16*/("""

""")))};def /*15.2*/userContent/*15.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.17*/("""
    """),format.raw/*16.5*/("""<div class="input-group">
        """),_display_(/*17.10*/helper/*17.16*/.form( action = controllers.User.routes.KitchenStaffController.doEdit())/*17.88*/{_display_(Seq[Any](format.raw/*17.89*/("""
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
                """),_display_(/*28.18*/helper/*28.24*/.inputText(userProfile("password"), '_name -> "Password")),format.raw/*28.81*/("""
                """),_display_(/*29.18*/helper/*29.24*/.inputText(userProfile("confirmPassword"), '_name -> "Confirm Password")),format.raw/*29.96*/("""
            """),format.raw/*30.13*/("""</div>
            <br/>
            <br/>
            <div class="container input-container">
                <h6>Your Personal Details</h6>
                """),_display_(/*35.18*/helper/*35.24*/.inputPassword(userProfile("name"), '_name -> "Name")),format.raw/*35.77*/("""
                """),_display_(/*36.18*/helper/*36.24*/.inputPassword(userProfile("surname"), '_name -> "Surname")),format.raw/*36.83*/("""
            """),format.raw/*37.13*/("""</div>
            <br/>
            <div class="container input-container">
                <h6>Your Contact Information</h6>
                """),_display_(/*41.18*/helper/*41.24*/.inputText(userProfile("cellNumber"), '_name -> "Cellphone Number")),format.raw/*41.91*/("""
            """),format.raw/*42.13*/("""</div>
            <br/>
            <div class="container input-container">
                <input class="btn btn-default button-padding" type="button" onclick="location.href='"""),_display_(/*45.102*/controllers/*45.113*/.User.routes.KitchenStaffController.index()),format.raw/*45.156*/("""';" value="Cancel"> <input class="btn btn-success button-padding" type="submit" value="Update">
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
    """),format.raw/*62.5*/("""<script href=""""),_display_(/*62.20*/controllers/*62.31*/.User.routes.javascript.KitchenStaffController.kitchenJSRoutes),format.raw/*62.93*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*6.34*/("""

"""),format.raw/*9.2*/("""

"""),format.raw/*13.2*/("""

"""),format.raw/*50.2*/("""

"""),format.raw/*56.2*/("""

"""),format.raw/*63.2*/("""

"""),_display_(/*65.2*/essentials/*65.12*/.apply(" :: Edit Profile", navContent, bodyContent, scriptsContent)),format.raw/*65.79*/("""
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
                  SOURCE: /home/cybex/Projects/eatalot-temp/app/views/User/Staff/editKitchenProfile.scala.html
                  HASH: 3b8a2d4a6a25e6f03013f9607a3cc63bd00484e9
                  MATRIX: 662->1|691->24|730->57|756->77|794->109|1144->132|1254->167|1276->181|1356->185|1381->190|1400->200|1481->204|1507->210|1527->221|1608->225|1640->230|1702->265|1717->271|1798->343|1837->344|1878->358|1891->362|1922->372|1963->385|2151->546|2166->552|2241->606|2282->619|2444->754|2459->760|2537->817|2582->835|2597->841|2690->913|2731->926|2917->1085|2932->1091|3006->1144|3051->1162|3066->1168|3146->1227|3187->1240|3358->1384|3373->1390|3461->1457|3502->1470|3708->1648|3729->1659|3794->1702|3967->1844|3999->1849|4030->1860|4045->1867|4126->1871|4158->1876|4296->1994|4316->2005|4397->2009|4425->2011|4438->2016|4478->2035|4507->2038|4522->2045|4562->2064|4594->2069|4636->2084|4656->2095|4739->2157|4814->164|4842->187|4871->207|4900->1857|4929->1991|4958->2193|4987->2196|5006->2206|5094->2273
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->6|37->8|37->8|39->8|40->11|40->11|42->11|44->15|44->15|46->15|47->16|48->17|48->17|48->17|48->17|49->18|49->18|49->18|50->19|54->23|54->23|54->23|55->24|59->28|59->28|59->28|60->29|60->29|60->29|61->30|66->35|66->35|66->35|67->36|67->36|67->36|68->37|72->41|72->41|72->41|73->42|76->45|76->45|76->45|79->48|80->49|81->52|81->52|83->52|84->53|87->58|87->58|89->58|90->59|90->59|90->59|92->61|92->61|92->61|93->62|93->62|93->62|93->62|95->6|97->9|99->13|101->50|103->56|105->63|107->65|107->65|107->65
                  -- GENERATED --
              */
          