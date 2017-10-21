
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
""")))};def /*26.2*/userInfoContent/*26.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*26.21*/("""
    """),format.raw/*27.5*/("""<br/>
    <div class="container input-container">
        <h4>Your Personal Details</h4>
        """),_display_(/*30.10*/helper/*30.16*/.inputText(userProfile("name"), '_name -> "Name")),format.raw/*30.65*/("""
        """),_display_(/*31.10*/helper/*31.16*/.inputText(userProfile("surname"), '_name -> "Surname")),format.raw/*31.71*/("""
    """),format.raw/*32.5*/("""</div>
    <br/>
    <div class="container input-container">
        <h4>Your Contact Information</h4>
        """),_display_(/*36.10*/helper/*36.16*/.inputText(userProfile("cellNumber"), '_name -> "Cellphone Number")),format.raw/*36.83*/("""
    """),format.raw/*37.5*/("""</div>
""")))};def /*40.2*/addressContent/*40.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*40.20*/("""
    """),format.raw/*41.5*/("""<br/>
    <div class="container input-container">
        <h4>Street Address</h4>
        """),_display_(/*44.10*/helper/*44.16*/.inputText(userProfile("streetName"), '_name -> "Street")),format.raw/*44.73*/("""
        """),_display_(/*45.10*/helper/*45.16*/.inputText(userProfile("unitNumber"), '_name -> "House/Unit Number")),format.raw/*45.84*/("""
    """),format.raw/*46.5*/("""</div>
    <br/>
    <div class="container input-container">
        <h4>Community Information</h4>
        """),_display_(/*50.10*/helper/*50.16*/.checkbox(userProfile("isCommunity"), '_name -> "Do you live in a complex or apartment?")),format.raw/*50.105*/("""
        """),_display_(/*51.10*/helper/*51.16*/.inputText(userProfile("communityName"), '_name -> "Name of building/complex")),format.raw/*51.94*/("""
    """),format.raw/*52.5*/("""</div>
""")))};def /*55.2*/navTabsContent/*55.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*55.20*/("""
"""),_display_(/*56.2*/helper/*56.8*/.form(action = controllers.User.routes.CustomerController.update())/*56.75*/ {_display_(Seq[Any](format.raw/*56.77*/("""
    """),_display_(/*57.6*/CSRF/*57.10*/.formField),format.raw/*57.20*/("""
    """),format.raw/*58.5*/("""<div class="panel-body">
        <div class="center-parent">
            <ul class="nav nav-pills center-child">
                <li class="text-larger active"><a href="#userInfo" data-toggle="tab">Basic Information</a>
                </li>
                <li class="text-larger"><a href="#password" data-toggle="tab">Change Password</a>
                </li>
                <li class="text-larger"><a href="#address" data-toggle="tab">Change Address</a>
                </li>
            </ul>
        </div>

        <div class="tab-content">
            <div class="tab-pane fade active in" id="userInfo">
            """),_display_(/*72.14*/userInfoContent),format.raw/*72.29*/("""
            """),format.raw/*73.13*/("""</div>
            <div class="tab-pane fade" id="password">
            """),_display_(/*75.14*/passwordContent),format.raw/*75.29*/("""
            """),format.raw/*76.13*/("""</div>
            <div class="tab-pane fade" id="address">
            """),_display_(/*78.14*/addressContent),format.raw/*78.28*/("""
            """),format.raw/*79.13*/("""</div>
        </div>
    </div>

""")))}),format.raw/*83.2*/("""
""")))};def /*86.2*/bodyContent/*86.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*86.17*/("""
    """),format.raw/*87.5*/("""<h1 class="center-parent">Profile Information</h1>
"""),_display_(/*88.2*/navTabsContent),format.raw/*88.16*/("""
    """),format.raw/*89.5*/("""<br/>
    <div class="row">
        <div class="pull-center">
            <input class="btn btn-default button-padding button-small" type="button" onclick="location.href = '"""),_display_(/*92.113*/controllers/*92.124*/.User.routes.CustomerController.index()),format.raw/*92.163*/("""';" value="Cancel"> <input class="btn btn-success button-padding button-small" type="submit" value="Update">
        </div>
    </div>
""")))};
Seq[Any](format.raw/*6.34*/("""

"""),format.raw/*10.2*/("""

"""),format.raw/*14.2*/("""

"""),format.raw/*24.2*/("""

"""),format.raw/*38.2*/("""

"""),format.raw/*53.2*/("""

"""),format.raw/*84.2*/("""

"""),format.raw/*95.2*/("""

"""),_display_(/*97.2*/masterpage/*97.12*/.apply(" :: Edit Profile", bodyContent)),format.raw/*97.51*/("""
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
                  DATE: Sat Oct 21 11:02:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/editProfile.scala.html
                  HASH: 217f396d5f8f26a81162aa4834a204d6d9aceb21
                  MATRIX: 665->1|704->34|730->54|768->86|1111->110|1221->145|1243->159|1323->163|1354->168|1394->182|1408->188|1479->239|1528->268|1547->278|1628->282|1654->288|1678->303|1759->307|1791->312|1982->476|1997->482|2079->543|2116->553|2131->559|2256->662|2288->667|2319->678|2343->693|2424->697|2456->702|2581->800|2596->806|2666->855|2703->865|2718->871|2794->926|2826->931|2965->1043|2980->1049|3068->1116|3100->1121|3131->1132|3154->1146|3235->1150|3267->1155|3385->1246|3400->1252|3478->1309|3515->1319|3530->1325|3619->1393|3651->1398|3787->1507|3802->1513|3913->1602|3950->1612|3965->1618|4064->1696|4096->1701|4127->1712|4150->1726|4231->1730|4259->1732|4273->1738|4349->1805|4389->1807|4421->1813|4434->1817|4465->1827|4497->1832|5149->2457|5185->2472|5226->2485|5327->2559|5363->2574|5404->2587|5504->2660|5539->2674|5580->2687|5645->2722|5670->2727|5690->2738|5771->2742|5803->2747|5881->2799|5916->2813|5948->2818|6150->2992|6171->3003|6232->3042|6407->142|6436->265|6465->285|6494->675|6523->1129|6552->1709|6581->2724|6610->3178|6639->3181|6658->3191|6718->3230
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|39->9|39->9|39->9|40->12|40->12|42->12|44->16|44->16|46->16|47->17|51->21|51->21|51->21|52->22|52->22|52->22|53->23|54->26|54->26|56->26|57->27|60->30|60->30|60->30|61->31|61->31|61->31|62->32|66->36|66->36|66->36|67->37|68->40|68->40|70->40|71->41|74->44|74->44|74->44|75->45|75->45|75->45|76->46|80->50|80->50|80->50|81->51|81->51|81->51|82->52|83->55|83->55|85->55|86->56|86->56|86->56|86->56|87->57|87->57|87->57|88->58|102->72|102->72|103->73|105->75|105->75|106->76|108->78|108->78|109->79|113->83|114->86|114->86|116->86|117->87|118->88|118->88|119->89|122->92|122->92|122->92|126->6|128->10|130->14|132->24|134->38|136->53|138->84|140->95|142->97|142->97|142->97
                  -- GENERATED --
              */
          