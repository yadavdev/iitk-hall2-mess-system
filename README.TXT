Mess

To Run already compiled run "java -jar project.jar" in linux or click project.jar in the "dist" folder.
If compiling in netbeans use clean build.


Do following before watching it in action  ....


*To use install mysql only(not xampp) and start its server at port 3306 
password of sql is "tiger" and database used is "test"
 
*Makes neccessary tables as following in "test" database:

Tables used are following and should be made in sql
student(s_no int primary key auto_increment,name text,roll int not null unique,img text)
dues (s_no int primary key auto_increment,roll int not null unique,name text,img text
	,dues int default 0,extra int default 0,advance int default 0,total int default 0)
login (s_no int primary key auto_increment,id text,password text)

* in login table update data with your login id and password

After that run the python file then open the program it will give you welcome screen
then go to admin pannel, login with your id and password updated 
then click on generate tables after that table will be generated then you are ready to use this application

Good Luck
