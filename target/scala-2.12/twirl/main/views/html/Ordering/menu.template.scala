
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
/*3.2*/import helper._
/*4.2*/import models.Order.Meal

object menu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[util.List[Meal],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(meals: util.List[Meal], menuType: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.45*/("""

"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html>
    <body>
        """),_display_(/*10.10*/if(session.get("user") == null)/*10.41*/{_display_(Seq[Any](format.raw/*10.42*/("""
            """),format.raw/*11.13*/("""<a href=""""),_display_(/*11.23*/controllers/*11.34*/.Order.routes.AccountController.getSignUp()),format.raw/*11.77*/("""">Sign up</a>
        """)))}/*12.11*/else/*12.15*/{_display_(Seq[Any](format.raw/*12.16*/("""
            """),format.raw/*13.13*/("""<p>Welcome """),_display_(/*13.25*/session/*13.32*/.get("username")),format.raw/*13.48*/("""</p>
            <a href=""""),_display_(/*14.23*/controllers/*14.34*/.Order.routes.AccountController.doSignOut()),format.raw/*14.77*/("""">Sign out</a>
        """)))}),format.raw/*15.10*/("""

        """),format.raw/*17.79*/("""
        """),format.raw/*18.9*/("""<h1>Menu</h1>
        <table>
            <tr><td><a href=""""),_display_(/*20.31*/controllers/*20.42*/.Order.routes.OrderController.getMenu()),format.raw/*20.81*/("""">Menu</a></td></tr>
            <tr><td><a href=""""),_display_(/*21.31*/controllers/*21.42*/.Order.routes.OrderController.getCart()),format.raw/*21.81*/("""">Checkout</a></td></tr>
        </table>
        <table>
            """),_display_(/*24.14*/menuType),format.raw/*24.22*/("""
            """),format.raw/*25.13*/("""<tr><td><a href=""""),_display_(/*25.31*/controllers/*25.42*/.Order.routes.OrderController.switchMenu(0)),format.raw/*25.85*/("""">Breakfast</a></td></tr>
            <tr><td><a href=""""),_display_(/*26.31*/controllers/*26.42*/.Order.routes.OrderController.switchMenu(1)),format.raw/*26.85*/("""">Lunch</a></td></tr>
            <tr><td><a href=""""),_display_(/*27.31*/controllers/*27.42*/.Order.routes.OrderController.switchMenu(2)),format.raw/*27.85*/("""">Dinner</a></td></tr>
        </table>
        """),_display_(/*29.10*/if(meals.size() == 0)/*29.31*/{_display_(Seq[Any](format.raw/*29.32*/("""
            """),format.raw/*30.13*/("""<p>List is empty</p>
        """)))}/*31.11*/else/*31.16*/{_display_(Seq[Any](format.raw/*31.17*/("""
            """),_display_(/*32.14*/for(x <- 0 until meals.size) yield /*32.42*/ {_display_(Seq[Any](format.raw/*32.44*/("""
                """),_display_(/*33.18*/form(CSRF(controllers.Order.routes.OrderController.addMealToOrder(meals.get(x).getMealId())))/*33.111*/ {_display_(Seq[Any](format.raw/*33.113*/("""
                    """),format.raw/*34.119*/("""
                    """),format.raw/*35.21*/("""<table>
                        <tr>
                            <td>Meal</td>
                            <td>Price</td>
                            <td>Status</td>
                        </tr>
                        <tr>
                            <td>"""),_display_(/*42.34*/meals/*42.39*/.get(x).getDescription()),format.raw/*42.63*/("""</td>
                            <td>"""),_display_(/*43.34*/meals/*43.39*/.get(x).getCost()),format.raw/*43.56*/("""</td>
                            <td>$$Status</td>
                        </tr>
                        <tr>
                            <td>$$Image</td>
                            <td></td>
                            <td><button type="submit">Add to order</button></td>
                        </tr>
                    </table>
                    """),format.raw/*52.32*/("""
                """)))}),format.raw/*53.18*/("""
            """)))}),format.raw/*54.14*/("""
        """)))}),format.raw/*55.10*/("""
    """),format.raw/*56.5*/("""</body>
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
                  DATE: Wed Oct 18 00:03:04 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Ordering/menu.scala.html
                  HASH: 3b8ca2b3a56bba767e56ea64cc2c97e9b826cdae
                  MATRIX: 660->1|684->20|707->37|1052->63|1190->106|1218->108|1288->151|1328->182|1367->183|1408->196|1445->206|1465->217|1529->260|1571->284|1584->288|1623->289|1664->302|1703->314|1719->321|1756->337|1810->364|1830->375|1894->418|1949->442|1987->522|2023->531|2110->591|2130->602|2190->641|2268->692|2288->703|2348->742|2446->813|2475->821|2516->834|2561->852|2581->863|2645->906|2728->962|2748->973|2812->1016|2891->1068|2911->1079|2975->1122|3051->1171|3081->1192|3120->1193|3161->1206|3210->1237|3223->1242|3262->1243|3303->1257|3347->1285|3387->1287|3432->1305|3535->1398|3576->1400|3626->1519|3675->1540|3960->1798|3974->1803|4019->1827|4085->1866|4099->1871|4137->1888|4519->2253|4568->2271|4613->2285|4654->2295|4686->2300
                  LINES: 24->1|25->3|26->4|31->5|36->5|38->7|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|45->14|45->14|45->14|46->15|48->17|49->18|51->20|51->20|51->20|52->21|52->21|52->21|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|66->35|73->42|73->42|73->42|74->43|74->43|74->43|83->52|84->53|85->54|86->55|87->56
                  -- GENERATED --
              */
          