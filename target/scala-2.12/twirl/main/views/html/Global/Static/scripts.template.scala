
package views.html.Global.Static

import controllers._

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

"""),format.raw/*15.96*/("""

"""),format.raw/*17.95*/("""

"""),format.raw/*19.93*/("""

"""),format.raw/*21.1*/("""<script type="text/javascript" src=""""),_display_(/*21.38*/controllers/*21.49*/.Order.routes.ScheduleController.scheduleJSRoutes()),format.raw/*21.100*/(""""></script>
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
                  DATE: Tue Oct 17 23:44:33 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/scripts.scala.html
                  HASH: 42914e4f7493775883429e64e498670c522d7a1f
                  MATRIX: 957->1|1053->3|1081->5|1235->133|1249->139|1318->188|1415->259|1429->265|1494->310|1593->383|1607->389|1667->429|1734->469|1749->475|1814->519|1881->559|1896->565|1959->607|2013->728|2043->824|2073->918|2102->920|2166->957|2186->968|2259->1019
                  LINES: 28->1|33->1|35->3|37->5|37->5|37->5|39->7|39->7|39->7|41->9|41->9|41->9|43->11|43->11|43->11|45->13|45->13|45->13|47->15|49->17|51->19|53->21|53->21|53->21|53->21
                  -- GENERATED --
              */
          