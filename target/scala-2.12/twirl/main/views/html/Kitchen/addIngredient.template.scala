
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

object addIngredient extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Ingredient],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(ingredientForm: Form[Ingredient]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.36*/("""
"""),format.raw/*4.1*/("""<html>

    """),format.raw/*6.37*/("""
    """),_display_(/*7.6*/form(CSRF(controllers.Order.routes.KitchenController.addIngredient()))/*7.76*/{_display_(Seq[Any](format.raw/*7.77*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(ingredientForm("description"),
            '_name -> "Ingredient Description",
            '_class -> "text-field")),format.raw/*10.37*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(ingredientForm("qtyOrdered"),
            '_name -> "Quantity",
            '_class -> "text-field")),format.raw/*13.37*/("""
        """),format.raw/*14.9*/("""<input type="submit" value="Add Ingredient"/>
    """)))}),format.raw/*15.6*/("""
    """),format.raw/*16.15*/("""
"""),format.raw/*17.1*/("""</html>"""))
      }
    }
  }

  def render(ingredientForm:Form[Ingredient]): play.twirl.api.HtmlFormat.Appendable = apply(ingredientForm)

  def f:((Form[Ingredient]) => play.twirl.api.HtmlFormat.Appendable) = (ingredientForm) => apply(ingredientForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 12:05:34 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Kitchen/addIngredient.scala.html
                  HASH: 80fdc3bd8b3f837f826b53a8001593291b52dfdc
                  MATRIX: 659->1|693->29|1046->61|1175->95|1202->96|1241->140|1272->146|1350->216|1388->217|1424->227|1438->233|1585->359|1622->369|1637->375|1769->486|1805->495|1886->546|1919->561|1947->562
                  LINES: 24->1|25->2|30->3|35->3|36->4|38->6|39->7|39->7|39->7|40->8|40->8|42->10|43->11|43->11|45->13|46->14|47->15|48->16|49->17
                  -- GENERATED --
              */
          