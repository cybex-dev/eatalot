
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
/*1.2*/import Global.Static.masterpage
/*2.2*/import helper.CSRF
/*3.2*/import models.User.UserProfile
/*4.2*/import play.data.Form

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

""")))};def /*16.2*/passwordContent/*16.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.21*/("""
    """),format.raw/*17.5*/("""<br/>
    <div class="container input-container">
        <h4>Change Password</h4>
        <i>(Only edit password fields if you intend to change them)</i>
        """),_display_(/*21.10*/helper/*21.16*/.inputPassword(userProfile("password"), '_name -> "Password")),format.raw/*21.77*/("""
        """),_display_(/*22.10*/helper/*22.16*/.inputPassword(userProfile("confirmPassword"), '_name -> "Confirm Password", '_id -> "confirmPassword")),format.raw/*22.119*/("""
    """),format.raw/*23.5*/("""</div>
    <br/>
""")))};def /*27.2*/userInfoContent/*27.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*27.21*/("""
    """),format.raw/*28.5*/("""<br/>
    <div class="container input-container">
        <h4>Your Personal Details</h4>
        """),_display_(/*31.10*/helper/*31.16*/.inputText(userProfile("name"), '_name -> "Name")),format.raw/*31.65*/("""
        """),_display_(/*32.10*/helper/*32.16*/.inputText(userProfile("surname"), '_name -> "Surname")),format.raw/*32.71*/("""
    """),format.raw/*33.5*/("""</div>
    <br/>
    <div class="container input-container">
        <h4>Your Contact Information</h4>
        """),_display_(/*37.10*/helper/*37.16*/.inputText(userProfile("cellNumber"), '_name -> "Cellphone Number")),format.raw/*37.83*/("""
    """),format.raw/*38.5*/("""</div>
    <br/>
