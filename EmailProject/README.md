Before any email can be sent, SMTP server has to be configured.

This project uses smtp server with runs on localhost and is bound to port 2025.
To achieve this, I have used FakeSMTP server which can be downloaded from here
http://nilhcem.com/FakeSMTP/download.html
and you can run it like this:

java -jar fakeSMTP-1.11.jar

Hit "Start Server" and you are ready to go.

Configuration for SMTP server can be changed like this:

Autorihg->Project Authoring->EmailProject
Select Open Project Editor - > Project Settings -> Deployment Descriptor
Scroll down for "Work Item handlers" section and find an entry with "Email"
The Email Task is backed by corresponding handler, which is configured like this:
new org.jbpm.process.workitem.email.EmailWorkItemHandler("localhost","2025","arbitraryUser","arbitraryPassword")
parameters are as follows:
1) smtp server host
2) smtp server port
3) username (in case of fakesmtp this value can be arbitrary, with real smtp server, this must be valid username)
4) password (in case of fakesmtp this value can be arbitrary, with real smtp server, this must be valid password for the given user) 