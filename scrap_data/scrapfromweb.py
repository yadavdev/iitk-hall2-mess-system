#!/usr/bin/env python
#AUTHOR @yadavdev Devashish Kumar Yadav

import re
import urllib2
from pprint import pprint

data_file = open("y11_hall9_dual.txt","w")
myre = re.compile(r"<b>Name: <\/b>([\r\n\t\ ]*)([0-9a-zA-Z\ ]*)")
data = open('myfile', 'w')
for i in range(111907001, 111907950):
    try:
        print i
        link = "http://oa.cc.iitk.ac.in:8181/Oa/Jsp/OAServices/IITk_SrchRes.jsp?typ=stud&numtxt="+str(i)+"&sbm=Y"
        data_student = urllib2.urlopen(link).read()
        if data_student.find("HALL9") >0:
            print data_student
            data.write(data_student) 
            try:
                name = myre.search(data_student)
                print "Current Data for: " + str(i)
                if name is None:
                    print "is NONE"
                    assert False
                name_str = str(i)+" "+name.group(2).strip()+"\n"
                data_file.write(name_str)
            except Exception, e:
                print "Exception Thrown:"
                print e
                print "------------------------"

    except Exception, e:
        print "Data not found for: " + str(i)

data_file.close()