""")))};def /*42.2*/addressContent/*42.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*42.20*/("""
    """),format.raw/*43.5*/("""<br/>
    <div class="container input-container">
        <h4>Street Address</h4>
        """),_display_(/*46.10*/helper/*46.16*/.inputText(userProfile("streetName"), '_name -> "Street")),format.raw/*46.73*/("""
        """),_display_(/*47.10*/helper/*47.16*/.inputText(userProfile("unitNumber"), '_name -> "House/Unit Number")),format.raw/*47.84*/("""
    """),format.raw/*48.5*/("""</div>
    <br/>
    <div class="container input-container">
        <h4>Community Information</h4>
        """),_display_(/*52.10*/helper/*52.16*/.checkbox(userProfile("isCommunity"), '_name -> "Do you live in a complex or apartment?")),format.raw/*52.105*/("""
        """),_display_(/*53.10*/helper/*53.16*/.inputText(userProfile("communityName"), '_name -> "Name of building/complex")),format.raw/*53.94*/("""
    """),format.raw/*54.5*/("""</div>
    <br/>
    <div class="container input-container">
        <input class="btn btn-default button-padding" type="button" onclick="location.href = '"""),_display_(/*57.96*/controllers/*57.107*/.User.routes.CustomerController.index()),format.raw/*57.146*/("""';" value="Cancel"> <input class="btn btn-success button-padding" type="submit" value="Update">
    </div>
    <br/>
""")))};def /*62.2*/navTabsContent/*62.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*62.20*/("""
"""),_display_(/*63.2*/helper/*63.8*/.form(action = controllers.User.routes.CustomerController.update())/*63.75*/ {_display_(Seq[Any](format.raw/*63.77*/("""
    """),_display_(/*64.6*/CSRF/*64.10*/.formField),format.raw/*64.20*/("""
    """),format.raw/*65.5*/("""<div class="panel-body">
        <div class="center-parent">
            <ul class="nav nav-pills center-child">
                <li class="active"><a href="#userInfo" data-toggle="tab">Basic Information</a>
                </li>
                <li class=""><a href="#password" data-toggle="tab">Change Password</a>
                </li>
                <li class=""><a href="#address" data-toggle="tab">Change Address</a>
                </li>
            </ul>
        </div>

        <div class="tab-content">
            <div class="tab-pane fade active in" id="userInfo">
            """),_display_(/*79.14*/userInfoContent),format.raw/*79.29*/("""
            """),format.raw/*80.13*/("""</div>
            <div class="tab-pane fade" id="password">
            """),_display_(/*82.14*/passwordContent),format.raw/*82.29*/("""
            """),format.raw/*83.13*/("""</div>
            <div class="tab-pane fade" id="address">
            """),_display_(/*85.14*/addressContent),format.raw/*85.28*/("""
            """),format.raw/*86.13*/("""</div>
        </div>
    </div>

""")))}),format.raw/*90.2*/("""
""")))};def /*93.2*/bodyContent/*93.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*93.17*/("""
    """),format.raw/*94.5*/("""<h2 class="center-parent">Profile Information</h2>
"""),_display_(/*95.2*/navTabsContent),format.raw/*95.16*/("""
""")))};
Seq[Any](format.raw/*6.34*/("""

"""),format.raw/*10.2*/("""

"""),format.raw/*14.2*/("""

"""),format.raw/*25.2*/("""

"""),format.raw/*40.2*/("""

"""),format.raw/*60.2*/("""

"""),format.raw/*91.2*/("""

"""),format.raw/*96.2*/("""

"""),_display_(/*98.2*/masterpage/*98.12*/.apply(" :: Edit Profile", bodyContent)),format.raw/*98.51*/("""
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
                  DATE: Wed Oct 18 00:03:04 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/editProfile.scala.html
                  HASH: 755369d12e58ec28f60e16474fa7d16dfd98a569
                  MATRIX: 665->1|704->34|730->54|768->86|1111->110|1221->145|1243->159|1323->163|1354->168|1394->182|1408->188|1479->239|1528->268|1547->278|1628->282|1654->288|1678->303|1759->307|1791->312|1982->476|1997->482|2079->543|2116->553|2131->559|2256->662|2288->667|2329->688|2353->703|2434->707|2466->712|2591->810|2606->816|2676->865|2713->875|2728->881|2804->936|2836->941|2975->1053|2990->1059|3078->1126|3110->1131|3151->1152|3174->1166|3255->1170|3287->1175|3405->1266|3420->1272|3498->1329|3535->1339|3550->1345|3639->1413|3671->1418|3807->1527|3822->1533|3933->1622|3970->1632|3985->1638|4084->1716|4116->1721|4299->1877|4320->1888|4381->1927|4522->2048|4545->2062|4626->2066|4654->2068|4668->2074|4744->2141|4784->2143|4816->2149|4829->2153|4860->2163|4892->2168|5510->2759|5546->2774|5587->2787|5688->2861|5724->2876|5765->2889|5865->2962|5900->2976|5941->2989|6006->3024|6031->3029|6051->3040|6132->3044|6164->3049|6242->3101|6277->3115|6318->142|6347->265|6376->285|6405->685|6434->1149|6463->2045|6492->3026|6521->3117|6550->3120|6569->3130|6629->3169
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|39->9|39->9|39->9|40->12|40->12|42->12|44->16|44->16|46->16|47->17|51->21|51->21|51->21|52->22|52->22|52->22|53->23|55->27|55->27|57->27|58->28|61->31|61->31|61->31|62->32|62->32|62->32|63->33|67->37|67->37|67->37|68->38|70->42|70->42|72->42|73->43|76->46|76->46|76->46|77->47|77->47|77->47|78->48|82->52|82->52|82->52|83->53|83->53|83->53|84->54|87->57|87->57|87->57|90->62|90->62|92->62|93->63|93->63|93->63|93->63|94->64|94->64|94->64|95->65|109->79|109->79|110->80|112->82|112->82|113->83|115->85|115->85|116->86|120->90|121->93|121->93|123->93|124->94|125->95|125->95|127->6|129->10|131->14|133->25|135->40|137->60|139->91|141->96|143->98|143->98|143->98
                  -- GENERATED --
              */
          