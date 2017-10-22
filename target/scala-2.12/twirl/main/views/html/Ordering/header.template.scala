
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
"""),_display_(/*8.2*/if(session.get("display_name") == null)/*8.41*/{_display_(Seq[Any](format.raw/*8.42*/("""
    """),format.raw/*9.5*/("""<a href=""""),_display_(/*9.15*/controllers/*9.26*/.User.routes.UserController.login()),format.raw/*9.61*/("""">Sign up</a>
""")))}/*10.3*/else/*10.7*/{_display_(Seq[Any](format.raw/*10.8*/("""
    """),format.raw/*11.5*/("""<p>Welcome """),_display_(/*11.17*/session/*11.24*/.get("display_name")),format.raw/*11.44*/("""
        """),format.raw/*12.9*/("""<br>
        <a href=""""),_display_(/*13.19*/controllers/*13.30*/.User.routes.UserController.logout),format.raw/*13.64*/("""">Sign out</a>
    </p>
""")))}),format.raw/*15.2*/("""


"""),format.raw/*18.1*/("""</div>

<div class="cart-wrapper">
    <a href=""""),_display_(/*21.15*/controllers/*21.26*/.Order.routes.OrderController.getCart()),format.raw/*21.65*/(""""><img src=""""),_display_(/*21.78*/routes/*21.84*/.Assets.versioned("images/menu/cart.png")),format.raw/*21.125*/("""" class="cart-image" /></a>
    """),_display_(/*22.6*/if(session.get("display_name") != null)/*22.45*/{_display_(Seq[Any](format.raw/*22.46*/("""
        """),format.raw/*23.9*/("""<p class="cart-wrapper">"""),_display_(/*23.34*/MealOrder/*23.43*/.findMealOrderByOrderId(session.get("orderId")).size()),format.raw/*23.97*/("""</p>
    """)))}),format.raw/*24.6*/("""
"""),format.raw/*25.1*/("""</div>

<div class="nav-menu-wrapper">
    <div class="nav-bar">
        <ul>
            <li><a href=""""),_display_(/*30.27*/controllers/*30.38*/.User.routes.CustomerController.index),format.raw/*30.75*/("""">Dashboard</a></li>
            <li><a href=""""),_display_(/*31.27*/controllers/*31.38*/.Application.routes.HomeController.index()),format.raw/*31.80*/("""">Home</a></li>
            <li><a href=""""),_display_(/*32.27*/controllers/*32.38*/.Order.routes.OrderController.getCart()),format.raw/*32.77*/("""">Checkout</a></li>
            <li><a href=""""),_display_(/*33.27*/controllers/*33.38*/.Order.routes.OrderController.getMenu()),format.raw/*33.77*/("""">Menu</a></li>
            <li><a href=""""),_display_(/*34.27*/controllers/*34.38*/.Order.routes.OrderController.getActiveOrders()),format.raw/*34.85*/("""">Active Orders</a></li>
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
                  DATE: Sun Oct 22 14:15:09 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Ordering/header.scala.html
                  HASH: 858259fd1f810b0d766164bbc9ebf9a221d1249c
                  MATRIX: 660->1|988->32|1084->34|1111->35|1158->56|1172->62|1228->98|1263->107|1282->118|1345->160|1410->200|1457->239|1495->240|1526->245|1562->255|1581->266|1636->301|1669->317|1681->321|1719->322|1751->327|1790->339|1806->346|1847->366|1883->375|1933->398|1953->409|2008->443|2063->468|2093->471|2169->520|2189->531|2249->570|2289->583|2304->589|2367->630|2426->663|2474->702|2513->703|2549->712|2601->737|2619->746|2694->800|2734->810|2762->811|2893->915|2913->926|2971->963|3045->1010|3065->1021|3128->1063|3197->1105|3217->1116|3277->1155|3350->1201|3370->1212|3430->1251|3499->1293|3519->1304|3587->1351
                  LINES: 24->1|29->2|34->2|35->3|36->4|36->4|36->4|36->4|36->4|36->4|40->8|40->8|40->8|41->9|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|43->11|44->12|45->13|45->13|45->13|47->15|50->18|53->21|53->21|53->21|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|55->23|56->24|57->25|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34
                  -- GENERATED --
              */
          