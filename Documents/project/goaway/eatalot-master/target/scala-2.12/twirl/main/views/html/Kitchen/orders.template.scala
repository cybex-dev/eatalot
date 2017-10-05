
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
/*1.2*/import models.Order.CustomerOrder
/*2.2*/import helper.form
/*3.2*/import helper.CSRF
/*4.2*/import java.util.List

object orders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[CustomerOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(list: List[CustomerOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.29*/("""

"""),format.raw/*7.1*/("""<html>
    """),_display_(/*8.6*/if(list.isEmpty)/*8.22*/{_display_(Seq[Any](format.raw/*8.23*/("""
        """),format.raw/*9.9*/("""<p><i>dust</i></p>
    """)))}/*10.6*/else/*10.10*/{_display_(Seq[Any](format.raw/*10.11*/("""
        """),format.raw/*11.9*/("""<table>
            <tr>
                <td>Order Number</td>
                <td>Status</td>
            </tr>
            """),_display_(/*16.14*/for(x <- 0 until list.size()) yield /*16.43*/{_display_(Seq[Any](format.raw/*16.44*/("""
                """),_display_(/*17.18*/form(CSRF(controllers.Order.routes.KitchenController.getMealOrderPage(list.get(x).getOrderId().toString)))/*17.124*/ {_display_(Seq[Any](format.raw/*17.126*/("""
                    """),format.raw/*18.21*/("""<tr>
                        <td>"""),_display_(/*19.30*/list/*19.34*/.get(x).getOrderId),format.raw/*19.52*/("""</td>
                        <td>"""),_display_(/*20.30*/list/*20.34*/.get(x).getStatusId),format.raw/*20.53*/("""</td>
                        <td><button type="submit" value="viewOrder">View Order</button></td>
                    </tr>
                """)))}),format.raw/*23.18*/("""
            """)))}),format.raw/*24.14*/("""
        """),format.raw/*25.9*/("""</table>
    """)))}),format.raw/*26.6*/("""
"""),format.raw/*27.1*/("""</html>"""))
      }
    }
  }

  def render(list:List[CustomerOrder]): play.twirl.api.HtmlFormat.Appendable = apply(list)

  def f:((List[CustomerOrder]) => play.twirl.api.HtmlFormat.Appendable) = (list) => apply(list)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 05 23:12:56 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master/app/views/Kitchen/orders.scala.html
                  HASH: 863c0ca4f30973b3ed7e8b4ff7fa7d43ef1c6d4a
                  MATRIX: 659->1|700->36|726->56|752->76|1092->99|1214->126|1242->128|1279->140|1303->156|1341->157|1376->166|1418->190|1431->194|1470->195|1506->204|1659->330|1704->359|1743->360|1788->378|1904->484|1945->486|1994->507|2055->541|2068->545|2107->563|2169->598|2182->602|2222->621|2395->763|2440->777|2476->786|2520->800|2548->801
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|48->16|48->16|48->16|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|52->20|52->20|55->23|56->24|57->25|58->26|59->27
                  -- GENERATED --
              */
          