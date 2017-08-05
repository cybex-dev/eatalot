
package views.html.Global.Static

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
/*1.2*/import Global.Html5.nav

object nav_wrapper extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(nav_extension: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/nav_section/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<section class="menu-section">
        <a class="top app-logo" href="customerHome.html">
            <img src="/assets/images/logo.png"/>
        </a>
        <div class="navbar navbar-inverse set-radius-zero">
            <div class="container">
                <div class="row ">
                    <div class="col-md-pull-12">
                        <div class="navbar-collapse collapse ">
                            <ul class="nav navbar-nav navbar-left navbar-top">
                                <li><a href=""""),_display_(/*16.47*/controllers/*16.58*/.User.routes.CustomerController.index()),format.raw/*16.97*/("""" class="menu-top-active">DASHBOARD</a></li>

                                <li><a href="#">FORMS</a></li>
                                <li>
                                    <a href="#" class="dropdown-toggle" id="ddlmenuItem" data-toggle="dropdown">
                                        UI ELEMENTS
                                        <i class="fa fa-angle-down"></i>
                                    </a>
                                    <ul class="dropdown-menu" role="menu" aria-labelledby="ddlmenuItem">
                                        <li role="presentation"><a role="menuitem" tabindex="-1" href="ui.html">UI ELEMENTS</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">EXAMPLE LINK</a></li>
                                    </ul>
                                </li>
                                <li><a href="#">TABS & PANELS</a> </li>
                                <li><a href="#">TABLES</a></li>
                                <li><a href="#">BLANK PAGE</a></li>
                            </ul>
                            <ul class="right-container navbar-btn navbar-right">
                                <ul class="top">
                                    <label class="media-heading navbar-user pull-center">Welcome, User</label>
                                </ul>
                                <ul class="bottom text-center">
                                    <a href="/user/login" class="btn btn-success pull-center">Login</a>
                                </ul>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    """),_display_(/*48.6*/nav_extension),format.raw/*48.19*/("""
""")))};
Seq[Any](format.raw/*3.23*/("""

"""),format.raw/*49.2*/("""

"""),_display_(/*51.2*/nav/*51.5*/.apply("null", nav_section)))
      }
    }
  }

  def render(nav_extension:Html): play.twirl.api.HtmlFormat.Appendable = apply(nav_extension)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (nav_extension) => apply(nav_extension)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Aug 05 22:42:05 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/nav_wrapper.scala.html
                  HASH: 5703851fe7591f89dc2561b5a6b9d34a435cf227
                  MATRIX: 665->1|997->27|1096->51|1115->62|1195->66|1226->71|1773->591|1793->602|1853->641|3643->2405|3677->2418|3718->48|3747->2420|3776->2423|3787->2426
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|46->16|46->16|46->16|78->48|78->48|80->3|82->49|84->51|84->51
                  -- GENERATED --
              */
          