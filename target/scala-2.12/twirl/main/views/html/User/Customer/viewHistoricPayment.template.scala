
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
/*1.2*/import Global.Static.masterpage
/*2.2*/import helper.CSRF
/*3.2*/import models.Finance.PaymentItemDetail

object viewHistoricPayment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[PaymentItemDetail,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(paymentDetails: PaymentItemDetail):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.2*/bodyContent/*7.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.17*/("""
    """),format.raw/*8.5*/("""<h1>Payment details</h1>
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
            <label>"""),_display_(/*19.21*/paymentDetails/*19.35*/.paymentId),format.raw/*19.45*/("""</label>
            <label>"""),_display_(/*20.21*/String/*20.27*/.valueOf(paymentDetails.amount)),format.raw/*20.58*/("""</label>
            <label>"""),_display_(/*21.21*/if(paymentDetails.isCash)/*21.46*/{_display_(Seq[Any](format.raw/*21.47*/(""""Yes"""")))}/*21.53*/else/*21.57*/{_display_(Seq[Any](format.raw/*21.58*/(""""No"""")))}),format.raw/*21.63*/("""</label>
            <label>"""),_display_(/*22.21*/paymentDetails/*22.35*/.deliveryStaffName),format.raw/*22.53*/("""</label>
            <label><a href=""""),_display_(/*23.30*/controllers/*23.41*/.User.routes.CustomerController.viewOrder(paymentDetails.orderId)),format.raw/*23.106*/("""">"#"""),_display_(/*23.111*/paymentDetails/*23.125*/.orderId),format.raw/*23.133*/(""""</a></label>
        </div>
    </div>
    <br/>
    """),_display_(/*27.6*/helper/*27.12*/.form( action = controllers.User.routes.CustomerController.index())/*27.79*/{_display_(Seq[Any](format.raw/*27.80*/("""
        """),_display_(/*28.10*/CSRF/*28.14*/.formField),format.raw/*28.24*/("""
        """),format.raw/*29.9*/("""<input class="btn btn-info" type="submit" name="Home">
    """)))}),format.raw/*30.6*/("""
""")))};
Seq[Any](format.raw/*5.37*/("""

"""),format.raw/*31.2*/("""

    """),_display_(/*33.6*/masterpage/*33.16*/.apply(" :: Payment", bodyContent)))
      }
    }
  }

  def render(paymentDetails:PaymentItemDetail): play.twirl.api.HtmlFormat.Appendable = apply(paymentDetails)

  def f:((PaymentItemDetail) => play.twirl.api.HtmlFormat.Appendable) = (paymentDetails) => apply(paymentDetails)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Sun Oct 22 22:44:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/viewHistoricPayment.scala.html
=======
                  DATE: Sun Oct 22 11:23:03 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/User/Customer/viewHistoricPayment.scala.html
>>>>>>> master
                  HASH: a31c96f9ba5a2a4a61c24cfd0ad94224e4116b21
                  MATRIX: 665->1|704->34|730->54|1099->96|1212->134|1231->145|1311->149|1342->154|1758->543|1781->557|1812->567|1868->596|1883->602|1935->633|1991->662|2025->687|2064->688|2089->694|2102->698|2141->699|2177->704|2233->733|2256->747|2295->765|2360->803|2380->814|2467->879|2500->884|2524->898|2554->906|2635->961|2650->967|2726->1034|2765->1035|2802->1045|2815->1049|2846->1059|2882->1068|2972->1128|3013->131|3042->1130|3075->1137|3094->1147
                  LINES: 24->1|25->2|26->3|31->5|35->7|35->7|37->7|38->8|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|51->21|51->21|51->21|51->21|52->22|52->22|52->22|53->23|53->23|53->23|53->23|53->23|53->23|57->27|57->27|57->27|57->27|58->28|58->28|58->28|59->29|60->30|62->5|64->31|66->33|66->33
                  -- GENERATED --
              */
          