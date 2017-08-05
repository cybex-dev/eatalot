
package views.html.User.Account

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
/*1.2*/import Global.Static.essentials
/*2.2*/import controllers.Application.AppTags
/*3.2*/import java.lang.String
/*4.2*/import Global.Html5._

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Object,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(pageTitle: String, obj: Object):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/htmlNav/*8.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.13*/("""

""")))};def /*12.2*/htmlBody/*12.10*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.14*/("""
	"""),format.raw/*13.2*/("""clazz : String = "menu-item"
	aside(clazz)"""),format.raw/*14.14*/("""{"""),format.raw/*14.15*/("""
		"""),format.raw/*15.3*/("""<a href="#">Basic Information</a>
		<a href="#">Edit Address</a>
		<a href="#">Change Password</a>
	"""),format.raw/*18.2*/("""}"""),format.raw/*18.3*/("""
""")))};
Seq[Any](format.raw/*6.34*/("""

"""),format.raw/*10.2*/("""

"""),format.raw/*19.2*/("""

"""),_display_(/*21.2*/essentials(pageTitle)/*21.23*/(htmlNav)/*21.32*/(htmlBody)),format.raw/*21.42*/("""
"""))
      }
    }
  }

  def render(pageTitle:String,obj:Object): play.twirl.api.HtmlFormat.Appendable = apply(pageTitle,obj)

  def f:((String,Object) => play.twirl.api.HtmlFormat.Appendable) = (pageTitle,obj) => apply(pageTitle,obj)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Aug 05 21:32:53 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Account/edit.scala.html
                  HASH: 15aad0764fc32d22730b6935e70e6fa415923fb8
                  MATRIX: 664->1|703->34|749->74|780->99|1112->123|1222->158|1236->165|1316->169|1342->175|1359->183|1440->187|1469->189|1539->231|1568->232|1598->235|1725->335|1753->336|1794->155|1823->172|1852->338|1881->341|1911->362|1929->371|1960->381
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|40->12|40->12|42->12|43->13|44->14|44->14|45->15|48->18|48->18|50->6|52->10|54->19|56->21|56->21|56->21|56->21
                  -- GENERATED --
              */
          