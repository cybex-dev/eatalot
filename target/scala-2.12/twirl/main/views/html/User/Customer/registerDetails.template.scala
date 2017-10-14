
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
/*1.2*/import views.html.Global.Static.essentials
/*2.2*/import helper._
/*3.2*/import models.User.UserProfile
/*4.2*/import play.data.Form

object registerDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserProfile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userProfile: Form[UserProfile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/navContent/*8.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.16*/("""

""")))};def /*12.2*/bodyContent/*12.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.17*/("""
    """),_display_(/*13.6*/helper/*13.12*/.form(action = controllers.User.routes.CustomerController.doCompleteRegistration())/*13.95*/ {_display_(Seq[Any](format.raw/*13.97*/("""
        """),format.raw/*14.9*/("""<h1>Complete registration</h1>
        <br/>
        <div class="container input-container">
            <h3>About you</h3>
            """),_display_(/*18.14*/CSRF/*18.18*/.formField),format.raw/*18.28*/("""
            """),format.raw/*19.13*/("""<div class="input-group input-container">
                """),_display_(/*20.18*/helper/*20.24*/.inputText(userProfile("name"), '_name -> "Name")),format.raw/*20.73*/("""
                """),_display_(/*21.18*/helper/*21.24*/.inputText(userProfile("surname"), '_name -> "Surname")),format.raw/*21.79*/("""
            """),format.raw/*22.13*/("""</div>
            <br/>
            <br/>
            <h3>Contact Info</h3>
            <div class="input-group input-container">
            """),_display_(/*27.14*/helper/*27.20*/.inputText(userProfile("cellNumber"), '_name -> "Mobile Number")),format.raw/*27.84*/("""
            """),format.raw/*28.13*/("""</div>
            <br/>
            <br/>
            <h3>Address</h3>
            <div class="input-group input-container">
                """),_display_(/*33.18*/helper/*33.24*/.inputText(userProfile("streetName"), '_name -> "Street Name")),format.raw/*33.86*/("""
                """),_display_(/*34.18*/helper/*34.24*/.inputText(userProfile("unitNumber"), '_name -> "Street/Communal Number")),format.raw/*34.97*/("""
                """),format.raw/*35.17*/("""<br/>
                """),_display_(/*36.18*/helper/*36.24*/.inputText(userProfile("communityName"), '_name -> "Community Name", '_id -> "commName")),format.raw/*36.112*/("""
                """),_display_(/*37.18*/helper/*37.24*/.checkbox(userProfile("isCommunity"), '_name -> "Reside in an apartment/complex", '_id -> "chkComm")),format.raw/*37.124*/("""
                """),format.raw/*38.17*/("""<input type="submit" class="btn btn-default" value="Complete Registration">
            </div>
        </div>
        <br/>
        <p class="small">NOTE: all information is kept confidential</p>
    """)))}),format.raw/*43.6*/("""

""")))};def /*47.2*/scriptsContent/*47.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*47.20*/("""
    """),format.raw/*48.5*/("""<script src=""""),_display_(/*48.19*/routes/*48.25*/.Assets.versioned("javascripts/registerDetails.js")),format.raw/*48.76*/("""" rel="script"></script>
""")))};
Seq[Any](format.raw/*6.34*/("""

"""),format.raw/*10.2*/("""

"""),format.raw/*45.2*/("""

"""),format.raw/*49.2*/("""


"""),_display_(/*52.2*/essentials/*52.12*/.apply(" :: User Details", navContent, bodyContent, scriptsContent)))
      }
    }
  }

  def render(userProfile:Form[UserProfile]): play.twirl.api.HtmlFormat.Appendable = apply(userProfile)

  def f:((Form[UserProfile]) => play.twirl.api.HtmlFormat.Appendable) = (userProfile) => apply(userProfile)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 14 13:23:50 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/registerDetails.scala.html
                  HASH: 54ba64d75a49795044c4466b2fd6cb02d37d0844
                  MATRIX: 665->1|715->45|738->62|776->94|1123->118|1233->153|1251->163|1331->167|1357->173|1377->184|1458->188|1490->194|1505->200|1597->283|1637->285|1673->294|1837->431|1850->435|1881->445|1922->458|2008->517|2023->523|2093->572|2138->590|2153->596|2229->651|2270->664|2441->808|2456->814|2541->878|2582->891|2752->1034|2767->1040|2850->1102|2895->1120|2910->1126|3004->1199|3049->1216|3099->1239|3114->1245|3224->1333|3269->1351|3284->1357|3406->1457|3451->1474|3682->1675|3708->1681|3731->1695|3812->1699|3844->1704|3885->1718|3900->1724|3972->1775|4037->150|4066->170|4095->1678|4124->1801|4154->1805|4173->1815
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|40->12|40->12|42->12|43->13|43->13|43->13|43->13|44->14|48->18|48->18|48->18|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|57->27|57->27|57->27|58->28|63->33|63->33|63->33|64->34|64->34|64->34|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|73->43|75->47|75->47|77->47|78->48|78->48|78->48|78->48|80->6|82->10|84->45|86->49|89->52|89->52
                  -- GENERATED --
              */
          