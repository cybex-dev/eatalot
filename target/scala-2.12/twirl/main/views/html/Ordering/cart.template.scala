
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
            """),format.raw/*17.13*/("""<table>
                """),_display_(/*18.18*/for(x <- 0 until meals.size()) yield /*18.48*/ {_display_(Seq[Any](format.raw/*18.50*/("""
                    """),_display_(/*19.22*/form(CSRF(controllers.Order.routes.OrderController.removeMealFromOrder(meals.get(x).getObject1.getMealId)))/*19.129*/ {_display_(Seq[Any](format.raw/*19.131*/("""
                        """),format.raw/*20.25*/("""<tr>
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
                    """)))}),format.raw/*35.22*/("""
                """)))}),format.raw/*36.18*/("""
            """),format.raw/*37.13*/("""</table>
            <a href=""""),_display_(/*38.23*/controllers/*38.34*/.Order.routes.OrderController.getSubmitPage()),format.raw/*38.79*/("""">Submit Cart</a>
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
                  DATE: Sat Oct 14 09:33:01 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/app/views/Ordering/cart.scala.html
                  HASH: 1aeaa0619c9e27c376b7c387d7c51166ceb83308
                  MATRIX: 660->1|684->20|711->41|748->72|771->89|1156->132|1314->195|1342->197|1413->286|1450->296|1497->334|1536->335|1577->348|1624->376|1637->380|1676->381|1717->394|1769->419|1815->449|1855->451|1904->473|2021->580|2062->582|2115->607|2368->833|2382->838|2436->871|2502->910|2516->915|2563->941|2789->1140|2803->1145|2854->1175|3051->1341|3100->1359|3141->1372|3199->1403|3219->1414|3285->1459|3343->1486|3375->1491
                  LINES: 24->1|25->3|26->4|27->5|28->6|33->7|38->7|40->9|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|57->26|57->26|57->26|58->27|58->27|58->27|63->32|63->32|63->32|66->35|67->36|68->37|69->38|69->38|69->38|70->39|71->40
                  -- GENERATED --
              */
          