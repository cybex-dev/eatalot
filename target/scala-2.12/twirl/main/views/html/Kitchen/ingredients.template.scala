
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

    """),_display_(/*9.6*/if(list.size() == 0)/*9.26*/{_display_(Seq[Any](format.raw/*9.27*/("""
        """),format.raw/*10.9*/("""<p><i>dust</i></p>
    """)))}/*11.6*/else/*11.10*/{_display_(Seq[Any](format.raw/*11.11*/("""
        """),format.raw/*12.41*/("""
        """),format.raw/*13.9*/("""<table class="ingredient-table-wrapper">
            <tr>
                <th>Description</th>
                <th>Quantity Ordered</th>
            </tr>
            """),_display_(/*18.14*/for(x <- 0 until list.size()) yield /*18.43*/{_display_(Seq[Any](format.raw/*18.44*/("""
                """),_display_(/*19.18*/form(CSRF(controllers.Order.routes.KitchenController.getIngredientOrderPage(list.get(x).getIngredientId)))/*19.124*/ {_display_(Seq[Any](format.raw/*19.126*/("""
                    """),format.raw/*20.21*/("""<tr>
                        <td>"""),_display_(/*21.30*/list/*21.34*/.get(x).getDescription),format.raw/*21.56*/("""</td>
                        <td>"""),_display_(/*22.30*/list/*22.34*/.get(x).getQtyOrdered),format.raw/*22.55*/("""</td>
                        <td><button type="submit" name="action" value="order">Order</button></td>
                    </tr>
                """)))}),format.raw/*25.18*/("""
            """)))}),format.raw/*26.14*/("""
        """),format.raw/*27.9*/("""</table>
        """),format.raw/*28.19*/("""
    """)))}),format.raw/*29.6*/("""

    """),format.raw/*31.37*/("""
    """),format.raw/*32.5*/("""<table>
        <tr>
            <td>
                <a href=""""),_display_(/*35.27*/controllers/*35.38*/.Order.routes.KitchenController.getNewIngredientPage),format.raw/*35.90*/("""">New Ingredient</a>
            </td>
        </tr>
    </table>
    """),format.raw/*39.15*/("""
"""),format.raw/*40.1*/("""</html>"""))
      }
    }
  }

  def render(list:List[Ingredient]): play.twirl.api.HtmlFormat.Appendable = apply(list)

  def f:((List[Ingredient]) => play.twirl.api.HtmlFormat.Appendable) = (list) => apply(list)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 12:05:34 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Kitchen/ingredients.scala.html
                  HASH: f3b04673a7d6afa0c763c4b7c4ebd5cd290b6d06
                  MATRIX: 659->1|688->25|722->53|1073->85|1192->109|1220->111|1258->124|1286->144|1324->145|1360->154|1402->178|1415->182|1454->183|1491->224|1527->233|1722->401|1767->430|1806->431|1851->449|1967->555|2008->557|2057->578|2118->612|2131->616|2174->638|2236->673|2249->677|2291->698|2469->845|2514->859|2550->868|2595->895|2631->901|2665->939|2697->944|2788->1008|2808->1019|2881->1071|2979->1151|3007->1152
                  LINES: 24->1|25->3|26->4|31->5|36->5|38->7|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|49->18|49->18|49->18|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|56->25|57->26|58->27|59->28|60->29|62->31|63->32|66->35|66->35|66->35|70->39|71->40
                  -- GENERATED --
              */
          