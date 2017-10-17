
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

object editDeliveryProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserProfile],play.twirl.api.HtmlFormat.Appendable] {

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
        """),_display_(/*19.10*/helper/*19.16*/.form( action = controllers.User.routes.DeliveryStaffController.doEdit())/*19.89*/{_display_(Seq[Any](format.raw/*19.90*/("""
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
            <br/>
            <div class="container input-container">
                <input class="btn btn-default button-padding" type="button" onclick="location.href='"""),_display_(/*47.102*/controllers/*47.113*/.User.routes.DeliveryStaffController.index()),format.raw/*47.157*/("""';" value="Cancel"> <input class="btn btn-success button-padding" type="submit" value="Update">
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

    """),format.raw/*65.5*/("""<script href=""""),_display_(/*65.20*/controllers/*65.31*/.User.routes.javascript.DeliveryStaffController.deliveryJSRoutes),format.raw/*65.95*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*8.34*/("""

"""),format.raw/*11.2*/("""

"""),format.raw/*15.2*/("""

"""),format.raw/*52.2*/("""

"""),format.raw/*58.2*/("""

"""),format.raw/*66.2*/("""

"""),_display_(/*68.2*/essentials/*68.12*/.apply(" :: Edit Profile", navContent, bodyContent, scriptsContent)),format.raw/*68.79*/("""
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
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Staff/editDeliveryProfile.scala.html
                  HASH: e3f620a761f23121df76449d223d1790bd7d9f89
                  MATRIX: 662->1|701->34|730->57|759->80|785->100|823->133|1201->183|1312->218|1335->232|1416->236|1441->241|1460->251|1541->255|1567->261|1587->272|1668->276|1700->281|1762->316|1777->322|1859->395|1898->396|1939->410|1952->414|1983->424|2024->437|2212->598|2227->604|2302->658|2343->671|2505->806|2520->812|2602->873|2647->891|2662->897|2760->973|2801->986|2987->1145|3002->1151|3072->1200|3117->1218|3132->1224|3208->1279|3249->1292|3420->1436|3435->1442|3523->1509|3564->1522|3770->1700|3791->1711|3857->1755|4030->1897|4062->1902|4093->1913|4108->1920|4189->1924|4221->1929|4359->2047|4379->2058|4460->2062|4488->2064|4501->2069|4541->2088|4570->2091|4585->2098|4625->2117|4658->2123|4700->2138|4720->2149|4805->2213|4880->215|4909->238|4938->258|4967->1910|4996->2044|5025->2249|5054->2252|5073->2262|5161->2329
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->7|34->8|38->10|38->10|40->10|41->13|41->13|43->13|45->17|45->17|47->17|48->18|49->19|49->19|49->19|49->19|50->20|50->20|50->20|51->21|55->25|55->25|55->25|56->26|60->30|60->30|60->30|61->31|61->31|61->31|62->32|67->37|67->37|67->37|68->38|68->38|68->38|69->39|73->43|73->43|73->43|74->44|77->47|77->47|77->47|80->50|81->51|82->54|82->54|84->54|85->55|88->60|88->60|90->60|91->61|91->61|91->61|93->63|93->63|93->63|95->65|95->65|95->65|95->65|97->8|99->11|101->15|103->52|105->58|107->66|109->68|109->68|109->68
                  -- GENERATED --
              */
          