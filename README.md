# ParkNow
## Group 2
## Team Members:
 - Chenxuan He
 - ToanTTran
 - Minwoo Kong

This software design document describes the architecture and system design of ParkNow application. The purpose of ParkNow application is to provide an exclusive convenience parking solutions for the San Jose State University (SJSU) students, faculty members, and parking services. 

arduino: C program
this program is to run with the arduino IDE 
connection and set up to activate the ultra sensor

Raspberry Pi: javascript file is to install in the raspberry pi terminal
type (sudo install 'filename.js')
connect arduino to raspberry pi using USB cable.
this will communicate through serialport.

Android Studio: Java
1. Download androidstudio file at https://developer.android.com/studio/.
2. Install the program, and launch new project or use exisiting project file. 
3. At MainActivity.xml, copy and paste the code which is located on Android subfolder. 
4. Click on the Run button, create a virtual emulator (API 21 - API 28) 
5. User should able to see the output.
6. This android application is not yet published on android app market, therefore user only can access to this working code on Android Studio.


ARTIK Cloud:
create a Iot Device in artik cloud for Device ID and Token
raspberry pi will send data to artik cloud 
website will receive the data by the token ID

AWS Static website
html and javascript will publish a static website on AWS.
returning live status of data from artik cloud.
## LINK: 
```
http://www.sjsuparknow.com.s3-website-us-west-1.amazonaws.com
```
