
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
    """),_display_(/*5.6*/form(CSRF(controllers.Order.routes.KitchenController.addIngredient()))/*5.76*/{_display_(Seq[Any](format.raw/*5.77*/("""
        """),_display_(/*6.10*/helper/*6.16*/.inputText(ingredientForm("description"),
            '_name -> "Ingredient Description",
            '_class -> "text-field")),format.raw/*8.37*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(ingredientForm("qtyOrdered"),
            '_name -> "Quantity (Optional)",
            '_class -> "text-field")),format.raw/*11.37*/("""
        """),format.raw/*12.9*/("""<input type="submit" value="Add Ingredient"/>
    """)))}),format.raw/*13.6*/("""
"""),format.raw/*14.1*/("""</html>"""))
      }
    }
  }

  def render(ingredientForm:Form[Ingredient]): play.twirl.api.HtmlFormat.Appendable = apply(ingredientForm)

  def f:((Form[Ingredient]) => play.twirl.api.HtmlFormat.Appendable) = (ingredientForm) => apply(ingredientForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 09:12:57 SAST 2017
                  SOURCE: /home/cybex/Projects/eatalot-temp/app/views/Kitchen/addIngredient.scala.html
                  HASH: 2ac663478786a83c473ab4019601151d9da237fb
                  MATRIX: 659->1|693->29|1046->61|1175->95|1202->96|1239->108|1317->178|1355->179|1391->189|1405->195|1551->321|1587->331|1601->337|1744->459|1780->468|1861->519|1889->520
                  LINES: 24->1|25->2|30->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|40->8|41->9|41->9|43->11|44->12|45->13|46->14
                  -- GENERATED --
              */
          