This repository is supposed to be used inside BPM Suite product.
In order to do so, it needs to be cloned.

1) Start BPM Suite executing ./standalone.sh[bat]
2) Log in with user with admin role (in our case pv207/password1!)
3) Navigate to Authoring->Administration->Repositories->Clone Repository
Fill in the repository name and ORganizational unit - these values can be arbitrary.
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


There are two projects -  DataModel and CoffeeOrderCompany.
Select DataModel.
This project has only one relevant file - data model called CoffeeOrder.
This model is used later on in our process and also in the REST service, so it's necessary to build this project first.
Select "Open Project Editor" and click Build->Build&Deploy.
Build should succeed immediatelly.

![Build](https://ctrlv.cz/shots/2017/03/29/82Be.png)
 