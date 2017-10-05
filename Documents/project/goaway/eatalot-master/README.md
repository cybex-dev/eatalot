# eatalot
3rd year project for group: Intelligents

# Status

Basic workable project with latest scala and sbt

 - Scala version : 2.12.2  
 - Play version  : 2.6.1
 - Java version  : 1.8.0_131

All compiles correctly, branch off this project and start developing your own use cases

# Instructions for cloning

First: Check email and accept invite for collaboration

1. Open up IntelliJ (Assuming you have installed: IntelliJ, Java JDK - latest, scala-sbt and has been added to your environment path - see below **)
2. Install the scala plugin if you haven't done so
3. On the "Welcome" page of Intellij, select Import from Version Control...
    - Select Github
    - Enter username and password (using password method)
    - There should be a git repository url provided
    (if not, use this link : https://github.com/cybex-dev/eatalot.git)
    - click ```test``` to check if it can pull the repository
    - *set directory to clone to (see below)
    - Click clone
4. After cloning, it may ask you to import a project. It cannot happen there since when you click import, your project model should be set to ```SBT```, 
   however the ```SBT``` option is not there, so click cancel
5. Click on import project, then browse to the folder containing the project (example mentioned below uses the directory name ```project-eatalot````)
6. Select project model ```SBT```
7. A window pops up asking about the project settings. 
    - make sure the JDK has been selected
    - Check the box ```Allow Auto-Import```
    - Check the box ```Download Library Sources```
8. Wait for SBT to download sources, it may take a while
9. IntelliJ will open up
10. A Import SBT Porjects dialog will popup asking about importing modules. 
    - It will contain 2 entries/modules ```root``` and ```root-build```, make sure both are check, and click ok
11. If no project structure windows opens on the left side of the IDE, Press ```Alt + 1``` if no window appears on the left side of the GUI. This will open the project structure and files of the project
12. Happy coding

If ever something does not work with an ```html``` file 
 - ```e.g. yourViewFile.scala.html```
  
Do the following:

open up a terminal or press ```Alt + F12```
 - then type ```sbt``` and press enter (check that you are in the root folder of the project, usually it is there by default)
 - when it finishes, type ```compile``` and it will compile the sbt application, this sorts out the 
     ```Unresolved issues``` in scala.html files
     
# Notes:
*Note: 

For cloning, the <i>parent directory</i> is literally the parent directory

The <i>Directory Name</i> is the directory in which the contents of the github page will be cloned in to

e.g. Assume user's name is ```User``` 

Parent directory: 

Windows:

```C:\Users\User```

Linux

```/home/User```

Directory Name: ```project-eatalot```

Having these directory names filled in, the structure will look as follows:

Windows and Linux will look essentially the same
```
User\project-eatalot\
                    .q8\
                    .git\
                    .idea\
                    app\
                    project\
                    public\
                    target\
                    ...
```

if you want to have a folder named ```WRR_PROJECT``` which contains the info about the project like notes or resources, etc and the project itself

then set the ```Parent Directory``` to
     
     Windows:
     
     ```C:\Users\User\WRR_PROJECT```
     
     Linux
     
     ```/home/User/WRR_PROJECT```

this folder ```WRR_PROJECT``` will  contain a folder named ```project-eatalot``` (which will contain the actual project files)

NOTE: for version control to occur, the folder containing a folder named ```.git``` will be added the the repository

if you import the project from a directory, but the directory's parent contains the ```.git``` folder, it will not be added to the repository

**Note:

To check if sbt is in your environment path

```Linux```
 - open terminal (Ctrl + Alt + T)
 - type ```sbt``` and press enter
 
 ```Windows```
 - press ```Windows Key + r```
 - type in ```sbt``` and press enter
 
 - if it responds with (or something similar on windows) 
     "bash: sbt: command not found",
     then it is not installed, 
 - if it start with ```Loading global plugins``` or ```Updating``` or ```Resolving```, etc 
     then it is installed and you are fine
         
# Sources and references

Use site: 
 - https://playframework.com/documentation/2.6.x/Home
 
Note: you will have to select previos versions to get more information and documentation. Not everything is contained in the 2.6.x API documentation

Suggested youtube playlist to learn Play Framework:
 - https://www.youtube.com/playlist?list=PLYPFxrXyK0Bx9SBkNhJr1e2-NlIq4E7ED

Note: Leave him a comment if you want something explained or a video made

Have a look at play examples aswel:
 - https://www.playframework.com/documentation/2.2.x/JavaTodoList

# Project Structure

```
App/
    controllers/    - contains controllers handling code
    models/         - contains models of all data objects, this is a java representation of the database tables
    views/          - contains views rendered by controllers

        *views/ (see notes below)
                Global/ - contains "general" and non-package specific content

                        application/    - application specific views,
                            e.g. basepage used as base for all models, futher models are created from this in the relevant controller folder
                        html5/          - contains views and resources from html tags found in html5, used for logical groupings

                User/   - contains views for each controller that is part of the package User

                html-example-view/      - A suggested layout of website,
```                

*notes about Views folder:
 - keep directory structure the same as in controllers. It does not affect the project,
    it is just for logical groupings, and easy navigation and understanding

```i.e. views/{package name}/{controller name}/{view name}.scala.html```

# Routes

```
conf/
    routes          - contains routes for each controller, when a specific url is requested, the route is looked up and the controller method is fired
```

Contains routes for each controller. When creating a sub package, in the routes file
you need to use a order as follows (note that each package contains it own hypothetical routes file)
 
```controllers.YourPackageNameHere.routes.YourController.yourMethod```

# Extra Libraries / JAR's

Any extra libraries you may need, place them in the folder below, they are automagically added to the project path. You can simply just import them in your java code
```
lib/                - any extra libraries, .jar files needed for your application, place them in here
```

# Additional Information

Application runs on:
 - http://localhost:8080

How to set port:
 - this is set in ```{project root}/build.sbt```    
           OR     
 - look for file named ```build```
 
 replace 8080 with your desired port number

```PlayKeys.playDefaultPort := 8080```

# Database

Linux:

do a quick google search on how to install MySQL on ubuntu

suggested to look at:
 - https://www.digitalocean.com/community/tutorials/how-to-install-mysql-on-ubuntu-16-04
 - see youtube playlist as a reference aswel

Windows:
 
 - Install the MAMP stack (see youtube playlist for more info)

Database Credentials:

Suggested credentials are, this will be changed later. We can use this for <i>testing only</i>

 - Username: playdbuser
 - Password: 1234
 
see bottom of ```conf/application.conf``` for more info
 # ~Happy Coding~

==================================================================================================


play-java-starter-example 
 This is a starter application that shows how Play works. Please see the documentation at https:// www.playframework.com/documentation/latest/Home for more details. 
 Running 
 Run this using sbt. If you downloaded this project from http://www.playframework.com/download then you'll find a prepackaged version of sbt in the project directory: 
 sbt run
 
 And then go to http://localhost:9000 to see the running web application. 
 Controllers 
 There are several demonstration files available in this template. 
   HomeController.java: 
 Shows how to handle simple HTTP requests. 
 
  AsyncController.java: 
 Shows how to do asynchronous programming when handling a request. 
 
  CountController.java: 
 Shows how to inject a component into a controller and use the component when handling requests. 
 
 
 Components 
   Module.java: 
 Shows how to use Guice to bind all the components needed by your application. 
 
  Counter.java: 
 An example of a component that contains state, in this case a simple counter. 
 
  ApplicationTimer.java: 
 An example of a component that starts when the application starts and stops when the application stops. 
 
 
 Filters 
   ExampleFilter.java 
 A simple filter that adds a header to every response. 
