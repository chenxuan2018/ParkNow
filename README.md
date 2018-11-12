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

ARTIK Cloud:
create a Iot Device in artik cloud for Device ID and Token
raspberry pi will send data to artik cloud 
website will receive the data by the token ID

AWS Static website
html and javascript will publish a static website on AWS.
returning live status of data from artik cloud.
## LINK: 
```
https://sites.google.com/view/sjsuparknow/north
```
