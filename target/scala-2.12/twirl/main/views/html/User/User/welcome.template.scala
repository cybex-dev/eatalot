
package views.html.User.User

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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/bodyContent/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<br/>
    <br/>
    <div class="container pull-center">
        <a class="btn btn-success" href=""""),_display_(/*9.43*/controllers/*9.54*/.User.routes.UserController.login()),format.raw/*9.89*/("""">Login</a>
        <br/>
        <br/>
        <a class="btn btn-default" href=""""),_display_(/*12.43*/controllers/*12.54*/.User.routes.CustomerController.register()),format.raw/*12.96*/("""">Register</a>
    </div>
""")))};
Seq[Any](format.raw/*3.4*/("""

"""),format.raw/*14.2*/("""

"""),_display_(/*16.2*/masterpage/*16.12*/.apply(" :: Home",bodyContent)))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 11:23:03 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/User/User/welcome.scala.html
                  HASH: 7a968aad196f3c970cf566865407475c1d102ff9
                  MATRIX: 661->1|1003->46|1083->51|1102->62|1182->66|1213->71|1337->169|1356->180|1411->215|1520->297|1540->308|1603->350|1668->48|1697->377|1726->380|1745->390
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|39->9|39->9|39->9|42->12|42->12|42->12|45->3|47->14|49->16|49->16
                  -- GENERATED --
              */
          