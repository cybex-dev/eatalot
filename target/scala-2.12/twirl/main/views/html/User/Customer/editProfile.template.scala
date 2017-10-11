
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
/*4.2*/import Global.Html5._
/*5.2*/import helper.CSRF

object editProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserProfile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(userProfile: Form[UserProfile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/scriptsContent/*9.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.20*/("""
    """),format.raw/*10.5*/("""<script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("javascripts/registerDetails.js")),format.raw/*10.76*/("""" rel="script"></script>
""")))};def /*13.2*/navContent/*13.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.16*/("""

""")))};def /*17.2*/userContent/*17.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.17*/("""
    """),format.raw/*18.5*/("""<div class="input-group">
        """),_display_(/*19.10*/helper/*19.16*/.form(action = controllers.User.routes.CustomerController.update())/*19.83*/{_display_(Seq[Any](format.raw/*19.84*/("""
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
            <h2>Your Address</h2>
            <div class="container input-container">
                """),_display_(/*37.18*/helper/*37.24*/.inputText(userProfile("streetName"), '_name -> "Street")),format.raw/*37.81*/("""
                """),_display_(/*38.18*/helper/*38.24*/.inputText(userProfile("unitNumber"), '_name -> "House/Unit Number")),format.raw/*38.92*/("""
            """),format.raw/*39.13*/("""</div>
            <br/>
            <div class="container input-container">
                """),_display_(/*42.18*/helper/*42.24*/.checkbox(userProfile("isCommunity"), '_name -> "Do you live in a complex or apartment?")),format.raw/*42.113*/("""
                """),_display_(/*43.18*/helper/*43.24*/.inputText(userProfile("communityName"), '_name -> "Name of building/complex")),format.raw/*43.102*/("""
            """),format.raw/*44.13*/("""</div>
            <br/>
            <div class="container input-container">
                <input class="btn btn-default button-padding" type="button" href=""""),_display_(/*47.84*/controllers/*47.95*/.User.routes.CustomerController.index()),format.raw/*47.134*/("""" value="Cancel"> <input class="btn btn-success button-padding" type="submit" value="Update">
            </div>
        """)))}),format.raw/*49.10*/("""
    """),format.raw/*50.5*/("""</div>
""")))};def /*53.2*/navSide/*53.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*53.13*/("""
    """),format.raw/*54.5*/("""<a href="#" onclick="">Basic Information</a>
    <a href="#">Edit Address</a>
    <a href="#">Change Password</a>
""")))};def /*59.2*/bodyContent/*59.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*59.17*/("""
"""),_display_(/*60.2*/aside/*60.7*/.apply("", navSide)),format.raw/*60.26*/("""

"""),_display_(/*62.2*/article/*62.9*/.apply(userContent)),format.raw/*62.28*/("""
""")))};
Seq[Any](format.raw/*7.34*/("""

"""),format.raw/*11.2*/("""

"""),format.raw/*15.2*/("""

"""),format.raw/*51.2*/("""

"""),format.raw/*57.2*/("""

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
                  DATE: Wed Oct 11 22:25:23 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/editProfile.scala.html
                  HASH: 8096b3f0a2b7d07ff69fa09879bea2455c3ba676
                  MATRIX: 665->1|704->34|742->66|771->89|800->112|1140->133|1250->168|1272->182|1352->186|1384->191|1425->205|1440->211|1512->262|1561->291|1580->301|1661->305|1687->311|1707->322|1788->326|1820->331|1882->366|1897->372|1973->439|2012->440|2053->454|2066->458|2097->468|2138->481|2325->641|2340->647|2410->696|2455->714|2470->720|2546->775|2587->788|2758->932|2773->938|2861->1005|2902->1018|3075->1164|3090->1170|3168->1227|3213->1245|3228->1251|3317->1319|3358->1332|3479->1426|3494->1432|3605->1521|3650->1539|3665->1545|3765->1623|3806->1636|3993->1796|4013->1807|4074->1846|4227->1968|4259->1973|4290->1984|4305->1991|4386->1995|4418->2000|4556->2118|4576->2129|4657->2133|4685->2135|4698->2140|4738->2159|4767->2162|4782->2169|4822->2188|4863->165|4892->288|4921->308|4950->1981|4979->2115|5008->2190|5037->2193|5056->2203|5144->2270
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->9|37->9|39->9|40->10|40->10|40->10|40->10|41->13|41->13|43->13|45->17|45->17|47->17|48->18|49->19|49->19|49->19|49->19|50->20|50->20|50->20|51->21|55->25|55->25|55->25|56->26|56->26|56->26|57->27|61->31|61->31|61->31|62->32|67->37|67->37|67->37|68->38|68->38|68->38|69->39|72->42|72->42|72->42|73->43|73->43|73->43|74->44|77->47|77->47|77->47|79->49|80->50|81->53|81->53|83->53|84->54|87->59|87->59|89->59|90->60|90->60|90->60|92->62|92->62|92->62|94->7|96->11|98->15|100->51|102->57|104->63|106->65|106->65|106->65
                  -- GENERATED --
              */
          