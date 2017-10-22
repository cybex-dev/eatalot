
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
/*4.2*/import models.Order.CustomerOrder

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
        """),format.raw/*11.9*/("""<table class="ingredient-table-wrapper">
            <tr>
                <th>Order Number</th>
                <th>Status</th>
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
                  DATE: Sun Oct 22 12:05:34 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Kitchen/orders.scala.html
                  HASH: 9adafcd660cf7f602ccbb25c1a6d1f7e32e61d34
                  MATRIX: 659->1|688->25|722->53|1074->88|1196->115|1224->117|1261->129|1285->145|1323->146|1358->155|1400->179|1413->183|1452->184|1488->193|1674->352|1719->381|1758->382|1803->400|1919->506|1960->508|2009->529|2070->563|2083->567|2122->585|2184->620|2197->624|2237->643|2410->785|2455->799|2491->808|2535->822|2563->823
                  LINES: 24->1|25->3|26->4|31->5|36->5|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|54->23|55->24|56->25|57->26|58->27
                  -- GENERATED --
              */
          