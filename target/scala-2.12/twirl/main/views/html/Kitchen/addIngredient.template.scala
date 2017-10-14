
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
/*1.2*/import helper.form
/*2.2*/import helper.CSRF
/*3.2*/import models.Order.Ingredient

object addIngredient extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Ingredient],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(ingredientForm: Form[Ingredient]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.36*/("""
"""),format.raw/*5.1*/("""<html>
    """),_display_(/*6.6*/form(CSRF(controllers.Order.routes.KitchenController.addIngredient()))/*6.76*/{_display_(Seq[Any](format.raw/*6.77*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(ingredientForm("description"),
            '_name -> "Ingredient Description",
            '_class -> "text-field")),format.raw/*9.37*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(ingredientForm("qtyOrdered"),
            '_name -> "Quantity (Optional)",
            '_class -> "text-field")),format.raw/*12.37*/("""
        """),format.raw/*13.9*/("""<input type="submit" value="Add Ingredient"/>
    """)))}),format.raw/*14.6*/("""
"""),format.raw/*15.1*/("""</html>"""))
      }
    }
  }

  def render(ingredientForm:Form[Ingredient]): play.twirl.api.HtmlFormat.Appendable = apply(ingredientForm)

  def f:((Form[Ingredient]) => play.twirl.api.HtmlFormat.Appendable) = (ingredientForm) => apply(ingredientForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 07 11:30:32 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/app/views/Kitchen/addIngredient.scala.html
                  HASH: 37c89892aeb0076e084a2cb30d5072852e6c8b38
                  MATRIX: 659->1|685->21|711->41|1064->73|1193->107|1220->108|1257->120|1335->190|1373->191|1409->201|1423->207|1569->333|1606->343|1621->349|1764->471|1800->480|1881->531|1909->532
                  LINES: 24->1|25->2|26->3|31->4|36->4|37->5|38->6|38->6|38->6|39->7|39->7|41->9|42->10|42->10|44->12|45->13|46->14|47->15
                  -- GENERATED --
              */
          