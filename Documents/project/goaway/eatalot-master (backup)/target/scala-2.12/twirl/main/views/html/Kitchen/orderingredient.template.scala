
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
/*1.2*/import models.Order.Ingredient
/*2.2*/import helper.form
/*3.2*/import helper.CSRF
/*4.2*/import helper.textarea

object orderingredient extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Ingredient,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(ingredient: Ingredient):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.26*/("""
"""),format.raw/*6.1*/("""<html>
    """),_display_(/*7.6*/form(CSRF(controllers.Order.routes.KitchenController.editIngredient(ingredient.getIngredientId)))/*7.103*/{_display_(Seq[Any](format.raw/*7.104*/("""
        """),format.raw/*8.9*/("""<table>
            <tr>
                <td>Description</td>
                <td>Quantity</td>
            </tr>
            <tr>
                <td>"""),_display_(/*14.22*/ingredient/*14.32*/.getDescription),format.raw/*14.47*/("""</td>
                <td>"""),_display_(/*15.22*/ingredient/*15.32*/.getQtyOrdered),format.raw/*15.46*/("""</td>
            </tr>
            <tr>
                <td><label id="qty">New order quantity:</label></td>
                <td><textarea name="qty" title="qty"></textarea></td>
            </tr>
        </table>
        <button type="submit" name="action" value="edit">Change Quantity</button>
        <button type="submit" name="action" value="remove">Remove Order</button>
    """)))}),format.raw/*24.6*/("""
"""),format.raw/*25.1*/("""</html>

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
                  DATE: Mon Oct 02 16:52:54 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master/app/views/Kitchen/orderIngredient.scala.html
                  HASH: 63b66d1176b8ea6c6c44b1b742b0eb619bb9eca7
                  MATRIX: 659->1|697->33|723->53|749->73|1090->97|1209->121|1236->122|1273->134|1379->231|1418->232|1453->241|1632->393|1651->403|1687->418|1741->445|1760->455|1795->469|2208->852|2236->853
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|38->6|39->7|39->7|39->7|40->8|46->14|46->14|46->14|47->15|47->15|47->15|56->24|57->25
                  -- GENERATED --
              */
          