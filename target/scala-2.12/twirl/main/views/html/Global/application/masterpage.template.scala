
package views.html.Global.application

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

object masterpage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pageTitle: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*3.1*/("""<html xmlns="http://www.w3.org/1999/xhtml">
    """),_display_(/*4.6*/Global/*4.12*/.html5.header/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""

        """),_display_(/*6.10*/Global/*6.16*/.application.meta),format.raw/*6.33*/("""
        """),_display_(/*7.10*/Global/*7.16*/.application.stylesheets),format.raw/*7.40*/("""

        """),_display_(/*9.10*/Global/*9.16*/.html5.title/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
            """),format.raw/*10.13*/(""""Eatalot """),_display_(/*10.23*/pageTitle),format.raw/*10.32*/(""""
        """)))}),format.raw/*11.10*/("""
    """)))}),format.raw/*12.6*/("""

    """),_display_(/*14.6*/Global/*14.12*/.html5.body/*14.23*/ {_display_(Seq[Any](format.raw/*14.25*/("""

        """),_display_(/*16.10*/Global/*16.16*/.html5.bodyHead/*16.31*/ {_display_(Seq[Any](format.raw/*16.33*/("""
            """),format.raw/*17.13*/("""<div class="navbar navbar-inverse set-radius-zero" >
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="index.html">

                            <img src="assets/images/logo.png" />
                        </a>

                    </div>

                    <div class="right-div">
                        <a href="#" class="btn btn-danger pull-right">LOG ME OUT</a>
                    </div>
                </div>
            </div>
        """)))}),format.raw/*37.10*/("""

        """),_display_(/*39.10*/Global/*39.16*/.html5.nav),format.raw/*39.26*/("""

        """),_display_(/*41.10*/if(content != null)/*41.29*/ {_display_(Seq[Any](format.raw/*41.31*/("""
            """),_display_(/*42.14*/content),format.raw/*42.21*/("""
        """)))}),format.raw/*43.10*/("""

        """),_display_(/*45.10*/Global/*45.16*/.html5.article/*45.30*/ {_display_(Seq[Any](format.raw/*45.32*/("""
            """),format.raw/*46.13*/("""<p>
                Article content goes here
                <br>
                Quite easy actually
                <br>
                See...
            </p>
        """)))}),format.raw/*53.10*/("""

        """),_display_(/*55.10*/Global/*55.16*/.html5.footer),format.raw/*55.29*/("""

    """)))}),format.raw/*57.6*/("""

    """),_display_(/*59.6*/Global/*59.12*/.application.scripts),format.raw/*59.32*/("""

"""),format.raw/*61.1*/("""</html>"""))
      }
    }
  }

  def render(pageTitle:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageTitle)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pageTitle) => (content) => apply(pageTitle)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 24 22:44:55 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/application/masterpage.scala.html
                  HASH: 338461e90ba8fe64d06f0ca32693e67e8f7318cc
                  MATRIX: 977->1|1106->35|1134->37|1208->86|1222->92|1243->105|1282->107|1319->118|1333->124|1370->141|1406->151|1420->157|1464->181|1501->192|1515->198|1535->210|1574->212|1615->225|1652->235|1682->244|1724->255|1760->261|1793->268|1808->274|1828->285|1868->287|1906->298|1921->304|1945->319|1985->321|2026->334|2930->1207|2968->1218|2983->1224|3014->1234|3052->1245|3080->1264|3120->1266|3161->1280|3189->1287|3230->1297|3268->1308|3283->1314|3306->1328|3346->1330|3387->1343|3591->1516|3629->1527|3644->1533|3678->1546|3715->1553|3748->1560|3763->1566|3804->1586|3833->1588
                  LINES: 28->1|33->1|35->3|36->4|36->4|36->4|36->4|38->6|38->6|38->6|39->7|39->7|39->7|41->9|41->9|41->9|41->9|42->10|42->10|42->10|43->11|44->12|46->14|46->14|46->14|46->14|48->16|48->16|48->16|48->16|49->17|69->37|71->39|71->39|71->39|73->41|73->41|73->41|74->42|74->42|75->43|77->45|77->45|77->45|77->45|78->46|85->53|87->55|87->55|87->55|89->57|91->59|91->59|91->59|93->61
                  -- GENERATED --
              */
          