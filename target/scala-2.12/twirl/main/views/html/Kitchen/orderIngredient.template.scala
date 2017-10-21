
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
/*1.2*/import helper.{CSRF, form}
/*2.2*/import models.Order.Ingredient

object orderIngredient extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Ingredient,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(ingredient: Ingredient):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.26*/("""
"""),format.raw/*4.1*/("""<html>
    """),_display_(/*5.6*/form(CSRF(controllers.Order.routes.KitchenController.editIngredient(ingredient.getIngredientId)))/*5.103*/{_display_(Seq[Any](format.raw/*5.104*/("""
        """),format.raw/*6.9*/("""<table>
            <tr>
                <td>Description</td>
                <td>Quantity</td>
            </tr>
            <tr>
                <td>"""),_display_(/*12.22*/ingredient/*12.32*/.getDescription),format.raw/*12.47*/("""</td>
                <td>"""),_display_(/*13.22*/ingredient/*13.32*/.getQtyOrdered),format.raw/*13.46*/("""</td>
            </tr>
            <tr>
                <td><label id="qty">New order quantity:</label></td>
                <td><textarea name="qty" title="qty"></textarea></td>
            </tr>
        </table>
        <button type="submit" name="action" value="edit">Change Quantity</button>
        <button type="submit" name="action" value="remove">Remove Order</button>
    """)))}),format.raw/*22.6*/("""
"""),format.raw/*23.1*/("""</html>

"""))
      }
    }
  }

  def render(ingredient:Ingredient): play.twirl.api.HtmlFormat.Appendable = apply(ingredient)

  def f:((Ingredient) => play.twirl.api.HtmlFormat.Appendable) = (ingredient) => apply(ingredient)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 11:02:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Kitchen/orderIngredient.scala.html
                  HASH: ab7b3628dcf4db9b4f71c9c910f08e03c65ba1fa
                  MATRIX: 659->1|693->29|1042->61|1161->85|1188->86|1225->98|1331->195|1370->196|1405->205|1584->357|1603->367|1639->382|1693->409|1712->419|1747->433|2160->816|2188->817
                  LINES: 24->1|25->2|30->3|35->3|36->4|37->5|37->5|37->5|38->6|44->12|44->12|44->12|45->13|45->13|45->13|54->22|55->23
                  -- GENERATED --
              */
          