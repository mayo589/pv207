# PV207 HOW-TO


This readme explains how to:

* Install Red Hat JBoss BPM Suite
* Clone this repository its projects.
 

If anything is unclear feel free to contact me @ 418132@mail.muni.cz

### Installation
The only prerequisite is JDK 8 which you can download from the [Oracle website](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
You can of course use OpenJDK too.
To verify successful installation, open your command line (or terminal) and execute:

```bash
$ javac -version
javac 1.8.0_51
$ java -version
Java(TM) SE Runtime Environment (build 1.8.0_51-b16)
Java HotSpot(TM) 64-Bit Server VM (build 25.51-b03, mixed mode)
```

In case of errors in the output, you likely need to [update the PATH on Windows](http://stackoverflow.com/questions/1672281/environment-variables-for-java-installation).


Download the [BPM Suite](https://drive.google.com/file/d/0B9FEDpx-WZeodjkyWW0teHMtSWM/view?usp=sharing), unzip it and navigate into BPM_HOME/bin using the *cd* command line command.


### First steps
This repository is supposed to be used inside BPM Suite product.

Clone it into your BPM Suite instance:

0) Change into `BPM_HOME/bin`, for exampe: `cd C:\BPM_HOME\bin`  
1) Execute `./standalone.sh` in a Unix environment or `standalone.bat` in a Windows environment to start BPM Suite. Ensure you are inside bin folder.
2) Log in as a user with the admin role--in our case **pv207/password1!**.
3) Click Authoring -> Administration -> Repositories -> Clone Repository
Fill in the repository name and Organizational unit--these values can be arbitrary.
Use this URL: https://github.com/agiertli/pv207.git
username and password *must* be empty
Click "Clone"

![Clone Repository](https://ctrlv.cz/shots/2017/03/29/2Od3.png)

Once done, click Authoring -> Project Authoring to see the Project Explorer menu. Navigation bar looks like this:
<organizational_unit_name>  >> <repository_name> >> <project_name>

![Navigation](https://ctrlv.cz/shots/2017/04/09/z9JE.png)

Navigate between different repositories and projects by clicking on respective links.
Click on repository and select the one you have just cloned.

For our first excercise you will need to use these two projects--DataModel and CoffeeOrderCompany.
Select DataModel.
This project has only one relevant file--data model called CoffeeOrder.
This model is used later in our process and also in the REST service, so it's necessary to build this project first.
Select "Open Project Editor" and click Build->Build&Deploy.

![Build](https://ctrlv.cz/shots/2017/03/29/82Be.png)

### Useful tips
* You can add new users by executing `./add-user.sh[bat]` script located in the `BPM_HOME/bin` folder.
* The REST service is deployed in `BPM_HOME/standalone/deployments`. You can use your [favourite java decompiler](http://jd.benow.ca/) to check its logic. This REST service depends on the DataModel project, that's why it's necessary to build it first.
* Make frequent backups of the `.niogit` directory located in the bin folder. `.niogit` is hidden on \*nix systems. 
* If you break your BPM Suite instance, usually deleting the `.niogit` directory helps. That's why frequent backups are useful, so you can simply copy the internal git repository (i.e. pv207.git) inside the new `.niogit` directory.
* If you start BPM Suite in a directory different from `bin`, new and empty `.niogit` folder will be created. This will create an impression that you had lost all your previous work. Therefore, make sure you are always starting BPM Suite from the same directory. The `bin` directory is recommended.


 