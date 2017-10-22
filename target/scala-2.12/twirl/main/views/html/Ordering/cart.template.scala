
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
    <body>
        """),format.raw/*12.55*/("""
        """),_display_(/*13.10*/if(meals != null && meals.size() == 0)/*13.48*/{_display_(Seq[Any](format.raw/*13.49*/("""
            """),format.raw/*14.13*/("""<p><i>dust</i></p>
        """)))}/*15.10*/else/*15.14*/{_display_(Seq[Any](format.raw/*15.15*/("""
            """),format.raw/*16.13*/("""<table>
            """),_display_(/*17.14*/for(x <- 0 until meals.size()) yield /*17.44*/ {_display_(Seq[Any](format.raw/*17.46*/("""
                """),_display_(/*18.18*/form(CSRF(controllers.Order.routes.OrderController.removeMealFromOrder(meals.get(x).getObject1.getMealId)))/*18.125*/ {_display_(Seq[Any](format.raw/*18.127*/("""
                    """),format.raw/*19.21*/("""<tr>
                        <td>Meal</td>
                        <td>Price</td>
                        <td>Status</td>
                    </tr>
                    <tr>
                        <td>"""),_display_(/*25.30*/meals/*25.35*/.get(x).getObject2.getDescription),format.raw/*25.68*/("""</td>
                        <td>"""),_display_(/*26.30*/meals/*26.35*/.get(x).getObject2.getCost),format.raw/*26.61*/("""</td>
                        <td>$$Status</td>
                    </tr>
                    <tr>
                        <td><img class="image" src=""""),_display_(/*30.54*/routes/*30.60*/.Assets.versioned("images/menu/" + meals.get(x).getObject2.getImage)),format.raw/*30.128*/(""""/></td>
                        <td>Quantity: """),_display_(/*31.40*/meals/*31.45*/.get(x).getObject1.getOrderQty),format.raw/*31.75*/("""</td>
                        <td><button type="submit" name="action" value="remove">Remove Meal</button></td>
                    </tr>
                """)))}),format.raw/*34.18*/("""
            """)))}),format.raw/*35.14*/("""
            """),format.raw/*36.13*/("""</table>
            <a href=""""),_display_(/*37.23*/controllers/*37.34*/.Order.routes.OrderController.getSubmitPage()),format.raw/*37.79*/("""">Submit Cart</a>
        """)))}),format.raw/*38.10*/("""
    """),format.raw/*39.5*/("""</body>
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
<<<<<<< HEAD
                  DATE: Sun Oct 22 22:44:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Ordering/cart.scala.html
                  HASH: 1a56d34695b5fcabbc80d4a7437d07bc95c2bbfe
                  MATRIX: 660->1|684->20|707->37|767->91|1130->112|1288->175|1316->177|1387->221|1407->232|1436->240|1468->245|1523->318|1560->328|1607->366|1646->367|1687->380|1734->408|1747->412|1786->413|1827->426|1879->451|1925->481|1965->483|2014->505|2131->612|2172->614|2225->639|2478->865|2492->870|2546->903|2612->942|2626->947|2673->973|2899->1172|2913->1177|2964->1207|3161->1373|3210->1391|3251->1404|3309->1435|3329->1446|3395->1491|3453->1518|3485->1523
                  LINES: 24->1|25->3|26->4|27->5|32->6|37->6|39->8|43->12|43->12|43->12|44->13|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|59->28|59->28|59->28|60->29|60->29|60->29|65->34|65->34|65->34|68->37|69->38|70->39|71->40|71->40|71->40|72->41|73->42
=======
                  DATE: Sun Oct 22 12:05:34 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Ordering/cart.scala.html
                  HASH: c7be1288763cba73faaf72cfa8479dc35337c2ec
                  MATRIX: 660->1|684->20|707->37|767->91|1130->112|1288->175|1316->177|1387->266|1424->276|1471->314|1510->315|1551->328|1598->356|1611->360|1650->361|1691->374|1739->395|1785->425|1825->427|1870->445|1987->552|2028->554|2077->575|2306->777|2320->782|2374->815|2436->850|2450->855|2497->881|2676->1033|2691->1039|2781->1107|2856->1155|2870->1160|2921->1190|3106->1344|3151->1358|3192->1371|3250->1402|3270->1413|3336->1458|3394->1485|3426->1490
                  LINES: 24->1|25->3|26->4|27->5|32->6|37->6|39->8|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|56->25|56->25|56->25|57->26|57->26|57->26|61->30|61->30|61->30|62->31|62->31|62->31|65->34|66->35|67->36|68->37|68->37|68->37|69->38|70->39
>>>>>>> master
                  -- GENERATED --
              */
          