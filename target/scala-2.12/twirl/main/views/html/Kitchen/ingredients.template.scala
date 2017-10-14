
package views.html.Kitchen

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
/*1.2*/import java.util.List
/*2.2*/import models.Order.Ingredient
/*3.2*/import helper.CSRF
/*4.2*/import helper.form

object ingredients extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Ingredient],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(list: List[Ingredient]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.26*/("""

"""),format.raw/*7.1*/("""<html>
    """),_display_(/*8.6*/if(list.size() == 0)/*8.26*/{_display_(Seq[Any](format.raw/*8.27*/("""
        """),format.raw/*9.9*/("""<p><i>dust</i></p>
    """)))}/*10.6*/else/*10.10*/{_display_(Seq[Any](format.raw/*10.11*/("""
        """),format.raw/*11.9*/("""<table>
            <tr>
                <td>Description</td>
                <td>Quantity Ordered</td>
            </tr>
            """),_display_(/*16.14*/for(x <- 0 until list.size()) yield /*16.43*/{_display_(Seq[Any](format.raw/*16.44*/("""
                """),_display_(/*17.18*/form(CSRF(controllers.Order.routes.KitchenController.getIngredientOrderPage(list.get(x).getIngredientId)))/*17.124*/ {_display_(Seq[Any](format.raw/*17.126*/("""
                    """),format.raw/*18.21*/("""<tr>
                        <td>"""),_display_(/*19.30*/list/*19.34*/.get(x).getDescription),format.raw/*19.56*/("""</td>
                        <td>"""),_display_(/*20.30*/list/*20.34*/.get(x).getQtyOrdered),format.raw/*20.55*/("""</td>
                        <td><button type="submit" name="action" value="order">Order</button></td>
                    </tr>
                """)))}),format.raw/*23.18*/("""
            """)))}),format.raw/*24.14*/("""
        """),format.raw/*25.9*/("""</table>
    """)))}),format.raw/*26.6*/("""
    """),format.raw/*27.5*/("""<table>
        <tr>
            <td>
                <a href=""""),_display_(/*30.27*/controllers/*30.38*/.Order.routes.KitchenController.getNewIngredientPage),format.raw/*30.90*/("""">New Ingredient</a>
            </td>
        </tr>
    </table>
</html>"""))
      }
    }
  }

  def render(list:List[Ingredient]): play.twirl.api.HtmlFormat.Appendable = apply(list)

  def f:((List[Ingredient]) => play.twirl.api.HtmlFormat.Appendable) = (list) => apply(list)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 07 11:30:32 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/app/views/Kitchen/ingredients.scala.html
                  HASH: c74aea567d45fa9397ad265885eaea4fe46c31f3
                  MATRIX: 659->1|688->24|726->56|752->76|1091->96|1210->120|1238->122|1275->134|1303->154|1341->155|1376->164|1418->188|1431->192|1470->193|1506->202|1668->337|1713->366|1752->367|1797->385|1913->491|1954->493|2003->514|2064->548|2077->552|2120->574|2182->609|2195->613|2237->634|2415->781|2460->795|2496->804|2540->818|2572->823|2663->887|2683->898|2756->950
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|48->16|48->16|48->16|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|52->20|52->20|55->23|56->24|57->25|58->26|59->27|62->30|62->30|62->30
                  -- GENERATED --
              */
          