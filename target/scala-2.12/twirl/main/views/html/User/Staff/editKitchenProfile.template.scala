
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
                <h6>Your Personal Details</h6>
                """),_display_(/*25.18*/helper/*25.24*/.inputText(userProfile("name"), '_name -> "Name")),format.raw/*25.73*/("""
                """),_display_(/*26.18*/helper/*26.24*/.inputText(userProfile("surname"), '_name -> "Surname")),format.raw/*26.79*/("""
            """),format.raw/*27.13*/("""</div>
            <br/>
            <div class="container input-container">
                <h6>Your Contact Information</h6>
                """),_display_(/*31.18*/helper/*31.24*/.inputText(userProfile("cellNumber"), '_name -> "Cellphone Number")),format.raw/*31.91*/("""
            """),format.raw/*32.13*/("""</div>
            <br/>
            <br/>
            <div class="container input-container">
                <h6>Change Password</h6>
                """),_display_(/*37.18*/helper/*37.24*/.inputText(userProfile("password"), '_name -> "Password")),format.raw/*37.81*/("""
                """),_display_(/*38.18*/helper/*38.24*/.inputText(userProfile("confirmPassword"), '_name -> "Confirm Password")),format.raw/*38.96*/("""
            """),format.raw/*39.13*/("""</div>
            <br/>
            <br/>
            <div class="container input-container">
                <input class="btn btn-default button-padding" type="button" href=""""),_display_(/*43.84*/controllers/*43.95*/.User.routes.KitchenStaffController.index()),format.raw/*43.138*/("""" value="Cancel"> <input class="btn btn-success button-padding" type="submit" value="Update">
            </div>
            <br/>
        """)))}),format.raw/*46.10*/("""
    """),format.raw/*47.5*/("""</div>
""")))};def /*50.2*/navSide/*50.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*50.13*/("""
    """),format.raw/*51.5*/("""<a href="#" onclick="">Basic Information</a>
    <a href="#">Edit Address</a>
    <a href="#">Change Password</a>
""")))};def /*56.2*/bodyContent/*56.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*56.17*/("""
"""),_display_(/*57.2*/aside/*57.7*/.apply("", navSide)),format.raw/*57.26*/("""

"""),_display_(/*59.2*/article/*59.9*/.apply(userContent)),format.raw/*59.28*/("""
""")))};
Seq[Any](format.raw/*8.34*/("""

"""),format.raw/*11.2*/("""

"""),format.raw/*15.2*/("""

"""),format.raw/*48.2*/("""

"""),format.raw/*54.2*/("""

"""),format.raw/*60.2*/("""

"""),_display_(/*62.2*/essentials/*62.12*/.apply(" :: Edit Profile", navContent, bodyContent, scriptsContent)),format.raw/*62.79*/("""
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
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Staff/editKitchenProfile.scala.html
                  HASH: 69387db9c69c4387ad5eabe8d18feab93273fe37
                  MATRIX: 662->1|701->34|730->57|759->80|785->100|823->133|1200->183|1311->218|1334->232|1415->236|1440->241|1459->251|1540->255|1566->261|1586->272|1667->276|1699->281|1761->316|1776->322|1857->394|1896->395|1937->409|1950->413|1981->423|2022->436|2209->596|2224->602|2294->651|2339->669|2354->675|2430->730|2471->743|2642->887|2657->893|2745->960|2786->973|2966->1126|2981->1132|3059->1189|3104->1207|3119->1213|3212->1285|3253->1298|3458->1476|3478->1487|3543->1530|3714->1670|3746->1675|3777->1686|3792->1693|3873->1697|3905->1702|4043->1820|4063->1831|4144->1835|4172->1837|4185->1842|4225->1861|4254->1864|4269->1871|4309->1890|4350->215|4379->238|4408->258|4437->1683|4466->1817|4495->1892|4524->1895|4543->1905|4631->1972
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->7|34->8|38->10|38->10|40->10|41->13|41->13|43->13|45->17|45->17|47->17|48->18|49->19|49->19|49->19|49->19|50->20|50->20|50->20|51->21|55->25|55->25|55->25|56->26|56->26|56->26|57->27|61->31|61->31|61->31|62->32|67->37|67->37|67->37|68->38|68->38|68->38|69->39|73->43|73->43|73->43|76->46|77->47|78->50|78->50|80->50|81->51|84->56|84->56|86->56|87->57|87->57|87->57|89->59|89->59|89->59|91->8|93->11|95->15|97->48|99->54|101->60|103->62|103->62|103->62
                  -- GENERATED --
              */
          