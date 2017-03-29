# PV207 HOW-TO

This readme should explain how to BPM Suite, this repository and projects inside. 
If anything is unclear feel free to contact me @ 418132@mail.muni.cz

### Installation
The only prerequisite is JDK 8 which you can download from Oracle website
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
You can of course use OpenJDK too.
You can verify the success of installation by opening command line (or terminal) and executing these commands:

```bash
$ javac -version
javac 1.8.0_51
$ java -version
Java(TM) SE Runtime Environment (build 1.8.0_51-b16)
Java HotSpot(TM) 64-Bit Server VM (build 25.51-b03, mixed mode)
```

If there is some error in the output,you'll like need to [update the PATH on windows](http://stackoverflow.com/questions/1672281/environment-variables-for-java-installation)


Download BPM Suite
https://drive.google.com/file/d/0B9FEDpx-WZeodjkyWW0teHMtSWM/view?usp=sharing
Unzip and navigate to (using cd command) into BPM_HOME/bin


### First steps
This repository is supposed to be used inside BPM Suite product.
In order to do so, it needs to be cloned.

1) Start BPM Suite by executing ./standalone.sh[bat] (make sure you are inside bin folder)
2) Log in with user with admin role (in our case **pv207/password1!**)
3) Navigate to Authoring->Administration->Repositories->Clone Repository
Fill in the repository name and Organizational unit - these values can be arbitrary.
Use this URL: https://github.com/agiertli/pv207.git
username and password *must* be empty
Click "Clone"

![Clone Repository](https://ctrlv.cz/shots/2017/03/29/2Od3.png)

Once done, navigate back to Authoring->Project Authoring.
You should be in the Project Explorer menu now. Navigation bar looks like this:
<organizational_unit_name>  >> <repository_name> >> <project_name>

![Navigation](https://ctrlv.cz/shots/2017/03/29/MhEi.png)

By clicking on respective links you can navigate between different repositories / projects. 
Click on repository and select the one you have just cloned.


For our first excersice you will need to use these two projects -  DataModel and CoffeeOrderCompany.
Select DataModel.
This project has only one relevant file - data model called CoffeeOrder.
This model is used later on in our process and also in the REST service, so it's necessary to build this project first.
Select "Open Project Editor" and click Build->Build&Deploy.
Build should succeed immediatelly.

![Build](https://ctrlv.cz/shots/2017/03/29/82Be.png)

### Useful tips
* You can add new users by executing ./add-user.sh[bat] script located in the BPM_HOME/bin folder.
* The REST service is deployed inside BPM_HOME/standalone/deployments. You can use your [favourite java decompiler](http://jd.benow.ca/) to check its logic. This REST service depends on the DataModel project, that's why it's necessary to build it first.
* Make frequent backups of .niogit folder located in the bin folder. .niogit is hidden on *nix systems. 
* If you ever manage to break BPM Suite, usually deleting .niogit folder helps (that's why frequent backups are useful, so you can simply copy the internal git repository (i.e. pv207.git) inside the new .niogit/)
* If you start BPM Suite in different than bin folder, than new/empty .niogit folder will be created. This will create an impression as if you'd lost all your previous work. Therefore make sure you are always starting BPM Suite from the same directory (bin is recommended)


 