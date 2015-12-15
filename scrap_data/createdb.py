#!/usr/bin/env python

import MySQLdb
import sys
# Opening databse connection
# Preparing cursor object 
try:
	db = MySQLdb.connect("localhost","root","tiger","test")
	cursor = db.cursor()
except MySQLdb.Error, e:
	print "Database Connection Error"
	raise e


# Adding students to database
y13 = open("y13.txt")
y14 = open("y14.txt")
y15 = open("y15.txt")



print "This script will create tables in the database named test.\nAll previous data using application login information (the login table) will be overwritten"
print "If upgdating database make sure to take a backup first. Run \" mysqldump -uroot -ptiger test > backup_orig.sql\" "
print "Note: Change the username and password for mysql as and when required"
print "Make sure you have the backup .sql. Want to continue?"
while 1:
	call = raw_input("Press y or n:")
	if call=='y':
		sure = raw_input("Dude you really sure? y or n:")
		if sure=='y':
			break;
		else:
			sys.exit(0)
	elif call=='n':
		sys.exit(0)


cursor.execute("DROP TABLE IF EXISTS dues")

createtable = """CREATE TABLE dues (
				s_no INT(6)  not null auto_increment primary key,
				name CHAR(50),
				roll INT(6) not null unique ,
				dues INT(6) default 0,
				extra INT(6) default 0,
				advance INT(6) default 0,
				total INT(6) default 0)"""

cursor.execute(createtable)

cursor.execute("DROP TABLE IF EXISTS login")

#the application searches the provided credentials against those in this table

createtable = """CREATE TABLE login (
				id VARCHAR(30),
				password VARCHAR(30)
				)"""

cursor.execute(createtable)

cursor.execute("DROP TABLE IF EXISTS eggs")

#A table to maintain the total consumption of egg coupons in the mess

createtable = """CREATE TABLE eggs (
				s_no INT(6)  not null auto_increment primary key,
				date DATE not null unique ,
				quantity INT(6) DEFAULT 0,
				amount INT(6) DEFAULT 0
				)"""

cursor.execute(createtable)

print "Created new login table. Use mysql to insert login credentials using \"INSERT into LOGIN (id,password) values (\"myuser\",\"mypassword\") \""

for i in range(190):
	data = y13.readline()
	data = data.split()
	rollno = int(data[0])
	name = ' '.join(data[1:]) #create table "+table_name+"(s_no int primary key auto_increment,extra varchar(50),date timestamp,price int,number int);
	createtable = "CREATE TABLE "+'s'+str(rollno) + """(
													s_no INT(6) not null auto_increment primary key,
													date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
													extra VARCHAR(50),
													price INT(6),
													number INT(6))"""

	cursor.execute(createtable)

	cursor.execute('insert into dues (name,roll) values ("%s", "%d")' % (name, rollno))
	#cursor.execute('insert into '+'s'+str(rollno) +(' (s_no ,name,rollno) values ("%d","%s", "%d")' % (i+1,name, rollno)))
	db.commit()

for i in range(200):
	data = y14.readline()
	data = data.split()
	rollno = int(data[0])
	name = ' '.join(data[1:])
	createtable = "CREATE TABLE "+'s'+str(rollno) + """(
													s_no INT(6) not null auto_increment primary key,
													date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
													extra VARCHAR(50),
													price INT(6),
													number INT(6))"""

	cursor.execute(createtable)

	cursor.execute('insert into dues (name,roll) values ("%s", "%d")' % (name, rollno))
	#cursor.execute('insert into '+'s'+str(rollno) +(' (s_no ,name,rollno) values ("%d","%s", "%d")' % (0,name, rollno)))
	db.commit()

for i in range(207):
	data = y15.readline()
	data = data.split()
	rollno = int(data[0])
	name = ' '.join(data[1:])
	createtable = "CREATE TABLE "+'s'+str(rollno) + """(
													s_no INT(6) not null auto_increment primary key,
													date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
													extra VARCHAR(50),
													price INT(6),
													number INT(6))"""

	cursor.execute(createtable)

	cursor.execute('insert into dues (name,roll) values ("%s", "%d")' % (name, rollno))
	#cursor.execute('insert into '+'s'+str(rollno)+(' (s_no ,name,rollno) values ("%d","%s", "%d")' % (0,name, rollno)))
	db.commit()

db.close()
y13.close()
y14.close()
y15.close()