
package views.html.User.Staff

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

object kitchenHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/bodyContent/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<h1>Kitchen Page</h1>
""")))};
Seq[Any](format.raw/*3.4*/("""

"""),format.raw/*7.2*/("""

"""),_display_(/*9.2*/masterpage/*9.12*/.apply(" :: Kitchen", bodyContent)),format.raw/*9.46*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 07 12:53:16 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/app/views/User/Staff/kitchenHome.scala.html
                  HASH: 9be8cc69e96b37fdbc6c1a1ca436f4294f86a471
                  MATRIX: 662->1|1008->46|1088->51|1107->62|1187->66|1218->71|1279->48|1307->94|1335->97|1353->107|1407->141
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|38->3|40->7|42->9|42->9|42->9
                  -- GENERATED --
              */
          