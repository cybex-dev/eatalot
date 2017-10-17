
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
/*3.2*/import helper.{CSRF, form}
/*4.2*/import models.Order.Ingredient

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
                  DATE: Wed Oct 18 00:03:04 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Kitchen/ingredients.scala.html
                  HASH: 6de887c4fa10ce02d2e8dd5d674027244eab03ed
                  MATRIX: 659->1|688->25|722->53|1073->85|1192->109|1220->111|1257->123|1285->143|1323->144|1358->153|1400->177|1413->181|1452->182|1488->191|1650->326|1695->355|1734->356|1779->374|1895->480|1936->482|1985->503|2046->537|2059->541|2102->563|2164->598|2177->602|2219->623|2397->770|2442->784|2478->793|2522->807|2554->812|2645->876|2665->887|2738->939
                  LINES: 24->1|25->3|26->4|31->5|36->5|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|54->23|55->24|56->25|57->26|58->27|61->30|61->30|61->30
                  -- GENERATED --
              */
          