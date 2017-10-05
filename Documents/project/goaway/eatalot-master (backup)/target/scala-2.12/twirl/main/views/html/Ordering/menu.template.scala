
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
/*1.2*/import java.util
/*2.2*/import helper._
/*3.2*/import models.Order.Meal

object menu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[util.List[Meal],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(meals: util.List[Meal], menuType: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.45*/("""

"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html>
    <body>
        """),_display_(/*9.10*/if(session.get("user") == null)/*9.41*/{_display_(Seq[Any](format.raw/*9.42*/("""
            """),format.raw/*10.13*/("""<a href=""""),_display_(/*10.23*/controllers/*10.34*/.Order.routes.AccountController.getSignUp()),format.raw/*10.77*/("""">Sign up</a>
        """)))}/*11.11*/else/*11.15*/{_display_(Seq[Any](format.raw/*11.16*/("""
            """),format.raw/*12.13*/("""<p>Welcome """),_display_(/*12.25*/session/*12.32*/.get("username")),format.raw/*12.48*/("""</p>
            <a href=""""),_display_(/*13.23*/controllers/*13.34*/.Order.routes.AccountController.doSignOut()),format.raw/*13.77*/("""">Sign out</a>
        """)))}),format.raw/*14.10*/("""

        """),format.raw/*16.79*/("""
        """),format.raw/*17.9*/("""<h1>Menu</h1>
        <table>
            <tr><td><a href=""""),_display_(/*19.31*/controllers/*19.42*/.Order.routes.OrderController.getMenu()),format.raw/*19.81*/("""">Menu</a></td></tr>
            <tr><td><a href=""""),_display_(/*20.31*/controllers/*20.42*/.Order.routes.OrderController.getCart()),format.raw/*20.81*/("""">Checkout</a></td></tr>
        </table>
        <table>
            """),_display_(/*23.14*/menuType),format.raw/*23.22*/("""
            """),format.raw/*24.13*/("""<tr><td><a href=""""),_display_(/*24.31*/controllers/*24.42*/.Order.routes.OrderController.switchMenu(0)),format.raw/*24.85*/("""">Breakfast</a></td></tr>
            <tr><td><a href=""""),_display_(/*25.31*/controllers/*25.42*/.Order.routes.OrderController.switchMenu(1)),format.raw/*25.85*/("""">Lunch</a></td></tr>
            <tr><td><a href=""""),_display_(/*26.31*/controllers/*26.42*/.Order.routes.OrderController.switchMenu(2)),format.raw/*26.85*/("""">Dinner</a></td></tr>
        </table>
        """),_display_(/*28.10*/if(meals.size() == 0)/*28.31*/{_display_(Seq[Any](format.raw/*28.32*/("""
            """),format.raw/*29.13*/("""<p>List is empty</p>
        """)))}/*30.11*/else/*30.16*/{_display_(Seq[Any](format.raw/*30.17*/("""
            """),_display_(/*31.14*/for(x <- 0 until meals.size) yield /*31.42*/ {_display_(Seq[Any](format.raw/*31.44*/("""
                """),_display_(/*32.18*/form(CSRF(controllers.Order.routes.OrderController.addMealToOrder(meals.get(x).getMealId())))/*32.111*/ {_display_(Seq[Any](format.raw/*32.113*/("""
                    """),format.raw/*33.119*/("""
                    """),format.raw/*34.21*/("""<table>
                        <tr>
                            <td>Meal</td>
                            <td>Price</td>
                            <td>Status</td>
                        </tr>
                        <tr>
                            <td>"""),_display_(/*41.34*/meals/*41.39*/.get(x).getDescription()),format.raw/*41.63*/("""</td>
                            <td>"""),_display_(/*42.34*/meals/*42.39*/.get(x).getCost()),format.raw/*42.56*/("""</td>
                            <td>$$Status</td>
                        </tr>
                        <tr>
                            <td>$$Image</td>
                            <td></td>
                            <td><button type="submit">Add to order</button></td>
                        </tr>
                    </table>
                    """),format.raw/*51.32*/("""
                """)))}),format.raw/*52.18*/("""
            """)))}),format.raw/*53.14*/("""
        """)))}),format.raw/*54.10*/("""
    """),format.raw/*55.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(meals:util.List[Meal],menuType:Integer): play.twirl.api.HtmlFormat.Appendable = apply(meals,menuType)

  def f:((util.List[Meal],Integer) => play.twirl.api.HtmlFormat.Appendable) = (meals,menuType) => apply(meals,menuType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 05 23:18:42 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master/app/views/Ordering/menu.scala.html
                  HASH: 3b177f95a22535b78519116f1dddae9e503e773c
                  MATRIX: 660->1|684->19|707->36|1052->62|1190->105|1218->107|1287->150|1326->181|1364->182|1405->195|1442->205|1462->216|1526->259|1568->283|1581->287|1620->288|1661->301|1700->313|1716->320|1753->336|1807->363|1827->374|1891->417|1946->441|1984->521|2020->530|2107->590|2127->601|2187->640|2265->691|2285->702|2345->741|2443->812|2472->820|2513->833|2558->851|2578->862|2642->905|2725->961|2745->972|2809->1015|2888->1067|2908->1078|2972->1121|3048->1170|3078->1191|3117->1192|3158->1205|3207->1236|3220->1241|3259->1242|3300->1256|3344->1284|3384->1286|3429->1304|3532->1397|3573->1399|3623->1518|3672->1539|3957->1797|3971->1802|4016->1826|4082->1865|4096->1870|4134->1887|4516->2252|4565->2270|4610->2284|4651->2294|4683->2299
                  LINES: 24->1|25->2|26->3|31->4|36->4|38->6|41->9|41->9|41->9|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|44->12|45->13|45->13|45->13|46->14|48->16|49->17|51->19|51->19|51->19|52->20|52->20|52->20|55->23|55->23|56->24|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|66->34|73->41|73->41|73->41|74->42|74->42|74->42|83->51|84->52|85->53|86->54|87->55
                  -- GENERATED --
              */
          