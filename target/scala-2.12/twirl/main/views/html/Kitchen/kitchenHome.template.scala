
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

object kitchenHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""


"""),format.raw/*4.1*/("""<html>
    <table>
        <tr>
            <td>
                <a href=""""),_display_(/*8.27*/controllers/*8.38*/.Order.routes.KitchenController.getIngredientPage()),format.raw/*8.89*/("""">Ingredients</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href=""""),_display_(/*13.27*/controllers/*13.38*/.Order.routes.KitchenController.getOrderPage()),format.raw/*13.84*/("""">All Customer Orders</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href=""""),_display_(/*18.27*/controllers/*18.38*/.Order.routes.KitchenController.getPendingOrderPage()),format.raw/*18.91*/("""">Pending Orders</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href=""""),_display_(/*23.27*/controllers/*23.38*/.Order.routes.KitchenController.getProcessingOrderPage()),format.raw/*23.94*/("""">Processing Orders</a>
            </td>
        </tr>
    </table>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 07 11:30:32 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/app/views/Kitchen/kitchenHome.scala.html
                  HASH: e71c552057467942561328f3be66639be9effaa8
                  MATRIX: 955->1|1051->3|1080->6|1181->81|1200->92|1271->143|1404->249|1424->260|1491->306|1632->420|1652->431|1726->484|1862->593|1882->604|1959->660
                  LINES: 28->1|33->1|36->4|40->8|40->8|40->8|45->13|45->13|45->13|50->18|50->18|50->18|55->23|55->23|55->23
                  -- GENERATED --
              */
          