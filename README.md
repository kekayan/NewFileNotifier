# FilesMonitor
An example for Observer Pattern for My Software Architecture & Desgin Assingmnent.
The Apllication will monitor a particular Folder and notify the file counts to the subscribers.

Inorder to change the listening directory.Goto Files Monitor class and edit line 45
```java
String folderPath="E:/Test";
```
to
```java
String folderPath="your path";
```

Since i used dummy implementations for Sms, Email and Twitter message sending classes.
Output will be like below .
When we run our application.It ll send intial files count (Here it's 2 files).
Thereafter it will only notify for new change in counts .

![alt text](https://lh5.googleusercontent.com/fprMZAoTLiztRwnMM1fflO9adPVlqX6Cz0wJDcvLqeE_Lmezs_OWxjZYGj1eVCyW0Oi3KLmytXxDR44bjqB2=w3840-h1835)



