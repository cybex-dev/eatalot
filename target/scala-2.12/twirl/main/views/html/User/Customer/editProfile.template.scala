
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
/*2.2*/import models.User.UserProfile
/*3.2*/import play.data.Form
/*4.2*/import controllers.Application.AppTags
/*5.2*/import java.lang.String
/*6.2*/import Global.Html5._
/*7.2*/import helper.CSRF

object editProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserProfile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(userProfile: Form[UserProfile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*11.2*/scriptsContent/*11.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.20*/("""
    """),format.raw/*12.5*/("""<script src=""""),_display_(/*12.19*/routes/*12.25*/.Assets.versioned("javascripts/registerDetails.js")),format.raw/*12.76*/("""" rel="script"></script>
""")))};def /*15.2*/navContent/*15.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.16*/("""

""")))};def /*19.2*/userContent/*19.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.17*/("""
    """),format.raw/*20.5*/("""<div class="input-group">
        """),_display_(/*21.10*/helper/*21.16*/.form(action = controllers.User.routes.CustomerController.update())/*21.83*/{_display_(Seq[Any](format.raw/*21.84*/("""
            """),_display_(/*22.14*/CSRF/*22.18*/.formField),format.raw/*22.28*/("""
            """),format.raw/*23.13*/("""<h2>Your information</h2>
            <br/>
            <div class="container input-container">
                <h6>Your Personal Details</h6>
                """),_display_(/*27.18*/helper/*27.24*/.inputText(userProfile("name"), '_name -> "Name")),format.raw/*27.73*/("""
                """),_display_(/*28.18*/helper/*28.24*/.inputText(userProfile("surname"), '_name -> "Surname")),format.raw/*28.79*/("""
            """),format.raw/*29.13*/("""</div>
            <br/>
            <div class="container input-container">
                <h6>Your Contact Information</h6>
                """),_display_(/*33.18*/helper/*33.24*/.inputText(userProfile("cellNumber"), '_name -> "Cellphone Number")),format.raw/*33.91*/("""
            """),format.raw/*34.13*/("""</div>
            <br/>
            <br/>
            <h2>Your Address</h2>
            <div class="container input-container">
                """),_display_(/*39.18*/helper/*39.24*/.inputText(userProfile("streetName"), '_name -> "Street")),format.raw/*39.81*/("""
                """),_display_(/*40.18*/helper/*40.24*/.inputText(userProfile("unitNumber"), '_name -> "House/Unit Number")),format.raw/*40.92*/("""
            """),format.raw/*41.13*/("""</div>
            <br/>
            <div class="container input-container">
                """),_display_(/*44.18*/helper/*44.24*/.checkbox(userProfile("isCommunity"), '_name -> "Do you live in a complex or apartment?")),format.raw/*44.113*/("""
                """),_display_(/*45.18*/helper/*45.24*/.inputText(userProfile("communityName"), '_name -> "Name of building/complex")),format.raw/*45.102*/("""
            """),format.raw/*46.13*/("""</div>
            <br/>
            <div class="container input-container">
                <input class="btn btn-info button-padding" type="button" href=""""),_display_(/*49.81*/controllers/*49.92*/.User.routes.CustomerController.index()),format.raw/*49.131*/(""""> <input class="btn btn-success button-padding" type="submit" value="Update">
            </div>
        """)))}),format.raw/*51.10*/("""
    """),format.raw/*52.5*/("""</div>
""")))};def /*55.2*/navSide/*55.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*55.13*/("""
    """),format.raw/*56.5*/("""<a href="#" onclick="">Basic Information</a>
    <a href="#">Edit Address</a>
    <a href="#">Change Password</a>
""")))};def /*61.2*/bodyContent/*61.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*61.17*/("""
"""),_display_(/*62.2*/aside/*62.7*/.apply("", navSide)),format.raw/*62.26*/("""

"""),_display_(/*64.2*/article/*64.9*/.apply(userContent)),format.raw/*64.28*/("""
""")))};
Seq[Any](format.raw/*9.34*/("""

"""),format.raw/*13.2*/("""

"""),format.raw/*17.2*/("""

"""),format.raw/*53.2*/("""

"""),format.raw/*59.2*/("""

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
                  DATE: Fri Aug 18 20:48:54 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/editProfile.scala.html
                  HASH: 0d1a1c28f9b15ecc061a159c02bf246c09f34727
                  MATRIX: 665->1|704->34|742->66|771->89|817->129|848->154|877->177|1217->198|1328->233|1351->247|1432->251|1464->256|1505->270|1520->276|1592->327|1641->356|1660->366|1741->370|1767->376|1787->387|1868->391|1900->396|1962->431|1977->437|2053->504|2092->505|2133->519|2146->523|2177->533|2218->546|2405->706|2420->712|2490->761|2535->779|2550->785|2626->840|2667->853|2838->997|2853->1003|2941->1070|2982->1083|3155->1229|3170->1235|3248->1292|3293->1310|3308->1316|3397->1384|3438->1397|3559->1491|3574->1497|3685->1586|3730->1604|3745->1610|3845->1688|3886->1701|4070->1858|4090->1869|4151->1908|4289->2015|4321->2020|4352->2031|4367->2038|4448->2042|4480->2047|4618->2165|4638->2176|4719->2180|4747->2182|4760->2187|4800->2206|4829->2209|4844->2216|4884->2235|4925->230|4954->353|4983->373|5012->2028|5041->2162|5070->2237|5099->2240|5118->2250|5206->2317
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->6|30->7|35->9|39->11|39->11|41->11|42->12|42->12|42->12|42->12|43->15|43->15|45->15|47->19|47->19|49->19|50->20|51->21|51->21|51->21|51->21|52->22|52->22|52->22|53->23|57->27|57->27|57->27|58->28|58->28|58->28|59->29|63->33|63->33|63->33|64->34|69->39|69->39|69->39|70->40|70->40|70->40|71->41|74->44|74->44|74->44|75->45|75->45|75->45|76->46|79->49|79->49|79->49|81->51|82->52|83->55|83->55|85->55|86->56|89->61|89->61|91->61|92->62|92->62|92->62|94->64|94->64|94->64|96->9|98->13|100->17|102->53|104->59|106->65|108->67|108->67|108->67
                  -- GENERATED --
              */
          