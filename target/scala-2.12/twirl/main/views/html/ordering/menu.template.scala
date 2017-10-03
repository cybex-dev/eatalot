
package views.html.ordering

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
/*1.2*/import models.ordering.Meal
/*2.2*/import java.util
/*3.2*/import helper._

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
            """),format.raw/*10.13*/("""<a href=""""),_display_(/*10.23*/routes/*10.29*/.AccountController.getSignUp()),format.raw/*10.59*/("""">Sign up</a>
        """)))}/*11.11*/else/*11.15*/{_display_(Seq[Any](format.raw/*11.16*/("""
            """),format.raw/*12.13*/("""<p>Welcome """),_display_(/*12.25*/session/*12.32*/.get("username")),format.raw/*12.48*/("""</p>
            <a href=""""),_display_(/*13.23*/routes/*13.29*/.AccountController.doSignOut()),format.raw/*13.59*/("""">Sign out</a>
        """)))}),format.raw/*14.10*/("""

        """),format.raw/*16.79*/("""
        """),format.raw/*17.9*/("""<h1>Menu</h1>
        <table>
            <tr><td><a href=""""),_display_(/*19.31*/routes/*19.37*/.OrderController.getMenu()),format.raw/*19.63*/("""">Menu</a></td></tr>
            <tr><td><a href=""""),_display_(/*20.31*/routes/*20.37*/.OrderController.getCart()),format.raw/*20.63*/("""">Checkout</a></td></tr>
        </table>
        <table>
            """),_display_(/*23.14*/menuType),format.raw/*23.22*/("""
            """),format.raw/*24.13*/("""<tr><td><a href=""""),_display_(/*24.31*/routes/*24.37*/.OrderController.switchMenu(0)),format.raw/*24.67*/("""">Breakfast</a></td></tr>
            <tr><td><a href=""""),_display_(/*25.31*/routes/*25.37*/.OrderController.switchMenu(1)),format.raw/*25.67*/("""">Lunch</a></td></tr>
            <tr><td><a href=""""),_display_(/*26.31*/routes/*26.37*/.OrderController.switchMenu(2)),format.raw/*26.67*/("""">Dinner</a></td></tr>
        </table>
        """),_display_(/*28.10*/if(meals.size() == 0)/*28.31*/{_display_(Seq[Any](format.raw/*28.32*/("""
            """),format.raw/*29.13*/("""<p>List is empty</p>
        """)))}/*30.11*/else/*30.16*/{_display_(Seq[Any](format.raw/*30.17*/("""
            """),_display_(/*31.14*/for(x <- 0 until meals.size) yield /*31.42*/ {_display_(Seq[Any](format.raw/*31.44*/("""
                """),_display_(/*32.18*/form(CSRF(routes.OrderController.addMealToOrder(meals.get(x).getMealId())))/*32.93*/ {_display_(Seq[Any](format.raw/*32.95*/("""
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
                  DATE: Tue Oct 03 04:34:57 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/ordering/menu.scala.html
                  HASH: 3892f37976ec181bd998640a127117232b62cf75
                  MATRIX: 660->1|695->30|719->48|1055->65|1193->108|1221->110|1290->153|1329->184|1367->185|1408->198|1445->208|1460->214|1511->244|1553->268|1566->272|1605->273|1646->286|1685->298|1701->305|1738->321|1792->348|1807->354|1858->384|1913->408|1951->488|1987->497|2074->557|2089->563|2136->589|2214->640|2229->646|2276->672|2374->743|2403->751|2444->764|2489->782|2504->788|2555->818|2638->874|2653->880|2704->910|2783->962|2798->968|2849->998|2925->1047|2955->1068|2994->1069|3035->1082|3084->1113|3097->1118|3136->1119|3177->1133|3221->1161|3261->1163|3306->1181|3390->1256|3430->1258|3480->1377|3529->1398|3814->1656|3828->1661|3873->1685|3939->1724|3953->1729|3991->1746|4373->2111|4422->2129|4467->2143|4508->2153|4540->2158
                  LINES: 24->1|25->2|26->3|31->4|36->4|38->6|41->9|41->9|41->9|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|44->12|45->13|45->13|45->13|46->14|48->16|49->17|51->19|51->19|51->19|52->20|52->20|52->20|55->23|55->23|56->24|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|66->34|73->41|73->41|73->41|74->42|74->42|74->42|83->51|84->52|85->53|86->54|87->55
                  -- GENERATED --
              */
          