
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
"""),format.raw/*3.1*/("""<div class="header-wrapper">
    <div>
        <img class="header-title" src=""""),_display_(/*5.41*/routes/*5.47*/.Assets.versioned("images/logo.png")),format.raw/*5.83*/("""" href=""""),_display_(/*5.92*/controllers/*5.103*/.Application.routes.HomeController.index()),format.raw/*5.145*/("""" />
    </div>

    <div style="float: left">
    """),_display_(/*9.6*/if(session.get("display_name") == null)/*9.45*/{_display_(Seq[Any](format.raw/*9.46*/("""
        """),format.raw/*10.9*/("""<a href=""""),_display_(/*10.19*/controllers/*10.30*/.User.routes.UserController.login()),format.raw/*10.65*/("""">Sign up</a>
    """)))}/*11.7*/else/*11.11*/{_display_(Seq[Any](format.raw/*11.12*/("""
        """),format.raw/*12.9*/("""<p>Welcome """),_display_(/*12.21*/session/*12.28*/.get("display_name")),format.raw/*12.48*/("""
            """),format.raw/*13.13*/("""<br>
            <a href=""""),_display_(/*14.23*/controllers/*14.34*/.User.routes.UserController.logout),format.raw/*14.68*/("""">Sign out</a>
        </p>
    """)))}),format.raw/*16.6*/("""


    """),format.raw/*19.5*/("""</div>

    <div class="cart-wrapper">
        <a href=""""),_display_(/*22.19*/controllers/*22.30*/.Order.routes.OrderController.getCart()),format.raw/*22.69*/(""""><img src=""""),_display_(/*22.82*/routes/*22.88*/.Assets.versioned("images/menu/cart.png")),format.raw/*22.129*/("""" class="cart-image" /></a>
        """),_display_(/*23.10*/if(session.get("display_name") != null)/*23.49*/{_display_(Seq[Any](format.raw/*23.50*/("""
            """),format.raw/*24.13*/("""<p class="cart-wrapper">"""),_display_(/*24.38*/MealOrder/*24.47*/.findMealOrderByOrderId(session.get("orderId")).size()),format.raw/*24.101*/("""</p>
        """)))}),format.raw/*25.10*/("""
    """),format.raw/*26.5*/("""</div>
</div>
<div class="nav-menu-wrapper">
    <div class="nav-bar">
        <ul>
            <li><a href=""""),_display_(/*31.27*/controllers/*31.38*/.User.routes.CustomerController.index),format.raw/*31.75*/("""">Dashboard</a></li>
            <li><a href=""""),_display_(/*32.27*/controllers/*32.38*/.Application.routes.HomeController.index()),format.raw/*32.80*/("""">Home</a></li>
            """),format.raw/*33.100*/("""
            """),format.raw/*34.13*/("""<li><a href=""""),_display_(/*34.27*/controllers/*34.38*/.Order.routes.OrderController.getMenu()),format.raw/*34.77*/("""">Menu</a></li>
            <li><a href=""""),_display_(/*35.27*/controllers/*35.38*/.Order.routes.OrderController.getActiveOrders()),format.raw/*35.85*/("""">Active Orders</a></li>
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
                  DATE: Sun Oct 22 22:30:42 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Ordering/header.scala.html
                  HASH: 1b9e7dff1e2878c12f21c67f1cec2789cb2e5090
                  MATRIX: 660->1|988->32|1084->34|1111->35|1216->114|1230->120|1286->156|1321->165|1341->176|1404->218|1481->270|1528->309|1566->310|1602->319|1639->329|1659->340|1715->375|1752->395|1765->399|1804->400|1840->409|1879->421|1895->428|1936->448|1977->461|2031->488|2051->499|2106->533|2169->566|2203->573|2287->630|2307->641|2367->680|2407->693|2422->699|2485->740|2549->777|2597->816|2636->817|2677->830|2729->855|2747->864|2823->918|2868->932|2900->937|3037->1047|3057->1058|3115->1095|3189->1142|3209->1153|3272->1195|3329->1310|3370->1323|3411->1337|3431->1348|3491->1387|3560->1429|3580->1440|3648->1487
                  LINES: 24->1|29->2|34->2|35->3|37->5|37->5|37->5|37->5|37->5|37->5|41->9|41->9|41->9|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|44->12|45->13|46->14|46->14|46->14|48->16|51->19|54->22|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|56->24|57->25|58->26|63->31|63->31|63->31|64->32|64->32|64->32|65->33|66->34|66->34|66->34|66->34|67->35|67->35|67->35
                  -- GENERATED --
              */
          