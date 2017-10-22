
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
    """),format.raw/*5.37*/("""
    """),format.raw/*6.5*/("""<div class="order-ingredient-table">
        """),_display_(/*7.10*/form(CSRF(controllers.Order.routes.KitchenController.editIngredient(ingredient.getIngredientId)))/*7.107*/{_display_(Seq[Any](format.raw/*7.108*/("""
            """),format.raw/*8.13*/("""<table class="ingredient-table-wrapper">
                <tr>
                    <th>Description</th>
                    <th>Quantity</th>
                </tr>
                <tr>
                    <td>"""),_display_(/*14.26*/ingredient/*14.36*/.getDescription),format.raw/*14.51*/("""</td>
                    <td>"""),_display_(/*15.26*/ingredient/*15.36*/.getQtyOrdered),format.raw/*15.50*/("""</td>
                </tr>
                <tr>
                    <td><label id="qty">New order quantity:</label></td>
                    <td>
                        <input type="text" name="qty" title="qty" />
                    </td>
                </tr>
            </table>
            <button type="submit" name="action" value="edit">Change Quantity</button>
            <button type="submit" name="action" value="remove">Remove Order</button>
        """)))}),format.raw/*26.10*/("""
    """),format.raw/*27.5*/("""</div>
    """),format.raw/*28.15*/("""
"""),format.raw/*29.1*/("""</html>

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
<<<<<<< HEAD
                  DATE: Sun Oct 22 22:44:13 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Kitchen/orderIngredient.scala.html
                  HASH: ab7b3628dcf4db9b4f71c9c910f08e03c65ba1fa
                  MATRIX: 659->1|693->29|1042->61|1161->85|1188->86|1225->98|1331->195|1370->196|1405->205|1584->357|1603->367|1639->382|1693->409|1712->419|1747->433|2160->816|2188->817
                  LINES: 24->1|25->2|30->3|35->3|36->4|37->5|37->5|37->5|38->6|44->12|44->12|44->12|45->13|45->13|45->13|54->22|55->23
=======
                  DATE: Sun Oct 22 12:05:34 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Kitchen/orderIngredient.scala.html
                  HASH: 368d6606b5669596c24ddc36829b48778b57d967
                  MATRIX: 659->1|693->29|1042->61|1161->85|1188->86|1226->129|1257->134|1329->180|1435->277|1474->278|1514->291|1750->500|1769->510|1805->525|1863->556|1882->566|1917->580|2413->1045|2445->1050|2484->1071|2512->1072
                  LINES: 24->1|25->2|30->3|35->3|36->4|37->5|38->6|39->7|39->7|39->7|40->8|46->14|46->14|46->14|47->15|47->15|47->15|58->26|59->27|60->28|61->29
>>>>>>> master
                  -- GENERATED --
              */
          