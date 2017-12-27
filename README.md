# NewFileNotifier
An example for Observer Pattern for My Software Architecture & Desgin Assingmnent.

>"The app should monitor a directory and whenever a new file is available in the directory,
it should notify the user via SMS, Email or Twitter about the new file. 
You must follow the observer design pattern.
Use dummy implementations for Sms, Email and Twitter message sending classes."

Inorder to change the listening directory.Goto Files Monitor class and edit line 43
```java
Path path = Paths.get("E:/Test");
```
to
```java
Path path = Paths.get("your path");
```





