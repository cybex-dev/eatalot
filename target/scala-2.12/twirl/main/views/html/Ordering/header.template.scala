
package views.html.Ordering

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
/*1.2*/import models.Order.MealOrder

object header extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.4*/("""
"""),format.raw/*3.1*/("""<div>
    <img src=""""),_display_(/*4.16*/routes/*4.22*/.Assets.versioned("images/logo.png")),format.raw/*4.58*/("""" href=""""),_display_(/*4.67*/controllers/*4.78*/.Application.routes.HomeController.index()),format.raw/*4.120*/("""" />
</div>

<div style="float: left">
    """),_display_(/*8.6*/if(session.get("display_name") == null)/*8.45*/{_display_(Seq[Any](format.raw/*8.46*/("""
        """),format.raw/*9.9*/("""<a href=""""),_display_(/*9.19*/controllers/*9.30*/.User.routes.UserController.login()),format.raw/*9.65*/("""">Sign up</a>
    """)))}/*10.7*/else/*10.11*/{_display_(Seq[Any](format.raw/*10.12*/("""
        """),format.raw/*11.9*/("""<p>Welcome """),_display_(/*11.21*/session/*11.28*/.get("display_name")),format.raw/*11.48*/("""
        """),format.raw/*12.9*/("""<br>
        <a href=""""),_display_(/*13.19*/controllers/*13.30*/.Order.routes.AccountController.doSignOut()),format.raw/*13.73*/("""">Sign out</a>
        </p>
    """)))}),format.raw/*15.6*/("""


"""),format.raw/*18.1*/("""</div>

<div class="cart-wrapper">
    <a href=""""),_display_(/*21.15*/controllers/*21.26*/.Order.routes.OrderController.getCart()),format.raw/*21.65*/(""""><img src=""""),_display_(/*21.78*/routes/*21.84*/.Assets.versioned("images/menu/cart.png")),format.raw/*21.125*/("""" class="cart-image" /></a>
    """),_display_(/*22.6*/if(session.get("display_name") != null)/*22.45*/{_display_(Seq[Any](format.raw/*22.46*/("""
        """),format.raw/*23.105*/("""
        """),format.raw/*24.9*/("""<p class="cart-wrapper">5</p>
    """)))}),format.raw/*25.6*/("""
"""),format.raw/*26.1*/("""</div>

<div class="nav-menu-wrapper">
    <div class="nav-bar">
        <ul>
            <li><a href=""""),_display_(/*31.27*/controllers/*31.38*/.User.routes.CustomerController.index),format.raw/*31.75*/("""">Dashboard</a></li>
            <li><a href=""""),_display_(/*32.27*/controllers/*32.38*/.Application.routes.HomeController.index()),format.raw/*32.80*/("""">Home</a></li>
            <li><a href=""""),_display_(/*33.27*/controllers/*33.38*/.Order.routes.OrderController.getCart()),format.raw/*33.77*/("""">Checkout</a></li>
            <li><a href=""""),_display_(/*34.27*/controllers/*34.38*/.Order.routes.OrderController.getMenu()),format.raw/*34.77*/("""">Menu</a></li>
        </ul>
    </div>
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 22:44:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Ordering/header.scala.html
                  HASH: 14b129d135c4022844cc9529aa6e0bf2da48142c
                  MATRIX: 660->1|988->32|1084->34|1111->35|1158->56|1172->62|1228->98|1263->107|1282->118|1345->160|1414->204|1461->243|1499->244|1534->253|1570->263|1589->274|1644->309|1681->329|1694->333|1733->334|1769->343|1808->355|1824->362|1865->382|1901->391|1951->414|1971->425|2035->468|2098->501|2128->504|2204->553|2224->564|2284->603|2324->616|2339->622|2402->663|2461->696|2509->735|2548->736|2586->841|2622->850|2687->885|2715->886|2846->990|2866->1001|2924->1038|2998->1085|3018->1096|3081->1138|3150->1180|3170->1191|3230->1230|3303->1276|3323->1287|3383->1326
                  LINES: 24->1|29->2|34->2|35->3|36->4|36->4|36->4|36->4|36->4|36->4|40->8|40->8|40->8|41->9|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|43->11|44->12|45->13|45->13|45->13|47->15|50->18|53->21|53->21|53->21|53->21|53->21|53->21|54->22|54->22|54->22|55->23|56->24|57->25|58->26|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34
                  -- GENERATED --
              */
          