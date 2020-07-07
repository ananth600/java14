# Java 14 new features :
## Patern matching instance of 
```
if(vehicle instanceof Car car) {
    ystem.out.println("Driving Speed "+ car.drivingSpeed());
}
```
## Switch expression
```
switch(day.toLowerCase()) {
    case "saturday" -> { System.out.println("Hey it's saturday"); }
}
```
## Record for DTOs
```
public record User(String firstName,String lastName) {
}
```
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
