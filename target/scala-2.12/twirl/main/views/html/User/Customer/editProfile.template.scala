
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
/*2.2*/import play.data.Form
/*3.2*/import Global.Html5._
/*4.2*/import helper.CSRF
/*5.2*/import models.User.UserProfile

object editProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserProfile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(userProfile: Form[UserProfile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

<<<<<<< HEAD
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
                <input class="btn btn-default button-padding" type="button" href=""""),_display_(/*49.84*/controllers/*49.95*/.User.routes.CustomerController.index()),format.raw/*49.134*/(""""> <input class="btn btn-success button-padding" type="submit" value="Update">
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
=======
def /*9.2*/scriptsContent/*9.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.20*/("""
    """),format.raw/*10.5*/("""<script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("javascripts/registerDetails.js")),format.raw/*10.76*/("""" rel="script"></script>
""")))};def /*13.2*/navContent/*13.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.16*/("""

""")))};def /*17.2*/passwordContent/*17.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.21*/("""
    """),format.raw/*18.5*/("""<br/>
    <div class="container input-container">
        <h4>Change Password</h4>
        <i>(Only edit password fields if you intend to change them)</i>
        """),_display_(/*22.10*/helper/*22.16*/.inputPassword(userProfile("password"), '_name -> "Password")),format.raw/*22.77*/("""
        """),_display_(/*23.10*/helper/*23.16*/.inputPassword(userProfile("confirmPassword"), '_name -> "Confirm Password", '_id -> "confirmPassword")),format.raw/*23.119*/("""
    """),format.raw/*24.5*/("""</div>
    <br/>
""")))};def /*28.2*/userInfoContent/*28.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*28.21*/("""
    """),format.raw/*29.5*/("""<br/>
    <div class="container input-container">
        <h4>Your Personal Details</h4>
        """),_display_(/*32.10*/helper/*32.16*/.inputText(userProfile("name"), '_name -> "Name")),format.raw/*32.65*/("""
        """),_display_(/*33.10*/helper/*33.16*/.inputText(userProfile("surname"), '_name -> "Surname")),format.raw/*33.71*/("""
    """),format.raw/*34.5*/("""</div>
    <br/>
    <div class="container input-container">
        <h4>Your Contact Information</h4>
        """),_display_(/*38.10*/helper/*38.16*/.inputText(userProfile("cellNumber"), '_name -> "Cellphone Number")),format.raw/*38.83*/("""
    """),format.raw/*39.5*/("""</div>
    <br/>
""")))};def /*43.2*/addressContent/*43.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*43.20*/("""
    """),format.raw/*44.5*/("""<br/>
    <div class="container input-container">
        <h4>Street Address</h4>
        """),_display_(/*47.10*/helper/*47.16*/.inputText(userProfile("streetName"), '_name -> "Street")),format.raw/*47.73*/("""
        """),_display_(/*48.10*/helper/*48.16*/.inputText(userProfile("unitNumber"), '_name -> "House/Unit Number")),format.raw/*48.84*/("""
    """),format.raw/*49.5*/("""</div>
    <br/>
    <div class="container input-container">
        <h4>Community Information</h4>
        """),_display_(/*53.10*/helper/*53.16*/.checkbox(userProfile("isCommunity"), '_name -> "Do you live in a complex or apartment?")),format.raw/*53.105*/("""
        """),_display_(/*54.10*/helper/*54.16*/.inputText(userProfile("communityName"), '_name -> "Name of building/complex")),format.raw/*54.94*/("""
    """),format.raw/*55.5*/("""</div>
    <br/>
    <div class="container input-container">
        <input class="btn btn-default button-padding" type="button" onclick="location.href = '"""),_display_(/*58.96*/controllers/*58.107*/.User.routes.CustomerController.index()),format.raw/*58.146*/("""';" value="Cancel"> <input class="btn btn-success button-padding" type="submit" value="Update">
    </div>
    <br/>
""")))};def /*63.2*/navTabsContent/*63.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*63.20*/("""
"""),_display_(/*64.2*/helper/*64.8*/.form(action = controllers.User.routes.CustomerController.update())/*64.75*/ {_display_(Seq[Any](format.raw/*64.77*/("""
    """),_display_(/*65.6*/CSRF/*65.10*/.formField),format.raw/*65.20*/("""
    """),format.raw/*66.5*/("""<div class="panel-body">
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
            """),_display_(/*80.14*/userInfoContent),format.raw/*80.29*/("""
            """),format.raw/*81.13*/("""</div>
            <div class="tab-pane fade" id="password">
            """),_display_(/*83.14*/passwordContent),format.raw/*83.29*/("""
            """),format.raw/*84.13*/("""</div>
            <div class="tab-pane fade" id="address">
            """),_display_(/*86.14*/addressContent),format.raw/*86.28*/("""
            """),format.raw/*87.13*/("""</div>
        </div>
    </div>

""")))}),format.raw/*91.2*/("""
""")))};def /*94.2*/bodyContent/*94.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*94.17*/("""
    """),format.raw/*95.5*/("""<h2 class="center-parent">Profile Information</h2>
"""),_display_(/*96.2*/navTabsContent),format.raw/*96.16*/("""
>>>>>>> Customer-Management-Dev
""")))};
Seq[Any](format.raw/*7.34*/("""

"""),format.raw/*11.2*/("""

"""),format.raw/*15.2*/("""

"""),format.raw/*26.2*/("""

"""),format.raw/*41.2*/("""

"""),format.raw/*61.2*/("""

"""),format.raw/*92.2*/("""

"""),format.raw/*97.2*/("""

"""),_display_(/*99.2*/masterpage/*99.12*/.apply(" :: Edit Profile", bodyContent)),format.raw/*99.51*/("""
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
<<<<<<< HEAD
                  DATE: Thu Aug 24 09:11:16 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/editProfile.scala.html
                  HASH: 61035166d93b52776f7d9ddc2a3e5e59e715e5d6
                  MATRIX: 665->1|704->34|742->66|771->89|817->129|848->154|877->177|1217->198|1328->233|1351->247|1432->251|1464->256|1505->270|1520->276|1592->327|1641->356|1660->366|1741->370|1767->376|1787->387|1868->391|1900->396|1962->431|1977->437|2053->504|2092->505|2133->519|2146->523|2177->533|2218->546|2405->706|2420->712|2490->761|2535->779|2550->785|2626->840|2667->853|2838->997|2853->1003|2941->1070|2982->1083|3155->1229|3170->1235|3248->1292|3293->1310|3308->1316|3397->1384|3438->1397|3559->1491|3574->1497|3685->1586|3730->1604|3745->1610|3845->1688|3886->1701|4073->1861|4093->1872|4154->1911|4292->2018|4324->2023|4355->2034|4370->2041|4451->2045|4483->2050|4621->2168|4641->2179|4722->2183|4750->2185|4763->2190|4803->2209|4832->2212|4847->2219|4887->2238|4928->230|4957->353|4986->373|5015->2031|5044->2165|5073->2240|5102->2243|5121->2253|5209->2320
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->6|30->7|35->9|39->11|39->11|41->11|42->12|42->12|42->12|42->12|43->15|43->15|45->15|47->19|47->19|49->19|50->20|51->21|51->21|51->21|51->21|52->22|52->22|52->22|53->23|57->27|57->27|57->27|58->28|58->28|58->28|59->29|63->33|63->33|63->33|64->34|69->39|69->39|69->39|70->40|70->40|70->40|71->41|74->44|74->44|74->44|75->45|75->45|75->45|76->46|79->49|79->49|79->49|81->51|82->52|83->55|83->55|85->55|86->56|89->61|89->61|91->61|92->62|92->62|92->62|94->64|94->64|94->64|96->9|98->13|100->17|102->53|104->59|106->65|108->67|108->67|108->67
=======
                  DATE: Mon Oct 16 22:47:07 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/editProfile.scala.html
                  HASH: 078d64531c818f6d67042fcb007f5a6b1aa67b39
                  MATRIX: 665->1|704->34|733->57|762->80|788->100|1140->133|1250->168|1272->182|1352->186|1384->191|1425->205|1440->211|1512->262|1561->291|1580->301|1661->305|1687->311|1711->326|1792->330|1824->335|2015->499|2030->505|2112->566|2149->576|2164->582|2289->685|2321->690|2362->711|2386->726|2467->730|2499->735|2624->833|2639->839|2709->888|2746->898|2761->904|2837->959|2869->964|3008->1076|3023->1082|3111->1149|3143->1154|3184->1175|3207->1189|3288->1193|3320->1198|3438->1289|3453->1295|3531->1352|3568->1362|3583->1368|3672->1436|3704->1441|3840->1550|3855->1556|3966->1645|4003->1655|4018->1661|4117->1739|4149->1744|4332->1900|4353->1911|4414->1950|4555->2071|4578->2085|4659->2089|4687->2091|4701->2097|4777->2164|4817->2166|4849->2172|4862->2176|4893->2186|4925->2191|5543->2782|5579->2797|5620->2810|5721->2884|5757->2899|5798->2912|5898->2985|5933->2999|5974->3012|6039->3047|6064->3052|6084->3063|6165->3067|6197->3072|6275->3124|6310->3138|6351->165|6380->288|6409->308|6438->708|6467->1172|6496->2068|6525->3049|6554->3140|6583->3143|6602->3153|6662->3192
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->9|37->9|39->9|40->10|40->10|40->10|40->10|41->13|41->13|43->13|45->17|45->17|47->17|48->18|52->22|52->22|52->22|53->23|53->23|53->23|54->24|56->28|56->28|58->28|59->29|62->32|62->32|62->32|63->33|63->33|63->33|64->34|68->38|68->38|68->38|69->39|71->43|71->43|73->43|74->44|77->47|77->47|77->47|78->48|78->48|78->48|79->49|83->53|83->53|83->53|84->54|84->54|84->54|85->55|88->58|88->58|88->58|91->63|91->63|93->63|94->64|94->64|94->64|94->64|95->65|95->65|95->65|96->66|110->80|110->80|111->81|113->83|113->83|114->84|116->86|116->86|117->87|121->91|122->94|122->94|124->94|125->95|126->96|126->96|128->7|130->11|132->15|134->26|136->41|138->61|140->92|142->97|144->99|144->99|144->99
>>>>>>> Customer-Management-Dev
                  -- GENERATED --
              */
          