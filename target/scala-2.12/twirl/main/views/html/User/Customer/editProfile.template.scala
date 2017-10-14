
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
/*1.2*/import Global.Static.essentials
/*2.2*/import play.data.Form
/*3.2*/import Global.Html5._
/*4.2*/import helper.CSRF
/*5.2*/import models.User.UserProfile

object editProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserProfile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userProfile: Form[UserProfile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/scriptsContent/*8.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.20*/("""
    """),format.raw/*9.5*/("""<script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.versioned("javascripts/registerDetails.js")),format.raw/*9.76*/("""" rel="script"></script>
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
                <h6>Your Personal Details</h6>
                """),_display_(/*24.18*/helper/*24.24*/.inputText(userProfile("name"), '_name -> "Name")),format.raw/*24.73*/("""
                """),_display_(/*25.18*/helper/*25.24*/.inputText(userProfile("surname"), '_name -> "Surname")),format.raw/*25.79*/("""
            """),format.raw/*26.13*/("""</div>
            <br/>
            <div class="container input-container">
                <h6>Your Contact Information</h6>
                """),_display_(/*30.18*/helper/*30.24*/.inputText(userProfile("cellNumber"), '_name -> "Cellphone Number")),format.raw/*30.91*/("""
            """),format.raw/*31.13*/("""</div>
            <br/>
            <br/>
            <div class="container input-container">
                <h6>Change Password</h6>
                """),_display_(/*36.18*/helper/*36.24*/.inputText(userProfile("password"), '_name -> "Password")),format.raw/*36.81*/("""
                """),_display_(/*37.18*/helper/*37.24*/.inputText(userProfile("confirmPassword"), '_name -> "Confirm Password")),format.raw/*37.96*/("""
            """),format.raw/*38.13*/("""</div>
            <br/>
            <br/>
            <h2>Your Address</h2>
            <div class="container input-container">
                """),_display_(/*43.18*/helper/*43.24*/.inputText(userProfile("streetName"), '_name -> "Street")),format.raw/*43.81*/("""
                """),_display_(/*44.18*/helper/*44.24*/.inputText(userProfile("unitNumber"), '_name -> "House/Unit Number")),format.raw/*44.92*/("""
            """),format.raw/*45.13*/("""</div>
            <br/>
            <div class="container input-container">
                """),_display_(/*48.18*/helper/*48.24*/.checkbox(userProfile("isCommunity"), '_name -> "Do you live in a complex or apartment?")),format.raw/*48.113*/("""
                """),_display_(/*49.18*/helper/*49.24*/.inputText(userProfile("communityName"), '_name -> "Name of building/complex")),format.raw/*49.102*/("""
            """),format.raw/*50.13*/("""</div>
            <br/>
            <div class="container input-container">
                <input class="btn btn-default button-padding" type="button" href=""""),_display_(/*53.84*/controllers/*53.95*/.User.routes.CustomerController.index()),format.raw/*53.134*/("""" value="Cancel"> <input class="btn btn-success button-padding" type="submit" value="Update">
            </div>
            <br/>
        """)))}),format.raw/*56.10*/("""
    """),format.raw/*57.5*/("""</div>
""")))};def /*60.2*/navSide/*60.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*60.13*/("""
    """),format.raw/*61.5*/("""<a href="#" onclick="">Basic Information</a>
    <a href="#">Edit Address</a>
    <a href="#">Change Password</a>
""")))};def /*66.2*/bodyContent/*66.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*66.17*/("""
"""),_display_(/*67.2*/aside/*67.7*/.apply("", navSide)),format.raw/*67.26*/("""

"""),_display_(/*69.2*/article/*69.9*/.apply(userContent)),format.raw/*69.28*/("""
""")))};
Seq[Any](format.raw/*6.34*/("""

"""),format.raw/*10.2*/("""

"""),format.raw/*14.2*/("""

"""),format.raw/*58.2*/("""

"""),format.raw/*64.2*/("""

"""),format.raw/*70.2*/("""

"""),_display_(/*72.2*/essentials/*72.12*/.apply(" :: Edit Profile", navContent, bodyContent, scriptsContent)),format.raw/*72.79*/("""
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
                  DATE: Sat Oct 14 13:03:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/editProfile.scala.html
                  HASH: e2a8f0e025975f7b6570b2dea46e987dc53f2b32
                  MATRIX: 665->1|704->34|733->57|762->80|788->100|1140->132|1250->167|1272->181|1352->185|1383->190|1423->204|1437->210|1508->261|1557->290|1576->300|1657->304|1683->310|1703->321|1784->325|1816->330|1878->365|1893->371|1969->438|2008->439|2049->453|2062->457|2093->467|2134->480|2321->640|2336->646|2406->695|2451->713|2466->719|2542->774|2583->787|2754->931|2769->937|2857->1004|2898->1017|3078->1170|3093->1176|3171->1233|3216->1251|3231->1257|3324->1329|3365->1342|3538->1488|3553->1494|3631->1551|3676->1569|3691->1575|3780->1643|3821->1656|3942->1750|3957->1756|4068->1845|4113->1863|4128->1869|4228->1947|4269->1960|4456->2120|4476->2131|4537->2170|4708->2310|4740->2315|4771->2326|4786->2333|4867->2337|4899->2342|5037->2460|5057->2471|5138->2475|5166->2477|5179->2482|5219->2501|5248->2504|5263->2511|5303->2530|5344->164|5373->287|5402->307|5431->2323|5460->2457|5489->2532|5518->2535|5537->2545|5625->2612
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->6|37->8|37->8|39->8|40->9|40->9|40->9|40->9|41->12|41->12|43->12|45->16|45->16|47->16|48->17|49->18|49->18|49->18|49->18|50->19|50->19|50->19|51->20|55->24|55->24|55->24|56->25|56->25|56->25|57->26|61->30|61->30|61->30|62->31|67->36|67->36|67->36|68->37|68->37|68->37|69->38|74->43|74->43|74->43|75->44|75->44|75->44|76->45|79->48|79->48|79->48|80->49|80->49|80->49|81->50|84->53|84->53|84->53|87->56|88->57|89->60|89->60|91->60|92->61|95->66|95->66|97->66|98->67|98->67|98->67|100->69|100->69|100->69|102->6|104->10|106->14|108->58|110->64|112->70|114->72|114->72|114->72
                  -- GENERATED --
              */
          