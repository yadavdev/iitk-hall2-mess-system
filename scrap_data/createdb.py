#!/usr/bin/env python

import MySQLdb

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

cursor.execute("DROP TABLE IF EXISTS dues")

createtable = """CREATE TABLE dues (
				s_no INT(6),
				name CHAR(50),
				roll INT(6),
				dues INT(6) default 0,
				extra INT(6) default 0,
				advance INT(6) default 0,
				total INT(6) default 0)"""

cursor.execute(createtable)

cursor.execute("DROP TABLE IF EXISTS login")

#the application searches the provided credentials against those in this table

createtable = """CREATE TABLE login (
				login VARCHAR(30),
				password VARCHAR(30)
				)"""

cursor.execute(createtable)


for i in range(190):
	data = y13.readline()
	data = data.split()
	rollno = int(data[0])
	name = ' '.join(data[1:])
	createtable = "CREATE TABLE "+'s'+str(rollno) + """(
													s_no INT(6) not null auto_increment primary key,
													date_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
													extra CHAR(30),
													price INT(6),
													number INT(6))"""

	cursor.execute(createtable)

	cursor.execute('insert into dues (s_no ,name,roll) values ("%d","%s", "%d")' % (i+1,name, rollno))
	#cursor.execute('insert into '+'s'+str(rollno) +(' (s_no ,name,rollno) values ("%d","%s", "%d")' % (i+1,name, rollno)))
	db.commit()

for i in range(200):
	data = y14.readline()
	data = data.split()
	rollno = int(data[0])
	name = ' '.join(data[1:])
	createtable = "CREATE TABLE "+'s'+str(rollno) + """(
													s_no INT(6) not null auto_increment primary key,
													date_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
													extra CHAR(30),
													price INT(6),
													number INT(6))"""

	cursor.execute(createtable)

	cursor.execute('insert into dues (s_no ,name,roll) values ("%d","%s", "%d")' % (i+1+190,name, rollno))
	#cursor.execute('insert into '+'s'+str(rollno) +(' (s_no ,name,rollno) values ("%d","%s", "%d")' % (0,name, rollno)))
	db.commit()

for i in range(207):
	data = y15.readline()
	data = data.split()
	rollno = int(data[0])
	name = ' '.join(data[1:])
	createtable = "CREATE TABLE "+'s'+str(rollno) + """(
													s_no INT(6) not null auto_increment primary key,
													date_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
													extra CHAR(30),
													price INT(6),
													number INT(6))"""

	cursor.execute(createtable)

	cursor.execute('insert into dues (s_no ,name,roll) values ("%d","%s", "%d")' % (i+1+290,name, rollno))
	#cursor.execute('insert into '+'s'+str(rollno)+(' (s_no ,name,rollno) values ("%d","%s", "%d")' % (0,name, rollno)))
	db.commit()

db.close()
y13.close()
y14.close()
y15.close()