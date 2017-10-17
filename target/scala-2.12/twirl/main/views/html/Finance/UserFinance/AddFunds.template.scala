
package views.html.Finance.UserFinance

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
/*1.2*/import helper._
/*2.2*/import models.Finance.UserFunds
/*3.2*/import play.data.Form
/*4.2*/import views.html.Global.Static.masterpage

object AddFunds extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserFunds],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userFunds : Form[UserFunds]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""<H1>Add funds</H1>
    <br/>
    <p>Note: we only support redeeming vouchers bought at select stores, in future further methods will be added</p>
    <br/>
    <br/>
    """),_display_(/*14.6*/helper/*14.12*/.form( action = controllers.Finance.routes.UserFinance.doAddFunds() , 'class -> "body")/*14.99*/{_display_(Seq[Any](format.raw/*14.100*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
        """),format.raw/*16.9*/("""<label>Voucher Code</label>"""),_display_(/*16.37*/helper/*16.43*/.inputText(userFunds("voucherValue"), '_name -> "")),format.raw/*16.94*/("""
        """),format.raw/*17.9*/("""<br/>
        <input type="submit" class="btn btn-success" value="Redeem">
    """)))}),format.raw/*19.6*/("""
""")))};
Seq[Any](format.raw/*6.31*/("""

"""),format.raw/*20.2*/("""

"""),_display_(/*22.2*/masterpage(" : Add Funds", bodyContent)))
      }
    }
  }

  def render(userFunds:Form[UserFunds]): play.twirl.api.HtmlFormat.Appendable = apply(userFunds)

  def f:((Form[UserFunds]) => play.twirl.api.HtmlFormat.Appendable) = (userFunds) => apply(userFunds)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 18 00:03:03 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Finance/UserFinance/AddFunds.scala.html
                  HASH: bacfcecb3ce963c36850292a1f4b1809788c7301
                  MATRIX: 671->1|694->18|733->51|762->74|1121->119|1228->151|1247->162|1327->166|1358->171|1555->342|1570->348|1666->435|1706->436|1743->446|1756->450|1787->460|1823->469|1878->497|1893->503|1965->554|2001->563|2111->643|2152->148|2181->645|2210->648
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|44->14|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|46->16|47->17|49->19|51->6|53->20|55->22
                  -- GENERATED --
              */
          