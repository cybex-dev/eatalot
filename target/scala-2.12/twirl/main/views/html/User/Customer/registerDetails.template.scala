
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
/*3.2*/import models.User.Customer.UserRegisterDetails
/*4.2*/import play.data.Form

object registerDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserRegisterDetails],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(detailsForm: Form[UserRegisterDetails]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/navContent/*8.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.16*/("""

""")))};def /*12.2*/bodyContent/*12.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.17*/("""
"""),_display_(/*13.2*/helper/*13.8*/.form(action = controllers.User.routes.CustomerController.completeRegistration())/*13.89*/ {_display_(Seq[Any](format.raw/*13.91*/("""
    """),format.raw/*14.5*/("""<h1>Complete registration</h1>
    <br/>
    <div class="container input-container">
        <h3>About you</h3>
        """),_display_(/*18.10*/CSRF/*18.14*/.formField),format.raw/*18.24*/("""
        """),format.raw/*19.9*/("""<div class="input-group input-container">
            """),_display_(/*20.14*/helper/*20.20*/.inputText(detailsForm("name"), '_name -> "Name")),format.raw/*20.69*/("""
            """),_display_(/*21.14*/helper/*21.20*/.inputText(detailsForm("surname"), '_name -> "Surname")),format.raw/*21.75*/("""
        """),format.raw/*22.9*/("""</div>
        <br/>
        <br/>
        <h3>Contact Info</h3>
        <div class="input-group input-container">
            """),_display_(/*27.14*/helper/*27.20*/.inputText(detailsForm("cellNumber"), '_name -> "Mobile Number")),format.raw/*27.84*/("""
        """),format.raw/*28.9*/("""</div>
        <br/>
        <br/>
        <h3>Address</h3>
        <div class="input-group input-container">
            """),_display_(/*33.14*/helper/*33.20*/.inputText(detailsForm("streetName"), '_name -> "Street Name")),format.raw/*33.82*/("""
            """),_display_(/*34.14*/helper/*34.20*/.inputText(detailsForm("unitNumber"), '_name -> "Street/Communal Number")),format.raw/*34.93*/("""
            """),format.raw/*35.13*/("""<br/>
            """),_display_(/*36.14*/helper/*36.20*/.inputText(detailsForm("communityName"), '_name -> "Community Name")),format.raw/*36.88*/("""
            """),_display_(/*37.14*/helper/*37.20*/.checkbox(detailsForm("isCommunity"), '_name -> "Reside in an apartment/complex")),format.raw/*37.101*/("""
            """),format.raw/*38.13*/("""<input type="submit" class="btn btn-default" value="Complete Registration">
        </div>
    </div>
    <br/>
    <p class="small">NOTE: all information is kept confidential</p>
""")))}),format.raw/*43.2*/("""

""")))};def /*47.2*/scriptsContent/*47.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*47.20*/("""
    """),format.raw/*48.5*/("""<script src=""""),_display_(/*48.19*/routes/*48.25*/.Assets.versioned("javascripts/registerDetails.js")),format.raw/*48.76*/("""" rel="script"></script>
""")))};
Seq[Any](format.raw/*6.42*/("""

"""),format.raw/*10.2*/("""

"""),format.raw/*45.2*/("""

"""),format.raw/*49.2*/("""


"""),_display_(/*52.2*/essentials/*52.12*/.apply(" :: User Details", navContent, bodyContent, scriptsContent)))
      }
    }
  }

  def render(detailsForm:Form[UserRegisterDetails]): play.twirl.api.HtmlFormat.Appendable = apply(detailsForm)

  def f:((Form[UserRegisterDetails]) => play.twirl.api.HtmlFormat.Appendable) = (detailsForm) => apply(detailsForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 10 18:16:54 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/registerDetails.scala.html
                  HASH: ccd76845d56806535a56d3651522be5eddc4925d
                  MATRIX: 665->1|715->45|738->62|793->111|1148->135|1266->178|1284->188|1364->192|1390->198|1410->209|1491->213|1519->215|1533->221|1623->302|1663->304|1695->309|1843->430|1856->434|1887->444|1923->453|2005->508|2020->514|2090->563|2131->577|2146->583|2222->638|2258->647|2413->775|2428->781|2513->845|2549->854|2699->977|2714->983|2797->1045|2838->1059|2853->1065|2947->1138|2988->1151|3034->1170|3049->1176|3138->1244|3179->1258|3194->1264|3297->1345|3338->1358|3549->1539|3575->1545|3598->1559|3679->1563|3711->1568|3752->1582|3767->1588|3839->1639|3904->175|3933->195|3962->1542|3991->1665|4021->1669|4040->1679
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|40->12|40->12|42->12|43->13|43->13|43->13|43->13|44->14|48->18|48->18|48->18|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|57->27|57->27|57->27|58->28|63->33|63->33|63->33|64->34|64->34|64->34|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|73->43|75->47|75->47|77->47|78->48|78->48|78->48|78->48|80->6|82->10|84->45|86->49|89->52|89->52
                  -- GENERATED --
              */
          