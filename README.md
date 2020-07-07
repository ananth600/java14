# Java 14 new features :
## Patern matching instance of 
## Switch expression
## Record for DTOs
## Helpful nullpointer exception
Regular logging
```
Exception in thread "main" java.lang.NullPointerException
	at javafourteen/org.tools.fourteen.sample.App.createNullPointer(App.java:46)
	at javafourteen/org.tools.fourteen.sample.App.main(App.java:13)
```
With -XX:+ShowCodeDetailsInExceptionMessages
```
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.List.add(Object)" because "list" is null
	at javafourteen/org.tools.fourteen.sample.App.createNullPointer(App.java:46)
	at javafourteen/org.tools.fourteen.sample.App.main(App.java:13)
```
