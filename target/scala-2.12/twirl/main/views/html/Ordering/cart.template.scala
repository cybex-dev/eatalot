
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
/*4.2*/import models.Order.{CustomerOrder, Meal, MealOrder}
/*5.2*/import utility.Pair

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[util.List[Pair[MealOrder, Meal]],CustomerOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(meals: util.List[Pair[MealOrder, Meal]], order: CustomerOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.65*/("""

"""),format.raw/*8.1*/("""<!DOCTYPE html>

<html>
    <head>
        """),_display_(/*12.10*/stylesheets/*12.21*/.apply()),format.raw/*12.29*/("""
    """),format.raw/*13.5*/("""</head>
    <body>
        """),format.raw/*15.55*/("""
        """),_display_(/*16.10*/if(meals != null && meals.size() == 0)/*16.48*/{_display_(Seq[Any](format.raw/*16.49*/("""
            """),format.raw/*17.13*/("""<p><i>dust</i></p>
        """)))}/*18.10*/else/*18.14*/{_display_(Seq[Any](format.raw/*18.15*/("""
            """),format.raw/*19.13*/("""<table>
                """),_display_(/*20.18*/for(x <- 0 until meals.size()) yield /*20.48*/ {_display_(Seq[Any](format.raw/*20.50*/("""
                    """),_display_(/*21.22*/form(CSRF(controllers.Order.routes.OrderController.removeMealFromOrder(meals.get(x).getObject1.getMealId)))/*21.129*/ {_display_(Seq[Any](format.raw/*21.131*/("""
                        """),format.raw/*22.25*/("""<tr>
                            <td>Meal</td>
                            <td>Price</td>
                            <td>Status</td>
                        </tr>
                        <tr>
                            <td>"""),_display_(/*28.34*/meals/*28.39*/.get(x).getObject2.getDescription),format.raw/*28.72*/("""</td>
                            <td>"""),_display_(/*29.34*/meals/*29.39*/.get(x).getObject2.getCost),format.raw/*29.65*/("""</td>
                            <td>$$Status</td>
                        </tr>
                        <tr>
                            <td>$$Image</td>
                            <td>Quantity: """),_display_(/*34.44*/meals/*34.49*/.get(x).getObject1.getOrderQty),format.raw/*34.79*/("""</td>
                            <td><button type="submit" name="action" value="remove">Remove Meal</button></td>
                        </tr>
                    """)))}),format.raw/*37.22*/("""
                """)))}),format.raw/*38.18*/("""
            """),format.raw/*39.13*/("""</table>
            <a href=""""),_display_(/*40.23*/controllers/*40.34*/.Order.routes.OrderController.getSubmitPage()),format.raw/*40.79*/("""">Submit Cart</a>
        """)))}),format.raw/*41.10*/("""
    """),format.raw/*42.5*/("""</body>
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
                  DATE: Sun Oct 22 04:28:36 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Ordering/cart.scala.html
                  HASH: 1a56d34695b5fcabbc80d4a7437d07bc95c2bbfe
                  MATRIX: 660->1|684->20|707->37|767->91|1130->112|1288->175|1316->177|1387->221|1407->232|1436->240|1468->245|1523->318|1560->328|1607->366|1646->367|1687->380|1734->408|1747->412|1786->413|1827->426|1879->451|1925->481|1965->483|2014->505|2131->612|2172->614|2225->639|2478->865|2492->870|2546->903|2612->942|2626->947|2673->973|2899->1172|2913->1177|2964->1207|3161->1373|3210->1391|3251->1404|3309->1435|3329->1446|3395->1491|3453->1518|3485->1523
                  LINES: 24->1|25->3|26->4|27->5|32->6|37->6|39->8|43->12|43->12|43->12|44->13|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|59->28|59->28|59->28|60->29|60->29|60->29|65->34|65->34|65->34|68->37|69->38|70->39|71->40|71->40|71->40|72->41|73->42
                  -- GENERATED --
              */
          