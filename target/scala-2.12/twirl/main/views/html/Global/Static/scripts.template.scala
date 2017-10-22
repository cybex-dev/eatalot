
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

object scripts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!-- JAVASCRIPT FILES TO BE  PLACED AT THE BOTTOM OF A PAGE TO REDUCE THE LOADING TIME  -->
<!-- CORE JQUERY  -->
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/jquery-1.10.2.js")),format.raw/*5.70*/("""" rel="script"></script>
    <!-- BOOTSTRAP SCRIPTS  -->
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("javascripts/bootstrap.js")),format.raw/*7.66*/("""" rel="script"></script>
    <!-- MAIN/CUSTOM SCRIPTS  -->
<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("javascripts/main.js")),format.raw/*9.61*/("""" rel="script"></script>

<script src=""""),_display_(/*11.15*/routes/*11.21*/.Assets.versioned("javascripts/carousel.js")),format.raw/*11.65*/("""" rel="script"></script>

<script src=""""),_display_(/*13.15*/routes/*13.21*/.Assets.versioned("javascripts/popper.js")),format.raw/*13.63*/("""" rel="script"></script>

<script src=""""),_display_(/*15.15*/routes/*15.21*/.Assets.versioned("javascripts/bootstrap-toggle.min.js")),format.raw/*15.77*/(""""></script>

<script type="text/javascript" src=""""),_display_(/*17.38*/controllers/*17.49*/.Order.routes.ScheduleController.scheduleJSRoutes()),format.raw/*17.100*/(""""></script>

<script type="text/javascript" src=""""),_display_(/*19.38*/controllers/*19.49*/.User.routes.CustomerController.customerJSRoutes),format.raw/*19.97*/(""""></script>

<script type="text/javascript" src=""""),_display_(/*21.38*/controllers/*21.49*/.User.routes.AdminController.adminJSRoutes),format.raw/*21.91*/(""""></script>

<script type="text/javascript" src=""""),_display_(/*23.38*/controllers/*23.49*/.User.routes.KitchenStaffController.kitchenJSRoutes),format.raw/*23.100*/(""""></script>

<script type="text/javascript" src=""""),_display_(/*25.38*/controllers/*25.49*/.User.routes.DeliveryStaffController.deliveryJSRoutes),format.raw/*25.102*/(""""></script>
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
<<<<<<< HEAD
                  DATE: Sun Oct 22 22:44:13 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/scripts.scala.html
=======
                  DATE: Sun Oct 22 11:23:03 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Global/Static/scripts.scala.html
>>>>>>> master
                  HASH: 0c34e2c65bb5d3ad2dbf54247b52baaee23afdf9
                  MATRIX: 957->1|1053->3|1081->5|1235->133|1249->139|1318->188|1415->259|1429->265|1494->310|1593->383|1607->389|1667->429|1734->469|1749->475|1814->519|1881->559|1896->565|1959->607|2026->647|2041->653|2118->709|2195->759|2215->770|2288->821|2365->871|2385->882|2454->930|2531->980|2551->991|2614->1033|2691->1083|2711->1094|2784->1145|2861->1195|2881->1206|2956->1259
                  LINES: 28->1|33->1|35->3|37->5|37->5|37->5|39->7|39->7|39->7|41->9|41->9|41->9|43->11|43->11|43->11|45->13|45->13|45->13|47->15|47->15|47->15|49->17|49->17|49->17|51->19|51->19|51->19|53->21|53->21|53->21|55->23|55->23|55->23|57->25|57->25|57->25
                  -- GENERATED --
              */
          