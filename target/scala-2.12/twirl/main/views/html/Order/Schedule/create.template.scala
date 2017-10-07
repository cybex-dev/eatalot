
package views.html.Order.Schedule

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
/*1.2*/import models.Order.OrderSchedule
/*2.2*/import Global.Static.masterpage
/*3.2*/import play.data.Form

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[OrderSchedule],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(scheduleForm: Form[OrderSchedule]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.2*/bodyContent/*7.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.17*/("""
    """),format.raw/*8.5*/("""<h1>Create order schedule</h1>
    <br/>
"""),_display_(/*10.2*/helper/*10.8*/.form( action = controllers.Order.routes.ScheduleController.doCreateSchedule())/*10.87*/{_display_(Seq[Any](format.raw/*10.88*/("""
    """),_display_(/*11.6*/helper/*11.12*/.inputText(scheduleForm("title"), '_name -> "Schedule Name")),format.raw/*11.72*/("""
    """),format.raw/*12.5*/("""<div class="container input-container">
        <input class="btn btn-success button-padding" type="button" value="Create Schedule">
    </div>
""")))}),format.raw/*15.2*/("""
""")))};
Seq[Any](format.raw/*5.37*/("""

"""),format.raw/*16.2*/("""

"""),_display_(/*18.2*/masterpage/*18.12*/.apply(" :: Create Schedule", bodyContent)),format.raw/*18.54*/("""



"""))
      }
    }
  }

  def render(scheduleForm:Form[OrderSchedule]): play.twirl.api.HtmlFormat.Appendable = apply(scheduleForm)

  def f:((Form[OrderSchedule]) => play.twirl.api.HtmlFormat.Appendable) = (scheduleForm) => apply(scheduleForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Oct 06 21:04:37 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Order/Schedule/create.scala.html
                  HASH: f87d7347387b3f9e25cdfe410888df228432b64f
                  MATRIX: 666->1|707->36|746->69|1086->93|1199->131|1218->142|1298->146|1329->151|1397->193|1411->199|1499->278|1538->279|1570->285|1585->291|1666->351|1698->356|1873->501|1914->128|1943->503|1972->506|1991->516|2054->558
                  LINES: 24->1|25->2|26->3|31->5|35->7|35->7|37->7|38->8|40->10|40->10|40->10|40->10|41->11|41->11|41->11|42->12|45->15|47->5|49->16|51->18|51->18|51->18
                  -- GENERATED --
              */
          