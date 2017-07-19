# eatalot
3rd year project for group: Intelligents

# Status

Bare project with latest scala and sbt

 - Scala version : 2.12.2  
 - Play version  : 2.6.1
 - Java version  : 1.8.0_131

# Instructions

Check email and accept invite for collaboration

1. Open up IntelliJ
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
8. Wait for SBT to download sources, it may take a while
9. IntelliJ will open up, press ```Alt + 1``` if no window appears on the left side of the GUI. This will open the project structure and files of the project
10. Happy coding
    
    Note: 
    
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

