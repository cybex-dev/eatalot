
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
/*1.2*/import views.html.Global.Static.masterpage

object verified extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/bodyContent/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<h2>Email has been verified</h2>
    <br/>
    <p>Please login to complete registration</p>
    <br/>
    <form method="get" action=""""),_display_(/*10.33*/controllers/*10.44*/.User.routes.UserController.login()),format.raw/*10.79*/("""">
        <button type="submit">Login</button>
    </form>
""")))};
Seq[Any](format.raw/*3.4*/("""

"""),format.raw/*13.2*/("""

"""),_display_(/*15.2*/masterpage/*15.12*/.apply("Verified", bodyContent)))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Sep 29 17:56:52 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master/app/views/User/Customer/verified.scala.html
                  HASH: 2f705f63e4892406e45f38daa4ee8e6771849f2d
                  MATRIX: 665->1|1008->46|1088->51|1107->62|1187->66|1218->71|1379->205|1399->216|1455->251|1554->48|1583->312|1612->315|1631->325
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|40->10|40->10|40->10|44->3|46->13|48->15|48->15
                  -- GENERATED --
              */
          