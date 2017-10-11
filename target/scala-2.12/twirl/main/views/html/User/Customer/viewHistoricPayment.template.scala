
package views.html.User.Customer

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
/*1.2*/import models.Finance.PaymentItemDetail
/*2.2*/import Global.Static.masterpage
/*3.2*/import helper.CSRF
/*4.2*/import helper.form

object viewHistoricPayment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[PaymentItemDetail,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(paymentDetails: PaymentItemDetail):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""<h1>Payment details</h1>
    <br/>
    <div class="split-pane">
        <div class="left container input-container">
            <label># Payment</label>
            <label>Amount</label>
            <label>Cash Payment</label>
            <label>Deliverer</label>
            <label># Order</label>
        </div>
        <div class="right container input-container">
            <label>"""),_display_(/*20.21*/paymentDetails/*20.35*/.paymentId),format.raw/*20.45*/("""</label>
            <label>"""),_display_(/*21.21*/String/*21.27*/.valueOf(paymentDetails.amount)),format.raw/*21.58*/("""</label>
            <label>"""),_display_(/*22.21*/if(paymentDetails.isCash)/*22.46*/{_display_(Seq[Any](format.raw/*22.47*/(""""Yes"""")))}/*22.53*/else/*22.57*/{_display_(Seq[Any](format.raw/*22.58*/(""""No"""")))}),format.raw/*22.63*/("""</label>
            <label>"""),_display_(/*23.21*/paymentDetails/*23.35*/.deliveryStaffName),format.raw/*23.53*/("""</label>
            <label><a href=""""),_display_(/*24.30*/controllers/*24.41*/.User.routes.CustomerController.viewOrder(paymentDetails.orderId)),format.raw/*24.106*/("""">"#"""),_display_(/*24.111*/paymentDetails/*24.125*/.orderId),format.raw/*24.133*/(""""</a></label>
        </div>
    </div>
    <br/>
    """),_display_(/*28.6*/helper/*28.12*/.form( action = controllers.User.routes.CustomerController.index())/*28.79*/{_display_(Seq[Any](format.raw/*28.80*/("""
        """),_display_(/*29.10*/CSRF/*29.14*/.formField),format.raw/*29.24*/("""
        """),format.raw/*30.9*/("""<input class="btn btn-info" type="submit" name="Home">
    """)))}),format.raw/*31.6*/("""
""")))};
Seq[Any](format.raw/*6.37*/("""

"""),format.raw/*32.2*/("""

    """),_display_(/*34.6*/masterpage/*34.16*/.apply(" :: Payment", bodyContent)))
      }
    }
  }

  def render(paymentDetails:PaymentItemDetail): play.twirl.api.HtmlFormat.Appendable = apply(paymentDetails)

  def f:((PaymentItemDetail) => play.twirl.api.HtmlFormat.Appendable) = (paymentDetails) => apply(paymentDetails)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 11 22:25:23 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/viewHistoricPayment.scala.html
                  HASH: 9e0692f2b5d65253078d869ffd775b3e745ca7d4
                  MATRIX: 665->1|712->42|751->75|777->95|1125->116|1238->154|1257->165|1337->169|1368->174|1784->563|1807->577|1838->587|1894->616|1909->622|1961->653|2017->682|2051->707|2090->708|2115->714|2128->718|2167->719|2203->724|2259->753|2282->767|2321->785|2386->823|2406->834|2493->899|2526->904|2550->918|2580->926|2661->981|2676->987|2752->1054|2791->1055|2828->1065|2841->1069|2872->1079|2908->1088|2998->1148|3039->151|3068->1150|3101->1157|3120->1167
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|50->20|50->20|50->20|51->21|51->21|51->21|52->22|52->22|52->22|52->22|52->22|52->22|52->22|53->23|53->23|53->23|54->24|54->24|54->24|54->24|54->24|54->24|58->28|58->28|58->28|58->28|59->29|59->29|59->29|60->30|61->31|63->6|65->32|67->34|67->34
                  -- GENERATED --
              */
          