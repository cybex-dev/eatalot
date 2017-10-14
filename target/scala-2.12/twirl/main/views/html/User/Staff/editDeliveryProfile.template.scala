
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
                <input class="btn btn-default button-padding" type="button" href=""""),_display_(/*43.84*/controllers/*43.95*/.User.routes.DeliveryStaffController.index()),format.raw/*43.139*/("""" value="Cancel"> <input class="btn btn-success button-padding" type="submit" value="Update">
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
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Staff/editDeliveryProfile.scala.html
                  HASH: 200755888d0e99a52896bff622df748920b6ead2
                  MATRIX: 662->1|701->34|730->57|759->80|785->100|823->133|1201->183|1312->218|1335->232|1416->236|1441->241|1460->251|1541->255|1567->261|1587->272|1668->276|1700->281|1762->316|1777->322|1859->395|1898->396|1939->410|1952->414|1983->424|2024->437|2211->597|2226->603|2296->652|2341->670|2356->676|2432->731|2473->744|2644->888|2659->894|2747->961|2788->974|2968->1127|2983->1133|3061->1190|3106->1208|3121->1214|3214->1286|3255->1299|3460->1477|3480->1488|3546->1532|3717->1672|3749->1677|3780->1688|3795->1695|3876->1699|3908->1704|4046->1822|4066->1833|4147->1837|4175->1839|4188->1844|4228->1863|4257->1866|4272->1873|4312->1892|4353->215|4382->238|4411->258|4440->1685|4469->1819|4498->1894|4527->1897|4546->1907|4634->1974
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->7|34->8|38->10|38->10|40->10|41->13|41->13|43->13|45->17|45->17|47->17|48->18|49->19|49->19|49->19|49->19|50->20|50->20|50->20|51->21|55->25|55->25|55->25|56->26|56->26|56->26|57->27|61->31|61->31|61->31|62->32|67->37|67->37|67->37|68->38|68->38|68->38|69->39|73->43|73->43|73->43|76->46|77->47|78->50|78->50|80->50|81->51|84->56|84->56|86->56|87->57|87->57|87->57|89->59|89->59|89->59|91->8|93->11|95->15|97->48|99->54|101->60|103->62|103->62|103->62
                  -- GENERATED --
              */
          