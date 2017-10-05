
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
/*3.2*/import utility.Pair
/*4.2*/import models.Order.MealOrder
/*5.2*/import helper._
/*6.2*/import models.Order.{CustomerOrder, Meal}

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[util.List[Pair[MealOrder, Meal]],CustomerOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(meals: util.List[Pair[MealOrder, Meal]], order: CustomerOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.65*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>

<html>
    <body>
        """),format.raw/*13.55*/("""
        """),_display_(/*14.10*/if(meals != null && meals.size() == 0)/*14.48*/{_display_(Seq[Any](format.raw/*14.49*/("""
            """),format.raw/*15.13*/("""<p><i>dust</i></p>
        """)))}/*16.10*/else/*16.14*/{_display_(Seq[Any](format.raw/*16.15*/("""
            """),_display_(/*17.14*/for(x <- 0 until meals.size()) yield /*17.44*/ {_display_(Seq[Any](format.raw/*17.46*/("""
                """),_display_(/*18.18*/form(CSRF(controllers.Order.routes.OrderController.removeMealFromOrder(meals.get(x).getObject1.getMealId)))/*18.125*/ {_display_(Seq[Any](format.raw/*18.127*/("""
                    """),format.raw/*19.21*/("""<table>
                        <tr>
                            <td>Meal</td>
                            <td>Price</td>
                            <td>Status</td>
                        </tr>
                        <tr>
                            <td>"""),_display_(/*26.34*/meals/*26.39*/.get(x).getObject2.getDescription),format.raw/*26.72*/("""</td>
                            <td>"""),_display_(/*27.34*/meals/*27.39*/.get(x).getObject2.getCost),format.raw/*27.65*/("""</td>
                            <td>$$Status</td>
                        </tr>
                        <tr>
                            <td>$$Image</td>
                            <td>Quantity: """),_display_(/*32.44*/meals/*32.49*/.get(x).getObject1.getOrderQty),format.raw/*32.79*/("""</td>
                            <td><button type="submit" name="action" value="remove">Remove Meal</button></td>
                        </tr>
                    </table>
                """)))}),format.raw/*36.18*/("""
            """)))}),format.raw/*37.14*/("""
            """),format.raw/*38.13*/("""<a href=""""),_display_(/*38.23*/controllers/*38.34*/.Order.routes.OrderController.submitCart()),format.raw/*38.76*/("""">Submit Cart</a>
        """)))}),format.raw/*39.10*/("""
    """),format.raw/*40.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(meals:util.List[Pair[MealOrder, Meal]],order:CustomerOrder): play.twirl.api.HtmlFormat.Appendable = apply(meals,order)

  def f:((util.List[Pair[MealOrder, Meal]],CustomerOrder) => play.twirl.api.HtmlFormat.Appendable) = (meals,order) => apply(meals,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 05 23:18:42 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master/app/views/Ordering/cart.scala.html
                  HASH: f0d56693f4595a1340b0cb8359e88aa4f64acdce
                  MATRIX: 660->1|684->20|711->41|748->72|771->89|1156->132|1314->195|1342->197|1413->286|1450->296|1497->334|1536->335|1577->348|1624->376|1637->380|1676->381|1717->395|1763->425|1803->427|1848->445|1965->552|2006->554|2055->575|2340->833|2354->838|2408->871|2474->910|2488->915|2535->941|2761->1140|2775->1145|2826->1175|3048->1366|3093->1380|3134->1393|3171->1403|3191->1414|3254->1456|3312->1483|3344->1488
                  LINES: 24->1|25->3|26->4|27->5|28->6|33->7|38->7|40->9|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|57->26|57->26|57->26|58->27|58->27|58->27|63->32|63->32|63->32|67->36|68->37|69->38|69->38|69->38|69->38|70->39|71->40
                  -- GENERATED --
              */
          