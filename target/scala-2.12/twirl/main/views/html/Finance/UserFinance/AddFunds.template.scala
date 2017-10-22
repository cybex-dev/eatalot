
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
  def apply/*6.2*/(userFunds: Form[UserFunds]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""<div class="row-width-center">
        <h1>Add funds</h1>
        <br/>
        <p>Note: we only support redeeming vouchers bought at select stores, in future further methods will be added</p>
        <br/>
        <br/>
        """),_display_(/*15.10*/helper/*15.16*/.form(action = controllers.Finance.routes.UserFinanceController.doAddFunds(), 'class -> "body")/*15.111*/ {_display_(Seq[Any](format.raw/*15.113*/("""
            """),_display_(/*16.14*/CSRF/*16.18*/.formField),format.raw/*16.28*/("""
            """),_display_(/*17.14*/helper/*17.20*/.inputText(userFunds("voucherCode"), '_name -> "Voucher Code")),format.raw/*17.82*/("""
            """),format.raw/*18.13*/("""<br/>
            <input type="submit" class="btn btn-success" value="Redeem">
            """)))}),format.raw/*20.14*/("""
    """),format.raw/*21.5*/("""</div>
""")))};
Seq[Any](format.raw/*6.30*/("""

"""),format.raw/*22.2*/("""

"""),_display_(/*24.2*/masterpage(" :: Add Funds", bodyContent)))
      }
    }
  }

  def render(userFunds:Form[UserFunds]): play.twirl.api.HtmlFormat.Appendable = apply(userFunds)

  def f:((Form[UserFunds]) => play.twirl.api.HtmlFormat.Appendable) = (userFunds) => apply(userFunds)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Sun Oct 22 22:44:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Finance/UserFinance/AddFunds.scala.html
=======
                  DATE: Sun Oct 22 11:23:04 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Finance/UserFinance/AddFunds.scala.html
>>>>>>> master
                  HASH: 7c551011b6876ff311c178a0dc32a0307ac9471e
                  MATRIX: 671->1|694->18|733->51|762->74|1121->119|1227->150|1246->161|1326->165|1357->170|1614->400|1629->406|1734->501|1775->503|1816->517|1829->521|1860->531|1901->545|1916->551|1999->613|2040->626|2163->718|2195->723|2242->147|2271->731|2300->734
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|45->15|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|50->20|51->21|53->6|55->22|57->24
                  -- GENERATED --
              */
          